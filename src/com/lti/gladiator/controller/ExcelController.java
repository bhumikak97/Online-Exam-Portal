package com.lti.gladiator.controller;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.Iterator;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lti.gladiator.bean.Exam;
import com.lti.gladiator.bean.ExamDetails;
import com.lti.gladiator.bean.ExcelDTO;
import com.lti.gladiator.exception.ExamDetailsException;
import com.lti.gladiator.exception.ExamException;
import com.lti.gladiator.service.ExamDetailsService;
import com.lti.gladiator.service.ExamService;

@Controller
public class ExcelController {
	@Resource
	private ExamDetailsService service;
	@Resource
	private ExamService e_service;

	@RequestMapping(path = "/excel.htm", method = RequestMethod.POST)
	public String add(ExcelDTO excelDTO, HttpServletRequest request) {
		System.out.println(excelDTO.getFile());
		boolean insertedED = false;
		ExamDetails ed = new ExamDetails();
		int level = Integer.parseInt(request.getParameter("level"));

		String created_by = "Admin";
		Date date = new Date();
		Exam newExam = new Exam();
		String exam_name = request.getParameter("exam_name");
		newExam.setExam_name(exam_name);
		newExam.setCreated_by(created_by);
		newExam.setCreated_on(date);
		int insertedExam = 1;
		System.out.println(newExam.getExam_name() + newExam.getCreated_by() + newExam.getCreated_on());
		try {
			insertedExam = e_service.insertNewExam(newExam);
		} catch (ExamException e1) {

			e1.printStackTrace();
		}

		InputStream excelFile;
		try {
			excelFile = excelDTO.getFile().getInputStream();
			Workbook workbook = new XSSFWorkbook(excelFile);
			Sheet datatypeSheet = workbook.getSheetAt(0);
			Iterator<Row> iterator = datatypeSheet.iterator();

			while (iterator.hasNext()) {

				Row currentRow = iterator.next();
				Iterator<Cell> cellIterator = currentRow.iterator();

				while (cellIterator.hasNext()) {

					Cell currentCell = cellIterator.next();
					if (currentCell.getCellTypeEnum() == CellType.STRING) {
						String value = currentCell.getStringCellValue();
						System.out.println(currentCell.getColumnIndex());
						int index = currentCell.getColumnIndex();

						if (index == 1) {
							ed.setQuestion(value);
						}

						if (index == 2) {
							ed.setOpt_1(value);

						}
						if (index == 3) {
							ed.setOpt_2(value);

						}
						if (index == 4) {
							ed.setOpt_3(value);
						}
						if (index == 5) {
							ed.setOpt_4(value);
						}
						if (index == 6) {
							ed.setCorrect_answer(value);
						}

					}
					if (currentCell.getCellTypeEnum() == CellType.NUMERIC) {
						int value = (int) currentCell.getNumericCellValue();

						ed.setQ_id(value);
						System.out.print(currentCell.getNumericCellValue() + "--");

					}
					if (currentCell.getCellTypeEnum() == CellType.BLANK)
						break;

				}

				ed.setExam_name(exam_name);
				ed.setLevel(level);
				ed.setExam_id(insertedExam);
				if (ed.getQ_id() != 0)
					insertedED = service.insertNewExamDetails(ed);
			}

		} catch (ExamDetailsException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "redirect:/insertExamPage.htm";
	}
}

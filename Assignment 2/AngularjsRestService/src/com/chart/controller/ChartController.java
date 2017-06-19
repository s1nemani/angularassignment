package com.chart.controller;

import java.util.Date;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.chart.model.ChartObject;

@Controller
public class ChartController {

	@RequestMapping(value = "/chart")
	public String getReportJSON(Model model) {

		ChartObject chart = new ChartObject();
		Random r = new Random();

		chart.setTime((int) new Date().getTime());
		chart.setMaxMemory(r.nextInt());
		chart.setMemoryAvailable(r.nextInt());

		model.addAttribute("chart", chart);

		return "jsonTemplate";
	}
}
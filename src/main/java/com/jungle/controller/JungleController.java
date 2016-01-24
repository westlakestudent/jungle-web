package com.jungle.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jungle.model.JungleMan;

@Controller
public class JungleController {

	@RequestMapping(value = "/")
	public String jungle() {
		return "jungle";
	}

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	@ResponseBody
	public JungleMan jungleMan() {
		return new JungleMan("jungleCC", "junglePP", "jungleLL", "jungleFF", "junglePA");
	}

}

package com.dende.controller;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dende.services.ProductServicesImp;
@Controller
public class HelloController {
	
	@Autowired
	private ProductServicesImp productServicesImp;
	
	@Autowired
	private MessageSource messageSource;
	
	@RequestMapping("/")
	public String index(final ModelMap model, Locale locale) {
		
		model.addAttribute("listTrendingProduct", productServicesImp.getListTrendingProduct());
		model.addAttribute("listProduct", productServicesImp.allProduct());
		return "index";
  }
}
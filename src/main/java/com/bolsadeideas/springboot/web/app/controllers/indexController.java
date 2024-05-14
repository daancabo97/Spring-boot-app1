package com.bolsadeideas.springboot.web.app.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/app")
public class indexController {

	/*
	 * Formas de pasar datos a la vista
	 * 
	 * */
	
	@GetMapping({"/index", "/", "", "/home"})
	public String index(Model model) {
		model.addAttribute("titulo", "Hola Spring Framework con model");
		return "index";
	}

	@GetMapping({ "/index1", "/", "home1" })
	public String index1(ModelMap model) {
		model.addAttribute("titulo", "Hola Spring Framework con ModelMap!");
		return "index1";
	}

	@GetMapping({ "/index2", "/", "home2" })
	public String index2(Map<String, Object> map) {
		map.put("titulo", "Hola Spring Framework con map!");
		return "index2";
	}

	@GetMapping({ "/index3", "/", "home3" })
	public ModelAndView index3(ModelAndView mv) {
		mv.addObject("titulo", "Hola Spring Framework con Modelandview!");
		mv.setViewName("index3");
		return mv;
	}

}

   /*
    * http://localhost:8383/app/index
    * */


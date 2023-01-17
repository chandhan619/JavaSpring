package com.example.demo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LCDController {

	static String imagedata = "some data";
	@GetMapping("/")
	public String caller1(Model model) {
		 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm a");  
		   LocalDateTime now = LocalDateTime.now();  
		   
		   imagedata = dtf.format(now);
		   
		   System.out.println(dtf.format(now));  
		   model.addAttribute("LCD_Image", imagedata);
		   return "helloworld";
	}

}

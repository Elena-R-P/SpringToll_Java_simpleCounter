package com.ponomareva.counter;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller

public class CounterController {
	
	@RequestMapping("/your_server")
	public String index(HttpSession session) {
		session.setAttribute("count", 0);
		return "index.jsp";
	}
	@RequestMapping("/your_server/counter")
	public String counter(HttpSession session) {
		Integer count = (Integer) session.getAttribute("count");
		count = count + 1;
		session.setAttribute("count", count);
		return "counter.jsp";
	}
	@RequestMapping("/wipeout")
	public String wipeout(HttpSession session) {
		session.invalidate();
		return "redirect:/your_server";
	}
	@RequestMapping("/plustwo")
	public String plustwo(HttpSession session) {
		Integer count = (Integer) session.getAttribute("count");
		count = count + 2;
		session.setAttribute("count", count);
		return "redirect:/your_server/counter";
	}
}

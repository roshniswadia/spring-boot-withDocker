package com.demoBootApp.springbootwithdocker.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/rest")
public class HomeController {

	@GetMapping("/printList")
	public List<String> printList(){
		List<String> testList = new ArrayList<>();
		testList.add("Element1");
		testList.add("Element2");
		testList.add("Element3");
		return testList;
	}
}

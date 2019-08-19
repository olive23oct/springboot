package com.example.study.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.study.model.SearchParam;

@RestController
@RequestMapping("/api")
public class GetController {

	@RequestMapping(method = RequestMethod.GET, path = "/getMethod") 
	public String getRequest() {
		return "Hi getMethod";
	}


	@GetMapping("/getParameter") 
	public void	getParameter() { System.out.println("ddd"); }


	@GetMapping(value = "/getParameter", params = { "id", "password" }) 
	public String getParameter(@RequestParam String id
							 , @RequestParam(name="password") String pwd) {
		String password = "bbb";
		System.out.println("id : " + id);
		System.out.println("password : " + password);

		return id + pwd;
	}
	
	@GetMapping("/getMultiParameter")
	public SearchParam getMultiParameter(SearchParam searchParam) {
		System.out.println(searchParam.getAccount());
		System.out.println(searchParam.getEmail());
		System.out.println(searchParam.getPage());
		
		// { "account" : "", "email" : "", "page" : 0 }
		return searchParam;
	}
}

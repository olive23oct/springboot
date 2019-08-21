package com.example.study.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.study.model.SearchParam;

@RestController
@RequestMapping("/api")
public class PostController {
	// HTML <form>
	// ajax 검색
	// http post body -> data
	// json, xml, mulitpart-form / text-plain
	
	@PostMapping(value = "/postMethod")
	//@RequestMapping(method = RequestMethod.POST , path = "/postMethod")
	public SearchParam postMethod(@RequestBody SearchParam searchParam) {//@RequestBody SearchParam searchParam
		System.out.println(searchParam.toString());
		return searchParam;
	}
	

}

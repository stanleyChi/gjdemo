package com.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class SampleController
{

	@Autowired
	protected HttpServletRequest request;

	@Autowired
	protected HttpServletResponse response;

	@ResponseBody
	@RequestMapping("/")
	public String home()
	{return "Hello Kisso!";	}

	// 授权登录
	@ResponseBody
	@RequestMapping("/login")
    public String login()	{
        if(true){return "gjzq hello";}else{return "false";}		     		 	}

}
package com.bankak.controller;

import org.springframework.stereotype.Controller;

@Controller
public class AccountOpenController {
	
	@RequestMapping("/")
	public String showAccountOpenScreen() {
		return "account_open";
	}
	@RequestMapping("/login")
	public String showLoginScreen() {
		return "account_open";
	}
}

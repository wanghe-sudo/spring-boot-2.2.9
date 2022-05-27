package org.springframework.boot.springbootmytest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author wanghe
 * @Date 2022/5/27
 * @DESC
 */
@RestController
public class MyController {
	@GetMapping("/test")
	public String init() {
		System.out.println("spring-boot-2.2.9 init success");
		return "spring-boot-2.2.9 init success";
	}
}

package com.pk.mvc;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.pk.mvc.domain.User;

@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = {"/", "index.html"}, method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		return "home";
	}
	
	
	//form ��û�� GET���� �������� �� ó���� �޼ҵ�
	@RequestMapping(value="form", method = RequestMethod.GET)
	public String form() {
		//�ܼ� ������ �̵��� jsp ������ �̸��� �����ϸ� �˴ϴ�.
		return "form";
	}
	
	/*
	@RequestMapping(value="form", method = RequestMethod.POST)
	//������ HttpServletRequest�� �̿��� �Ķ���� ó���� ���� �޼ҵ�
	public String form(HttpServletRequest request) {
		String name = request.getParameter("name");
		String phone = request.getParameter("phone");
		String age = request.getParameter("age");
		
		//���
		System.out.println("�̸�:" + name);
		System.out.println("��ȭ��ȣ:" + phone);
		System.out.println("����:" + age);
		
		return "result";
	}
	*/
	
	/*
	@RequestMapping(value="form", method = RequestMethod.POST)
	//@RequestParam�� �̿��� �Ķ���� ó���� ���� �޼ҵ�
	//Spring���� �Ķ���� ó���� �� �� ���� ����ϴ� ���
	//������ �̸��� �Ķ���Ͱ� ���� �� ������ List �� �迭�� �޴� �͵� ����
	public String form(
			@RequestParam("name") String name,
			@RequestParam("phone") String phone,
			@RequestParam("age") int age) {
		//���
		System.out.println("�̸�:" + name);
		System.out.println("��ȭ��ȣ:" + phone);
		System.out.println("����:" + age);
		
		return "result";
	}
	*/
	
	@RequestMapping(value="form", method = RequestMethod.POST)
	//Command ��ü�� �̿��ϴ� ���
	public String form(User user) {
		//���
		System.out.println(user);
		return "result";
	}
	
	@RequestMapping(value="detail/{num}", 
			method = RequestMethod.GET)
	//��θ� ������ �̿��ϰ��� �� �� �о�� ��� : �ֱ��� ��α��� �Խ��ǿ� �̿�
	public String detail(@PathVariable("num") int num) {
		//���
		System.out.println(num);
		return "result";
	}
}








package com.camp_us.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.camp_us.dto.MemberVO;
import com.camp_us.service.MemberService;

@Controller
@RequestMapping("/login")
public class LoginController {
	
	private MemberService memberService;
	
	@Autowired
	public LoginController(MemberService memberService) {
		this.memberService = memberService;
	}
	
	@GetMapping("/index")
	public String loginGet() {		
		String url = "/login/index";
		return url;
	}
	
	@PostMapping("/index")
	public String loginPost(String id, String pwd,HttpSession session)throws Exception{
		String url="redirect:/main";
		
		MemberVO member=null;
		member = memberService.getMember(id);			
				
		if(member!=null && pwd.equals(member.getMem_pass())) { //로그인 성공.
				session.setAttribute("loginUser",member);
		}else {  //아이디 불일치
			url="redirect://login/index";
		}	
		
		return url;
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		String url="redirect:/";
		
		session.invalidate(); //세션 갱신
		
		return url;
	}

}

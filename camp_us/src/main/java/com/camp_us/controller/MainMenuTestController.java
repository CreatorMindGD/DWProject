package com.camp_us.controller;

import javax.servlet.http.HttpSession;

import com.camp_us.dto.MemberVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/main")
public class MainMenuTestController {

    @GetMapping("/home")
    public String memberInfo(HttpSession session, Model model) {
        MemberVO member = (MemberVO) session.getAttribute("loginUser");
        model.addAttribute("member", member);
        return "/main/home"; // → /WEB-INF/views/member/info.jsp
    }
}

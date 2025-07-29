package com.camp_us.security;

import java.io.IOException;
import javax.servlet.http.*;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;

import com.camp_us.dto.MemberVO;

public class LoginSuccessHandler extends SavedRequestAwareAuthenticationSuccessHandler {
    public LoginSuccessHandler() {
        setDefaultTargetUrl("/camp_us/main/home");
    }

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
                                         Authentication authentication) throws IOException {
    	System.out.println("로그인 성공");
    	User user = (User) authentication.getPrincipal();
        MemberVO member = user.getMember();

        // 세션에 로그인 정보 저장
        request.getSession().setAttribute("loginUser", member);
        response.sendRedirect(getDefaultTargetUrl());
    }
}
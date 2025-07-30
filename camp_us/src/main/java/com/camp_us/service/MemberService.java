package com.camp_us.service;

import java.sql.SQLException;

import com.camp_us.dto.MemberVO;

public interface MemberService {

	MemberVO getMemberById(String mem_id) throws SQLException;
	MemberVO getMember(String id) throws SQLException;
	void updateMemLastLogin(String mem_id) throws Exception;

}
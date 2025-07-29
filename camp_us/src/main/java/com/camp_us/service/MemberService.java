package com.camp_us.service;

import java.sql.SQLException;
import java.util.List;

import com.camp_us.dto.MemberVO;

public interface MemberService {

	MemberVO getMemberById(String mem_id) throws SQLException;
	MemberVO getMember(String id) throws SQLException;

}
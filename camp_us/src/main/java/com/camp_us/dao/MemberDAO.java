package com.camp_us.dao;

import java.sql.SQLException;
import java.util.List;

import com.camp_us.dto.MemberVO;

public interface MemberDAO {
	MemberVO getMemberById(String mem_id) throws SQLException;

	String selectAuthoritiesById(String id);
}






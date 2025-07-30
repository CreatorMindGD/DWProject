package com.camp_us.dao;

import java.sql.SQLException;
import java.sql.Time;
import java.util.Date;
import java.util.List;

import com.camp_us.dto.LectureVO;
import com.camp_us.dto.MemberVO;

public interface MemberDAO {
	MemberVO getMemberById(String mem_id) throws SQLException;

	String selectAuthoritiesById(String id);
	
	void insertLastLogin(MemberVO vo) throws Exception;
}






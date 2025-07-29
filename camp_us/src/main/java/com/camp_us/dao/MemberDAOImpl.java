package com.camp_us.dao;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.camp_us.dto.MemberVO;

public class MemberDAOImpl implements MemberDAO{
	
	private SqlSession session;	
	public MemberDAOImpl(SqlSession session) {
		this.session = session;
	}


	@Override
	public MemberVO getMemberById(String mem_id) throws SQLException {
		return session.selectOne("Member-Mapper.selectMemberByID",mem_id);
	}


	@Override
	public String selectAuthoritiesById(String mem_id) {
		return session.selectOne("Member-Mapper.selectAuthoritiesById",mem_id);
	}
}

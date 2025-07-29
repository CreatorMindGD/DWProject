package com.camp_us.service;

import java.sql.SQLException;
import java.util.List;

import com.camp_us.command.PageMaker;
import com.camp_us.dao.MemberDAO;
import com.camp_us.dto.MemberVO;



public class MemberServiceImpl implements MemberService {


	private MemberDAO memberDAO;

	public MemberServiceImpl(MemberDAO memberDAO) {
		this.memberDAO = memberDAO;
	}
	
	@Override
    public MemberVO getMemberById(String mem_id) throws SQLException{
        return memberDAO.getMemberById(mem_id);
    }
	
	@Override
	public MemberVO getMember(String id) throws SQLException {
		MemberVO member = memberDAO.getMemberById(id);
		if (member != null)
			member.setMem_auth(memberDAO.selectAuthoritiesById(id));
		return member;
	}

}





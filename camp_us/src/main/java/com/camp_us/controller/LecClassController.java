package com.camp_us.controller;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.camp_us.dto.MemberVO;
import com.camp_us.dto.StuLecVO;
import com.camp_us.dto.UnsubmitHomeworkVO;
import com.camp_us.service.StuLecService;
import com.camp_us.service.UnsubmitHomeworkService;

@Controller
@RequestMapping("/lecture")
public class LecClassController {
    
    @Autowired
    private StuLecService stuLecService;
    
    @Autowired
    private UnsubmitHomeworkService unsubmitHomeworkService;
    @GetMapping("/main")
	public String main(HttpSession session, Model model) throws Exception {
    	MemberVO member = (MemberVO) session.getAttribute("loginUser");
        model.addAttribute("member", member);
		String stu_id = member.getMem_id();
//		List<UnsubmitHomeworkVO> unsubmithwList = unsubmitHomeworkService.getUnsubmitHomeworkList(stu_id);
		
		
//		model.addAttribute("unsubmitList", unsubmithwList);
		
		
		
		return "lecture/main";
	}

    @GetMapping("/changeMajor")
    @ResponseBody
    public List<StuLecVO> getLectureInfo(@RequestParam("lec_id") String lec_id) throws SQLException {
        return stuLecService.selectLectureListByStudentId(lec_id);
    }
    @GetMapping("/syllabus")
    public String syllabus(@RequestParam("lec_id") String lec_id, Model model) {
        model.addAttribute("lec_id", lec_id);
        return "lecture/syllabus";  
    }
    @GetMapping("/공지사항")
    public String 공지사항(@RequestParam("lec_id") String lec_id, Model model) {
        model.addAttribute("lec_id", lec_id);
        return "lecture/공지사항";  
    }
    @GetMapping("/실시간 강의")
    public String 실시간강의(@RequestParam("lec_id") String lec_id, Model model) {
        model.addAttribute("lec_id", lec_id);
        return "lecture/실시간강의";  
    }
    @GetMapping("/온라인강의")
    public String 온라인강의(@RequestParam("lec_id") String lec_id, Model model) {
        model.addAttribute("lec_id", lec_id);
        return "lecture/syllabus";  
    }
    @GetMapping("/출결")
    public String 출결(@RequestParam("lec_id") String lec_id, Model model) {
        model.addAttribute("lec_id", lec_id);
        return "lecture/출결";  
    }
    @GetMapping("/자료실")
    public String 자료실(@RequestParam("lec_id") String lec_id, Model model) {
        model.addAttribute("lec_id", lec_id);
        return "lecture/자료실";  
    }
    @GetMapping("/과제제출")
    public String 과제제출(@RequestParam("lec_id") String lec_id, Model model) {
        model.addAttribute("lec_id", lec_id);
        return "lecture/과제제출";  
    }
}
package com.camp_us.dto;

import java.util.Date;

public class ProjectVO {
	private String project_id; //프로젝트 아이디
	private String project_name; //프로젝트 이름
	private String project_desc; //프로젝트 상세설명
	private String project_proc; //프로젝트 진행정도
	private String sche_name; //일정명
	private Date sche_start; //일정 시작일
	private Date sche_end; //일정 종료일
	private String pjsumit_eval; //최종 프로젝트 평가 여부
	private String profes_id; // 교수아이디
	public String getProject_id() {
		return project_id;
	}
	public void setProject_id(String project_id) {
		this.project_id = project_id;
	}
	public String getProject_name() {
		return project_name;
	}
	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}
	public String getProject_desc() {
		return project_desc;
	}
	public void setProject_desc(String project_desc) {
		this.project_desc = project_desc;
	}
	public String getProject_proc() {
		return project_proc;
	}
	public void setProject_proc(String project_proc) {
		this.project_proc = project_proc;
	}
	public String getSche_name() {
		return sche_name;
	}
	public void setSche_name(String sche_name) {
		this.sche_name = sche_name;
	}
	public Date getSche_start() {
		return sche_start;
	}
	public void setSche_start(Date sche_start) {
		this.sche_start = sche_start;
	}
	public Date getSche_end() {
		return sche_end;
	}
	public void setSche_end(Date sche_end) {
		this.sche_end = sche_end;
	}
	public String getPjsumit_eval() {
		return pjsumit_eval;
	}
	public void setPjsumit_eval(String pjsumit_eval) {
		this.pjsumit_eval = pjsumit_eval;
	}
	public String getProfes_id() {
		return profes_id;
	}
	public void setProfes_id(String profes_id) {
		this.profes_id = profes_id;
	}
	
	
}

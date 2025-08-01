package com.camp_us.service;

import java.sql.SQLException;
import java.util.List;

import com.camp_us.dto.ProjectVO;

public interface ProjectService {
    // 특정 학생이 속한 프로젝트 목록 조회
    List<ProjectVO> listByStudentId(String stu_id) throws SQLException;

    // 특정 학생이 참여 중인 진행 중 프로젝트 수 조회
    int countOngoingByStudentId(String stu_id) throws SQLException;

    // 프로젝트 상세 조회
    ProjectVO detail(String project_id) throws SQLException;

    // 프로젝트 등록
    void regist(ProjectVO project) throws SQLException;

    // 프로젝트 수정
    void modify(ProjectVO project) throws SQLException;

    // 프로젝트 삭제
    void remove(String projectId) throws SQLException;

}

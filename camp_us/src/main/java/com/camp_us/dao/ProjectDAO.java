package com.camp_us.dao;

import java.sql.SQLException;
import java.util.List;

import com.camp_us.dto.ProjectVO;

public interface ProjectDAO {
    // 특정 학생이 속한 모든 프로젝트 목록 조회
    List<ProjectVO> selectProjectListByStuId(String stu_id) throws SQLException;

    // 특정 학생의 진행 중 프로젝트 수 (상태 = '진행중')
    int selectOngoingProjectCountByStuId(String stu_id) throws SQLException;

    // 프로젝트 ID로 상세 정보 조회
    ProjectVO selectProjectById(String projectId) throws SQLException;

    // 새 프로젝트 등록
    void insertProject(ProjectVO project) throws SQLException;

    // 프로젝트 수정
    void updateProject(ProjectVO project) throws SQLException;

    // 프로젝트 삭제
    void deleteProject(String projectId) throws SQLException;
}

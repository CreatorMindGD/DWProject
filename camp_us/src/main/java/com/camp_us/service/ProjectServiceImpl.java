package com.camp_us.service;

import java.sql.SQLException;
import java.util.List;

import com.camp_us.dao.ProjectDAO;
import com.camp_us.dto.ProjectVO;

public class ProjectServiceImpl implements ProjectService{
    private final ProjectDAO projectDAO;

    public ProjectServiceImpl(ProjectDAO projectDAO) {
        this.projectDAO = projectDAO;
    }

    @Override
    public List<ProjectVO> listByStudentId(String stuId) throws SQLException {
        return projectDAO.selectProjectListByStuId(stuId);
    }

    @Override
    public int countOngoingByStudentId(String stuId) throws SQLException {
        return projectDAO.selectOngoingProjectCountByStuId(stuId);
    }

    @Override
    public ProjectVO detail(String projectId) throws SQLException {
        return projectDAO.selectProjectById(projectId);
    }

    @Override
    public void regist(ProjectVO project) throws SQLException {
        projectDAO.insertProject(project);
    }

    @Override
    public void modify(ProjectVO project) throws SQLException {
        projectDAO.updateProject(project);
    }

    @Override
    public void remove(String projectId) throws SQLException {
        projectDAO.deleteProject(projectId);
    }

}



package com.camp_us.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.camp_us.dto.ProjectVO;
import com.camp_us.service.ProjectService;

@Controller
@RequestMapping("/project")
public class ProjectController {
    private ProjectService projectService;

    @Autowired
    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }
    
    // 프로젝트 목록 (특정 학생 ID 기준)
    @GetMapping("/list")
    public void list(@RequestParam("stuId") String stu_id, Model model) throws Exception {
        List<ProjectVO> projectList = projectService.listByStudentId(stu_id);
        model.addAttribute("projectList", projectList);
    }

    // 프로젝트 상세
    @GetMapping("/detail")
    public void detail(@RequestParam("project_id") String project_id, Model model) throws Exception {
        ProjectVO project = projectService.detail(project_id);
        model.addAttribute("project", project);
    }

    // 프로젝트 등록 폼
    @GetMapping("/regist")
    public void registForm() {
        // 뷰 이름은 /project/regist.jsp
    }

    // 프로젝트 등록 처리
    @PostMapping("/regist")
    public String registPost(ProjectVO project) throws Exception {
        projectService.regist(project);
        return "redirect:/project/list?stuId=" + project.getProfes_id(); // 혹은 적절한 리다이렉트 경로
    }

    // 프로젝트 수정 폼
    @GetMapping("/modify")
    public void modifyForm(@RequestParam("project_id") String project_id, Model model) throws Exception {
        ProjectVO project = projectService.detail(project_id);
        model.addAttribute("project", project);
    }

    // 프로젝트 수정 처리
    @PostMapping("/modify")
    public String modifyPost(ProjectVO project) throws Exception {
        projectService.modify(project);
        return "redirect:/project/detail?project_id=" + project.getProject_id();
    }

    // 프로젝트 삭제
    @GetMapping("/remove")
    public String remove(@RequestParam("project_id") String project_id) throws Exception {
        projectService.remove(project_id);
        return "redirect:/project/list";  // 필요한 경우 학생 ID 등 추가 파라미터 포함
    }
}

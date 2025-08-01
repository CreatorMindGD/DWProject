package com.camp_us.controller;

import java.io.File;
import java.io.IOException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.camp_us.dto.LectureVO;
import com.camp_us.service.LectureService;

@Controller
@RequestMapping("/lecture")
public class LectureUplaodController {

	
    @GetMapping("/list")
    public String lectureList(@RequestParam("lec_id") String lec_id, Model model) {
    	model.addAttribute("lec_id", lec_id);
        return "lecture/list";
    }
 
    @GetMapping("/upload")
    public String uploadForm() {
        return "lecture/upload";
    }
    
    @Resource(name = "lectureService")
    private LectureService lectureService;

    @GetMapping("/finalupload")
    public String finalUploadForm(Model model) {
        model.addAttribute("lec_id", "testcourse3");
        return "lecture/final";
    }

    @PostMapping("/finalupload")
    public String uploadFinal(@RequestParam("planFile") MultipartFile planFile) {
        String courseId = "testcourse3";
        try {
            lectureService.saveFinalPlan(courseId, planFile);
        } catch (Exception e) {
            e.printStackTrace();
            return "errorPage";
        }
        return "redirect:/lecture/success";
    }
    
    @GetMapping("/success")
    public String success() {
        return "lecture/success";
    }
    
//    @GetMapping("/planmaker/view")
//    public String viewPlanmaker(HttpServletRequest request, Model model) {
//        LectureVO vo = lectureService.getFirstLecturePlanmaker(); // DAO의 selectFirstOne 활용
//        if (vo == null) {
//            model.addAttribute("hasPdf", false);
//            return "lecture/planmakerView";  // JSP에서 "데이터 없음" 메시지
//        }
//        String fileEndpoint = request.getContextPath() + "/lecture/planmaker/file";
//        String encoded = URLEncoder.encode(fileEndpoint, StandardCharsets.UTF_8);
//        model.addAttribute("hasPdf", true);
//        model.addAttribute("encodedFileUrl", encoded);
//        return "lecture/planmakerView";
//    }

    /** 
     * pdf.js가 불러가는 실제 PDF 스트리밍
     */
//    @GetMapping("/planmaker/file")
//    public ResponseEntity<?> streamPlanmakerPdf() throws IOException {
//        LectureVO vo = lectureService.getFirstLecturePlanmaker();
//        if (vo == null) {
//            return ResponseEntity.notFound().build();   // OK
//        }
//
//        File file = new File(vo.getFilePath());
//        if (!file.exists()) {
//            return ResponseEntity.notFound().build();   // OK
//        }
//
//        Resource resource = new FileSystemResource(file);
//
//        return ResponseEntity.ok()
//                .contentType(MediaType.APPLICATION_PDF)
//                .header(HttpHeaders.CONTENT_DISPOSITION,
//                        "inline; filename=\"" + URLEncoder.encode(vo.getFileName(), StandardCharsets.UTF_8) + "\"")
//                .body(resource);
//    }
}

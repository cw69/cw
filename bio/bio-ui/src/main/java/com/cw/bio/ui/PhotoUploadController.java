package com.cw.bio.ui;

import com.cw.bio.bi.PhotoUploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class PhotoUploadController {

    private PhotoUploadService photoUploadService;

    @Autowired
    public PhotoUploadController(PhotoUploadService photoUploadService) {
        this.photoUploadService = photoUploadService;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/uploadPhoto")
    public String provideUploadInfo() {
        return "uploadForm";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/uploadPhoto")
    public String uploadFile(@RequestParam("name") String name, @RequestParam("file") MultipartFile file,
                             RedirectAttributes redirectAttributes) {
        photoUploadService.uploadPhoto();
        return "redirect:/";
    }
}

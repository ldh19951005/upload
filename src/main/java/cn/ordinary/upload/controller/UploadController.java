package cn.ordinary.upload.controller;

import cn.ordinary.upload.entity.WebValue;
import cn.ordinary.upload.util.FileUtil;
import cn.ordinary.upload.util.FolderUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

/**
 * @author ordinary
 * @date 2019/12/24
 */
@Controller
@RequestMapping("/upload")
public class UploadController {

    @Autowired
    private WebValue webValue;

    @ResponseBody
    @PostMapping("/file")
    public String uploadFile(HttpServletRequest servletRequest, MultipartFile file) {
        try {
            String folder = FolderUtil.getSaveFolder(webValue.getResourcePath());
            String fileName = file.getOriginalFilename();
            System.out.println(fileName);
            FileUtil.writeFile(folder + fileName, file.getBytes());
            return "success";
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            return "failed";
        }
    }
}

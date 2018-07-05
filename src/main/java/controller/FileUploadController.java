package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;

/**
 * @descripthion:
 * @author: Young Cao
 * @date: 下午4:52 18/7/5
 */
@Controller
public class FileUploadController {

    @PostMapping("/upload")
    public String upload(@RequestParam("file") MultipartFile file,
                         HttpServletRequest request) {

        if (!file.isEmpty()) {

            String contextPath = request.getContextPath();//"/SpringMvcFileUpload"
            String servletPath = request.getServletPath();//"/gotoAction"
            String scheme = request.getScheme();//"http"


            String storePath = "/Users/caoyang/Desktop/yunhe/src/main/webapp/images";//存放我们上传的文件路径

            String fileName = file.getOriginalFilename();

            File filepath = new File(storePath, fileName);

            if (!filepath.getParentFile().exists()) {
                filepath.getParentFile().mkdirs();//如果目录不存在，创建目录
            }

            try {
                file.transferTo(new File(storePath + File.separator + fileName));//把文件写入目标文件地址
            } catch (Exception e) {
                e.printStackTrace();
                return "error";
            }

            return "success";//返回到成功页面
        } else {
            return "error";//返回到失败的页面
        }
    }
}

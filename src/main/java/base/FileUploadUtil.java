package base;

import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * @descripthion:
 * @author: Young Cao
 * @date: 下午5:06 18/7/6
 */
public class FileUploadUtil {

    /**
     * 文件上传
     *
     * @param file 输入文件
     * @param request HttpServletRequest
     * @param childPath 存储于tomcat目录下的webapps子目录（用户自己设置，例如："/images/"）
     * @return 文件访问路径
     * @throws IllegalStateException .
     * @throws IOException .
     */
    private static String upload(MultipartFile file,
                         HttpServletRequest request, String childPath) throws IllegalStateException, IOException {

        if (file == null) return "";

        //获取上传文件的原始名称
        String originalFilename = file.getOriginalFilename();
        String newFileName = "";
        String pic_path;
        if (originalFilename.length() <= 0) return "";

        //获取Tomcat服务器所在的路径
        String tomcat_path = System.getProperty("user.dir");
        //获取Tomcat服务器所在路径的最后一个文件目录
        String bin_path = tomcat_path.substring(tomcat_path.lastIndexOf("/") + 1, tomcat_path.length());
        //若最后一个文件目录为bin目录，则服务器为手动启动
        if (("bin").equals(bin_path)) {//手动启动Tomcat时获取路径为：D:\Software\Tomcat-8.5\bin
            //获取保存上传图片的文件路径
            pic_path = tomcat_path.substring(0, System.getProperty("user.dir").lastIndexOf("/")) + "/webapps" + childPath;
        } else {//服务中自启动Tomcat时获取路径为：D:\Software\Tomcat-8.5
            pic_path = tomcat_path + "/webapps" + childPath;
        }
        // 新的图片名称
        newFileName = UUID.randomUUID() + originalFilename.substring(originalFilename.lastIndexOf("."));
        // 新图片
        File newFile = new File(pic_path + newFileName);
        if (!newFile.getParentFile().exists()) {
            newFile.getParentFile().mkdirs();//如果目录不存在，创建目录
        }
        // 将内存中的数据写入磁盘
        file.transferTo(newFile);

        // 获得上传图片的服务器端路径.
        String request_path = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort();
        String img_relative_path = childPath + newFileName;
        return request_path + img_relative_path;
    }

    /**
     * 图片上传
     *
     * @param file 输入文件
     * @param request HttpServletRequest
     * @return 文件访问路径
     * @throws IOException .
     */
    public static String imageUpload(MultipartFile file, HttpServletRequest request) throws IOException {
        return FileUploadUtil.upload(file, request, "/images/");
    }

    /**
     * 视频上传
     *
     * @param file 输入文件
     * @param request HttpServletRequest
     * @return 文件访问路径
     * @throws IOException .
     */
    public static String videoUpload(MultipartFile file, HttpServletRequest request) throws IOException {
        return FileUploadUtil.upload(file, request, "/videos/");
    }
}

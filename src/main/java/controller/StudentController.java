package controller;

import base.AppResult;
import base.AppResultBuilder;
import base.ResultStringUtil;
import entity.Student;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "/api/student", produces = "application/json;charset=UTF-8")
public class StudentController {
    private static final Logger logger = LogManager.getLogger(StudentController.class.getName());

    @Qualifier("studentService")
    @Autowired
    private IStudentService service;

    /**
     * 获取一条student信息
     *
     * @param id student的id，必选
     * @param name student的姓名，可选
     * @return student信息
     */
    @GetMapping("/detail")
    public AppResult<Student> get(@RequestParam("id") Long id,
                       @RequestParam(required = false, name = "name") String name) {
        logger.info("测试log4j");
        Student student = service.selectById(id);
        if (student != null) {
            return AppResultBuilder.buildSuccessMessageResult(student, ResultStringUtil.QUERY_SUCCESS);
        }
        return AppResultBuilder.buildFailedMessageResult(ResultStringUtil.QUERY_FAIL);
    }

    /**
     * post请求，插入一条student数据
     *
     * @param student 包含student信息的json字符串
     * @return 包含成功或失败的json字符串
     */
    @PostMapping("/addStudent")
    public AppResult<Student> post(@RequestBody Student student) {

        int result = service.insert(student);

        if (result > 0) {
            return AppResultBuilder.buildSuccessMessageResult(student, ResultStringUtil.QUERY_SUCCESS);
        }
        return AppResultBuilder.buildFailedMessageResult(ResultStringUtil.QUERY_FAIL);
    }

}


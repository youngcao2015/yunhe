package service.impl;

import mapper.StudentMapper;
import org.springframework.stereotype.Service;

import java.util.List;

import entity.Student;
import org.springframework.transaction.annotation.Transactional;
import service.IStudentService;

import javax.annotation.Resource;


@Service("studentService")
public class StudentServiceImpl implements IStudentService {
    @Resource
    private StudentMapper studentMapper;

    @Override
    public int deleteByPrimaryKey(byte[] uid) {
        return studentMapper.deleteByPrimaryKey(uid);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int insert(Student record) {
        return studentMapper.insert(record);
    }

    @Override
    public int insertSelective(Student record) {
        return studentMapper.insertSelective(record);
    }

    @Override
    public Student selectById(Long id) {
        return studentMapper.selectById(id);
    }

    @Override
    public List<Student> selectByCondition(Student record) {
        return studentMapper.selectByCondition(record);
    }

    @Override
    public int updateByPrimaryKeySelective(Student record) {
        return studentMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Student record) {
        return studentMapper.updateByPrimaryKey(record);
    }
}

package service;

import entity.Student;

import java.util.List;


public interface IStudentService {
    int deleteByPrimaryKey(byte[] uid);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectById(Long id);

    List<Student> selectByCondition(Student record);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
}

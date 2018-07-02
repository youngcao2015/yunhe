package mapper;

import org.springframework.stereotype.Repository;
import entity.Student;
import java.util.List;

/**
 * @descripthion:
 * @author: Young Cao
 * @date: 下午6:19 18/6/23
 */
@Repository
public interface StudentMapper {
    int deleteByPrimaryKey(byte[] uid);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectById(Long id);

    List<Student> selectByCondition(Student record);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
}

package github.akanemiku.mybatisplusdemo.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import github.akanemiku.mybatisplusdemo.entity.Student;

import java.util.List;

public interface StudentService {
    /**
     * 分页查找全部学生
     *
     * @param page 当前页
     * @param size 每页显示数
     * @return
     */
    IPage<Student> findAllStudents(long page, long size);

    /**
     * 根据id删除学生
     *
     * @param studentId 学生id
     * @return
     */
    int deleteById(int studentId);

    /**
     * 根据id查找学生
     *
     * @param studentId 学生id
     * @return 学生实体
     */
    Student findById(long studentId);

    /**
     * 根据学生实体新增学生
     *
     * @param student 学生实体对象
     * @return
     */
    int insertStudent(Student student);

    /**
     * 根据学生id更新学生信息
     *
     * @param student 学生实体
     * @return
     */
    int updateById(Student student);
}

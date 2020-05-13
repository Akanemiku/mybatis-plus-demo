package github.akanemiku.mybatisplusdemo.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import github.akanemiku.mybatisplusdemo.entity.Student;

import java.util.List;

public interface StudentService {
    IPage<Student> findAllStudents(long page, long size);

    int deleteById(int studentId);

    Student findById(long studentId);

    int insertStudent(Student student);

    int updateById(Student student);
}

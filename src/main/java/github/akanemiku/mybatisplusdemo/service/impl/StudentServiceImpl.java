package github.akanemiku.mybatisplusdemo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import github.akanemiku.mybatisplusdemo.dao.StudentMapper;
import github.akanemiku.mybatisplusdemo.entity.Student;
import github.akanemiku.mybatisplusdemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public IPage<Student> findAllStudents(long page, long size) {
        QueryWrapper<Student> queryWrapper = new QueryWrapper<>();
        Page<Student> studentPage = new Page<>(page,size);

        return studentMapper.findAll(studentPage,queryWrapper);
    }

    @Override
    public int deleteById(int studentId) {
        return studentMapper.deleteById(studentId);
    }

    @Override
    public Student findById(long studentId) {
        return studentMapper.selectById(studentId);
    }

    @Override
    public int insertStudent(Student student) {
        return studentMapper.insert(student);
    }

    @Override
    public int updateById(Student student) {
        return studentMapper.updateById(student);
    }
}

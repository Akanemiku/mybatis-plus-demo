package github.akanemiku.mybatisplusdemo.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import github.akanemiku.mybatisplusdemo.entity.Student;
import github.akanemiku.mybatisplusdemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/list")
    public String list(@RequestParam(value = "page", defaultValue = "1") long page,
                       @RequestParam(value = "size", defaultValue = "5") long size,
                       Model model) {
        IPage<Student> students = studentService.findAllStudents(page, size);
        System.out.println(students.getRecords().toString());
        model.addAttribute("students", students);
        model.addAttribute("current", students.getCurrent());
        model.addAttribute("size", students.getSize());
        return "student";
    }

    @GetMapping("/edit")
    public String index(@RequestParam(value = "studentId", required = false) Integer studentId,
                        Model model) {
        if(studentId!=null){
            Student student = studentService.findById(studentId);
            model.addAttribute("studentId",studentId);
            model.addAttribute("student", student);
        }
        return "studentEdit";
    }

    @PostMapping("/save")
    public String save(Student student,Model model){
        int rows;
        if(student.getStudentId()==null){
            rows = studentService.insertStudent(student);
            if (rows > 0) {
                return "common/success";
            } else {
                model.addAttribute("msg","保存学生失败！");
                return "common/error";
            }
        }else{
            rows = studentService.updateById(student);
            if (rows > 0) {
                return "common/success";
            } else {
                model.addAttribute("msg","更新学生失败！");
                return "common/error";
            }
        }
    }

    @GetMapping("/delete")
    public String delete(@RequestParam(value = "studentId", required = true) Integer studentId,
                         Model model) {
        int rows = studentService.deleteById(studentId);
        if (rows > 0) {
            return "common/success";
        } else {
            model.addAttribute("msg","删除学生失败！");
            return "common/error";
        }
    }
}

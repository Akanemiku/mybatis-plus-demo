package github.akanemiku.mybatisplusdemo.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import github.akanemiku.mybatisplusdemo.entity.Student;
import github.akanemiku.mybatisplusdemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/list")
    public String list(@RequestParam(value = "page",defaultValue = "1") long page,
            @RequestParam(value = "size",defaultValue = "5") long size,
            Model model){
        IPage<Student> students = studentService.findAllStudents(page, size);
        System.out.println(students.getRecords().toString());
        model.addAttribute("students",students);
        model.addAttribute("current",students.getCurrent());
        model.addAttribute("size",students.getSize());
        return "student";
    }
}

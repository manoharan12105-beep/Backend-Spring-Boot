package H2.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    public List<Student> getStudents() {
        return studentService.getStudents();
    }

    @PostMapping("/students")
    public Student addStudent(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }
    /*
    postman

    URL: http://localhost:8080/api/students
    Method: POST

    Body (raw JSON):
    {
        "firstName": "John",
        "lastName": "Doe"
    }
        
    */
}

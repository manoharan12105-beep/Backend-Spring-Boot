package H2.example.demo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repo;

    public List<Student> getStudents() {
        return repo.findAll();
    }

    public Student saveStudent(Student student) {
      return repo.save(student);
  }
}

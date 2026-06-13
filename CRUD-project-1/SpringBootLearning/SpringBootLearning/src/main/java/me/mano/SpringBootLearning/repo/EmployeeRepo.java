package me.mano.SpringBootLearning.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import me.mano.SpringBootLearning.entity.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long> {

    @Query("SELECT e FROM Employee e WHERE e.empId >= :start AND e.empId <= :end AND e.empAge <= :age")
    List<Employee>  query1(@Param("start") Long start, @Param("end") Long end, @Param("age") int age);

}

package me.mano.SpringBootLearning.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import me.mano.SpringBootLearning.entity.Employee2;

@Repository
public interface EmployeeRepo2 extends JpaRepository<Employee2, Long> {
    
}

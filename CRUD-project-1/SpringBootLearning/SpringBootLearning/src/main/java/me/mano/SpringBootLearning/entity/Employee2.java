package me.mano.SpringBootLearning.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "employee_details2")
public class Employee2 {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "emp_id")
  private Long empId;

  private String empName;

  private int empAge;


  // address_ad_id (default name)
  @OneToMany(cascade = CascadeType.ALL)
  @JoinColumn(name = "address_id_2", referencedColumnName = "emp_id")
  private List<Address> address;
}

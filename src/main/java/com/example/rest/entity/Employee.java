package com.example.rest.entity;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter @NoArgsConstructor
public class Employee {
	
	  @Id @GeneratedValue
	  private Long id;
	  private String name;
	  private String role;

	  Employee() {}

	  Employee(String name, String role) {

	    this.name = name;
	    this.role = role;
	  }


	  @Override
	  public boolean equals(Object o) {

	    if (this == o)
	      return true;
	    if (!(o instanceof Employee))
	      return false;
	    Employee employee = (Employee) o;
	    return Objects.equals(this.id, employee.id) && Objects.equals(this.name, employee.name)
	        && Objects.equals(this.role, employee.role);
	  }

	  @Override
	  public int hashCode() {
	    return Objects.hash(this.id, this.name, this.role);
	  }

	  @Override
	  public String toString() {
	    return "Employee{" + "id=" + this.id + ", name='" + this.name + '\'' + ", role='" + this.role + '\'' + '}';
	  }

}

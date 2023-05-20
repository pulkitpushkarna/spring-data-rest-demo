package com.demo.reactbackend.repository;




import com.demo.reactbackend.entity.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestResource
@CrossOrigin("http://localhost:3000")
public interface EmployeeRepository extends CrudRepository<Employee,Integer> {
}

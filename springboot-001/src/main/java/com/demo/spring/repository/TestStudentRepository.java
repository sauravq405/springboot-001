package com.demo.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.spring.beans.TestStudent;

@Repository
public interface TestStudentRepository extends JpaRepository<TestStudent, Integer> {
	
	TestStudent findByStudId(Integer id);

}

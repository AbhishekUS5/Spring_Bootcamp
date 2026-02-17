package com.Example.Hibernate;

import com.Example.Hibernate.dao.StudentDAO;
import com.Example.Hibernate.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HibernateApplication {

	public static void main(String[] args) {
		SpringApplication.run(HibernateApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){
		return runner -> {
//			createStudent(studentDAO);
			createMultipleStudent(studentDAO);
		};
	}

	private void createStudent(StudentDAO studentDAO) {
		// create the student object
		System.out.println("Creating new student object ...");
		Student tempStudent = new Student("Paul","Doe","Sam@gmail.com");

		// save the student objects
		System.out.println("Saving the student...");
		studentDAO.save(tempStudent);
	}

	private void createMultipleStudent(StudentDAO studentDAO) {
		// create multiple students
		System.out.println("Creating new student object ...");
		Student student1 = new Student("Paul","Doe","paul@gmail.com");
		Student student2 = new Student("John","Smith","john@gmail.com");
		Student student3 = new Student("Mary","Jane","mary@gmail.com");
		Student student4 = new Student("James","Bond","bond@gmail.com");

		// save the student object
		System.out.println("Saving the student...");
		studentDAO.save(student1);
		studentDAO.save(student2);
		studentDAO.save(student3);
		studentDAO.save(student4);

		// display the id of the saved student
		System.out.println("Saved student. Generated ID: " + student1.getId());
		for (int i = student1.getId(); i < student4.getId(); i++) {
			System.out.println(i);
		}
	}
}

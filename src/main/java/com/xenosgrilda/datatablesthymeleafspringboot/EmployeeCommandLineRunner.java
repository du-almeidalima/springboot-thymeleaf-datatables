package com.xenosgrilda.datatablesthymeleafspringboot;

import com.xenosgrilda.datatablesthymeleafspringboot.entity.Employee;
import com.xenosgrilda.datatablesthymeleafspringboot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class EmployeeCommandLineRunner implements org.springframework.boot.CommandLineRunner {

    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeCommandLineRunner(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }

    @Override
    public void run(String... args) {

        if (employeeRepository.findAll().size() > 0) {
            employeeRepository.deleteAll();
        }

        employeeRepository.saveAll(Arrays.asList(
                new Employee("Juaum", "Bonito", "juaumzinho@gmail.com"),
                new Employee("Fabricio", "Feio", "fabricio@gmail.com"),
                new Employee("Pedrinho", "Firmeza", "pedrinho@gmail.com"),
                new Employee("Mariazinha", "Fina", "maria@gmail.com"),
                new Employee("Clarinha", "Preto", "clarinha@gmail.com"),
                new Employee("Robisbal", "Lupshicnk", "robisbal@gmail.com"),
                new Employee("Bacanau", "Boreto", "boret@gmail.com"),
                new Employee("Wanderzin", "Vraus", "wandin@gmail.com"),
                new Employee("Soneca", "Maroto", "soneca@gmail.com"),
                new Employee("Joaninha", "Grossa", "joaninha@gmail.com"),
                new Employee("Penelope", "Zica", "pepe@gmail.com"),
                new Employee("Nina", "Chorona", "nina@gmail.com")
        ));
    }
}

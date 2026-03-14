package app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.AppConfig;
import model.Student;

public class MainAnno {

    public static void main(String[] args) {

        // Load Spring Container using Annotation Config
        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        // Get Student Bean
        Student s = context.getBean(Student.class);

        // Setter Injection Values
        s.setStudentId(201);
        s.setName("jyothika");
        s.setCourse("CSE");
        s.setYear(2);

        // Print Values
        s.display();
    }
}
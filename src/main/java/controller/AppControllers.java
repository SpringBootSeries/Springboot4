package controller;

import model.Student;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/app")

public class AppControllers {
    Student s1 = new Student("2020ict65","Chandru",23,"IT",3.66);
    Student s2 = new Student("2020bm31","Tharu",24,"BM",3.80);
    Student s3 = new Student("2020ASB76","Suthan",23,"BIO Sceince",4.0);
    Student s4 = new Student("2020ICt34","Chamari",25,"ICT",3.59);
    Student s5 = new Student("2020ICT67","Chawendra",30,"ITa",3.25);

    private static List<Student> students = new  ArrayList<Student>();
    private Map<String,Student> mstudents = new HashMap<String,Student>();


    public AppControllers(){
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);

        mstudents.put(s1.getRegNo(),s1);
        mstudents.put(s2.getRegNo(),s2);
        mstudents.put(s3.getRegNo(),s3);
        mstudents.put(s4.getRegNo(),s4);
        mstudents.put(s5.getRegNo(),s5);


    }
    @GetMapping("/msg")
    public String Mymessage() {
        return "Hello Spring Boot!";
    }

    @GetMapping("/age/{ag}")
    public String myAge(@PathVariable("ag") int age)
    {
        return "My Age is " +age;
    }

    //a method  to return student
    @GetMapping("/student")
    public Student getStudent()
    {
        return s1;
    }

    //return multiple students
    @GetMapping("/students")
    public Map<String,Student> getStudents()
    {
        return mstudents;
    }


    //find a student from the list by regNo
    @GetMapping("/students/{regNo}")
    public Student getStudentsReg(@PathVariable("regNo") String regNo )
    {
        return mstudents.get(regNo);
    }

    @PostMapping("/add")
    public String addStudent(@RequestBody Student student)
    {
        mstudents.put(student.getRegNo(),student);
        return "New Student added";g
    }

}

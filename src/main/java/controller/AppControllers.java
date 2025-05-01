package controller;

import model.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")

public class AppControllers {
    Student s1 = new Student("2020ict65","Chandru",23,"IT",3.66);
    Student s2 = new Student("2020bm31","Tharu",24,"BM",3.80);
    Student s3 = new Student("2020ASB76","Suthan",23,"BIO Sceince",4.0);
    Student s4 = new Student("2020ICt34","Chamari",25,"ICT",3.59);
    Student s5 = new Student("2020ICT67","Chawendra",30,"ITa",3.25);

}

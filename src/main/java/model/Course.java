package model;

public class Course {
    private String code;
    private String name;
    private int credits;

    public Course(String name, String code, int credits) {
        super();
        this.name = name;
        this.code = code;
        this.credits = credits;
    }
}

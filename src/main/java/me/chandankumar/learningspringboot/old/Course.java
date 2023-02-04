package me.chandankumar.learningspringboot.old;

public class Course {

    private long id;
    private String courseName;
    private String author;

    public Course(long id, String courseName, String author) {
        this.id = id;
        this.courseName = courseName;
        this.author = author;
    }

    public long getId() {
        return id;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getAuthor() {
        return author;
    }
}

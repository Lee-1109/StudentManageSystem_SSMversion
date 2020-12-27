package model;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author 南昌航空大学 18045221-李扬
 * @Date 2020/12/19 12:45
 * @Version 1.0
 */

/*
 * 对应v_grade
 */

public class Grade implements Serializable {
    private String courseId;
    private String courseName;
    private String classId;
    private String teacherId;
    private String studentId;
    private String studentName;
    private double grade;

    public Grade(){}
    public Grade(String courseId,String studentId){
        this.courseId=courseId;
        this.studentId=studentId;
    }

    public Grade(String courseId,String studentId,double grade){
        this.courseId=courseId;
        this.studentId=studentId;
        this.grade=grade;
    }
    public Grade(String courseId,String classId,String teacherId){
        this.courseId = courseId;
        this.classId = classId;
        this.teacherId=teacherId;
    }

    public Grade(String courseId, String courseName, String classId, String teacherId, String studentId, String studentName, double grade) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.classId = classId;
        this.teacherId = teacherId;
        this.studentId = studentId;
        this.studentName = studentName;
        this.grade = grade;
    }


    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public String getClassId() {
        return classId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public double getGrade() {
        return grade;
    }
}

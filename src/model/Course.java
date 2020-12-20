package model;

/**
 * @Author 南昌航空大学 18045221-李扬
 * @Date 2020/12/19 14:10
 * @Version 1.0
 */

public class Course {
    private String courseId;
    private String courseName;
    private String majorId;
    private String majorName;
    private String teacherId;
    private String teacherName;
    private int period;
    private double credit;

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

    public void setMajorId(String majorId) {
        this.majorId = majorId;
    }

    public String getMajorId() {
        return majorId;
    }

    public void setMajorName(String majorName) {
        this.majorName = majorName;
    }

    public String getMajorName() {
        return majorName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public int getPeriod() {
        return period;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public double getCredit() {
        return credit;
    }
}

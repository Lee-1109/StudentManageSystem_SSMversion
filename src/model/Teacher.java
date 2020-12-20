package model;

/**
 * @Author 南昌航空大学 18045221-李扬
 * @Date 2020/12/19 14:09
 * @Version 1.0
 */
/*对用DB中的view_v_teacher*/
public class Teacher {
    private String insId;
    private String insName;
    private String majorId;
    private String majorName;
    private String teacherId;
    private String teacherName;
    private boolean gender;
    private int age;

    public void setInsId(String insId) {
        this.insId = insId;
    }

    public String getInsId() {
        return insId;
    }

    public void setInsName(String insName) {
        this.insName = insName;
    }

    public String getInsName() {
        return insName;
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

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public boolean getGender(){
        return this.gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}

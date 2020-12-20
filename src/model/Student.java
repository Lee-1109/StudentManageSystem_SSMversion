package model;

public class Student {
    private String insId;
    private String insName;
    private String majorId;
    private String majorName;
    private String id;
    private String name;
    private String classes;
    private Integer age;
    private boolean gender;

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

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String getClasses() {
        return classes;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public boolean isGender() {
        return gender;
    }
}

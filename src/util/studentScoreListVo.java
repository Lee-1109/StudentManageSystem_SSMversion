package util;

import model.Grade;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author 南昌航空大学 18045221-李扬
 * @Date 2020/12/21 16:16
 * @Version 1.0
 */

public class studentScoreListVo implements Serializable {
    private List<Grade> studentList;

    public studentScoreListVo(){
        studentList = new ArrayList<>();
    }
    public void setStudentList(List<Grade> studentList) {
        this.studentList = studentList;
    }

    public List<Grade> getStudentList() {
        return studentList;
    }

    public boolean isEmpty(){
        return studentList.isEmpty();
    }
}

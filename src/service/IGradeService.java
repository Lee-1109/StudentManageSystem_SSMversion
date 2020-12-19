package service;

import model.Grade;
import model.Student;

/**
 * @Author 南昌航空大学 18045221-李扬
 * @Date 2020/12/19 13:45
 * @Version 1.0
 */

public interface IGradeService {
    Grade stuGetOneCourseGrade(String courId,String stuId);
}

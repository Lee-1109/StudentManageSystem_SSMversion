package service.impl;

import dao.IGradeDAO;
import model.Grade;
import model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import service.IGradeService;

/**
 * @Author 南昌航空大学 18045221-李扬
 * @Date 2020/12/19 13:47
 * @Version 1.0
 */

public class GradeServiceImpl implements IGradeService {

    private IGradeDAO gradeDAO;


    @Autowired
    public void setGradeDAO(IGradeDAO gradeDAO) {
        this.gradeDAO = gradeDAO;
    }

    @Override
    public Grade stuGetOneCourseGrade(String courId, String stuId) {
        return gradeDAO.stuGetOneGradeById(new Grade(courId,stuId));
    }
}

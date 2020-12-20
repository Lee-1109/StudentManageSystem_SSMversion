package dao.impl;

import dao.ICourseDAO;
import model.Course;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

/**
 * @Author 南昌航空大学 18045221-李扬
 * @Date 2020/12/20 10:37
 * @Version 1.0
 */

public class CourseDaoImpl extends SqlSessionDaoSupport implements ICourseDAO {
    /**
     * 添加课程
     * @param course 添加的课程对象
     * @return 添加成功返回 true 否则返回false
     */
    @Override
    public boolean add(Course course) {
        return this.getSqlSession().insert("model.Course.insertCourse", course) != 0;
    }

    /**
     * 更新课程信息
     * @param course 新课程对象
     * @return 更新成功返回true 否则返回false
     */
    @Override
    public boolean update(Course course) {

        return this.getSqlSession().update("model.Course.updateCourse",course) != 0;
    }

    @Override
    public boolean delete(String courseId) {
        return false;
    }

    @Override
    public List<Course> selectList() {
        return this.getSqlSession().selectList("model.Course.fromCourse");
    }

    @Override
    public List<Course> selectListByMajorId(String majorId) {
        return null;
    }

    @Override
    public List<Course> findByCondition(String condition) {
        return this.getSqlSession().selectList("model.Course.findByCondition","%"+condition+"%");
    }

    @Override
    public boolean addOneMajorCourse(String majorId, String courseId) {
        return false;
    }

    @Override
    public String getCourseNameByCourId(String courseId) {
       Course course = null;
        course = this.getSqlSession().selectOne("selectCourseNameById",courseId);
        if(null != course){
            return course.getCourseName();
        }else return "courseNotFound";
    }

    @Override
    public String getCourseIdByCourName(String courseName) {
        Course course = null;
        course = this.getSqlSession().selectOne("selectCourseIdByName",courseName);
        if(null != course){
            return course.getCourseId();
        }else return "courseNotFound";
    }

    @Override
    public List<Course> enterCourseList(String teacherId) {
        return this.getSqlSession().selectList("fromEnterCourse",teacherId);
    }

    @Override
    public List<Course> notEnterCourseList(String teacherId) {
        return this.getSqlSession().selectList("fromNotEnterCourse",teacherId);
    }
}

package camt.cbsd.dao;

import camt.cbsd.entity.Course;
import camt.cbsd.repository.CourseRepostitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by CAMT on 4/7/2017.
 */
@Repository
public class CourseDaoImpl implements CourseDao {
    CourseRepostitory courseRepostitory;
    @Autowired
    public void setCourseRepostitory(CourseRepostitory courseRepostitory) {
        this.courseRepostitory = courseRepostitory;
    }
    @Override
    public Course add(Course course) {
        return courseRepostitory.save(course);
    }
}

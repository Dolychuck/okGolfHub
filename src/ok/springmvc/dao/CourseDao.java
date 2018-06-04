package ok.springmvc.dao;

import java.util.List;
import ok.springmvc.model.Course;

public interface CourseDao {

	List<Course> selectAll();
}

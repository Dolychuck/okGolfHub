package ok.springmvc.service;

import java.util.List;

import ok.springmvc.model.Course;

public interface CourseService {

	List<Course> selectAll();
}

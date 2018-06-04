package ok.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import ok.springmvc.dao.CourseDao;
import ok.springmvc.model.Course;

public class CourseServiceImpl implements CourseService	 {

	@Autowired
	  public CourseDao courseDao;
	
	@Override
	public List<Course> selectAll() {
		return courseDao.selectAll();
	}
	
}

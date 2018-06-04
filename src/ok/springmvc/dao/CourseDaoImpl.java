package ok.springmvc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import ok.springmvc.model.Course;
import ok.springmvc.model.User;

public class CourseDaoImpl implements CourseDao {
	@Autowired
	DataSource datasource;
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public List<Course> selectAll() {
		String sql = "SELECT * FROM course";
		List<Course> courses = jdbcTemplate.query(sql, new CourseMapper());
		return !courses.isEmpty() ? courses : null;
	}
}

class CourseMapper implements RowMapper<Course> {
	public Course mapRow(ResultSet rs, int arg1) throws SQLException {
		Course course = new Course();
		course.setId(rs.getInt("id"));
		course.setName(rs.getString("name"));
		return course;
	}
}

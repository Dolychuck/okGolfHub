package ok.springmvc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import ok.springmvc.model.Hole;

public class HoleDaoImpl implements HoleDao {
	@Autowired
	DataSource datasource;
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Hole> selectAll() {
		String sql = "SELECT * FROM hole";
		List<Hole> holes = jdbcTemplate.query(sql, new HoleMapper());
		return !holes.isEmpty()?holes:null;
	}

	public Hole selectByNumber(int number) {
		String sql = "SELECT * FROM hole WHERE number = ?";
		return (Hole) jdbcTemplate.queryForObject(sql,new Object[]{number}, 
				(rs, rowNum) ->{ 
					return new Hole(rs.getInt("number"),rs.getInt("par"),rs.getInt("course_id"));
					
				});
	}
	
	class HoleMapper implements RowMapper<Hole> {

		@Override
		public Hole mapRow(ResultSet rs, int arg1) throws SQLException {
			Hole hole = new Hole();
			hole.setCourse_id(rs.getInt("course_id"));
			hole.setNumber(rs.getInt("number"));
			hole.setPar(rs.getInt("par"));
			return hole;
		}
		
	}
}

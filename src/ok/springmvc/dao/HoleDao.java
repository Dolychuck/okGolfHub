package ok.springmvc.dao;

import java.util.List;

import ok.springmvc.model.Hole;

public interface HoleDao {
	List<Hole> selectAll();
	Hole selectByNumber(int number);
}

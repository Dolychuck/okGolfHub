package ok.springmvc.service;

import java.util.List;

import ok.springmvc.model.Hole;

public interface HoleService {
	Hole selectByNumber(int number);
	List<Hole> selectAll();
}

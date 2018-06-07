package ok.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import ok.springmvc.dao.HoleDao;
import ok.springmvc.model.Hole;

public class HoleServiceImpl implements HoleService{
	@Autowired
	HoleDao holeDao;
	
	@Override
	public Hole selectByNumber(int number) {
		return holeDao.selectByNumber(number);
	}

	@Override
	public List<Hole> selectAll() {
		return holeDao.selectAll();
	}
}

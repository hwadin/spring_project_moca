package net.koreate.moca.cafe.service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import net.koreate.moca.cafe.dao.CafeMenuDAO;
import net.koreate.moca.cafe.vo.CafeMenuVO;

@Service
@RequiredArgsConstructor
public class CafeMenuServiceImpl implements CafeMenuService{

	private final CafeMenuDAO dao;

	@Override
	public void regist(CafeMenuVO vo) throws Exception {
		dao.regist(vo);		
	}

	@Override
	public CafeMenuVO read(int cafe_no) throws Exception {
		return dao.read(cafe_no);
	}

	@Override
	public void update(CafeMenuVO vo) throws Exception {
		dao.update(vo);
		
	}

	@Override
	public void delete(int no) throws Exception {
		dao.delete(no);
		
	}

}

package net.koreate.moca.cafe.service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import net.koreate.moca.cafe.dao.CafeDAO;
import net.koreate.moca.cafe.vo.CafeVO;

@Service
@RequiredArgsConstructor
public class CafeServiceImpl implements CafeService {

	private final CafeDAO dao;
	
	@Override
	public void regist(CafeVO vo) throws Exception {
		dao.regist(vo);
	}

	@Override
	public CafeVO read(int owner_no) throws Exception {
		return dao.read(owner_no);
	}

	@Override
	public void update(CafeVO vo) throws Exception {
		dao.update(vo);
		
	}

	@Override
	public void delete(int no) throws Exception {
		dao.delete(no);
		
	}

}

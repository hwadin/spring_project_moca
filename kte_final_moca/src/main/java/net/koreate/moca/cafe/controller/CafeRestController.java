package net.koreate.moca.cafe.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import net.koreate.moca.cafe.service.CafeLikeService;
import net.koreate.moca.cafe.service.CafeMenuService;
import net.koreate.moca.cafe.service.CafeService;
import net.koreate.moca.cafe.vo.CafeLikeVO;
import net.koreate.moca.cafe.vo.CafeMenuVO;
import net.koreate.moca.cafe.vo.CafeVO;
import net.koreate.moca.schedule.vo.ScheduleVO;

@RestController
@RequestMapping("/cafe/api/*")
@RequiredArgsConstructor 
public class CafeRestController {

	private final CafeMenuService cms;
	private final CafeService cs;
	private final CafeLikeService cls;
	
	
	@GetMapping("cafeList")
	public ResponseEntity<List<CafeVO>> cafeList(int index){
		List<CafeVO> list = null;
		try {
			list = cs.cafeList(index);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<>(list,HttpStatus.OK);
	}
	
	@GetMapping("cafeMenuList")
	public ResponseEntity<List<CafeMenuVO>> cafeMenuList(CafeMenuVO vo){
		List<CafeMenuVO> list = null;
		try {
			list = cms.menuList(vo);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<>(list,HttpStatus.OK);
	}
	
	@GetMapping("cafeDetail")
	public ResponseEntity<CafeVO> cafeDetail(int no){
		CafeVO cafevo = null;
		try {
			cafevo = cs.read(no);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<>(cafevo,HttpStatus.OK);
	} 
	
	@GetMapping("cafeLike")
	public ResponseEntity<CafeLikeVO> cafeLike(CafeLikeVO vo){
		CafeLikeVO likevo = null;
		try {
			likevo = cls.read(vo);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<>(likevo,HttpStatus.OK);
	}
	
	@PatchMapping("/")
	public ResponseEntity<String> update(CafeLikeVO vo) {
		try {
			cls.update(vo);
			return new ResponseEntity<>("SUCCESS", HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>("FAILED", HttpStatus.BAD_REQUEST);
		}
	}

	

		
}

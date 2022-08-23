package net.koreate.moca.member.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import net.koreate.moca.member.vo.MemberVO;


public interface MemberDAO {

	// 로그인
	@Select("SELECT * FROM tbl_member WHERE id=#{id} AND pw=#{pw}")
	MemberVO logIn(MemberVO vo) throws Exception;

	// 회원가입
	@Insert("INSERT INTO tbl_member(profile_url,id,pw,name,age,gender,post,addr,addr_detail) VALUES(#{profile_url},#{id},#{pw},#{name},#{age},#{gender},#{post},#{addr},#{addr_detail})")
	void signUp(MemberVO vo)throws Exception;
	
	// 회원정보 수정 비밀번호,이름, 나이, 주소
	@Update("UPDATE tbl_member SET profile_url=#{profile_url},pw=#{pw}, name=#{name}, age=#{pw}, post=#{post},addr=#{addr},addr_detail=#{addr_detail} WHERE no =#{no}")
	void memberUpdate(MemberVO vo) throws Exception;

	// owner 회원가입
	@Insert("")
	void ownerSignUp() throws Exception;
	
}

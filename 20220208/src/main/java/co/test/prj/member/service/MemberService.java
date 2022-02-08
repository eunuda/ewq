package co.test.prj.member.service;

import java.util.List;

import co.test.prj.member.vo.MemberVO;

public interface MemberService {

	List<MemberVO>memberSelectList();
	MemberVO memberSelect(MemberVO vo);
	int memberInsert(MemberVO vo);
	int memberUpdate(MemberVO vo);
	int memberDelete(MemberVO vo);

	boolean isIdCheck(String id);
 
	
}
	

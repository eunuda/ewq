package co.test.prj.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.test.prj.comm.Command;
import co.test.prj.member.service.MemberService;
import co.test.prj.member.serviceImpl.MemberServiceImpl;
import co.test.prj.member.vo.MemberVO;

public class ProcessCommand implements Command {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		// ȸ������
		MemberService memberDao = new MemberServiceImpl();
		MemberVO vo = new MemberVO();
		vo.setId(request.getParameter("id"));
		//�߰��Ѵ�
		int n = memberDao.memberInsert(vo);
		if(n != 0) {
			request.setAttribute("message", "���� ����");
		}else {
			request.setAttribute("message", "���� ����");
		}
		return "member/register";
	}

}

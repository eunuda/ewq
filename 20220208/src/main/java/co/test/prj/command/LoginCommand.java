package co.test.prj.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import co.test.prj.comm.Command;
import co.test.prj.member.service.MemberService;
import co.test.prj.member.serviceImpl.MemberServiceImpl;
import co.test.prj.member.vo.MemberVO;

public class LoginCommand implements Command{

		@Override
		public String exec(HttpServletRequest request, HttpServletResponse response) {
		
			MemberService memberDao = new MemberServiceImpl();
			String page;
			HttpSession session = request.getSession();
			MemberVO vo = new MemberVO();
			vo.setId(request.getParameter("id"));
			vo.setPassword(request.getParameter("password"));
			vo = memberDao.memberSelect(vo);
			if (vo != null) {
				session.setAttribute("id", vo.getId());
				session.setAttribute("author", vo.getAuthor());
				session.setAttribute("name", vo.getName());
				session.setAttribute("member", vo);
				page = "main.do";
			} else {
				request.setAttribute("message", "아이디 또는 패스워드 불일치");
				page = "member/memberError";
			}
			return page;

		}

	}



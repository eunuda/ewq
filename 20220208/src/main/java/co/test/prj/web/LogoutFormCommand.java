package co.test.prj.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.test.prj.comm.Command;

public class LogoutFormCommand implements Command {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		 
		return "member/logoutForm";
	}

}

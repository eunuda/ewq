package co.test.prj.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.test.prj.comm.Command;

public class LoginFormCommand implements Command{

		@Override
		public String exec(HttpServletRequest request, HttpServletResponse response) {
			
			return "member/loginForm";
		}
		
}

package co.test.prj.web;

import java.io.IOException;

import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.test.prj.comm.Command;
import co.test.prj.command.LoginFormCommand;
import co.test.prj.command.LogoutCommand;
import co.test.prj.command.MainCommand;
import co.test.prj.command.ProcessCommand;
import co.test.prj.command.SignupFormCommand;

@WebServlet("*.do")
	public class FrontController extends HttpServlet {
		private static final long serialVersionUID = 1L;
		private HashMap<String, Command> map;

		public FrontController() {
			super();
		}

		public void init(ServletConfig config) throws ServletException {
			map = new HashMap<String, Command>();
			map.put("/main.do", new MainCommand()); // 메인 페이지
			map.put("/loginForm.do", new LoginFormCommand()); // 메인 페이지
			map.put("/signupForm.do", new SignupFormCommand()); // 메인 페이지
			map.put("/logoutForm.do", new LogoutFormCommand()); // 메인 페이지
			map.put("/process.do", new ProcessCommand());//회원가입
		}

		protected void service(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
			request.setCharacterEncoding("UTF-8");

			String uri = request.getRequestURI();
			String contextPath = request.getContextPath();
			String page = uri.substring(contextPath.length());

			Command command = map.get(page);
			String viewPage = command.exec(request, response);

			if (!viewPage.endsWith(".do")) {
				viewPage = "/WEB-INF/views/" +viewPage + ".jsp";
			}

			RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
			dispatcher.forward(request, response);
		}

	}


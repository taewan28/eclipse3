package day6.mvc.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CartController implements Controller {
	
	@Override
	public void handle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//없는 jsp 요청하므로 404 상태코드 -> error.html 페이지 표시(web.nml)
		RequestDispatcher dispatcher = request.getRequestDispatcher("carts.jsp");
		dispatcher.forward(request, response);
		
	}
}

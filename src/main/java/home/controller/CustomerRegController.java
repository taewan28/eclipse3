package home.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import home.dao.MybatisCustomerDao;
import home.dto.CustomerDto;




public class CustomerRegController implements Controller{
	
	@Override
	public void handle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		if (request.getMethod().equals("GET")) {

			RequestDispatcher dispatcher = request.getRequestDispatcher("join.jsp");
			dispatcher.forward(request, response);
			
		}else {
			request.setCharacterEncoding("UTF-8");
			
			String userid = request.getParameter("userid");
			String name = request.getParameter("name");
			String email = request.getParameter("email");
			String temp = request.getParameter("age");
			
			int age = 0;
			if(temp.length() !=0) age = Integer.parseInt(temp);

			MybatisCustomerDao dao = new MybatisCustomerDao();
			CustomerDto dto = new CustomerDto(userid, name, email, age, null);
			
			int result = dao.insert(dto);	
			
			
			String message= "고객 등록이 완료되었습니다";
			if (result ==0) {
				message = "고객등록 오류가 발생했습니다";
			}
			
			response.setContentType("text/html; charset=UTF-8");
			PrintWriter out = response.getWriter();
			out.print("<script>");
			out.print("alert('"+message+"');");
			out.print("location.href='/jsp3_home';");
			out.print("</script>");
		}
		
		
	}
	
}
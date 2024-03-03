package home.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import home.dao.MybatisProductDao;
import home.dto.ProductDto;



public class ProductRegController implements Controller{
	
	@Override
	public void handle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		if (request.getMethod().equals("GET")) {

			RequestDispatcher dispatcher = request.getRequestDispatcher("add.jsp");
			dispatcher.forward(request, response);
			
		}else {
			request.setCharacterEncoding("UTF-8");
			
			String pcode = request.getParameter("pcode");
			String category = request.getParameter("category");
			String pname = request.getParameter("pname");
			String temp = request.getParameter("price");
			
			int price = 0;
			if(temp.length() !=0) price = Integer.parseInt(temp);

			MybatisProductDao dao = new MybatisProductDao();
			ProductDto dto = new ProductDto(pcode, category, pname, price);
			
			int result = dao.register(dto);	
			
			
			String message= "상품 등록이 완료되었습니다";
			if (result ==0) {
				message = "상품등록 오류가 발생했습니다";
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

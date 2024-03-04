package home.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import home.dto.CateDto;
import home.dao.MybatisProductDao;
import home.dto.ProductDto;


public class ProductListController implements Controller{
	

		private static final Logger logger = LoggerFactory.getLogger(ProductListController.class);
		@Override
		public void handle(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
			String category = req.getParameter("category");
			String keyword = req.getParameter("keyword");
			String from = req.getParameter("from");
			String to = req.getParameter("to");
			
			Map<String, Object> map=new HashMap<>();
			if(category != null && category.trim().length() !=0) {
				map.put("category", category);
				req.setAttribute("cate", category);
			}
			if(keyword != null && !keyword.isEmpty()) {
				map.put("keyword", keyword.trim());
				req.setAttribute("keyword", keyword);
			}

			if(from != null && !from.isEmpty() && to != null && !to.isEmpty()) {
				map.put("from", from.trim());
				map.put("to", to.trim());
			}
			
			logger.info("[MyInfo] 파리미터 map : {}",map);
			
			MybatisProductDao dao = new MybatisProductDao();
			List<ProductDto> list = dao.search(map);
			req.setAttribute("productList", list);
			
			List<CateDto> cateList = dao.getCategories();
			req.setAttribute("cateList", cateList);
			
			RequestDispatcher dispatcher = req.getRequestDispatcher("list.jsp");
			dispatcher.forward(req, resp);
			
		}
}

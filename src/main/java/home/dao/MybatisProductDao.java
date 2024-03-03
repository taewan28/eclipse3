package home.dao;

import java.util.List;


import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import home.dto.ProductDto;
import mybatis.SqlSessionBean;

public class MybatisProductDao {
	
	private SqlSessionFactory sessionFactory = SqlSessionBean.getSessionFactory(); 
	
	public List<ProductDto> selectAll() {
		SqlSession sqlSession = sessionFactory.openSession();
		List<ProductDto> list = sqlSession.selectList("tblproduct.selectAll");
		sqlSession.close();
		return list;
	}
	
	public int register(ProductDto dto) {
		SqlSession sqlSession = sessionFactory.openSession();
		int result = sqlSession.insert("tblproduct.register",dto);
		sqlSession.commit();
		sqlSession.close();
		return result;
	}
	
	
}

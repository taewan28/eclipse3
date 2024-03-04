package home.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import home.dto.CateDto;
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
	
	 public List<ProductDto> search(Map<String,Object>map){
		 SqlSession sqlSession = sessionFactory.openSession();
		 List<ProductDto> list = sqlSession.selectList("tblproduct.search",map);
		 sqlSession.close();
		 return list;
		 
	 }
	 
	 public List<CateDto> getCategories(){
		 SqlSession sqlSession = sessionFactory.openSession();
		 List<CateDto> list = sqlSession.selectList("tblproduct.getCategories");
		 sqlSession.close();
		 return list;
		 
		 }
	
	
}

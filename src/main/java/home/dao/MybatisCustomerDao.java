package home.dao;

import java.util.List;


import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import home.dto.CustomerDto;
import mybatis.SqlSessionBean;

public class MybatisCustomerDao {
	
	private SqlSessionFactory sessionFactory = SqlSessionBean.getSessionFactory();
	   
	   public List<CustomerDto> selectAll() {
	      SqlSession sqlSession = sessionFactory.openSession();
	      List<CustomerDto> list = sqlSession.selectList("tblcustom.selectAll");
	      sqlSession.close();
	      return list;
	   }
	   
	   public int insert(CustomerDto vo) {
	      SqlSession sqlSession = sessionFactory.openSession();
	      int result = sqlSession.insert("tblcustom.insert",vo);
	      sqlSession.commit();
	      sqlSession.close();
	      return result;
	   }
	   
	   
}

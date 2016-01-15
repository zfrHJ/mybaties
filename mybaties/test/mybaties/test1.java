package mybaties;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.itheima.mybatits.mapper.OrdersMapperCustom;
import com.itheima.mybatits.po.Orders;

public class test1 {
	//会话工厂
	private SqlSessionFactory sqlSessionFactory;
	@Before
	public void setUp() throws IOException{
		//加载配置文件
		String resource="SqlMapConfig.xml";
		InputStream inputStream=Resources.getResourceAsStream(resource);
		//根据mybaties的配置创建SqlSessionFactory
		sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
	}
	
	@Test
	public void testfindOrderUserDetsilist() throws Exception{
		SqlSession sqlSession =sqlSessionFactory.openSession();
		OrdersMapperCustom ordersMapperCustom = sqlSession
				.getMapper(OrdersMapperCustom.class);
		List<Orders> list = ordersMapperCustom.findOrdersUserDetailList();
		System.out.println(list.size());
	}

}

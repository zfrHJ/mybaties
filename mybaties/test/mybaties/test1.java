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
	//�Ự����
	private SqlSessionFactory sqlSessionFactory;
	@Before
	public void setUp() throws IOException{
		//���������ļ�
		String resource="SqlMapConfig.xml";
		InputStream inputStream=Resources.getResourceAsStream(resource);
		//����mybaties�����ô���SqlSessionFactory
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

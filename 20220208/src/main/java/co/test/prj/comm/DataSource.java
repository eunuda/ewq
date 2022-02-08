package co.test.prj.comm;

import java.io.IOException;


import java.io.InputStream;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class DataSource {


		private static SqlSessionFactory sqlsessionFactory;
		private DataSource(){};
		
		public static SqlSessionFactory getInstance() {
			String resource ="org/mybatis-config.xml";
			try {
			InputStream inputStream = Resources.getResourceAsStream(resource);
			sqlsessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		
		}catch(IOException e) {
		e.printStackTrace();	
				
			
		}return sqlsessionFactory;
	}
	}


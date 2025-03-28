package com.ict.service;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class DBService {

	private static SqlSessionFactory factory;
	// config.xml 파일 위치
	private static final String resource = "com/ict/repository/db_config.xml";

	static {
		try {
			InputStream in = Resources.getResourceAsStream(resource);
			factory = new SqlSessionFactoryBuilder().build(in);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	// 다른 곳(DAO)에서 factory를 호출할 수 있도록 만들자
	public static SqlSessionFactory getFactory() {
		return factory;
	}
}

package dao.r;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import dao.IntefaceDao;

public abstract class Dao<T> implements IntefaceDao<T> {

	String esquema;
	Connection connection;
	PreparedStatement preparedStatement;
	ResultSet resultSet;

	public Dao() {
                esquema = SingletonConnection.getEsquema();
                System.out.println("aqui:"+esquema);
		connection = SingletonConnection. //
				getSingletonConnection(). //
				getConnection();
	}

}

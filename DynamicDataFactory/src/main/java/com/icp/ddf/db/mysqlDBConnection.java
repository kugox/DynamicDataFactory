package com.icp.ddf.db;

import java.sql.*;
import com.icp.ddf.commom.*;

public class mysqlDBConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public Connection getConnection(dbParameter parm) throws SQLException
	{
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://" + parm.getHost() + "/" + parm.getDbName();
		try
		{
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url, parm.getUserName(), parm.getPassword());
			if(!conn.isClosed())
			{
				System.out.println("Succeeded connectiong to the mysql");
			}
			return conn;
			
		} catch(ClassNotFoundException e) {
			System.out.println("Not find the mysql driver");
			return null;
		}
	}
}

package com.icp.ddf.db;

import java.sql.*;
import com.icp.ddf.commom.*;

public class mysqlDataAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mysqlDBConnection mysqlConn = new mysqlDBConnection();
		try {
			dbParameter parm = new dbParameter();
			parm.setHost("localhost");
			parm.setDbName("python");
			parm.setUserName("root");
			parm.setPassword("123456");
			Connection conn = mysqlConn.getConnection(parm);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

	
}

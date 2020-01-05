package com.jcg.jdbc.mssql;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcMsSql {
	public static Connection connObj;
    public static String JDBC_URL = "jdbc:sqlserver://localhost:1433;databaseName=db_atm;integratedSecurity=true";
 
    public static void getDbConnection() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connObj = DriverManager.getConnection(JDBC_URL);
            
        } catch(Exception sqlException) {
            sqlException.printStackTrace();
        }
    }
    
 
    public static void main(String[] args) {
        getDbConnection();
    }
}

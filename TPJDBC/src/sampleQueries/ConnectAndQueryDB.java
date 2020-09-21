package sampleQueries;

import java.sql.*;

public class ConnectAndQueryDB {

	private static String user = "root";
	private static String passwd = "root";
	private Connection cn = null;
	private Statement st = null;
	private static String url = "jdbc:mysql://localhost:8889/tp_jdbc";
	
	public static void getRequette(String sql) throws SQLException {
		java.sql.Connection connect = DriverManager.getConnection(url, user, passwd); // Get connection
		Statement statement = connect.createStatement() ; // statement creation 
		ResultSet rs = statement.executeQuery(sql) ;  // SQL request  ; rs => result of SQL request
		ResultSetMetaData resultMeta = rs.getMetaData();

		while(rs.next()) //tant qu'il y a une suite on continue
		{
			for(int i = 1; i <= resultMeta.getColumnCount(); i++)
			{
				System.out.print(toString(rs.getObject(i))+" "); // resultMeta.getColumnName(i).toUpperCase()  
			}
			System.out.println();
		} rs.close();
		connect.close();
	}



	public static void main(String[] args) {
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver"); // Driver Loading	
			getRequette("SELECT name FROM poi ORDER BY name DESC");
			getRequette("CREATE TABLE VISITOR(id INT PRIMARY KEY NOT NULL, name VARCHAR(20), country VARCHAR(20))");
		} 

		catch (Exception e) 
		{ e.printStackTrace(); }


	}

	public static String toString(Object T)
	{
		if(T==null)
			return "NULL" ;
		else 
			return T.toString() ;
	}

}


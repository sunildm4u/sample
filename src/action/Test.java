package action;

import java.sql.Connection;
import java.sql.DriverManager;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	
	Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/athomeservices?useUnicode=true&characterEncoding=UTF-8&zeroDateTimeBehavior=convertToNull&serverTimezone=GMT","root","Facet@1431");
	System.out.println(con.getSchema());
} catch (Exception e) {
	e.printStackTrace();
	// TODO: handle exception
}
	}

}

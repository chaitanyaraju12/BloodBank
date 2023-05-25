import java.sql.Connection;
import java.sql.DriverManager;

public class connectDB {
	public static void main(String[] args) {
		connectDB obj_connectDB=new connectDB();
		System.out.println(obj_connectDB.get_db());
	}

	public Connection get_db() {
		// TODO Auto-generated method stub
		
		Connection db= null;
		try {
			db = DriverManager.getConnection("jdbc:postgresql://localhost/Java", "postgres", "chaitanyahii1207");
			if(db!=null)
				System.out.println("Connected!");
			}catch(Exception e) {
				System.out.println(e);
			}
		return db;
	}

}

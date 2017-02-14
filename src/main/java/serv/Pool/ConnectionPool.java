import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Class which represent a pool of connections
 * @author hammadin
 *
 */
public class ConnectionPool {
	
	/**
	 * the pool of connections
	 */
	private ArrayList<Connection> pool;
	
	/**
	 * The database url
	 */
	private final String url = "jdbc:mysql://localhost:8889/tacos";
	
	/**
	 * JDBC driver
	 */
	private final String driver = "com.mysql.jdbc.Driver";
	
	/**
	 * The username (login) to access the database
	 */
	private final String user = "root";
	
	/**
	 * The password to access the database
	 */
	private final String password = "root";
	
	/**
	 * Class constructor
	 * @param nbConnection The number of connections in the pool
	 */
	public ConnectionPool(int nbConnection) {
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		for(int i = 0 ; i < nbConnection ; i++) {
			try {
				Connection co = DriverManager.getConnection(url, user, password);
				pool.add(co);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * Return an available connection from the pool
	 * @return an available connection
	 */
	public Connection getConnectionPool() {
		if(pool.isEmpty()) {
			System.out.println("There are no connection available");
			return null;
		}
		return pool.remove(pool.size());
	}
	
	/**
	 * Put the connection back to the pool
	 * @param co the connection which go back to the pool
	 */
	public void ConnectionToPool(Connection co) {
		pool.add(co);
	}
}

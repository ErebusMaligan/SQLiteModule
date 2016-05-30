package db.instance.specific.sqlite.wrapper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import db.instance.generic.wrapper.DatabaseWrapper;

/**
 * @author Daniel J. Rivers
 *         2013
 *
 * Created: Sep 18, 2013, 11:00:44 AM 
 */
public class SQLiteDatabaseWrapper implements DatabaseWrapper {
	
	private boolean init = false;
	
	private String name;
	
	@Override
	public void setName( String name ) {
		this.name = name;
	}
	
	@Override
	public Connection getConnection() throws ClassNotFoundException, SQLException {
		if ( !init ) {
			Class.forName( "org.sqlite.JDBC" );
			init = true;
		}
		return DriverManager.getConnection( "jdbc:sqlite:" + name );
	}
}
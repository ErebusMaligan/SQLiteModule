package db.instance.specific.sqlite;


import db.instance.DatabaseInstance;
import db.instance.generic.column.ColumnTypes;
import db.instance.generic.wrapper.DatabaseWrapper;
import db.instance.specific.sqlite.column.SQLiteColumnTypes;
import db.instance.specific.sqlite.wrapper.SQLiteDatabaseWrapper;

/**
 * @author Daniel J. Rivers
 *         2013
 *
 * Created: Sep 18, 2013, 12:06:03 PM 
 */
public class SQLiteDatabase implements DatabaseInstance {
	
	private ColumnTypes c;
	
	private DatabaseWrapper dbw;
	
	public SQLiteDatabase() {
		c = new SQLiteColumnTypes();
		dbw = new SQLiteDatabaseWrapper();
	}

	@Override
	public ColumnTypes getColumnTypes() {
		return c;
	}
	
	@Override
	public DatabaseWrapper getDatabaseWrapper() {
		return dbw;
	}
}
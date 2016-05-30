package db.instance.specific.sqlite.column;

import db.element.column.ColumnData;
import db.element.column.IntData;
import db.element.column.NumberData;
import db.instance.generic.column.ColumnTypes;

/**
 * @author Daniel J. Rivers
 *         2013
 *
 * Created: Sep 18, 2013, 12:10:44 PM 
 */
public class SQLiteColumnTypes implements ColumnTypes {
	
	@Override
	public String getStringTypeName() {
		return "TEXT";
	}
	
	@Override
	public String getNumberTypeName() {
		return "NUMERIC";
	}
	
	@Override
	public String getIntTypeName() {
		return "INTEGER";
	}

	@Override
	public ColumnData getTypeByNumber( String name, int num ) {
		ColumnData ret = null;
		switch( num ) {
			case 12: ret = new SQLiteStringData( name ); break;
			case 6: ret = new NumberData( name ); break;
			case 4: ret = new IntData( name ); break;
		}
		return ret;
	}
}
package db.instance.specific.sqlite.column;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

import db.element.column.StringData;

/**
 * @author Daniel J. Rivers
 *         2013
 *
 * Created: Oct 3, 2013, 10:01:09 AM 
 */
public class SQLiteStringData extends StringData {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static SimpleDateFormat format = new SimpleDateFormat( "yyyy-MM-dd HH:mm:ss" );

	/**
	 * @param name
	 */
	public SQLiteStringData( String name ) {
		super( name );
	}
	
	public SQLiteStringData( String name, String value ) {
		super( name, value );
	}
	
	public SQLiteStringData( String name, Timestamp value ) {
		super( name, timestampToString( value ) );
	}
	
	public void fromTimestamp( Timestamp t ) {
		value = timestampToString( t );
	}
	
	public Timestamp getValueAsTimestamp() {
		return stringToTimestamp( value );
	}
	
	public static String timestampToString( Timestamp t ) {
		return format.format( t );
	}
	
	public static Timestamp stringToTimestamp( String s ) {
		return Timestamp.valueOf( s );
	}	
}
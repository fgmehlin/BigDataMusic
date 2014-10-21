package BigData.Music;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DatabaseHandler {

	private static final String DB_PATH = "/Volumes/Data/ETHZ/Big Data/MillionSongSubset/AdditionalFiles/";
	private static final String METADATA_DB = "subset_track_metadata.db";
	private static final String TERM_DB = "subset_artist_term.db";
	private static final String SIMI_DB = "subset_artist_similarity.db";

	private static DatabaseHandler _instance;
	private Connection c;

	public String queryTrackFile(String artist, String track_name, String dataset) {
		String fileName = "";
		try {
			c = DriverManager.getConnection("jdbc:sqlite:" + DB_PATH + METADATA_DB);
			Statement stmt = c.createStatement();
			Class.forName("org.sqlite.JDBC");
			String[] args = {artist, track_name};
			String[] columns = {"track_id"};
			String sql = prepareSQL(Queries.GET_TRACK_ID, args);
			
			ResultSet r = stmt.executeQuery(sql);
			int cnt = 0;
			
			while(r.next()){
				cnt++;
				fileName = r.getString("track_id");
			}
			System.out.println("ResultSet size: " + cnt);

			r.close();
			stmt.close();
			c.close();
			
		} catch (SQLException s) {
			s.printStackTrace();
			System.out.println("aouch");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		return fileName;
	}

	public static DatabaseHandler getInstance() {
		if (_instance == null) {
			_instance = new DatabaseHandler();
		}

		return _instance;
	}
	/*
	 * Searches for '\n' chars in the query skeleton and 
	 * replace them by the corresponding args.
	 */
	private String prepareSQL(String skeleton, String[] args){
		int i = 0;
		String sql = skeleton;
		while(sql.contains("\n")){
			sql = sql.replaceFirst("\n", args[i]);
			i++;
		}
		
		
		return sql;
	}
	

//	private ResultSet queryDB(String dbPath, String dbName, String sql, String[] columns){
//		
//		try {
//			c = DriverManager.getConnection("jdbc:sqlite:" + dbPath + dbName);
//			Statement stmt = c.createStatement();
//			Class.forName("org.sqlite.JDBC");
//			ResultSet r = stmt.executeQuery(sql);
//			int cnt = 0;
//			int i = 0;
//			TrackBean tb = new TrackBean();
//			ArrayList<TrackBean> trackList = new ArrayList<TrackBean>();
//			while(r.next()){
//				cnt++;
//				tb.setArtistID(r.getString(columns[i]));
//			}
//			System.out.println("ResultSet size: " + cnt);
//
//			r.close();
//			stmt.close();
//			c.close();
//			
//		} catch (SQLException s) {
//			s.printStackTrace();
//			System.out.println("aouch");
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}
//		return null;
//	}

}

package BigData.Music;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

import ncsa.hdf.hdf5lib.HDF5Constants;
import ncsa.hdf.object.h5.H5File;

/**
 * Hello world!
 *
 */
public class App {
	private static H5Handler h5h;

	public static void main(String[] args) {
		
		h5h = H5Handler.getInstance();
		
		boolean loop = true;
		String artist ="";
		String song = "";
		
		while(loop){
			InputStreamReader sr =new InputStreamReader(System.in);
			BufferedReader br=new BufferedReader(sr);
			try {
				 System.out.println("Input an artist");
				 artist = br.readLine();
				 artist = artist.replaceAll("[\\r\\n]", ""); 
				 System.out.println("Input a song title");
				 song = br.readLine();
				 song = song.replaceAll("[\\r\\n]", ""); 
				 
				 System.out.println(artist + " - " + song);
				 readFromH5(artist, song);
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			
			
		}
	}

	public static void readFromH5(String artist, String track_name) {

		String fileNameFromTrack = h5h.queryTrackFile(artist, track_name);
		File[] files = new File(
				"/Volumes/Data/ETHZ/Big Data/MillionSongSubset/data/")
				.listFiles();
		File foundFile = getFile(files, fileNameFromTrack);

		if (foundFile != null)
			System.out.println(foundFile.getAbsolutePath());
		else
			System.out.println("404: File not found");

		H5File file = new H5File(foundFile.getAbsolutePath(),
				HDF5Constants.H5F_ACC_RDONLY);
		try {
			System.out.println("artist id : "
					+ hdf5_getters.get_artist_id(file));
			System.out.println("artist name : "
					+ hdf5_getters.get_artist_name(file));
			System.out.println("song title : " + hdf5_getters.get_title(file));
			System.out.println("artist familiarity : "
					+ hdf5_getters.get_artist_familiarity(file));
			System.out.println("artist hotttness : "
					+ hdf5_getters.get_artist_hotttnesss(file));
			System.out.println("artist location : "
					+ hdf5_getters.get_artist_location(file));
			System.out.println("song danceability : "
					+ hdf5_getters.get_danceability(file));
			System.out.println("song duration : "
					+ hdf5_getters.get_duration(file));
			System.out
					.println("song energy : " + hdf5_getters.get_energy(file));
			System.out.println("song key : " + hdf5_getters.get_key(file));
			System.out.println("song loudness : "
					+ hdf5_getters.get_loudness(file));
			System.out.println("song mode : " + hdf5_getters.get_mode(file));
			System.out.println("song hotttness : "
					+ hdf5_getters.get_song_hotttnesss(file));
			System.out.println("song tempo : " + hdf5_getters.get_tempo(file));
			System.out.println("song year : " + hdf5_getters.get_year(file));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static File getFile(File[] files, String wantedFile) {
		File foundFile = null;
		for (File file : files) {
			if (foundFile != null)
				break;
			if (file.isDirectory()) {
				foundFile = getFile(file.listFiles(), wantedFile);
				if (foundFile != null)
					System.out.println("foundfile = " + foundFile.getName());
			} else if (file.getName().equals(wantedFile + ".h5")) {
				System.out
						.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FOUND <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
				foundFile = file;
				break;
			} else {
			}
		}
		return foundFile;
	}

}

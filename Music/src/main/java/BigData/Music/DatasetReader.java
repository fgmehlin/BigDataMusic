package BigData.Music;

import java.io.File;

import ncsa.hdf.hdf5lib.HDF5Constants;
import ncsa.hdf.object.h5.H5File;

public class DatasetReader {
	
	
	private DatabaseHandler dbh;
	
	DatasetReader(){
		dbh = DatabaseHandler.getInstance();
	}

	public void readFromH5(String artist, String track_name) {

		String fileNameFromTrack = dbh.queryTrackFile(artist, track_name);
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

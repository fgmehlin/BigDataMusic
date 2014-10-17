package BigData.Music;

import java.util.Enumeration;

import javax.swing.tree.DefaultMutableTreeNode;

import ncsa.hdf.hdf5lib.HDF5Constants;
import ncsa.hdf.object.FileFormat;
import ncsa.hdf.object.HObject;
import ncsa.hdf.object.h5.H5File;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		readFromH5();
	}

	public static void readFromH5() {

		H5File file = new H5File(
				"/Volumes/Data/ETHZ/Big Data/MillionSongSubset/data/B/A/P/TRBAPMY128F42578B1.h5",
				HDF5Constants.H5F_ACC_RDONLY);
		try {
			// open file and retrieve the file structure
			file.open();
			System.out.println(file.getName());
			System.out.println(file.getNumberOfMembers());

			System.out.println(hdf5_getters.get_artist_name(file));			
			file.close();

		} catch (Exception ex) {
			System.out.println(ex);
		}

	}



}

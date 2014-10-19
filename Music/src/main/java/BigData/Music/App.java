package BigData.Music;

import java.io.File;
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
	private static H5Handler h5h;
	private static int cntFiles = 0;
	
	public static void main(String[] args) {
		System.out.println("Hello World!");
		h5h = H5Handler.getInstance();
		readFromH5();
	}

	public static void readFromH5() {

		String fileNameFromTrack = h5h.queryTrackFile("Elliot Smith", "Angeles");
		File[] files = new File("/Volumes/Data/ETHZ/Big Data/MillionSongSubset/data/").listFiles();
	    File foundFile = getFile(files, fileNameFromTrack);
	    
	    System.out.println("nb files scanned : " + cntFiles);
	    //H5File file2 = new H5File2(foundFile.)
		if(foundFile != null)
			System.out.println(foundFile.getAbsolutePath());
		else
			System.out.println("404: File not found");
		
		H5File file = new H5File(
				foundFile.getAbsolutePath(),
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
	
	
	private static File getFile(File[] files, String wantedFile){
		File foundFile = null;
		for(File file : files){
			cntFiles++;
			if(foundFile != null)
				break;
			if(file.isDirectory()){
				foundFile = getFile(file.listFiles(), wantedFile);
				if(foundFile != null)
					System.out.println("foundfile = " + foundFile.getName());
				else
					System.out.println("foundFile is null");
			}else if(file.getName().equals(wantedFile+".h5")){
			 	System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FOUND <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
				foundFile = file;
				break;
			}else{}
		}
		return foundFile;
	}
	



}

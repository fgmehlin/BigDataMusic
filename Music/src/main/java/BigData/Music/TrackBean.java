package BigData.Music;

public class TrackBean {
	
	
	private String trackID;
	private double artistFamiliarity;
	private double artistHotttness;
	private String artistID;
	private double artistLatitude;
	private double artistLongitude;
	private String[] mbTags;
	private int[] mbTagsCount;
	private String artistName;
	private int playmeID;
	private String[] artistTerms;
	private double[] artistTermsFreq;
	private double[] artistTermsWeight;
	private double[] barsStart;
	private double[] beatsStart;
	private double danceability;
	private double duration;
	private double endOfFadeIn;
	private double energy;
	private int key;
	private double loudness;
	private int mode;
	private String albumName;
	private double[] sectionsStart;
	private double[] segmentLoudnessMax;
	private double[] segmentLoudnessMaxTime;
	private double[] segmentLoudnessMaxStart;
	private double[] segmentStart;
	private String[] similarArtists;
	private double songHotttness;
	private String songID;
	private double startFadeOut;
	private double[] tatumStart;
	private double tempo;
	private int timeSignature;
	private String songTitle;
	private int year;
	private int sevenDigitalId;
	
	
	public double getArtistFamiliarity() {
		return artistFamiliarity;
	}

	public void setArtistFamiliarity(double artistFamiliarity) {
		this.artistFamiliarity = artistFamiliarity;
	}

	public double getArtistHotttness() {
		return artistHotttness;
	}

	public void setArtistHotttness(double artistHotttness) {
		this.artistHotttness = artistHotttness;
	}

	public String getArtistID() {
		return artistID;
	}

	public void setArtistID(String artistID) {
		this.artistID = artistID;
	}

	public double getArtistLatitude() {
		return artistLatitude;
	}

	public void setArtistLatitude(double artistLatitude) {
		this.artistLatitude = artistLatitude;
	}

	public double getArtistLongitude() {
		return artistLongitude;
	}

	public void setArtistLongitude(double artistLongitude) {
		this.artistLongitude = artistLongitude;
	}

	public String[] getMbTags() {
		return mbTags;
	}

	public void setMbTags(String[] mbTags) {
		this.mbTags = mbTags;
	}

	public int[] getMbTagsCount() {
		return mbTagsCount;
	}

	public void setMbTagsCount(int[] mbTagsCount) {
		this.mbTagsCount = mbTagsCount;
	}

	public String getArtistName() {
		return artistName;
	}

	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}

	public int getPlaymeID() {
		return playmeID;
	}

	public void setPlaymeID(int playmeID) {
		this.playmeID = playmeID;
	}

	public String[] getArtistTerms() {
		return artistTerms;
	}

	public void setArtistTerms(String[] artistTerms) {
		this.artistTerms = artistTerms;
	}

	public double[] getArtistTermsFreq() {
		return artistTermsFreq;
	}

	public void setArtistTermsFreq(double[] artistTermsFreq) {
		this.artistTermsFreq = artistTermsFreq;
	}

	public double[] getArtistTermsWeight() {
		return artistTermsWeight;
	}

	public void setArtistTermsWeight(double[] artistTermsWeight) {
		this.artistTermsWeight = artistTermsWeight;
	}

	public double[] getBarsStart() {
		return barsStart;
	}

	public void setBarsStart(double[] barsStart) {
		this.barsStart = barsStart;
	}

	public double[] getBeatsStart() {
		return beatsStart;
	}

	public void setBeatsStart(double[] beatsStart) {
		this.beatsStart = beatsStart;
	}

	public double getDanceability() {
		return danceability;
	}

	public void setDanceability(double danceability) {
		this.danceability = danceability;
	}

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}

	public double getEndOfFadeIn() {
		return endOfFadeIn;
	}

	public void setEndOfFadeIn(double endOfFadeIn) {
		this.endOfFadeIn = endOfFadeIn;
	}

	public double getEnergy() {
		return energy;
	}

	public void setEnergy(double energy) {
		this.energy = energy;
	}

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	public double getLoudness() {
		return loudness;
	}

	public void setLoudness(double loudness) {
		this.loudness = loudness;
	}

	public int getMode() {
		return mode;
	}

	public void setMode(int mode) {
		this.mode = mode;
	}

	public String getAlbumName() {
		return albumName;
	}

	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}

	public double[] getSectionsStart() {
		return sectionsStart;
	}

	public void setSectionsStart(double[] sectionsStart) {
		this.sectionsStart = sectionsStart;
	}

	public double[] getSegmentLoudnessMax() {
		return segmentLoudnessMax;
	}

	public void setSegmentLoudnessMax(double[] segmentLoudnessMax) {
		this.segmentLoudnessMax = segmentLoudnessMax;
	}

	public double[] getSegmentLoudnessMaxTime() {
		return segmentLoudnessMaxTime;
	}

	public void setSegmentLoudnessMaxTime(double[] segmentLoudnessMaxTime) {
		this.segmentLoudnessMaxTime = segmentLoudnessMaxTime;
	}

	public double[] getSegmentLoudnessMaxStart() {
		return segmentLoudnessMaxStart;
	}

	public void setSegmentLoudnessMaxStart(double[] segmentLoudnessMaxStart) {
		this.segmentLoudnessMaxStart = segmentLoudnessMaxStart;
	}

	public double[] getSegmentStart() {
		return segmentStart;
	}

	public void setSegmentStart(double[] segmentStart) {
		this.segmentStart = segmentStart;
	}

	public String[] getSimilarArtists() {
		return similarArtists;
	}

	public void setSimilarArtists(String[] similarArtists) {
		this.similarArtists = similarArtists;
	}

	public double getSongHotttness() {
		return songHotttness;
	}

	public void setSongHotttness(double songHotttness) {
		this.songHotttness = songHotttness;
	}

	public String getSongID() {
		return songID;
	}

	public void setSongID(String songID) {
		this.songID = songID;
	}

	public double getStartFadeOut() {
		return startFadeOut;
	}

	public void setStartFadeOut(double startFadeOut) {
		this.startFadeOut = startFadeOut;
	}

	public double[] getTatumStart() {
		return tatumStart;
	}

	public void setTatumStart(double[] tatumStart) {
		this.tatumStart = tatumStart;
	}

	public double getTempo() {
		return tempo;
	}

	public void setTempo(double tempo) {
		this.tempo = tempo;
	}

	public int getTimeSignature() {
		return timeSignature;
	}

	public void setTimeSignature(int timeSignature) {
		this.timeSignature = timeSignature;
	}

	public String getSongTitle() {
		return songTitle;
	}

	public void setSongTitle(String songTitle) {
		this.songTitle = songTitle;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getSevenDigitalId() {
		return sevenDigitalId;
	}

	public void setSevenDigitalId(int sevenDigitalId) {
		this.sevenDigitalId = sevenDigitalId;
	}


	public String getTrackID() {
		return trackID;
	}

	public void setTrackID(String trackID) {
		this.trackID = trackID;
	}
	
	

}

package birdsong;

public class B extends Bird{
	
	private BirdStats stats;
	private TimeWatch watch; // new watch for each occurrence
	
	public B () {
		stats = new BirdStats();
	}
	
	public BirdStats getStats() {
		return stats;
	}
	
	public void startSing() {
		watch = TimeWatch.start();
		stats.incNumSongs();
	}
	
	public void endSing() {
		long duration = watch.time(); // time between start and end of singing
		stats.incSongDuration(duration);
	}

}

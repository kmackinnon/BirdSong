package birdsong;

public class C extends Bird{
	
	BirdStats stats;
	TimeWatch watch;
	
	public C () {
		stats = new BirdStats();
	}
	
	public void startSing() {
		watch = TimeWatch.start();
		stats.incNumSongs();
	}
	
	public void endSing() {
		watch.time(); // time between start and end of singing
	}

}

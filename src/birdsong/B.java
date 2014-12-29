package birdsong;

public class B extends Bird{
	
	BirdStats stats;
	TimeWatch watch;
	
	public B () {
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

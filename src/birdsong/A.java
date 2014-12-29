package birdsong;

public class A extends Bird{
	
	BirdStats stats;
	TimeWatch watch;
	
	public A () {
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

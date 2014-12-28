package birdsong;

public abstract class Bird {

	private BirdStats stats;
	private TimeWatch watch;

	public void startSing() {
		watch = TimeWatch.start();
		stats.incNumSongs(); // increment
	}

	public void endSing() {
		long passedTimeInMs = watch.time();
		// long passedTimeInSeconds = watch.time(TimeUnit.SECONDS);

		stats.setSongDuration(passedTimeInMs);

	}

}

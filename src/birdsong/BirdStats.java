package birdsong;


public class BirdStats {

	private int countSongs;
	private long songDuration;

	public BirdStats() {
		countSongs = 0;
	}

	public int getCountSongs() {
		return countSongs;
	}

	public long getSongDuration() {
		return songDuration;
	}

	public void incNumSongs() {
		countSongs++;
	}

	public void setSongDuration(long timeToAdd) {
		songDuration += timeToAdd;
	}

}

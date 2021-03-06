package birdsong;


public class BirdStats {

	private int countSongs;
	private long songDuration;
	
	byte[] startTimes;
	byte[] endTimes;

	public BirdStats() {
		countSongs = 0;
		songDuration = 0;
	}

	public int getCountSongs() {
		return countSongs;
	}

	public long getSongDuration() {
		return songDuration;
	}

	public void incNumSongs() {
		countSongs++;
		System.out.println(countSongs);
	}

	public void incSongDuration(long timeToAdd) {
		songDuration += timeToAdd;
	}

}

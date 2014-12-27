package birdsong;

public class Sing {
	
	private int countSings;
	private double songDuration;
	
	public Sing() {
		countSings = 0;
		songDuration = 0.0;
	}
	
	public int getCountSings() {
		return countSings;
	}
	
	public double getSongDuration() {
		return songDuration;
	}
	
	public void setCountSings(int count) {
		countSings = count;
	}
	
	public void setSongDuration(double duration) {
		songDuration = duration;
	}

}

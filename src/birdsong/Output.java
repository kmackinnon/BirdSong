package birdsong;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Output {

	/**
	 * Writes the number of times each button was pressed and total song
	 * duration (in minutes)
	 */
	public void show(A a, B b, C c) {

		int aSongs = a.getStats().getCountSongs();
		int bSongs = b.getStats().getCountSongs();
		int cSongs = c.getStats().getCountSongs();

		long aDuration = a.getStats().getSongDuration();
		long bDuration = b.getStats().getSongDuration();
		long cDuration = c.getStats().getSongDuration();

		try {
			BufferedWriter out = new BufferedWriter(new FileWriter(
					"results.txt"));
			out.write("A: " + aSongs + "\t" + aDuration);
			out.newLine();
			out.write("B: " + bSongs + "\t" + bDuration);
			out.newLine();
			out.write("C: " + cSongs + "\t" + cDuration);

			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

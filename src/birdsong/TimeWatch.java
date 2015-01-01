package birdsong;

import java.util.concurrent.TimeUnit;

/**
 * @author GHad on StackOverflow
 */
public class TimeWatch {

	long starts;

	private TimeWatch() {
		reset();
	}

	public static TimeWatch start() {
		return new TimeWatch();
	}

	public TimeWatch reset() {
		starts = System.currentTimeMillis();
		return this;
	}

	public long time() {
		long ends = System.currentTimeMillis();
		System.out.println(ends - starts);
		return ends - starts;
	}

	public long time(TimeUnit unit) {
		return unit.convert(time(), TimeUnit.MILLISECONDS);
	}

}

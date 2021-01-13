package SleepPackage;
/**
 * 
 * @author tj
 *
 */
public class Sleep {
	public static void sleepFor(long n) {
		long timeElapsed;
		final long initTime = System.nanoTime();
		do{
			timeElapsed = System.nanoTime() - initTime;
		}while(timeElapsed < n);
	}
	public static long secondsToNano(long t) {
		return t * (long)Math.pow(10, 9);
	}
	public static long milliToNano(long t) {
		return t * (long)Math.pow(10, 6);
	}
	public static long microToNano(long t) {
		return t * (long)Math.pow(10, 3);
	}
}

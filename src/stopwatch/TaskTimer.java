package stopwatch;
/**
 * TimerTask use to declare Stopwatch object and measure and print the time for each Runnable Task
 * @author Tharit Pongsaneh
 *
 */
public class TaskTimer {
	/**
	 * Create new Stopwatch object called timer
	 */
	static Stopwatch timer = new Stopwatch();

	/**
	 * Method use to measure time and print the result of the task
	 * @param runnable Runnable Implemented task
	 */
	static void measureAndPrint( Runnable runnable ){
		timer.start();
		runnable.run();
		timer.stop();
		System.out.printf( runnable.toString() );
		System.out.printf("Elapsed time %.6f sec\n\n", timer.getElapsed());
	}
}

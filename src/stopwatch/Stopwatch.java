package stopwatch;
/**
 * A Stopwatch that measures elapsed time between a starting time
 * and stopping time, or until the present time.
 * @author Tharit Pongsaneh
 */
public class Stopwatch {

	/** constant for converting nanoseconds to seconds. */
	private static final double NANOSECONDS = 1.0E-9;

	/** Variable Use In Stopwatch Class */
	private long startTime;
	private long stopTime;
	private boolean isRun;

	/**
	 * Declare Constructor
	 */
	public Stopwatch(){
		this.startTime = 0;
		this.stopTime = 0;
		this.isRun = false;
	}

	/**
	 * Method start use to initialize the startTime
	 */
	public void start( ) {  
		if( isRun == false ){
			this.startTime = System.nanoTime();
			this.isRun = true;
		}
	}

	/**
	 * Method stop use to get the stopping time and run getElapsed method to calculate the elapsed time
	 */
	public void stop( ) {
		this.stopTime = System.nanoTime();
		this.isRun = false;
		getElapsed();
	}

	/**
	 * Method use to calculate the elapsed time
	 * @return the elapsed time since start to stop in case the stopwatch is not running.
	 * if it run, then return the elapsed since start to now
	 */
	public double getElapsed(){
		if(this.isRun==false)
			return (System.nanoTime() - this.startTime)*NANOSECONDS;
		else 
			return (this.startTime - this.stopTime)*NANOSECONDS;
	}

	/**
	 * Check either the clock is running
	 * @return true if isRun if true else return false
	 */
	public boolean isRunning(){
		if( isRun == false ) return false;
		else return true;
	}
}


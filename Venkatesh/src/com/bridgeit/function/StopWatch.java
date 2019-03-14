package com.bridgeit.function;

import com.bridgeit.utility1.Utility;
/**
 * 
 * @author Venkatesha E R
 *date:25/02/19
 */

public class StopWatch {

		private long startTime;
		private long endTime;

		public void start() {
			startTime = System.currentTimeMillis();
		}

		public void stop() {
			endTime = System.currentTimeMillis();
		}

		public long timeElapsed() {
			return (endTime - startTime);
		}

		public static void main(String[] args) {
			StopWatch sw = new StopWatch();
			int start;
			int end;
			long timeTaken;

			do {
				System.out.println("Enter 1 to start watch");
				start = Utility.getPositiveInt();
			} while (start != 1);
			sw.start();

			do {
				System.out.println("Enter 2 to stop the stop watch");
				end = Utility.getPositiveInt();
			} while (end != 2);
			sw.stop();

			timeTaken = sw.timeElapsed();
			Utility.printTime(timeTaken);
		}
		

	}



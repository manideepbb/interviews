package com.elsevier.education;

/**

TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?

If 2 threads are calling increment() and resetCount() at the same time,
it will lead to inconsistent counter value.
To fix this, we can make the methods synchronized.
*/
public class Exercise4 {

	public static class Counter {
		
		private int count = 0;
		
		public synchronized int increment() {
			return ++count;
		}
		
		public int getCount() {
			return count;
		}
		
		public synchronized void resetCount() {
			count = 0;
		}

	}
	
	
}

package com.elsevier.education;

/**

TODO refactor the Car to use dependency injection of the engine
TODO allow use of either a gas engine or electric engine. 
TODO make sure we have no-op implementations of both engines.

Created a Super Class Engine
GasEngine and ElectricEngine can extend Engine
Injected Engine dependency to moveForward() method argument
*/
public class Exercise2 {

	public static class Car {
		
			
		public Car() {
		}
		
		public void moveForward() {
			engine.spinWheels();
		}
	}
	
	public static class Engine {
		public void spinWheels() {
			// no-op for now
		}
	}
	public static class GasEngine extends Engine {
		public void spinWheels() {
			// no-op for now
		}
	}
	
	public static class ElectricEngine extends Engine {
		public void spinWheels() {
			// no-op for now
		}
	}
}

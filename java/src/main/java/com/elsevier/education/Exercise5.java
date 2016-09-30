package com.elsevier.education;

/**

TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().

Create a private static instance 
make constructor private
create a public getSingleton() method that returns the object of singleton
*/


public static class Singleton {

	private static Singleton s = null;
	private Singleton()
	{
	}
	public static Singleton getSingleton()
	{
		if (s==null)
		{
			s=new Singleton();
		}
		return s;
	}
		
		public void doSomeThing() {
			System.out.println("Doing something....");
	    }
	}


public static void main(String a[]){
		Singleton st = Singleton.getSingleton();
		st.doSomeThing();
	}

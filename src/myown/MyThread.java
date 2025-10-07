package myown;


	// File: MyThread.java
	public class MyThread extends Thread {
	    private String threadName;

	    public MyThread(String name) { this.threadName = name; }

	    @Override
	    public void run() {
	        for (int i = 1; i <= 5; i++) {
	            System.out.println(threadName + " - Count: " + i);
	            try { Thread.sleep(500); } catch (InterruptedException e) {}
	        }
	    }
	}




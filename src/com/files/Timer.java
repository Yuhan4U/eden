package com.files;

public class Timer extends Thread {

	private QuizMaster master;

	private int counter = 5;

	public Timer(QuizMaster master) {
		this.master = master;
	}

	@Override
	public void run() {
		while (counter >= 0) {
			try {
				Thread.sleep(1000);
				System.out.println(counter);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			counter--;
			if (counter == 0) {
				//master.timeOver();
				break;
			}

		}
	}
	public void stopTimer() {
		counter = -1;
	}

	public void reset() {
		counter = 5;
	}
}

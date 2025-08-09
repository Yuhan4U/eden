package com.yuhan.studies;

public class Timer {
static int i=5;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread1 = new Thread(() -> {

			try {

				while (true) {

					Thread.sleep(1000); 					

					i--;

				
					if(i==0) {

						System.out.println("Thread is stopping now");

						break;

					}

				}

				// Sleep for 1 second

			} catch (InterruptedException e) {

				e.printStackTrace();

			}

			System.out.println("End Time: " + System.nanoTime());

		});

		thread1.setName("First Thread");

		thread1.start();

		


	}

}

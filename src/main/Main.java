package src.main;

import java.io.FileNotFoundException;

import src.brain.Brain;
import src.brain.Learning;

public class Main implements Runnable {
	public Thread thread;

	public void start() {
		thread = new Thread(this);
		thread.start();
	}

	public void stop() {
		thread.interrupt();
		try {
			thread.join();
		} catch(InterruptedException e) {
			e.printStackTrace();
			System.exit(1);
		}
	}

	public void run() {
		while(!Thread.interrupted()) {
			Brain brain = new Brain();
			brain.Response();
		}
		stop();
	}

	public static void main(String[] args) {
		Main reaver = new Main();
		reaver.start();
	}
}
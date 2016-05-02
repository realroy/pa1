package com.pa1.roiboon;


import java.awt.EventQueue;

public class Main {
	/**
	 * Run Application
	 * @param args not use
	 * */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App app = new App();
					app.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

}

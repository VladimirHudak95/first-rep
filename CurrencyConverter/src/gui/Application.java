package gui;

import java.awt.EventQueue;

public class Application {
	
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
					window.createWindow();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

}

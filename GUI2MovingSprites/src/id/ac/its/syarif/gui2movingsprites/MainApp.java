package id.ac.its.syarif.gui2movingsprites;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class MainApp extends JFrame {
	
	public MainApp() {
		initUI();
	}
	
	private void initUI() {
		add(new Board());

		//setSize(400, 300);
		setResizable(false);
		pack();
		
		setTitle("Moving Sprite Already");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			MainApp ex = new MainApp();
			ex.setVisible(true);
		});

	}
}

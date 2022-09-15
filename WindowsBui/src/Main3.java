
import javax.swing.JFrame;

public class Main3 {
	public static void m3() {
		JFrame obj = new JFrame();
		Gameplay3 gamePlay = new Gameplay3();
		obj.setBounds(500, 250, 700, 600);
		obj.setTitle("Break Ball");
		obj.setResizable(false);
		obj.setVisible(true);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.add(gamePlay);

	}

}

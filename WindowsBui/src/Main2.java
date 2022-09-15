
import javax.swing.JFrame;

public class Main2 {
	public static void m2() {
		JFrame obj = new JFrame();
		Gameplay2 gamePlay = new Gameplay2();
		obj.setBounds(500, 250, 700, 600);
		obj.setTitle("Break Ball");
		obj.setResizable(false);
		obj.setVisible(true);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.add(gamePlay);

	}

}

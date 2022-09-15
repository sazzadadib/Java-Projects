import javax.swing.JFrame;

public class Main {
	public static void m() {
		JFrame obj = new JFrame();
		Gameplay gamePlay = new Gameplay();
		obj.setBounds(500, 250, 700, 600);
		obj.setTitle("Break Ball");
		obj.setResizable(false);
		obj.setVisible(true);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.add(gamePlay);

	}

}

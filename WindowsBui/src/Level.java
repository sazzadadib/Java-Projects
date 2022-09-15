import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Level extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void l() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Level frame = new Level();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Level() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 250, 700, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnNewButton = new JButton("Easy");
		btnNewButton.setFocusable(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main m = new Main();
				m.m();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setBounds(280, 202, 89, 23);
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Normal");
		btnNewButton_1.setFocusable(false);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_1.setBackground(Color.CYAN);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main2 m2 = new Main2();
				m2.m2();
			}
		});
		btnNewButton_1.setBounds(280, 256, 89, 23);
		contentPane.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("Hard");
		btnNewButton_2.setFocusable(false);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main3 m3 = new Main3();
				m3.m3();
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_2.setBackground(Color.RED);
		btnNewButton_2.setBounds(280, 307, 89, 23);
		contentPane.add(btnNewButton_2);

		JLabel lblNewLabel = new JLabel("Select Level");
		lblNewLabel.setFont(new Font("Ravie", Font.BOLD, 18));
		lblNewLabel.setBackground(Color.CYAN);
		lblNewLabel.setBounds(244, 125, 162, 48);
		contentPane.add(lblNewLabel);
	}
}

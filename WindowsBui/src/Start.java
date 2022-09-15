import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Start extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Start frame = new Start();
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
	public Start() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 250, 700, 600);
		contentPane = new JPanel();
		contentPane.setIgnoreRepaint(true);
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton stbutton = new JButton("Start");
		stbutton.setFocusable(false);
		stbutton.setVerifyInputWhenFocusTarget(false);
		stbutton.setForeground(Color.GREEN);
		stbutton.setFont(new Font("Viner Hand ITC", Font.BOLD, 22));
		stbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Start frame = new Start();
				JFrame frmtest = new JFrame();
				frmtest.setVisible(false);
				Level l = new Level();
				l.l();
			}
		});
		stbutton.setBackground(SystemColor.textHighlight);
		stbutton.setBounds(258, 240, 148, 56);
		contentPane.add(stbutton);

		JLabel lblNewLabel = new JLabel("Developed By Sazzad & Maimuna");
		lblNewLabel.setFont(new Font("Stylus BT", Font.BOLD, 20));
		lblNewLabel.setForeground(SystemColor.infoText);
		lblNewLabel.setBounds(178, 489, 315, 42);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Press Start Button To Play");
		lblNewLabel_1.setForeground(new Color(119, 136, 153));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(240, 182, 202, 47);
		contentPane.add(lblNewLabel_1);
	}
}

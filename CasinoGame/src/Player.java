import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.Color;

public class Player extends JFrame {

	private JPanel contentPane;
	private JTextField question;
	private String yourName;
	private int yourMoney;
	public static JTextField enterName;

	public String getYourName() {
		return yourName;
	}

	public int getYourMoney() {
		return yourMoney;
	}

	public void setYourName(String yourName) {
		this.yourName = yourName;
	}

	public void setYourMoney(int yourMoney) {
		this.yourMoney = yourMoney;
	}

	public Player(String name, int money) {
		this.yourName = name;
		this.yourMoney = money;
	}

	public Player() {
		setResizable(false);
		setTitle("PLAYER");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 600, 400);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		question = new JTextField();
		question.setText("WHAT IS YOUR NAME?");
		question.setHorizontalAlignment(SwingConstants.CENTER);
		question.setFont(new Font("Tahoma", Font.BOLD, 20));
		question.setEditable(false);
		question.setColumns(10);
		question.setBackground(SystemColor.inactiveCaption);
		question.setBounds(10, 10, 576, 60);
		contentPane.add(question);

		enterName = new JTextField();
		enterName.setForeground(Color.LIGHT_GRAY);
		enterName.setText("ENTER YOUR NAME HERE.");
		enterName.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				enterName.setText("");
				enterName.setForeground(Color.BLACK);
			}
		});
		enterName.setHorizontalAlignment(SwingConstants.CENTER);
		enterName.setFont(new Font("Tahoma", Font.BOLD, 20));
		enterName.setBounds(10, 100, 576, 60);
		contentPane.add(enterName);
		enterName.setColumns(10);

		JButton startButton = new JButton("OK");
		startButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (enterName.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Please enter your name.");
				}
				else if (enterName.getText().equals("ENTER YOUR NAME HERE.")) {
					JOptionPane.showMessageDialog(null, "Please enter your name.");
				} 
				else {
					setVisible(false);
					JOptionPane.showMessageDialog(null,
							"Casino owner: Welcome to my casino. "
							+ "You can gamble and drink as much as you want here. But remember, if you run out of money, I'll kick you out of here.");
					WelcomeToCasino frame = new WelcomeToCasino();
					frame.setVisible(true);
				}
			}
		});

		startButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		startButton.setBackground(SystemColor.inactiveCaption);
		startButton.setBounds(208, 170, 180, 60);
		contentPane.add(startButton);

		JButton exitButton = new JButton("EXIT");
		exitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		exitButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		exitButton.setBackground(SystemColor.inactiveCaption);
		exitButton.setBounds(406, 302, 180, 60);
		contentPane.add(exitButton);
	}
}

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class WelcomeToCasino extends JFrame {

	private JPanel contentPane;
	private JTextField txtWhatDoYou;
	private JButton drinkingButton;
	private JButton gamblingButton;
	private JButton exitButton;
	private JTextField txtMoney;
	private JTextField yourMoneyTF;
	private JTextField $;

	static Random rand = new Random();
	static int randomMoney = (rand.nextInt(5)+1)*10;
	public static Player you = new Player(Player.enterName.getText(), randomMoney);

	public WelcomeToCasino() {
		
		setResizable(false);
		setBackground(SystemColor.activeCaption);
		setTitle("WELCOME TO CASINO");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 600, 400);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		txtWhatDoYou = new JTextField();
		txtWhatDoYou.setEditable(false);
		txtWhatDoYou.setBackground(SystemColor.inactiveCaption);
		txtWhatDoYou.setText("WHAT DO YOU WANT TO DO " + you.getYourName().toUpperCase() + "?");
		txtWhatDoYou.setHorizontalAlignment(SwingConstants.CENTER);
		txtWhatDoYou.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtWhatDoYou.setBounds(10, 10, 576, 60);
		contentPane.add(txtWhatDoYou);
		txtWhatDoYou.setColumns(10);

		drinkingButton = new JButton("DRINKING");
		drinkingButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Drinking drinking = new Drinking();
				drinking.setVisible(true);
				setVisible(false);
				
			}
		});
		drinkingButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		drinkingButton.setBackground(SystemColor.inactiveCaption);
		drinkingButton.setBounds(208, 100, 180, 60);
		contentPane.add(drinkingButton);

		gamblingButton = new JButton("GAMBLING");
		gamblingButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Gambling gambling = new Gambling();
				gambling.setVisible(true);
				setVisible(false);

			}
		});
		gamblingButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		gamblingButton.setBackground(SystemColor.inactiveCaption);
		gamblingButton.setBounds(208, 170, 180, 60);
		contentPane.add(gamblingButton);

		exitButton = new JButton("EXIT");
		exitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		exitButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		exitButton.setBackground(SystemColor.inactiveCaption);
		exitButton.setBounds(406, 301, 180, 60);
		contentPane.add(exitButton);

		txtMoney = new JTextField();
		txtMoney.setText("MONEY: ");
		txtMoney.setHorizontalAlignment(SwingConstants.CENTER);
		txtMoney.setForeground(Color.BLACK);
		txtMoney.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtMoney.setEditable(false);
		txtMoney.setColumns(10);
		txtMoney.setBackground(SystemColor.inactiveCaption);
		txtMoney.setBounds(10, 302, 120, 60);
		contentPane.add(txtMoney);

		yourMoneyTF = new JTextField();
		yourMoneyTF.setText("" + you.getYourMoney());
		yourMoneyTF.setHorizontalAlignment(SwingConstants.CENTER);
		yourMoneyTF.setForeground(Color.BLACK);
		yourMoneyTF.setFont(new Font("Tahoma", Font.BOLD, 20));
		yourMoneyTF.setEditable(false);
		yourMoneyTF.setColumns(10);
		yourMoneyTF.setBackground(SystemColor.inactiveCaption);
		yourMoneyTF.setBounds(130, 302, 60, 60);
		contentPane.add(yourMoneyTF);

		$ = new JTextField();
		$.setText("$");
		$.setHorizontalAlignment(SwingConstants.CENTER);
		$.setForeground(Color.BLACK);
		$.setFont(new Font("Tahoma", Font.BOLD, 20));
		$.setEditable(false);
		$.setColumns(10);
		$.setBackground(SystemColor.inactiveCaption);
		$.setBounds(190, 302, 60, 60);
		contentPane.add($);

	}
}

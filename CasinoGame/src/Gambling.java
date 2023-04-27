
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Frame;

public class Gambling extends JFrame {

	private JPanel contentPane;
	private JTextField comNum;
	private JTextField yourNum;
	private JTextField prevComNum;
	private JTextField prev2ComNum;
	private JTextField prev2YourNum;
	private JTextField prevYourNum;
	private JTextField yourMoneyTF;
	private JComboBox betComboBox;
	private JTextField $B;
	private JTextField $A;
	private JTextField bet;
	private JTextField money;
	private JButton backButton;

	public Gambling() {
		setResizable(false);

		setForeground(Color.BLACK);

		setTitle("GAMBLING");
		setBackground(SystemColor.activeCaption);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 800, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		contentPane.setBackground(SystemColor.activeCaption);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setMaximumSize(getMaximumSize());

		comNum = new JTextField();
		comNum.setForeground(Color.BLACK);
		comNum.setBackground(SystemColor.inactiveCaption);
		comNum.setToolTipText("");
		comNum.setText("0");
		comNum.setHorizontalAlignment(SwingConstants.CENTER);
		comNum.setEditable(false);
		comNum.setFont(new Font("Bradley Hand ITC", Font.BOLD | Font.ITALIC, 30));
		comNum.setBounds(416, 10, 150, 240);
		contentPane.add(comNum);
		comNum.setColumns(10);

		yourNum = new JTextField();
		yourNum.setForeground(Color.BLACK);
		yourNum.setBackground(SystemColor.inactiveCaption);
		yourNum.setText("0");
		yourNum.setHorizontalAlignment(SwingConstants.CENTER);
		yourNum.setEditable(false);
		yourNum.setFont(new Font("Bradley Hand ITC", Font.BOLD | Font.ITALIC, 30));
		yourNum.setColumns(10);
		yourNum.setBounds(416, 370, 150, 250);
		contentPane.add(yourNum);

		prevComNum = new JTextField();
		prevComNum.setBackground(SystemColor.inactiveCaption);
		prevComNum.setForeground(Color.GRAY);
		prevComNum.setText("0");
		prevComNum.setHorizontalAlignment(SwingConstants.CENTER);
		prevComNum.setFont(new Font("Bradley Hand ITC", Font.BOLD | Font.ITALIC, 30));
		prevComNum.setEditable(false);
		prevComNum.setColumns(10);
		prevComNum.setBounds(596, 10, 100, 160);
		contentPane.add(prevComNum);

		prev2ComNum = new JTextField();
		prev2ComNum.setBackground(SystemColor.inactiveCaption);
		prev2ComNum.setForeground(Color.GRAY);
		prev2ComNum.setText("0");
		prev2ComNum.setHorizontalAlignment(SwingConstants.CENTER);
		prev2ComNum.setFont(new Font("Bradley Hand ITC", Font.BOLD | Font.ITALIC, 30));
		prev2ComNum.setEditable(false);
		prev2ComNum.setColumns(10);
		prev2ComNum.setBounds(726, 10, 50, 80);
		contentPane.add(prev2ComNum);

		prevYourNum = new JTextField();
		prevYourNum.setBackground(SystemColor.inactiveCaption);
		prevYourNum.setForeground(Color.GRAY);
		prevYourNum.setText("0");
		prevYourNum.setHorizontalAlignment(SwingConstants.CENTER);
		prevYourNum.setFont(new Font("Bradley Hand ITC", Font.BOLD | Font.ITALIC, 30));
		prevYourNum.setEditable(false);
		prevYourNum.setColumns(10);
		prevYourNum.setBounds(596, 460, 100, 160);
		contentPane.add(prevYourNum);

		prev2YourNum = new JTextField();
		prev2YourNum.setBackground(SystemColor.inactiveCaption);
		prev2YourNum.setForeground(Color.GRAY);
		prev2YourNum.setText("0");
		prev2YourNum.setHorizontalAlignment(SwingConstants.CENTER);
		prev2YourNum.setFont(new Font("Bradley Hand ITC", Font.BOLD | Font.ITALIC, 30));
		prev2YourNum.setEditable(false);
		prev2YourNum.setColumns(10);
		prev2YourNum.setBounds(726, 540, 50, 80);
		contentPane.add(prev2YourNum);

		yourMoneyTF = new JTextField();
		yourMoneyTF.setForeground(Color.BLACK);
		yourMoneyTF.setBackground(SystemColor.inactiveCaption);
		yourMoneyTF.setText("" + WelcomeToCasino.you.getYourMoney());
		yourMoneyTF.setHorizontalAlignment(SwingConstants.CENTER);
		yourMoneyTF.setFont(new Font("Tahoma", Font.BOLD, 30));
		yourMoneyTF.setEditable(false);
		yourMoneyTF.setColumns(10);
		yourMoneyTF.setBounds(198, 693, 128, 60);
		contentPane.add(yourMoneyTF);

		int array[] = new int[10];
		Random r = new Random();

		for (int i = 0; i < 10; i++) {
			array[i] = i;
		}

		JButton playButton = new JButton("PLAY");
		playButton.setForeground(Color.BLACK);
		playButton.setBackground(SystemColor.inactiveCaption);
		playButton.addActionListener(new ActionListener() {

			int yourMoney = 50;

			public void actionPerformed(ActionEvent e) {
				
				int yourMoney = WelcomeToCasino.you.getYourMoney();

				if (WelcomeToCasino.you.getYourMoney() == 0) {
					JOptionPane.showMessageDialog(null,
							"Casino owner: You're out of money. I warned you, leave my casino now.");
					System.exit(0);
				}

				int a = Integer.parseInt(betComboBox.getSelectedItem().toString());

				if (a > yourMoney) {
					JOptionPane.showMessageDialog(null,
							"Casino owner: You don't have enough money for this bet.");
				}

				else {
					String c = comNum.getText();
					String c1 = prevComNum.getText();
					String y = yourNum.getText();
					String y1 = prevYourNum.getText();

					prevComNum.setText(c);
					prev2ComNum.setText(c1);
					prevYourNum.setText(y);
					prev2YourNum.setText(y1);

					int random1 = r.nextInt(10);
					int random2 = r.nextInt(10);

					comNum.setText("" + random1);
					yourNum.setText("" + random2);

					if (random1 > random2) {
						if (betComboBox.getSelectedIndex() == 0) // 1 $
						{
							yourMoney = yourMoney - 1;
						}
						if (betComboBox.getSelectedIndex() == 1) // 5 $
						{
							yourMoney = yourMoney - 5;
						}
						if (betComboBox.getSelectedIndex() == 2) // 10 $
						{
							yourMoney = yourMoney - 10;
						}
						if (betComboBox.getSelectedIndex() == 3) // 50 $
						{
							yourMoney = yourMoney - 50;
						}
						if (betComboBox.getSelectedIndex() == 4) // 100 $
						{
							yourMoney = yourMoney - 100;
						}
						if (betComboBox.getSelectedIndex() == 5) // 500 $
						{
							yourMoney = yourMoney - 500;
						}

						yourMoneyTF.setText("" + yourMoney);
					}

					if (random1 == random2) {

					}

					if (random1 < random2) {
						if (betComboBox.getSelectedIndex() == 0) // 1 $
						{
							yourMoney = yourMoney + 1;
						}
						if (betComboBox.getSelectedIndex() == 1) // 5 $
						{
							yourMoney = yourMoney + 5;
						}
						if (betComboBox.getSelectedIndex() == 2) // 10 $
						{
							yourMoney = yourMoney + 10;
						}
						if (betComboBox.getSelectedIndex() == 3) // 50 $
						{
							yourMoney = yourMoney + 50;
						}
						if (betComboBox.getSelectedIndex() == 4) // 100 $
						{
							yourMoney = yourMoney + 100;
						}
						if (betComboBox.getSelectedIndex() == 5) // 500 $
						{
							yourMoney = yourMoney + 500;
						}

						yourMoneyTF.setText("" + yourMoney);
					}
					
					WelcomeToCasino.you.setYourMoney(Integer.parseInt(yourMoneyTF.getText()));

				}
			}
		});
		playButton.setFont(new Font("Bradley Hand ITC", Font.BOLD, 30));
		playButton.setBounds(416, 280, 150, 60);
		contentPane.add(playButton);

		betComboBox = new JComboBox();
		betComboBox.setForeground(Color.BLACK);
		betComboBox.setBackground(SystemColor.inactiveCaption);
		betComboBox.setModel(new DefaultComboBoxModel(new String[] { "1", "5", "10", "50", "100", "500" }));
		betComboBox.setFont(new Font("Bradley Hand ITC", Font.BOLD, 30));
		betComboBox.setBounds(198, 280, 128, 60);
		contentPane.add(betComboBox);

		$B = new JTextField();
		$B.setHorizontalAlignment(SwingConstants.CENTER);
		$B.setForeground(Color.BLACK);
		$B.setEditable(false);
		$B.setBackground(SystemColor.inactiveCaption);
		$B.setText("$");
		$B.setFont(new Font("Tahoma", Font.BOLD, 30));
		$B.setBounds(326, 693, 60, 60);
		contentPane.add($B);
		$B.setColumns(10);

		$A = new JTextField();
		$A.setHorizontalAlignment(SwingConstants.CENTER);
		$A.setForeground(Color.BLACK);
		$A.setEditable(false);
		$A.setBackground(SystemColor.inactiveCaption);
		$A.setText("$");
		$A.setFont(new Font("Bradley Hand ITC", Font.BOLD, 30));
		$A.setColumns(10);
		$A.setBounds(326, 280, 60, 60);
		contentPane.add($A);

		bet = new JTextField();
		bet.setHorizontalAlignment(SwingConstants.LEFT);
		bet.setEditable(false);
		bet.setForeground(Color.BLACK);
		bet.setText("BET: ");
		bet.setBackground(SystemColor.inactiveCaption);
		bet.setFont(new Font("Bradley Hand ITC", Font.BOLD | Font.ITALIC, 30));
		bet.setBounds(10, 280, 188, 60);
		contentPane.add(bet);
		bet.setColumns(10);

		money = new JTextField();
		money.setHorizontalAlignment(SwingConstants.CENTER);
		money.setText("MONEY: ");
		money.setForeground(Color.BLACK);
		money.setFont(new Font("Tahoma", Font.BOLD, 30));
		money.setEditable(false);
		money.setColumns(10);
		money.setBackground(SystemColor.inactiveCaption);
		money.setBounds(10, 693, 188, 60);
		contentPane.add(money);
		
		backButton = new JButton("BACK");
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (WelcomeToCasino.you.getYourMoney() == 0) {
					JOptionPane.showMessageDialog(null,
							"Casino owner: You're out of money. Get the **** out of my place.");
					System.exit(0);
				}
				else {
					WelcomeToCasino frame = new WelcomeToCasino();
					frame.setVisible(true);
					setVisible(false);
				}
				
			}
		});
		backButton.setForeground(Color.BLACK);
		backButton.setFont(new Font("Tahoma", Font.BOLD, 30));
		backButton.setBackground(SystemColor.inactiveCaption);
		backButton.setBounds(626, 692, 150, 60);
		contentPane.add(backButton);

	}
}

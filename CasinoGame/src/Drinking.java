
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

public class Drinking extends JFrame {

	private JPanel contentPane;
	private JTextField yourMoneyTF;
	private JTextField $;
	private JTextField money;
	private JTextField txtDrnkMenu;
	private JTextField txtDomestc;
	private JTextField txtBeer;
	private JTextField priceD;
	private JTextField textField_1;
	private JTextField txtImportmcro;
	private JTextField priceIM;
	private JTextField textField_4;
	private JTextField txtBDomestic;
	private JTextField priceBD;
	private JTextField textField_5;
	private JTextField txtBImportmcro;
	private JTextField priceBIM;
	private JTextField textField_8;
	private JTextField txtHouseWne;
	private JTextField txtSutterHome;
	private JTextField priceSH;
	private JTextField textField_10;
	private JTextField txtPremumLquor;
	private JTextField txtvTtos;
	private JTextField priceVT;
	private JTextField textField_12;
	private JTextField txtvGreyGoose;
	private JTextField priceVGG;
	private JTextField textField_14;
	private JTextField txtgHendrcks;
	private JTextField priceGH;
	private JTextField textField_16;
	private JTextField txttPatronSlver;
	private JTextField priceTPS;
	private JTextField textField_18;
	private JTextField txttPatronReposado;
	private JTextField priceTPR;
	private JTextField textField_20;
	private JButton buyIM;
	private JButton buyBD;
	private JButton buyBIM;
	private JButton buySH;
	private JButton buyVT;
	private JButton buyVGG;
	private JButton buyGH;
	private JButton buyTPS;
	private JButton buyTPR;
	
	void buy(JTextField jtf)
	{
		int yourMoney = WelcomeToCasino.you.getYourMoney();

		if (WelcomeToCasino.you.getYourMoney() == 0) {
			JOptionPane.showMessageDialog(null,
					"Casino owner: You're out of money. Get the **** out of my place.");
			System.exit(0);
		}

		int a = Integer.parseInt(jtf.getText());

		if (a > yourMoney) {
			JOptionPane.showMessageDialog(null, "Casino owner: You don't have enough money for this drink.");
		}

		else {
			yourMoney = yourMoney - a;
			WelcomeToCasino.you.setYourMoney(yourMoney);
			yourMoneyTF.setText("" + yourMoney);
		}
	}

	public Drinking() {
		setResizable(false);

		setForeground(Color.BLACK);

		setTitle("DRINKING");
		setBackground(SystemColor.activeCaption);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 800, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		contentPane.setBackground(SystemColor.activeCaption);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setMaximumSize(getMaximumSize());

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

		$ = new JTextField();
		$.setHorizontalAlignment(SwingConstants.CENTER);
		$.setForeground(Color.BLACK);
		$.setEditable(false);
		$.setBackground(SystemColor.inactiveCaption);
		$.setText("$");
		$.setFont(new Font("Tahoma", Font.BOLD, 30));
		$.setBounds(326, 693, 60, 60);
		contentPane.add($);
		$.setColumns(10);

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

		txtDrnkMenu = new JTextField();
		txtDrnkMenu.setText("DRINK MENU");
		txtDrnkMenu.setHorizontalAlignment(SwingConstants.CENTER);
		txtDrnkMenu.setForeground(Color.BLACK);
		txtDrnkMenu.setFont(new Font("Bradley Hand ITC", Font.BOLD | Font.ITALIC, 40));
		txtDrnkMenu.setEditable(false);
		txtDrnkMenu.setColumns(10);
		txtDrnkMenu.setBackground(SystemColor.inactiveCaption);
		txtDrnkMenu.setBounds(248, 10, 300, 60);
		contentPane.add(txtDrnkMenu);

		JButton backButton = new JButton("BACK");
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (WelcomeToCasino.you.getYourMoney() == 0) {
					JOptionPane.showMessageDialog(null,
							"Casino owner: You're out of money. Get the **** out of my place.");
					System.exit(0);
				} else {
					WelcomeToCasino frame = new WelcomeToCasino();
					frame.setVisible(true);
					setVisible(false);
				}

			}
		});
		backButton.setForeground(Color.BLACK);
		backButton.setFont(new Font("Tahoma", Font.BOLD, 30));
		backButton.setBackground(SystemColor.inactiveCaption);
		backButton.setBounds(626, 693, 150, 60);
		contentPane.add(backButton);

		txtDomestc = new JTextField();
		txtDomestc.setText("DOMESTIC");
		txtDomestc.setHorizontalAlignment(SwingConstants.LEFT);
		txtDomestc.setFont(new Font("Bradley Hand ITC", Font.BOLD | Font.ITALIC, 20));
		txtDomestc.setEditable(false);
		txtDomestc.setColumns(10);
		txtDomestc.setBackground(SystemColor.inactiveCaption);
		txtDomestc.setBounds(144, 140, 300, 30);
		contentPane.add(txtDomestc);

		txtBeer = new JTextField();
		txtBeer.setText("~~~~ BEERS ~~~~");
		txtBeer.setHorizontalAlignment(SwingConstants.CENTER);
		txtBeer.setForeground(Color.BLACK);
		txtBeer.setFont(new Font("Bradley Hand ITC", Font.ITALIC, 30));
		txtBeer.setEditable(false);
		txtBeer.setColumns(10);
		txtBeer.setBackground(SystemColor.inactiveCaption);
		txtBeer.setBounds(10, 100, 776, 30);
		contentPane.add(txtBeer);

		priceD = new JTextField();
		priceD.setText("5");
		priceD.setHorizontalAlignment(SwingConstants.CENTER);
		priceD.setFont(new Font("Bradley Hand ITC", Font.BOLD | Font.ITALIC, 20));
		priceD.setEditable(false);
		priceD.setColumns(10);
		priceD.setBackground(SystemColor.inactiveCaption);
		priceD.setBounds(454, 140, 60, 30);
		contentPane.add(priceD);

		textField_1 = new JTextField();
		textField_1.setText("$");
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setFont(new Font("Bradley Hand ITC", Font.BOLD | Font.ITALIC, 20));
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBackground(SystemColor.inactiveCaption);
		textField_1.setBounds(514, 140, 30, 30);
		contentPane.add(textField_1);

		txtImportmcro = new JTextField();
		txtImportmcro.setText("IMPORT/MICRO");
		txtImportmcro.setHorizontalAlignment(SwingConstants.LEFT);
		txtImportmcro.setFont(new Font("Bradley Hand ITC", Font.BOLD | Font.ITALIC, 20));
		txtImportmcro.setEditable(false);
		txtImportmcro.setColumns(10);
		txtImportmcro.setBackground(SystemColor.inactiveCaption);
		txtImportmcro.setBounds(144, 180, 300, 30);
		contentPane.add(txtImportmcro);

		priceIM = new JTextField();
		priceIM.setText("7");
		priceIM.setHorizontalAlignment(SwingConstants.CENTER);
		priceIM.setFont(new Font("Bradley Hand ITC", Font.BOLD | Font.ITALIC, 20));
		priceIM.setEditable(false);
		priceIM.setColumns(10);
		priceIM.setBackground(SystemColor.inactiveCaption);
		priceIM.setBounds(453, 180, 60, 30);
		contentPane.add(priceIM);

		textField_4 = new JTextField();
		textField_4.setText("$");
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setFont(new Font("Bradley Hand ITC", Font.BOLD | Font.ITALIC, 20));
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBackground(SystemColor.inactiveCaption);
		textField_4.setBounds(513, 180, 30, 30);
		contentPane.add(textField_4);

		txtBDomestic = new JTextField();
		txtBDomestic.setText("B. DOMESTIC");
		txtBDomestic.setHorizontalAlignment(SwingConstants.LEFT);
		txtBDomestic.setFont(new Font("Bradley Hand ITC", Font.BOLD | Font.ITALIC, 20));
		txtBDomestic.setEditable(false);
		txtBDomestic.setColumns(10);
		txtBDomestic.setBackground(SystemColor.inactiveCaption);
		txtBDomestic.setBounds(143, 220, 300, 30);
		contentPane.add(txtBDomestic);

		priceBD = new JTextField();
		priceBD.setText("5");
		priceBD.setHorizontalAlignment(SwingConstants.CENTER);
		priceBD.setFont(new Font("Bradley Hand ITC", Font.BOLD | Font.ITALIC, 20));
		priceBD.setEditable(false);
		priceBD.setColumns(10);
		priceBD.setBackground(SystemColor.inactiveCaption);
		priceBD.setBounds(453, 220, 60, 30);
		contentPane.add(priceBD);

		textField_5 = new JTextField();
		textField_5.setText("$");
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setFont(new Font("Bradley Hand ITC", Font.BOLD | Font.ITALIC, 20));
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBackground(SystemColor.inactiveCaption);
		textField_5.setBounds(513, 220, 30, 30);
		contentPane.add(textField_5);

		txtBImportmcro = new JTextField();
		txtBImportmcro.setText("B. IMPORT/MICRO");
		txtBImportmcro.setHorizontalAlignment(SwingConstants.LEFT);
		txtBImportmcro.setFont(new Font("Bradley Hand ITC", Font.BOLD | Font.ITALIC, 20));
		txtBImportmcro.setEditable(false);
		txtBImportmcro.setColumns(10);
		txtBImportmcro.setBackground(SystemColor.inactiveCaption);
		txtBImportmcro.setBounds(143, 260, 300, 30);
		contentPane.add(txtBImportmcro);

		priceBIM = new JTextField();
		priceBIM.setText("7");
		priceBIM.setHorizontalAlignment(SwingConstants.CENTER);
		priceBIM.setFont(new Font("Bradley Hand ITC", Font.BOLD | Font.ITALIC, 20));
		priceBIM.setEditable(false);
		priceBIM.setColumns(10);
		priceBIM.setBackground(SystemColor.inactiveCaption);
		priceBIM.setBounds(453, 260, 60, 30);
		contentPane.add(priceBIM);

		textField_8 = new JTextField();
		textField_8.setText("$");
		textField_8.setHorizontalAlignment(SwingConstants.CENTER);
		textField_8.setFont(new Font("Bradley Hand ITC", Font.BOLD | Font.ITALIC, 20));
		textField_8.setEditable(false);
		textField_8.setColumns(10);
		textField_8.setBackground(SystemColor.inactiveCaption);
		textField_8.setBounds(513, 260, 30, 30);
		contentPane.add(textField_8);

		txtHouseWne = new JTextField();
		txtHouseWne.setText("~~~~ HOUSE WINES ~~~~");
		txtHouseWne.setHorizontalAlignment(SwingConstants.CENTER);
		txtHouseWne.setForeground(Color.BLACK);
		txtHouseWne.setFont(new Font("Bradley Hand ITC", Font.ITALIC, 30));
		txtHouseWne.setEditable(false);
		txtHouseWne.setColumns(10);
		txtHouseWne.setBackground(SystemColor.inactiveCaption);
		txtHouseWne.setBounds(10, 310, 766, 30);
		contentPane.add(txtHouseWne);

		txtSutterHome = new JTextField();
		txtSutterHome.setText("SUTTER HOME");
		txtSutterHome.setHorizontalAlignment(SwingConstants.LEFT);
		txtSutterHome.setFont(new Font("Bradley Hand ITC", Font.BOLD | Font.ITALIC, 20));
		txtSutterHome.setEditable(false);
		txtSutterHome.setColumns(10);
		txtSutterHome.setBackground(SystemColor.inactiveCaption);
		txtSutterHome.setBounds(143, 350, 300, 30);
		contentPane.add(txtSutterHome);

		priceSH = new JTextField();
		priceSH.setText("6");
		priceSH.setHorizontalAlignment(SwingConstants.CENTER);
		priceSH.setFont(new Font("Bradley Hand ITC", Font.BOLD | Font.ITALIC, 20));
		priceSH.setEditable(false);
		priceSH.setColumns(10);
		priceSH.setBackground(SystemColor.inactiveCaption);
		priceSH.setBounds(453, 350, 60, 30);
		contentPane.add(priceSH);

		textField_10 = new JTextField();
		textField_10.setText("$");
		textField_10.setHorizontalAlignment(SwingConstants.CENTER);
		textField_10.setFont(new Font("Bradley Hand ITC", Font.BOLD | Font.ITALIC, 20));
		textField_10.setEditable(false);
		textField_10.setColumns(10);
		textField_10.setBackground(SystemColor.inactiveCaption);
		textField_10.setBounds(513, 350, 30, 30);
		contentPane.add(textField_10);

		txtPremumLquor = new JTextField();
		txtPremumLquor.setText("~~~~ PREMIUM LIQUORS ~~~~");
		txtPremumLquor.setHorizontalAlignment(SwingConstants.CENTER);
		txtPremumLquor.setForeground(Color.BLACK);
		txtPremumLquor.setFont(new Font("Bradley Hand ITC", Font.ITALIC, 30));
		txtPremumLquor.setEditable(false);
		txtPremumLquor.setColumns(10);
		txtPremumLquor.setBackground(SystemColor.inactiveCaption);
		txtPremumLquor.setBounds(10, 400, 766, 30);
		contentPane.add(txtPremumLquor);

		txtvTtos = new JTextField();
		txtvTtos.setText("(V) TITOS");
		txtvTtos.setHorizontalAlignment(SwingConstants.LEFT);
		txtvTtos.setFont(new Font("Bradley Hand ITC", Font.BOLD | Font.ITALIC, 20));
		txtvTtos.setEditable(false);
		txtvTtos.setColumns(10);
		txtvTtos.setBackground(SystemColor.inactiveCaption);
		txtvTtos.setBounds(144, 440, 300, 30);
		contentPane.add(txtvTtos);

		priceVT = new JTextField();
		priceVT.setText("12");
		priceVT.setHorizontalAlignment(SwingConstants.CENTER);
		priceVT.setFont(new Font("Bradley Hand ITC", Font.BOLD | Font.ITALIC, 20));
		priceVT.setEditable(false);
		priceVT.setColumns(10);
		priceVT.setBackground(SystemColor.inactiveCaption);
		priceVT.setBounds(453, 440, 60, 30);
		contentPane.add(priceVT);

		textField_12 = new JTextField();
		textField_12.setText("$");
		textField_12.setHorizontalAlignment(SwingConstants.CENTER);
		textField_12.setFont(new Font("Bradley Hand ITC", Font.BOLD | Font.ITALIC, 20));
		textField_12.setEditable(false);
		textField_12.setColumns(10);
		textField_12.setBackground(SystemColor.inactiveCaption);
		textField_12.setBounds(513, 440, 30, 30);
		contentPane.add(textField_12);

		txtvGreyGoose = new JTextField();
		txtvGreyGoose.setText("(V) GREY GOOSE");
		txtvGreyGoose.setHorizontalAlignment(SwingConstants.LEFT);
		txtvGreyGoose.setFont(new Font("Bradley Hand ITC", Font.BOLD | Font.ITALIC, 20));
		txtvGreyGoose.setEditable(false);
		txtvGreyGoose.setColumns(10);
		txtvGreyGoose.setBackground(SystemColor.inactiveCaption);
		txtvGreyGoose.setBounds(144, 480, 300, 30);
		contentPane.add(txtvGreyGoose);

		priceVGG = new JTextField();
		priceVGG.setText("14");
		priceVGG.setHorizontalAlignment(SwingConstants.CENTER);
		priceVGG.setFont(new Font("Bradley Hand ITC", Font.BOLD | Font.ITALIC, 20));
		priceVGG.setEditable(false);
		priceVGG.setColumns(10);
		priceVGG.setBackground(SystemColor.inactiveCaption);
		priceVGG.setBounds(453, 480, 60, 30);
		contentPane.add(priceVGG);

		textField_14 = new JTextField();
		textField_14.setText("$");
		textField_14.setHorizontalAlignment(SwingConstants.CENTER);
		textField_14.setFont(new Font("Bradley Hand ITC", Font.BOLD | Font.ITALIC, 20));
		textField_14.setEditable(false);
		textField_14.setColumns(10);
		textField_14.setBackground(SystemColor.inactiveCaption);
		textField_14.setBounds(513, 480, 30, 30);
		contentPane.add(textField_14);

		txtgHendrcks = new JTextField();
		txtgHendrcks.setText("(G) HENDRICKS");
		txtgHendrcks.setHorizontalAlignment(SwingConstants.LEFT);
		txtgHendrcks.setFont(new Font("Bradley Hand ITC", Font.BOLD | Font.ITALIC, 20));
		txtgHendrcks.setEditable(false);
		txtgHendrcks.setColumns(10);
		txtgHendrcks.setBackground(SystemColor.inactiveCaption);
		txtgHendrcks.setBounds(144, 520, 300, 30);
		contentPane.add(txtgHendrcks);

		priceGH = new JTextField();
		priceGH.setText("12");
		priceGH.setHorizontalAlignment(SwingConstants.CENTER);
		priceGH.setFont(new Font("Bradley Hand ITC", Font.BOLD | Font.ITALIC, 20));
		priceGH.setEditable(false);
		priceGH.setColumns(10);
		priceGH.setBackground(SystemColor.inactiveCaption);
		priceGH.setBounds(453, 520, 60, 30);
		contentPane.add(priceGH);

		textField_16 = new JTextField();
		textField_16.setText("$");
		textField_16.setHorizontalAlignment(SwingConstants.CENTER);
		textField_16.setFont(new Font("Bradley Hand ITC", Font.BOLD | Font.ITALIC, 20));
		textField_16.setEditable(false);
		textField_16.setColumns(10);
		textField_16.setBackground(SystemColor.inactiveCaption);
		textField_16.setBounds(513, 520, 30, 30);
		contentPane.add(textField_16);

		txttPatronSlver = new JTextField();
		txttPatronSlver.setText("(T) PATRON SILVER");
		txttPatronSlver.setHorizontalAlignment(SwingConstants.LEFT);
		txttPatronSlver.setFont(new Font("Bradley Hand ITC", Font.BOLD | Font.ITALIC, 20));
		txttPatronSlver.setEditable(false);
		txttPatronSlver.setColumns(10);
		txttPatronSlver.setBackground(SystemColor.inactiveCaption);
		txttPatronSlver.setBounds(144, 560, 300, 30);
		contentPane.add(txttPatronSlver);

		priceTPS = new JTextField();
		priceTPS.setText("14");
		priceTPS.setHorizontalAlignment(SwingConstants.CENTER);
		priceTPS.setFont(new Font("Bradley Hand ITC", Font.BOLD | Font.ITALIC, 20));
		priceTPS.setEditable(false);
		priceTPS.setColumns(10);
		priceTPS.setBackground(SystemColor.inactiveCaption);
		priceTPS.setBounds(453, 560, 60, 30);
		contentPane.add(priceTPS);

		textField_18 = new JTextField();
		textField_18.setText("$");
		textField_18.setHorizontalAlignment(SwingConstants.CENTER);
		textField_18.setFont(new Font("Bradley Hand ITC", Font.BOLD | Font.ITALIC, 20));
		textField_18.setEditable(false);
		textField_18.setColumns(10);
		textField_18.setBackground(SystemColor.inactiveCaption);
		textField_18.setBounds(513, 560, 30, 30);
		contentPane.add(textField_18);

		txttPatronReposado = new JTextField();
		txttPatronReposado.setText("(T) PATRON REPOSADO");
		txttPatronReposado.setHorizontalAlignment(SwingConstants.LEFT);
		txttPatronReposado.setFont(new Font("Bradley Hand ITC", Font.BOLD | Font.ITALIC, 20));
		txttPatronReposado.setEditable(false);
		txttPatronReposado.setColumns(10);
		txttPatronReposado.setBackground(SystemColor.inactiveCaption);
		txttPatronReposado.setBounds(144, 600, 300, 30);
		contentPane.add(txttPatronReposado);

		priceTPR = new JTextField();
		priceTPR.setText("14");
		priceTPR.setHorizontalAlignment(SwingConstants.CENTER);
		priceTPR.setFont(new Font("Bradley Hand ITC", Font.BOLD | Font.ITALIC, 20));
		priceTPR.setEditable(false);
		priceTPR.setColumns(10);
		priceTPR.setBackground(SystemColor.inactiveCaption);
		priceTPR.setBounds(453, 600, 60, 30);
		contentPane.add(priceTPR);

		textField_20 = new JTextField();
		textField_20.setText("$");
		textField_20.setHorizontalAlignment(SwingConstants.CENTER);
		textField_20.setFont(new Font("Bradley Hand ITC", Font.BOLD | Font.ITALIC, 20));
		textField_20.setEditable(false);
		textField_20.setColumns(10);
		textField_20.setBackground(SystemColor.inactiveCaption);
		textField_20.setBounds(513, 600, 30, 30);
		contentPane.add(textField_20);

		JButton buyD = new JButton("BUY");
		buyD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buy(priceD);
			}
		});
		buyD.setBackground(SystemColor.inactiveCaption);
		buyD.setFont(new Font("Bradley Hand ITC", Font.BOLD | Font.ITALIC, 20));
		buyD.setBounds(553, 140, 90, 30);
		contentPane.add(buyD);

		buyIM = new JButton("BUY");
		buyIM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buy(priceIM);
			}
		});
		buyIM.setBackground(SystemColor.inactiveCaption);
		buyIM.setFont(new Font("Bradley Hand ITC", Font.BOLD | Font.ITALIC, 20));
		buyIM.setBounds(553, 180, 90, 30);
		contentPane.add(buyIM);

		buyBD = new JButton("BUY");
		buyBD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buy(priceBD);
			}
		});
		buyBD.setBackground(SystemColor.inactiveCaption);
		buyBD.setFont(new Font("Bradley Hand ITC", Font.BOLD | Font.ITALIC, 20));
		buyBD.setBounds(553, 220, 90, 30);
		contentPane.add(buyBD);

		buyBIM = new JButton("BUY");
		buyBIM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buy(priceBIM);
			}
		});
		buyBIM.setBackground(SystemColor.inactiveCaption);
		buyBIM.setFont(new Font("Bradley Hand ITC", Font.BOLD | Font.ITALIC, 20));
		buyBIM.setBounds(553, 260, 90, 30);
		contentPane.add(buyBIM);

		buySH = new JButton("BUY");
		buySH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buy(priceSH);
			}
		});
		buySH.setBackground(SystemColor.inactiveCaption);
		buySH.setFont(new Font("Bradley Hand ITC", Font.BOLD | Font.ITALIC, 20));
		buySH.setBounds(553, 350, 90, 30);
		contentPane.add(buySH);

		buyVT = new JButton("BUY");
		buyVT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buy(priceVT);
			}
		});
		buyVT.setBackground(SystemColor.inactiveCaption);
		buyVT.setFont(new Font("Bradley Hand ITC", Font.BOLD | Font.ITALIC, 20));
		buyVT.setBounds(553, 440, 90, 30);
		contentPane.add(buyVT);

		buyVGG = new JButton("BUY");
		buyVGG.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buy(priceVGG);
			}
		});
		buyVGG.setBackground(SystemColor.inactiveCaption);
		buyVGG.setFont(new Font("Bradley Hand ITC", Font.BOLD | Font.ITALIC, 20));
		buyVGG.setBounds(553, 480, 90, 30);
		contentPane.add(buyVGG);

		buyGH = new JButton("BUY");
		buyGH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buy(priceGH);
			}
		});
		buyGH.setBackground(SystemColor.inactiveCaption);
		buyGH.setFont(new Font("Bradley Hand ITC", Font.BOLD | Font.ITALIC, 20));
		buyGH.setBounds(553, 520, 90, 30);
		contentPane.add(buyGH);

		buyTPS = new JButton("BUY");
		buyTPS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buy(priceTPS);
			}
		});
		buyTPS.setBackground(SystemColor.inactiveCaption);
		buyTPS.setFont(new Font("Bradley Hand ITC", Font.BOLD | Font.ITALIC, 20));
		buyTPS.setBounds(553, 560, 90, 30);
		contentPane.add(buyTPS);

		buyTPR = new JButton("BUY");
		buyTPR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buy(priceTPR);
			}
		});
		buyTPR.setBackground(SystemColor.inactiveCaption);
		buyTPR.setFont(new Font("Bradley Hand ITC", Font.BOLD | Font.ITALIC, 20));
		buyTPR.setBounds(553, 600, 90, 30);
		contentPane.add(buyTPR);

	}
}

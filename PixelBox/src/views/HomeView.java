package views;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import controllers.ClientsController;
import controllers.HomeController;
import controllers.LoginController;
import controllers.OperationsController;
import controllers.VideogamesController;
import controllers.Rentals_SalesController;

import customClasses.RoundedPanel;
import customClasses.SideBar;


public class HomeView {
	
	Color orangeBase = Color.decode("#FF8F00");
	Color grayField = Color.decode("#E8E8E8");
	
	ImageIcon logo = new ImageIcon(HomeView.class.getResource("/images/logo.png"));
	ImageIcon homeIcon = new ImageIcon(HomeView.class.getResource("/images/home.png"));
	ImageIcon usersIcon = new ImageIcon(HomeView.class.getResource("/images/users.png"));
	ImageIcon gamesIcon = new ImageIcon(HomeView.class.getResource("/images/games.png"));
	ImageIcon opIcon = new ImageIcon(HomeView.class.getResource("/images/op.png"));
	ImageIcon rentIcon = new ImageIcon(HomeView.class.getResource("/images/rent.png"));
	ImageIcon logOut = new ImageIcon(HomeView.class.getResource("/images/logOut.png"));
	ImageIcon adminIcon = new ImageIcon(HomeView.class.getResource("/images/admin.png"));
	
	public HomeView() {
		
	}
	
	public void home() {
		
		// VENTANA
		JFrame frame = new JFrame();
		frame.setBounds(100, 20, 1000, 643);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		// PANEL LATERAL
		RoundedPanel sidepanel = new RoundedPanel(10, orangeBase);
		sidepanel.setLocation(0, 0);
		sidepanel.setSize(128, 606);
		sidepanel.setLayout(new GridLayout(0, 1, 0, 0));
		frame.getContentPane().add(sidepanel);
		
		SideBar inicio = new SideBar("Inicio", homeIcon);
		sidepanel.add(inicio);
		inicio.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				HomeController hc = new HomeController();
				hc.home();
			}
			
		});
		
		SideBar clientes = new SideBar("Clientes", usersIcon);
		sidepanel.add(clientes);
		clientes.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				ClientsController cc = new ClientsController();
				cc.clients();
			}
			
		});
		
		SideBar nuevaOp = new SideBar("Nueva operación", opIcon );
		sidepanel.add(nuevaOp);
		nuevaOp.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				OperationsController oc = new OperationsController();
				oc.operations();
			}
			
		});
		
		SideBar rentaCompra = new SideBar("Rentas\ny compras", rentIcon);
		sidepanel.add(rentaCompra);
		rentaCompra.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Rentals_SalesController rsc = new Rentals_SalesController();
				rsc.rentas_compras();
			}
			
		});
		
		SideBar juegos = new SideBar("Videojuegos", gamesIcon);
		sidepanel.add(juegos);
		juegos.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				VideogamesController pc = new VideogamesController();
				pc.games();
			}
			
		});
		
		// PANEL CENTRO
		JPanel centro = new JPanel();
		centro.setBounds(0, 0, 809, 606);
		frame.getContentPane().add(centro);
		centro.setLayout(null);
		
		RoundedPanel banner = new RoundedPanel(10, grayField);
		banner.setLocation(230, 0);
		banner.setSize(654,75);
		centro.add(banner);
		banner.setLayout(null);
		
		JLabel logoLabel = new JLabel("");
		logoLabel.setBounds(233, 5, 188, 64);
		logoLabel.setIcon(new ImageIcon(((ImageIcon) logo).getImage().getScaledInstance(150, 80, Image.SCALE_SMOOTH)));
		banner.add(logoLabel);
		
		
		JLabel logOutLabel = new JLabel("Cerrar Sesión");
		logOutLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		logOutLabel.setForeground(new Color(51, 51, 51));
		logOutLabel.setFont(new Font("Dialog", Font.PLAIN, 10));
		logOutLabel.setBounds(526, 47, 88, 14);
		banner.add(logOutLabel);
		
		JLabel logOutIcon = new JLabel("");
		logOutIcon.setIcon(new ImageIcon(((ImageIcon) logOut).getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH)));
		logOutIcon.setBounds(620, 44, 20, 20);
		logOutIcon.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				
				frame.dispose();
				LoginController lc = new LoginController();
				lc.show();
			}
		});
		banner.add(logOutIcon);
		
		JLabel adminPhoto = new JLabel("");
		adminPhoto.setHorizontalAlignment(SwingConstants.CENTER);
		adminPhoto.setIcon(new ImageIcon(((ImageIcon) adminIcon).getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH)));
		adminPhoto.setBounds(494, 15, 49, 49);
		banner.add(adminPhoto);
		
		JLabel extralabel = new JLabel("Bienvenido");
		extralabel.setBounds(553, 15, 76, 14);
		banner.add(extralabel);
		
		JLabel adminName = new JLabel("Admin");
		adminName.setBounds(553, 29, 49, 14);
		banner.add(adminName);
		
	}

}

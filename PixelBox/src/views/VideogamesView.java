package views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import controllers.ClientsController;
import controllers.HomeController;
import controllers.OperationsController;
import controllers.VideogamesController;
import controllers.Rentals_SalesController;
import customClasses.Fuentes;
import customClasses.RoundedPanel;
import customClasses.SideBar;

public class VideogamesView {
	
	private JFrame frame = new JFrame();
	
	Color orangeBase = Color.decode("#FF8F00");
	
	Fuentes tipoFuentes = new Fuentes();
	Font titles = tipoFuentes.fuente("/fonts/GolosText-Regular.ttf", Font.BOLD, 16f);
	
	ImageIcon homeIcon = new ImageIcon(HomeView.class.getResource("/images/home.png"));
	ImageIcon usersIcon = new ImageIcon(HomeView.class.getResource("/images/users.png"));
	ImageIcon gamesIcon = new ImageIcon(HomeView.class.getResource("/images/games.png"));
	ImageIcon opIcon = new ImageIcon(HomeView.class.getResource("/images/op.png"));
	ImageIcon rentIcon = new ImageIcon(HomeView.class.getResource("/images/rent.png"));
	ImageIcon logOut = new ImageIcon(HomeView.class.getResource("/images/logOut.png"));
	ImageIcon adminIcon = new ImageIcon(HomeView.class.getResource("/images/admin.png"));

	public VideogamesView() {

	}

	public void games() {
		//VENTANA
		JFrame frame  = new JFrame();
		frame.setBounds(100, 20, 1000, 643);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

		//PANEL LATERAL
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

		//PANEL CENTRO
		JPanel centro = new JPanel();
		centro.setBounds(0, 0, 809, 606);
		frame.getContentPane().add(centro);
		centro.setLayout(null);

		RoundedPanel titlePanel = new RoundedPanel(30, new Color(255, 255, 255));
		titlePanel.setBounds(151, 11, 120, 43);
		centro.add(titlePanel);
		titlePanel.setLayout(new BorderLayout(0, 0));

		JLabel titleLabel = new JLabel("Videojuegos");
		titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		titleLabel.setFont(titles);
		titlePanel.add(titleLabel);
	}

}

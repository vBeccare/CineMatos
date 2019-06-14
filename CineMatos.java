
//interface gráfica 
import java.sql.*;
import java.util.HashMap;
import java.util.Random;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.plaf.FontUIResource;
import javax.swing.table.*;

import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

public class CineMatos extends JFrame {
	Connection cc =null;
	// PRIMEIRA PAGINAA
	private JButton btingresso1, btpipoca1;
	private JLabel logo1, fundo;
	ImageIcon imglogo1,cines;

	// SEGUNDA PAGINA
	ImageIcon img1, img2, img3, img4, img5, img6;
	private JButton f1, f2, f3, f4, f5, f6, voltar, voltar1;
	ImageIcon voltar11;
	// TERCEIRA PAGINA
	private JButton h1, h2, h3, h4, h5, h6;
	private JLabel banner, preco3, duracao3, sinopse3,lbfaixa;
	ImageIcon faixa10,faixa12,faixa14,faixalivre;

	// pagina 4
	private JPanel legenda;
	private JLabel cadeiras4, livre4, ocupado4, selecionado4, cadverde, cadverm, cadazul;
	private JButton voltar4, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, C1, C2,
			C3, C4, C5, C6, C7, C8, C9, C10, ingressos4;
	private ImageIcon deficienteverde, deficienteverm, cadeiraverde, cadeiraverm, deficienteazul, cadeiraazul;

	// PAGINA 5
	private JTextField inteira, meia;
	private JLabel titulop5, lbinteira5, lbmeia5;
	private JButton mais, maiss, menos, menoss, lancho5;
	ImageIcon maizao, menozao;
	// pagina 6
	private ImageIcon fundao;
	private JLabel pipoca, bebida, doces, doces2, lanchonete, fundo2, fundo3;
	private JComboBox cbbebida, cbdoces, cbdoces2, cbsabor, cbtamanho;
	private JButton finalizar, voltar5;
	// pagina 7
	private JLabel compraf, pedido,aleatorio;
	private JButton imprimir, sair;
	int alea1,alea2,alea3,alea4,alea5;

	private CineMetodos cinema;

	public static void main(String args[]) {
		JFrame frame = new CineMatos();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setResizable(false);
	}

	public CineMatos() {
		inicializarComponentes();
		definirEventos();
		cc= BDCC.conector();

	}

	public void inicializarComponentes() {
		setLayout(null);
		setBounds(150, 0, 1000, 700);
		UIManager.getDefaults().put("OptionPane.background",new Color(178, 34, 34));
		UIManager.put ("Panel.background", new Color(178, 34, 34));
		
		UIManager.getDefaults().put("OptionPane.messageforeground",Color.WHITE);
		UIManager.put("OptionPane.messageForeground", Color.white);
		UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Caladea",Font.BOLD,15)));
		UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("SquareFont",Font.PLAIN,15)));
		Random random = new Random();
		 alea1 = random.nextInt(10);
		 alea2 = random.nextInt(10);
		 alea3 = random.nextInt(10);
		 alea4 = random.nextInt(10);
		 alea5 = random.nextInt(10);
		// PAGINA 1
		Font f = new Font("Caladea", Font.BOLD, 30);
		btingresso1 = new JButton("INGRESSO");
		btingresso1.setBounds(270, 450, 200, 60);
		btingresso1.setFont(f);
		btingresso1.setBackground(new Color(178, 34, 34));
		btingresso1.setForeground(Color.WHITE);
		btingresso1.setBorder(new LineBorder(Color.white, 2, true));
	
		add(btingresso1);

		btpipoca1 = new JButton("LANCHONETE");
		btpipoca1.setBounds(540, 450, 220, 60);
		btpipoca1.setFont(f);
		btpipoca1.setBorder(new LineBorder(Color.white, 2, true));
		btpipoca1.setBackground(new Color(178, 34, 34));
		btpipoca1.setForeground(Color.WHITE);
		add(btpipoca1);

		// PAGINA 2
		img1 = new ImageIcon("C:\\Users\\marco\\Desktop\\Cine\\vinga.jpg");
		f1 = new JButton(img1);
		f1.setBounds(160, 70, 210, 260);
		f1.setBackground(Color.white);
		f1.setBorder(null);
		f1.setVisible(false);
		add(f1);

		img2 = new ImageIcon("C:\\Users\\marco\\Desktop\\Cine\\aranha.jpg");
		f2 = new JButton(img2);
		f2.setBounds(405, 70, 210, 260);
		f2.setBorder(null);
		f2.setVisible(false);
		add(f2);

		img3 = new ImageIcon("C:\\Users\\marco\\Desktop\\Cine\\rei.jpg");
		f3 = new JButton(img3);
		f3.setBounds(660, 70, 210, 260);
		f3.setBorder(null);
		f3.setVisible(false);
		add(f3);

		img4 = new ImageIcon("C:\\Users\\marco\\Desktop\\Cine\\alladin.jpg");
		f4 = new JButton(img4);
		f4.setBounds(160, 370, 210, 260);
		f4.setBorder(null);
		f4.setVisible(false);
		add(f4);

		img5 = new ImageIcon("C:\\Users\\marco\\Desktop\\Cine\\marvel.jpg");
		f5 = new JButton(img5);
		f5.setBounds(405, 370, 210, 260);
		f5.setBorder(null);
		f5.setVisible(false);
		add(f5);

		img6 = new ImageIcon("C:\\Users\\marco\\Desktop\\Cine\\toy.jpg");
		f6 = new JButton(img6);
		f6.setBounds(660, 370, 210, 260);
		f6.setBorder(null);
		f6.setVisible(false);
		add(f6);

		// PAGINA 3
		Font h = new Font("SquareFont", Font.PLAIN, 17);
		h1 = new JButton();
		h1.setBounds(100, 80, 180, 130);
		h1.setBackground(new Color(25, 25, 112));
		h1.setFont(h);
		h1.setForeground(Color.WHITE);
		h1.setBorder(new LineBorder(Color.black, 2, true));

		h1.setVisible(false);
		add(h1);

		h2 = new JButton();
		h2.setBounds(350, 80, 180, 130);
		h2.setBackground(new Color(25, 25, 112));
		h2.setFont(h);
		h2.setForeground(Color.WHITE);
		h2.setBorder(new LineBorder(Color.black, 2, true));
		h2.setVisible(false);
		add(h2);

		h3 = new JButton();
		h3.setBounds(100, 280, 180, 130);
		h3.setBackground(new Color(25, 25, 112));
		h3.setFont(h);
		h3.setForeground(Color.WHITE);
		h3.setBorder(new LineBorder(Color.black, 2, true));
		h3.setVisible(false);
		add(h3);

		h4 = new JButton();
		h4.setBounds(350, 280, 180, 130);
		h4.setBackground(new Color(25, 25, 112));
		h4.setFont(h);
		h4.setForeground(Color.WHITE);
		h4.setBorder(new LineBorder(Color.black, 2, true));
		h4.setVisible(false);
		add(h4);

		h5 = new JButton();
		h5.setBounds(100, 480, 180, 130);
		h5.setBackground(new Color(25, 25, 112));
		h5.setFont(h);
		h5.setForeground(Color.WHITE);
		h5.setBorder(new LineBorder(Color.black, 2, true));
		h5.setVisible(false);
		add(h5);

		h6 = new JButton("<html>23:45<br>SALA 1");
		h6.setBounds(350, 480, 180, 130);
		h6.setBackground(new Color(25, 25, 112));
		h6.setFont(h);
		h6.setForeground(Color.WHITE);
		h6.setBorder(new LineBorder(Color.black, 2, true));
		h6.setVisible(false);
		add(h6);

		banner = new JLabel();
		banner.setBounds(640, 27, 200, 300);
		banner.setBorder(null);
		banner.setVisible(false);
		add(banner);
		Font cala = new Font("Caladea", Font.PLAIN, 14);
		Font cala5 = new Font("Caladea", Font.PLAIN, 20);
		preco3 = new JLabel();
		preco3.setBounds(600, 420, 200, 200);
		preco3.setBackground(Color.black);
		preco3.setFont(cala);
		preco3.setForeground(Color.WHITE);
		preco3.setVisible(false);
		add(preco3);
		
		faixa10 = new ImageIcon("C:\\Users\\marco\\Desktop\\Cine\\10anos.png");
		faixa12 = new ImageIcon("C:\\Users\\marco\\Desktop\\Cine\\12anos.png");
		faixa14 = new ImageIcon("C:\\Users\\marco\\Desktop\\Cine\\14anos.png");
		faixalivre = new ImageIcon("C:\\Users\\marco\\Desktop\\Cine\\livre.png");
		lbfaixa = new JLabel();
		lbfaixa.setBounds(830, 500, 50, 50);
		lbfaixa.setOpaque(true);
		lbfaixa.setBackground(Color.black);
		lbfaixa.setVisible(false);
		add(lbfaixa);

		duracao3 = new JLabel();
		duracao3.setBounds(600, 440, 200, 200);
		duracao3.setBackground(Color.black);
		duracao3.setFont(cala);
		duracao3.setForeground(Color.WHITE);
		duracao3.setVisible(false);
		add(duracao3);

		sinopse3 = new JLabel();
		sinopse3.setBounds(600, 300, 300, 200);
		sinopse3.setBackground(Color.black);
		sinopse3.setFont(cala);
		sinopse3.setForeground(Color.WHITE);
		sinopse3.setVisible(false);
		add(sinopse3);

		voltar11 = new ImageIcon("C:\\Users\\marco\\Desktop\\Cine\\voltar.png");
		voltar = new JButton(voltar11);
		voltar.setBounds(15, 15, 50, 50);
		voltar.setBackground(new Color(47,79,79));
		voltar.setBorder(null);
		voltar.setVisible(false);
		add(voltar);

		voltar1 = new JButton(voltar11);
		voltar1.setBounds(15, 15, 50, 50);
		voltar1.setBackground(new Color(25, 25, 112));
		voltar1.setBorder(null);
		voltar1.setVisible(false);
		add(voltar1);

		imglogo1 = new ImageIcon("C:\\Users\\marco\\Desktop\\Cine\\logocara.png");
		logo1 = new JLabel(imglogo1);
		logo1.setBounds(360, 100, 300, 300);
		add(logo1);

		Font o = new Font("Caladea", Font.BOLD, 28);
		cadeiras4 = new JLabel("   Escolha o seu Lugar");
		cadeiras4.setBounds(346, 30, 320, 80);
		cadeiras4.setFont(o);
		cadeiras4.setOpaque(true);
		cadeiras4.setBackground(new Color(178, 34, 34));
		cadeiras4.setForeground(Color.white);
		cadeiras4.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		add(cadeiras4);

		// PAGINA 4

		voltar4 = new JButton(voltar11);
		voltar4.setBounds(15, 15, 50, 50);
		voltar4.setBackground(Color.black);
		voltar4.setBorder(null);
		voltar4.setVisible(false);
		add(voltar4);
		cadeiraverm = new ImageIcon("C:\\Users\\marco\\Desktop\\Cine\\cadeiraverme.png");
		cadeiraazul = new ImageIcon("C:\\Users\\marco\\Desktop\\Cine\\cadeiraazul.png");
		deficienteverm = new ImageIcon("C:\\Users\\marco\\Desktop\\Cine\\cadeirarodasverme.png");
		deficienteverde = new ImageIcon("C:\\Users\\marco\\Desktop\\Cine\\cadeirarodasverde.png");
		cadeiraverde = new ImageIcon("C:\\Users\\marco\\Desktop\\Cine\\cadeiraverde.png");
		deficienteazul = new ImageIcon("C:\\Users\\marco\\Desktop\\Cine\\cadeirarodasazul.png");

		legenda = new JPanel();
		legenda.setLayout(null);
		legenda.setOpaque(true);
		legenda.setBackground(Color.black);
		legenda.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		legenda.setBounds(230, 500, 550, 80);
		legenda.setVisible(false);
		add(legenda);

		livre4 = new JLabel("LIVRE");
		livre4.setForeground(Color.white);
		livre4.setBounds(100, 20, 80, 50);
		legenda.add(livre4);
		cadverde = new JLabel(cadeiraverde);
		cadverde.setBounds(20, 17, 100, 50);
		legenda.add(cadverde);

		ocupado4 = new JLabel("OCUPADO");
		ocupado4.setForeground(Color.white);
		ocupado4.setBounds(250, 20, 80, 50);
		legenda.add(ocupado4);
		cadverm = new JLabel(cadeiraverm);
		cadverm.setBounds(170, 17, 100, 50);
		legenda.add(cadverm);

		selecionado4 = new JLabel("SELECIONADO");
		selecionado4.setForeground(Color.white);
		selecionado4.setBounds(430, 20, 100, 50);
		legenda.add(selecionado4);
		cadazul = new JLabel(cadeiraazul);
		cadazul.setBounds(350, 17, 100, 50);
		legenda.add(cadazul);

		ingressos4 = new JButton("Prosseguir");
		ingressos4.setBounds(890, 600, 80, 50);
		ingressos4.setBackground(new Color(178, 34, 34));
		ingressos4.setForeground(Color.white);
		ingressos4.setBorder(null);
		ingressos4.setFont(cala);
		ingressos4.setCursor(new Cursor(Cursor.HAND_CURSOR));
		ingressos4.setVisible(false);
		add(ingressos4);

		A1 = new JButton(deficienteverm);
		A1.setBounds(50, 200, 45, 45);
		A1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		A1.setBackground(Color.white);
		A1.setBorder(null);
		add(A1);

		A2 = new JButton(deficienteverde);
		A2.setBounds(120, 200, 45, 45);
		A2.setCursor(new Cursor(Cursor.HAND_CURSOR));
		A2.setBackground(Color.white);
		A2.setBorder(null);
		add(A2);

		A3 = new JButton(cadeiraverde);
		A3.setBounds(310, 200, 45, 45);
		A3.setCursor(new Cursor(Cursor.HAND_CURSOR));
		A3.setBackground(Color.white);
		A3.setBorder(null);
		add(A3);

		A4 = new JButton(cadeiraverde);
		A4.setBounds(380, 200, 45, 45);
		A4.setCursor(new Cursor(Cursor.HAND_CURSOR));
		A4.setBackground(Color.white);
		A4.setBorder(null);
		add(A4);

		A5 = new JButton(cadeiraverde);
		A5.setBounds(450, 200, 45, 45);
		A5.setCursor(new Cursor(Cursor.HAND_CURSOR));
		A5.setBackground(Color.white);
		A5.setBorder(null);
		add(A5);

		A6 = new JButton(cadeiraverm);
		A6.setBounds(520, 200, 45, 45);
		A6.setCursor(new Cursor(Cursor.HAND_CURSOR));
		A6.setBackground(Color.white);
		A6.setBorder(null);
		add(A6);

		A7 = new JButton(cadeiraverde);
		A7.setBounds(590, 200, 45, 45);
		A7.setCursor(new Cursor(Cursor.HAND_CURSOR));
		A7.setBackground(Color.white);
		A7.setBorder(null);
		add(A7);

		A8 = new JButton(cadeiraverde);
		A8.setBounds(660, 200, 45, 45);
		A8.setCursor(new Cursor(Cursor.HAND_CURSOR));
		A8.setBackground(Color.white);
		A8.setBorder(null);
		add(A8);

		A9 = new JButton(deficienteverde);
		A9.setBounds(830, 200, 45, 45);
		A9.setCursor(new Cursor(Cursor.HAND_CURSOR));
		A9.setBackground(Color.white);
		A9.setBorder(null);
		add(A9);

		A10 = new JButton(deficienteverm);
		A10.setBounds(900, 200, 45, 45);
		A10.setCursor(new Cursor(Cursor.HAND_CURSOR));
		A10.setBackground(Color.white);
		A10.setBorder(null);
		add(A10);

		B1 = new JButton(cadeiraverde);
		B1.setBounds(50, 300, 45, 45);
		B1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		B1.setBackground(Color.white);
		B1.setBorder(null);
		add(B1);

		B2 = new JButton(cadeiraverde);
		B2.setBounds(120, 300, 45, 45);
		B2.setCursor(new Cursor(Cursor.HAND_CURSOR));
		B2.setBackground(Color.white);
		B2.setBorder(null);
		add(B2);

		B3 = new JButton(cadeiraverde);
		B3.setBounds(310, 300, 45, 45);
		B3.setCursor(new Cursor(Cursor.HAND_CURSOR));
		B3.setBackground(Color.white);
		B3.setBorder(null);
		add(B3);

		B4 = new JButton(cadeiraverde);
		B4.setBounds(380, 300, 45, 45);
		B4.setCursor(new Cursor(Cursor.HAND_CURSOR));
		B4.setBackground(Color.white);
		B4.setBorder(null);
		add(B4);

		B5 = new JButton(cadeiraverde);
		B5.setBounds(450, 300, 45, 45);
		B5.setCursor(new Cursor(Cursor.HAND_CURSOR));
		B5.setBackground(Color.white);
		B5.setBorder(null);
		add(B5);

		B6 = new JButton(cadeiraverde);
		B6.setBounds(520, 300, 45, 45);
		B6.setCursor(new Cursor(Cursor.HAND_CURSOR));
		B6.setBackground(Color.white);
		B6.setBorder(null);
		add(B6);

		B7 = new JButton(cadeiraverde);
		B7.setBounds(590, 300, 45, 45);
		B7.setCursor(new Cursor(Cursor.HAND_CURSOR));
		B7.setBackground(Color.white);
		B7.setBorder(null);
		add(B7);

		B8 = new JButton(cadeiraverde);
		B8.setBounds(660, 300, 45, 45);
		B8.setCursor(new Cursor(Cursor.HAND_CURSOR));
		B8.setBackground(Color.white);
		B8.setBorder(null);
		add(B8);

		B9 = new JButton(cadeiraverde);
		B9.setBounds(830, 300, 45, 45);
		B9.setCursor(new Cursor(Cursor.HAND_CURSOR));
		B9.setBackground(Color.white);
		B9.setBorder(null);
		add(B9);

		B10 = new JButton(cadeiraverde);
		B10.setBounds(900, 300, 45, 45);
		B10.setCursor(new Cursor(Cursor.HAND_CURSOR));
		B10.setBackground(Color.white);
		B10.setBorder(null);
		add(B10);

		C1 = new JButton(cadeiraverde);
		C1.setBounds(50, 400, 45, 45);
		C1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		C1.setBackground(Color.white);
		C1.setBorder(null);
		add(C1);

		C2 = new JButton(cadeiraverde);
		C2.setBounds(120, 400, 45, 45);
		C2.setCursor(new Cursor(Cursor.HAND_CURSOR));
		C2.setBackground(Color.white);
		C2.setBorder(null);
		add(C2);

		C3 = new JButton(cadeiraverde);
		C3.setBounds(310, 400, 45, 45);
		C3.setCursor(new Cursor(Cursor.HAND_CURSOR));
		C3.setBackground(Color.white);
		C3.setBorder(null);
		add(C3);

		C4 = new JButton(cadeiraverde);
		C4.setBounds(380, 400, 45, 45);
		C4.setCursor(new Cursor(Cursor.HAND_CURSOR));
		C4.setBackground(Color.white);
		C4.setBorder(null);
		add(C4);

		C5 = new JButton(cadeiraverde);
		C5.setBounds(450, 400, 45, 45);
		C5.setCursor(new Cursor(Cursor.HAND_CURSOR));
		C5.setBackground(Color.white);
		C5.setBorder(null);
		add(C5);

		C6 = new JButton(cadeiraverde);
		C6.setBounds(520, 400, 45, 45);
		C6.setCursor(new Cursor(Cursor.HAND_CURSOR));
		C6.setBackground(Color.white);
		C6.setBorder(null);
		add(C6);

		C7 = new JButton(cadeiraverde);
		C7.setBounds(590, 400, 45, 45);
		C7.setCursor(new Cursor(Cursor.HAND_CURSOR));
		C7.setBackground(Color.white);
		C7.setBorder(null);
		add(C7);

		C8 = new JButton(cadeiraverde);
		C8.setBounds(660, 400, 45, 45);
		C8.setCursor(new Cursor(Cursor.HAND_CURSOR));
		C8.setBackground(Color.white);
		C8.setBorder(null);
		add(C8);

		C9 = new JButton(cadeiraverde);
		C9.setBounds(830, 400, 45, 45);
		C9.setCursor(new Cursor(Cursor.HAND_CURSOR));
		C9.setBackground(Color.white);
		C9.setBorder(null);
		add(C9);

		C10 = new JButton(cadeiraverde);
		C10.setBounds(900, 400, 45, 45);
		C10.setCursor(new Cursor(Cursor.HAND_CURSOR));
		C10.setBackground(Color.white);
		C10.setBorder(null);
		add(C10);

		cadeiras4.setVisible(false);
		A1.setVisible(false);
		A2.setVisible(false);
		A3.setVisible(false);
		A4.setVisible(false);
		A5.setVisible(false);
		A6.setVisible(false);
		A7.setVisible(false);
		A8.setVisible(false);
		A9.setVisible(false);
		A10.setVisible(false);
		B1.setVisible(false);
		B2.setVisible(false);
		B3.setVisible(false);
		B4.setVisible(false);
		B5.setVisible(false);
		B6.setVisible(false);
		B7.setVisible(false);
		B8.setVisible(false);
		B9.setVisible(false);
		B10.setVisible(false);
		C1.setVisible(false);
		C2.setVisible(false);
		C3.setVisible(false);
		C4.setVisible(false);
		C5.setVisible(false);
		C6.setVisible(false);
		C7.setVisible(false);
		C8.setVisible(false);
		C9.setVisible(false);
		C10.setVisible(false);

		// PAGINA 5

		maizao = new ImageIcon("C:\\Users\\marco\\Desktop\\Cine\\mais.png");

		menozao = new ImageIcon("C:\\Users\\marco\\Desktop\\Cine\\menos.png");

		mais = new JButton(maizao);
		mais.setBounds(550, 293, 35, 35);
		mais.setBorder(null);
		mais.setBackground(new Color(178, 34, 34));
		mais.setVisible(false);
		add(mais);

		lbinteira5 = new JLabel("INTEIRA");
		lbinteira5.setOpaque(true);
		lbinteira5.setBackground(new Color(178, 34, 34));
		lbinteira5.setFont(cala5);
		lbinteira5.setForeground(Color.WHITE);
		lbinteira5.setBounds(465, 250, 80, 20);
		lbinteira5.setVisible(false);
		add(lbinteira5);

		lbmeia5 = new JLabel("MEIA");
		lbmeia5.setOpaque(true);
		lbmeia5.setBackground(new Color(178, 34, 34));
		lbmeia5.setFont(cala5);
		lbmeia5.setForeground(Color.WHITE);
		lbmeia5.setBounds(475, 350, 80, 20);
		lbmeia5.setVisible(false);
		add(lbmeia5);

		menos = new JButton(menozao);
		menos.setBounds(420, 293, 35, 35);
		menos.setBorder(null);
		menos.setBackground(new Color(178, 34, 34));
		menos.setVisible(false);
		add(menos);

		maiss = new JButton(maizao);
		maiss.setBounds(550, 393, 35, 35);
		maiss.setBorder(null);
		maiss.setBackground(new Color(178, 34, 34));
		maiss.setVisible(false);
		add(maiss);

		menoss = new JButton(menozao);
		menoss.setBounds(420, 393, 35, 35);

		menoss.setBorder(null);
		menoss.setBackground(new Color(178, 34, 34));
		menoss.setVisible(false);
		add(menoss);

		inteira = new JTextField("0");
		inteira.setBackground(new Color(178, 34, 34));
		inteira.setFont(h);
		inteira.setForeground(Color.WHITE);
		inteira.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		inteira.setBounds(460, 300, 80, 20);
		inteira.setVisible(false);
		add(inteira);

		meia = new JTextField("0");
		meia.setBackground(new Color(178, 34, 34));
		meia.setForeground(Color.WHITE);
		meia.setFont(h);
		meia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		meia.setBounds(460, 400, 80, 20);
		meia.setVisible(false);
		add(meia);

		lancho5 = new JButton("LANCHONETE");
		lancho5.setBounds(650, 600, 150, 50);
		lancho5.setBackground(new Color(178, 34, 34));
		lancho5.setFont(cala5);
		lancho5.setForeground(Color.white);
		lancho5.setBorder(null);
		lancho5.setVisible(false);
		add(lancho5);
		
		// PAGINA 6
		voltar5 = new JButton(voltar11);
		voltar5.setBounds(15, 15, 50, 50);
		voltar5.setBackground(Color.black);
		voltar5.setBorder(null);
		voltar5.setVisible(false);
		add(voltar5);

		finalizar = new JButton("FINALIZAR");
		finalizar.setBounds(800, 600, 150, 50);
		finalizar.setBackground(new Color(178, 34, 34));
		finalizar.setFont(cala5);
		finalizar.setForeground(Color.white);
		finalizar.setBorder(null);
		add(finalizar);

		Font P = new Font("Caladea", Font.BOLD, 30);
		lanchonete = new JLabel("    Lanchonete");
		lanchonete.setBounds(346, 25, 240, 80);
		lanchonete.setFont(P);
		lanchonete.setOpaque(true);
		lanchonete.setBackground(new Color(178, 34, 34));
		lanchonete.setForeground(Color.white);
		lanchonete.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		add(lanchonete);

		Font a = new Font("Caladea", Font.BOLD, 25);
		pipoca = new JLabel("Pipoca");
		pipoca.setBounds(60, 200, 100, 100);
		pipoca.setForeground(Color.white);
		pipoca.setFont(a);
		add(pipoca);

		bebida = new JLabel("Bebida");
		bebida.setBounds(60, 300, 100, 100);
		bebida.setForeground(Color.white);
		bebida.setFont(a);
		add(bebida);

		doces = new JLabel("Doces");
		doces.setBounds(60, 400, 100, 100);
		doces.setForeground(Color.white);
		doces.setFont(a);
		add(doces);

		doces2 = new JLabel("Doces");
		doces2.setBounds(60, 500, 100, 100);
		doces2.setForeground(Color.white);
		doces2.setFont(a);
		add(doces2);

		// LISTAS COMBOBOX
		String[] sabor = { "Sabores ", "Amanteigada", "Sem manteiga", "Caramelizada", "C/Chocolate" };
		String[] tamanho = { "Nenhum (R$ 0)", "Pequena (R$ 10)", "Média (R$ 15)", "Grande (R$ 20)", "Mega (R$ 30)" };
		String[] bebidas = { "Nenhum (R$ 0)", "Coca-Cola (R$ 10)", "Pepsi (R$ 10)", "Guaraná (R$ 10)", "Soda (R$ 10)", "Fanta Laranja (R$ 10)", "Fanta Uva (R$ 10)", "Energético (R$ 15)","Chá Gelado (R$ 8)" };
		String[] docesa = { "Nenhum (R$ 0)", "Balas Fini (R$ 7)", "Chocolate (R$ 10)", "Twix (R$ 5)", "M&M'S (R$ 6)", "Churros (R$ 6)", "Snickers (R$ 5)" };
		String[] docesa2 = { "Nenhum (R$ 0)", "Balas Fini (R$ 7)", "Chocolate (R$ 10)", "Twix (R$ 5)", "M&M'S (R$ 6)", "Churros (R$ 6)", "Snickers (R$ 5)" };

		cbsabor = new JComboBox(sabor);
		cbsabor.setBackground(new Color(178, 34, 34));
		cbsabor.setForeground(Color.white);
		cbsabor.setBounds(380, 235, 150, 35);
		add(cbsabor);

		cbtamanho = new JComboBox(tamanho);
		cbtamanho.setBounds(180, 235, 150, 35);
		cbtamanho.setBackground(new Color(178, 34, 34));
		cbtamanho.setForeground(Color.white);
		add(cbtamanho);

		cbbebida = new JComboBox(bebidas);
		cbbebida.setBounds(180, 335, 150, 35);
		cbbebida.setBackground(new Color(178, 34, 34));
		cbbebida.setForeground(Color.white);
		add(cbbebida);

		cbdoces = new JComboBox(docesa);
		cbdoces.setBounds(180, 435, 150, 35);
		cbdoces.setBackground(new Color(178, 34, 34));
		cbdoces.setForeground(Color.white);
		add(cbdoces);

		cbdoces2 = new JComboBox(docesa2);
		cbdoces2.setBounds(180, 535, 150, 35);
		cbdoces2.setBackground(new Color(178, 34, 34));
		cbdoces2.setForeground(Color.white);
		add(cbdoces2);

		// PAGINA 7

		Font z = new Font("Caladea", Font.BOLD, 30);
		compraf = new JLabel("Compra realizada com sucesso");
		compraf.setBounds(300, 300, 600, 100);
		compraf.setForeground(Color.white);
		compraf.setFont(z);
		add(compraf);

		pedido = new JLabel("Nº DO PEDIDO :");
		pedido.setBounds(300, 200, 300, 100);
		pedido.setForeground(Color.white);
		pedido.setFont(z);
		add(pedido);
		
		aleatorio = new JLabel();
		aleatorio.setBounds(550, 200, 300, 100);
		aleatorio.setForeground(Color.white);
		aleatorio.setFont(z);
		add(aleatorio);
		
		imprimir = new JButton("Imprimir");
		imprimir.setBounds(350, 500, 100, 30);
		imprimir.setBackground(new Color(178, 34, 34));
		imprimir.setForeground(Color.white);
		add(imprimir);

		sair = new JButton("Sair");
		sair.setBounds(530, 500, 100, 30);
		sair.setBackground(new Color(178, 34, 34));
		sair.setForeground(Color.white);
		add(sair);
		
		
		fundao = new ImageIcon("C:\\Users\\marco\\Desktop\\Cine\\cine.jpg");
		fundo2 = new JLabel(fundao);
		fundo2.setBounds(0, 0, 1000, 1000);
		fundo2.setOpaque(true);
		add(fundo2);
		
		pipoca.setVisible(false);
		bebida.setVisible(false);
		lanchonete.setVisible(false);
		doces.setVisible(false);
		doces2.setVisible(false);
		cbbebida.setVisible(false);
		cbdoces.setVisible(false);
		cbdoces2.setVisible(false);
		cbtamanho.setVisible(false);
		cbsabor.setVisible(false);
		fundo2.setVisible(false);
		finalizar.setVisible(false);
		// PAGINA 8
		compraf.setVisible(false);
		pedido.setVisible(false);
		imprimir.setVisible(false);
		sair.setVisible(false);

		cinema = new CineMetodos();
		if (!cinema.bd.getConnection()) {
			JOptionPane.showMessageDialog(null, "Falha na conexão!");
			System.exit(0);
		}
		cines = new ImageIcon("C:\\Users\\marco\\Desktop\\Cine\\cines2.jpg");
		fundo = new JLabel();
		fundo.setBounds(0, 0, 1000, 700);
		fundo.setIcon(cines);
		fundo.setOpaque(true);
		fundo.setBackground(new Color(178, 34, 34));
		add(fundo);
	}

	public void definirEventos() {

		// PAGINA 1
		btingresso1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				btingresso1.setVisible(false);
				btpipoca1.setVisible(false);
				f1.setVisible(true);
				f2.setVisible(true);
				f3.setVisible(true);
				f4.setVisible(true);
				f5.setVisible(true);
				f6.setVisible(true);
				fundo.setIcon(null);
				fundo.setBackground(new Color(47,79,79));
				logo1.setVisible(false);
				voltar.setVisible(true);

			}
		});

		btpipoca1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btingresso1.setVisible(false);
				btpipoca1.setVisible(false);
				fundo.setVisible(false);
				logo1.setVisible(false);
				pipoca.setVisible(true);
				bebida.setVisible(true);
				lanchonete.setVisible(true);
				doces.setVisible(true);
				doces2.setVisible(true);
				cbbebida.setVisible(true);
				cbdoces.setVisible(true);
				cbdoces2.setVisible(true);
				cbtamanho.setVisible(true);
				cbsabor.setVisible(true);
				fundo2.setVisible(true);
				finalizar.setVisible(true);
				voltar5.setVisible(true);
				fundo.setIcon(null);
				fundo.setBackground(new Color(178, 34, 34));
				cinema.cinezao.setNomeFilme("Lanchonete");
				cinema.cinezao.setHorarioSala(" ");
				cinema.cinezao.setCadeiras(" ");
				cinema.cinezao.setEntrada(" ");
				
			}
		});

		voltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btingresso1.setVisible(true);
				btpipoca1.setVisible(true);
				f1.setVisible(false);
				f2.setVisible(false);
				f3.setVisible(false);
				f4.setVisible(false);
				f5.setVisible(false);
				f6.setVisible(false);
				fundo.setIcon(cines);
				fundo.setBackground(new Color(178, 34, 34));
				logo1.setVisible(true);
				voltar.setVisible(false);
				voltar1.setVisible(false);

			}

		});
		voltar1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f1.setVisible(true);
				f2.setVisible(true);
				f3.setVisible(true);
				f4.setVisible(true);
				f5.setVisible(true);
				f6.setVisible(true);
				h1.setVisible(false);
				lbfaixa.setVisible(false);
				h2.setVisible(false);
				h3.setVisible(false);
				h4.setVisible(false);
				h5.setVisible(false);
				h6.setVisible(false);
				banner.setVisible(false);
				preco3.setVisible(false);
				duracao3.setVisible(false);
				sinopse3.setVisible(false);
				fundo.setBackground(new Color(47,79,79));
				voltar.setVisible(true);

			}

		});

		// PAGINA 2
		f1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				f1.setVisible(false);
				f2.setVisible(false);
				f3.setVisible(false);
				f4.setVisible(false);
				f5.setVisible(false);
				f6.setVisible(false);
				h1.setVisible(true);
				h2.setVisible(true);
				h3.setVisible(true);
				h4.setVisible(true);
				h5.setVisible(true);
				h6.setVisible(true);
				banner.setVisible(true);
				preco3.setVisible(true);
				duracao3.setVisible(true);
				sinopse3.setVisible(true);
				voltar.setVisible(false);
				voltar1.setVisible(true);
				lbfaixa.setVisible(true);
				lbfaixa.setIcon(faixa14);
				fundo.setBackground(new Color(25,25,112));

				duracao3.setText("Duração : 3 horas 2 minutos");
				preco3.setText("Preço:20 reais");
				sinopse3.setText(
						"<html>SINOPSE<br>Após Thanos eliminar metade das criaturas vivas, os Vingadores têm de lidar com a perda de amigos e entes queridos. Com Tony Stark vagando perdido no espaço sem água e comida, Steve Rogers e Natasha Romanov lideram a resistência contra o titã louco.");
				banner.setIcon(img1);
				h1.setText("<html>16:45<br><br> SALA 1 <br>3D");
				h2.setText("<html>18:30<br><br> SALA 3");
				h3.setText("<html>20:00<br><br> SALA 3");
				h4.setText("<html>21:15<br><br> SALA 3");
				h5.setText("<html>22:00<br><br> SALA 1 <br>3D");
				h6.setText("<html>23:15<br><br> SALA 1 <br>3D");

				cinema.cinezao.setNomeFilme("Vingadores-Ultimato");
				cinema.cinezao.setPreco(Double.parseDouble(preco3.getText().replace("Preço:","").replace(" reais","")));

			}

		});
		f2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				f1.setVisible(false);
				f2.setVisible(false);
				f3.setVisible(false);
				f4.setVisible(false);
				f5.setVisible(false);
				f6.setVisible(false);
				h1.setVisible(true);
				h2.setVisible(true);
				h3.setVisible(true);
				h4.setVisible(true);
				h5.setVisible(true);
				h6.setVisible(true);
				banner.setVisible(true);
				preco3.setVisible(true);
				duracao3.setVisible(true);
				sinopse3.setVisible(true);
				voltar.setVisible(false);
				voltar1.setVisible(true);
				lbfaixa.setVisible(true);
				lbfaixa.setIcon(faixa12);
				fundo.setBackground(new Color(25,25,112));

				duracao3.setText("Duração : 2 horas 15 minutos");
				preco3.setText("Preço:22 reais");
				sinopse3.setText(
						"<html>SINOPSE<br>Peter Parker está em uma viagem de duas semanas pela Europa, ao lado de seus amigos de colégio, quando é surpreendido pela visita de Nick Fury. Convocado para mais uma missão heróica, ele precisa enfrentar vários vilões que surgem em cidades-símbolo do continente, como Londres, Paris e Veneza, e também a aparição do enigmático Mysterio.");
				banner.setIcon(img2);
				h1.setText("<html>12:30<br><br> SALA 2 <br>3D");
				h2.setText("<html>14:45<br><br> SALA 4");
				h3.setText("<html>17:15<br><br> SALA 4");
				h4.setText("<html>20:00<br><br> SALA 2 <br>3D");
				h5.setText("<html>23:45<br><br> SALA 4");
				h6.setText("<html>21:00<br><br> SALA 2 <br>3D");

				cinema.cinezao.setNomeFilme("Homem Aranha-Longe de Casa");
				cinema.cinezao.setPreco(Double.parseDouble(preco3.getText().replace("Preço:","").replace(" reais","")));
			}

		});

		f3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				f1.setVisible(false);
				f2.setVisible(false);
				f3.setVisible(false);
				f4.setVisible(false);
				f5.setVisible(false);
				f6.setVisible(false);
				h1.setVisible(true);
				h2.setVisible(true);
				h3.setVisible(true);
				h4.setVisible(true);
				h5.setVisible(true);
				h6.setVisible(true);
				banner.setVisible(true);
				preco3.setVisible(true);
				duracao3.setVisible(true);
				sinopse3.setVisible(true);
				voltar.setVisible(false);
				voltar1.setVisible(true);
				lbfaixa.setVisible(true);
				lbfaixa.setIcon(faixalivre);
				fundo.setBackground(new Color(25,25,112));

				duracao3.setText("Duração : 2 horas 15 minutos");
				preco3.setText("Preço:18 reais");
				sinopse3.setText(
						"<html>SINOPSE<br>O Rei Leão é um futuro filme épico musical de drama estadunidense de 2019, dirigido e co-produzido por Jon Favreau e escrito por Jeff Nathanson, sendo o remake do longa-metragem animado O Rei Leão, de 1994, inspirado em partes da obra Hamlet, de William Shakespeare.");
				banner.setIcon(img3);
				h1.setText("<html>13:30<br><br> SALA 1");
				h2.setText("<html>13:45<br><br> SALA 3 <br>3D");
				h3.setText("<html>16:00<br><br> SALA 1");
				h4.setText("<html>18:45<br><br> SALA 1");
				h5.setText("<html>16:30<br><br> SALA 3 <br>3D");
				h6.setText("<html>21:45<br><br> SALA 3 <br>3D");

				cinema.cinezao.setNomeFilme("Rei Leao");
				cinema.cinezao.setPreco(Double.parseDouble(preco3.getText().replace("Preço:","").replace(" reais","")));
			}

		});

		f4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				f1.setVisible(false);
				f2.setVisible(false);
				f3.setVisible(false);
				f4.setVisible(false);
				f5.setVisible(false);
				f6.setVisible(false);
				h1.setVisible(true);
				h2.setVisible(true);
				h3.setVisible(true);
				h4.setVisible(true);
				h5.setVisible(true);
				h6.setVisible(true);
				banner.setVisible(true);
				preco3.setVisible(true);
				duracao3.setVisible(true);
				sinopse3.setVisible(true);
				voltar.setVisible(false);
				voltar1.setVisible(true);
				lbfaixa.setVisible(true);
				lbfaixa.setIcon(faixa10);
				fundo.setBackground(new Color(25,25,112));

				duracao3.setText("Duração : 2 horas 8 minutos");
				preco3.setText("Preço:20 reais");
				sinopse3.setText(
						"<html>SINOPSE<br>Um jovem humilde descobre uma lâmpada mágica, com um gênio que pode lhe conceder desejos. Agora o rapaz quer conquistar a moça por quem se apaixonou, mas o que ele não sabe é que a jovem é uma princesa que está prestes a se noivar. Agora, com a ajuda do gênio, ele tenta se passar por um príncipe para conquistar o amor da moça e a confiança de seu pai.");
				banner.setIcon(img4);
				h1.setText("<html>10:15<br> SALA 2 <br>3D");
				h2.setText("<html>14:30<br> SALA 2 <br>3D");
				h3.setText("<html>17:45<br> SALA 2 <br>3D");
				h4.setText("<html>12:00<br> SALA 4");
				h5.setText("<html>19:30<br> SALA 4");
				h6.setText("<html>21:45<br> SALA 4");

				cinema.cinezao.setNomeFilme("Aladdin");
				cinema.cinezao.setPreco(Double.parseDouble(preco3.getText().replace("Preço:","").replace(" reais","")));
			}

		});

		f5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				f1.setVisible(false);
				f2.setVisible(false);
				f3.setVisible(false);
				f4.setVisible(false);
				f5.setVisible(false);
				f6.setVisible(false);
				h1.setVisible(true);
				h2.setVisible(true);
				h3.setVisible(true);
				h4.setVisible(true);
				h5.setVisible(true);
				h6.setVisible(true);
				banner.setVisible(true);
				preco3.setVisible(true);
				duracao3.setVisible(true);
				sinopse3.setVisible(true);
				voltar.setVisible(false);
				voltar1.setVisible(true);
				lbfaixa.setVisible(true);
				lbfaixa.setIcon(faixa14);
				fundo.setBackground(new Color(25,25,112));

				duracao3.setText("Duração : 2 horas 5 minutos");
				preco3.setText("Preço:26 reais");
				sinopse3.setText(
						"<html>SINOPSE<br>A Capitã Marvel se envolve em uma guerra galáctica entre duas raças alienígenas.");
				banner.setIcon(img5);
				h1.setText("<html>12:30<br><br> SALA 5 <br>3D");
				h2.setText("<html>12:00<br><br> SALA 6");
				h3.setText("<html>15:00<br><br> SALA 5 <br>3D");
				h4.setText("<html>14:45<br><br> SALA 6");
				h5.setText("<html>17:45<br><br> SALA 5 <br>3D");
				h6.setText("<html>18:45<br><br> SALA 6");

				cinema.cinezao.setNomeFilme("Capita Marvel");
				cinema.cinezao.setPreco(Double.parseDouble(preco3.getText().replace("Preço:","").replace(" reais","")));
			}

		});

		f6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				f1.setVisible(false);
				f2.setVisible(false);
				f3.setVisible(false);
				f4.setVisible(false);
				f5.setVisible(false);
				f6.setVisible(false);
				h1.setVisible(true);
				h2.setVisible(true);
				h3.setVisible(true);
				h4.setVisible(true);
				h5.setVisible(true);
				h6.setVisible(true);
				banner.setVisible(true);
				preco3.setVisible(true);
				duracao3.setVisible(true);
				sinopse3.setVisible(true);
				voltar.setVisible(false);
				voltar1.setVisible(true);
				lbfaixa.setVisible(true);
				lbfaixa.setIcon(faixalivre);
				fundo.setBackground(new Color(25,25,112));

				duracao3.setText("Duração : 1 horas 39 minutos");
				preco3.setText("Preço:21 reais");
				sinopse3.setText(
						"<html>SINOPSE<br>Toy Story 4 será um futuro filme de animação estadunidense de 2019, produzido pelos estúdios Walt Disney Pictures e Pixar do gênero de aventura e comédia romântica em 3D, sendo o quarto filme da franquia Toy Story.");
				banner.setIcon(img6);
				h1.setText("<html>15:45<br> SALA 6");
				h2.setText("<html>19:00<br> SALA 6");
				h3.setText("<html>21:00<br> SALA 5 <br>3D");
				h4.setText("<html>22:00<br> SALA 5 <br>3D");
				h5.setText("<html>23:45<br> SALA 6");
				h6.setText("<html>00:00<br> SALA 5 <br>3D");

				cinema.cinezao.setNomeFilme("Toy Story 4");
				cinema.cinezao.setPreco(Double.parseDouble(preco3.getText().replace("Preço:","").replace(" reais","")));
			}

		});
		// PAGINA 3
		h1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				A1.setVisible(true);
				A2.setVisible(true);
				A3.setVisible(true);
				A4.setVisible(true);
				A5.setVisible(true);
				A6.setVisible(true);
				A7.setVisible(true);
				A8.setVisible(true);
				A9.setVisible(true);
				A10.setVisible(true);
				B1.setVisible(true);
				B2.setVisible(true);
				B3.setVisible(true);
				B4.setVisible(true);
				B5.setVisible(true);
				B6.setVisible(true);
				B7.setVisible(true);
				B8.setVisible(true);
				B9.setVisible(true);
				B10.setVisible(true);
				C1.setVisible(true);
				C2.setVisible(true);
				C3.setVisible(true);
				C4.setVisible(true);
				C5.setVisible(true);
				C6.setVisible(true);
				C7.setVisible(true);
				C8.setVisible(true);
				C9.setVisible(true);
				C10.setVisible(true);
				cadeiras4.setVisible(true);
				voltar4.setVisible(true);
				legenda.setVisible(true);
				ingressos4.setVisible(true);
				h1.setVisible(false);
				h2.setVisible(false);
				h3.setVisible(false);
				h4.setVisible(false);
				h5.setVisible(false);
				h6.setVisible(false);
				banner.setVisible(false);
				preco3.setVisible(false);
				lbfaixa.setVisible(false);
				duracao3.setVisible(false);
				sinopse3.setVisible(false);
				voltar1.setVisible(false);
				fundo.setBackground(Color.black);

				cinema.cinezao.setHorarioSala(h1.getText().replace("<html>", "").replace("<br>", ""));
				cinema.setarcadeiras();
				// FILEIRA 1
				if (cinema.cinezao.getA1().equals("1")) {
					A1.setIcon(deficienteverde);
				} else {
					A1.setIcon(deficienteverm);
				}

				if (cinema.cinezao.getA2().equals("1")) {
					A2.setIcon(deficienteverde);
				} else {
					A2.setIcon(deficienteverm);
				}
				if (cinema.cinezao.getA3().equals("1")) {
					A3.setIcon(cadeiraverde);
				} else {
					A3.setIcon(cadeiraverm);
				}

				if (cinema.cinezao.getA4().equals("1")) {
					A4.setIcon(cadeiraverde);
				} else {
					A4.setIcon(cadeiraverm);
				}
				if (cinema.cinezao.getA5().equals("1")) {
					A5.setIcon(cadeiraverde);
				} else {
					A5.setIcon(cadeiraverm);
				}

				if (cinema.cinezao.getA6().equals("1")) {
					A6.setIcon(cadeiraverde);
				} else {
					A6.setIcon(cadeiraverm);
				}
				if (cinema.cinezao.getA7().equals("1")) {
					A7.setIcon(cadeiraverde);
				} else {
					A7.setIcon(cadeiraverm);
				}

				if (cinema.cinezao.getA8().equals("1")) {
					A8.setIcon(cadeiraverde);
				} else {
					A8.setIcon(cadeiraverm);
				}
				if (cinema.cinezao.getA9().equals("1")) {
					A9.setIcon(deficienteverde);
				} else {
					A9.setIcon(deficienteverm);
				}

				if (cinema.cinezao.getA10().equals("1")) {
					A10.setIcon(deficienteverde);
				} else {
					A10.setIcon(deficienteverm);
				}

				// FILEIRA 2
				if (cinema.cinezao.getB1().equals("1")) {
					B1.setIcon(deficienteverde);
				} else {
					B1.setIcon(deficienteverm);
				}
				if (cinema.cinezao.getB2().equals("1")) {
					B2.setIcon(deficienteverde);
				} else {
					B2.setIcon(deficienteverm);
				}
				if (cinema.cinezao.getB3().equals("1")) {
					B3.setIcon(cadeiraverde);
				} else {
					B3.setIcon(cadeiraverm);
				}
				if (cinema.cinezao.getB4().equals("1")) {
					B4.setIcon(cadeiraverde);
				} else {
					B4.setIcon(cadeiraverm);
				}
				if (cinema.cinezao.getB5().equals("1")) {
					B5.setIcon(cadeiraverde);
				} else {
					B5.setIcon(cadeiraverm);
				}
				if (cinema.cinezao.getB6().equals("1")) {
					B6.setIcon(cadeiraverde);
				} else {
					B6.setIcon(cadeiraverm);
				}
				if (cinema.cinezao.getB7().equals("1")) {
					B7.setIcon(cadeiraverde);
				} else {
					B7.setIcon(cadeiraverm);
				}
				if (cinema.cinezao.getB8().equals("1")) {
					B8.setIcon(cadeiraverde);
				} else {
					B8.setIcon(cadeiraverm);
				}
				if (cinema.cinezao.getB9().equals("1")) {
					B9.setIcon(deficienteverde);
				} else {
					B9.setIcon(deficienteverm);
				}
				if (cinema.cinezao.getB10().equals("1")) {
					B10.setIcon(deficienteverde);
				} else {
					B10.setIcon(deficienteverm);
				}

				// FILEIRA 3
				if (cinema.cinezao.getC1().equals("1")) {
					C1.setIcon(deficienteverde);
				} else {
					C1.setIcon(deficienteverm);
				}
				if (cinema.cinezao.getC2().equals("1")) {
					C2.setIcon(deficienteverde);
				} else {
					C2.setIcon(deficienteverm);
				}
				if (cinema.cinezao.getC3().equals("1")) {
					C3.setIcon(cadeiraverde);
				} else {
					C3.setIcon(cadeiraverm);
				}
				if (cinema.cinezao.getC4().equals("1")) {
					C4.setIcon(cadeiraverde);
				} else {
					C4.setIcon(cadeiraverm);
				}
				if (cinema.cinezao.getC5().equals("1")) {
					C5.setIcon(cadeiraverde);
				} else {
					C5.setIcon(cadeiraverm);
				}
				if (cinema.cinezao.getC6().equals("1")) {
					C6.setIcon(cadeiraverde);
				} else {
					C6.setIcon(cadeiraverm);
				}
				if (cinema.cinezao.getC7().equals("1")) {
					C7.setIcon(cadeiraverde);
				} else {
					C7.setIcon(cadeiraverm);
				}
				if (cinema.cinezao.getC8().equals("1")) {
					C8.setIcon(cadeiraverde);
				} else {
					C8.setIcon(cadeiraverm);
				}
				if (cinema.cinezao.getC9().equals("1")) {
					C9.setIcon(deficienteverde);
				} else {
					C9.setIcon(deficienteverm);
				}
				if (cinema.cinezao.getC10().equals("1")) {
					C10.setIcon(deficienteverde);
				} else {
					C10.setIcon(deficienteverm);
				}
			}

		});

		h2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				A1.setVisible(true);
				A2.setVisible(true);
				A3.setVisible(true);
				A4.setVisible(true);
				A5.setVisible(true);
				A6.setVisible(true);
				A7.setVisible(true);
				A8.setVisible(true);
				A9.setVisible(true);
				A10.setVisible(true);
				B1.setVisible(true);
				B2.setVisible(true);
				B3.setVisible(true);
				B4.setVisible(true);
				B5.setVisible(true);
				B6.setVisible(true);
				B7.setVisible(true);
				B8.setVisible(true);
				B9.setVisible(true);
				B10.setVisible(true);
				C1.setVisible(true);
				C2.setVisible(true);
				C3.setVisible(true);
				C4.setVisible(true);
				C5.setVisible(true);
				C6.setVisible(true);
				C7.setVisible(true);
				C8.setVisible(true);
				C9.setVisible(true);
				C10.setVisible(true);
				cadeiras4.setVisible(true);
				voltar4.setVisible(true);
				legenda.setVisible(true);
				ingressos4.setVisible(true);
				h1.setVisible(false);
				h2.setVisible(false);
				h3.setVisible(false);
				h4.setVisible(false);
				h5.setVisible(false);
				h6.setVisible(false);
				banner.setVisible(false);
				preco3.setVisible(false);
				duracao3.setVisible(false);
				sinopse3.setVisible(false);
				voltar1.setVisible(false);
				lbfaixa.setVisible(false);
				fundo.setBackground(Color.black);
				cinema.cinezao.setHorarioSala(h2.getText().replace("<html>", "").replace("<br>", ""));
				cinema.setarcadeiras();
				// FILEIRA 1
				if (cinema.cinezao.getA1().equals("1")) {
					A1.setIcon(deficienteverde);
				} else {
					A1.setIcon(deficienteverm);
				}

				if (cinema.cinezao.getA2().equals("1")) {
					A2.setIcon(deficienteverde);
				} else {
					A2.setIcon(deficienteverm);
				}
				if (cinema.cinezao.getA3().equals("1")) {
					A3.setIcon(cadeiraverde);
				} else {
					A3.setIcon(cadeiraverm);
				}

				if (cinema.cinezao.getA4().equals("1")) {
					A4.setIcon(cadeiraverde);
				} else {
					A4.setIcon(cadeiraverm);
				}
				if (cinema.cinezao.getA5().equals("1")) {
					A5.setIcon(cadeiraverde);
				} else {
					A5.setIcon(cadeiraverm);
				}

				if (cinema.cinezao.getA6().equals("1")) {
					A6.setIcon(cadeiraverde);
				} else {
					A6.setIcon(cadeiraverm);
				}
				if (cinema.cinezao.getA7().equals("1")) {
					A7.setIcon(cadeiraverde);
				} else {
					A7.setIcon(cadeiraverm);
				}

				if (cinema.cinezao.getA8().equals("1")) {
					A8.setIcon(cadeiraverde);
				} else {
					A8.setIcon(cadeiraverm);
				}
				if (cinema.cinezao.getA9().equals("1")) {
					A9.setIcon(deficienteverde);
				} else {
					A9.setIcon(deficienteverm);
				}

				if (cinema.cinezao.getA10().equals("1")) {
					A10.setIcon(deficienteverde);
				} else {
					A10.setIcon(deficienteverm);
				}

				// FILEIRA 2
				if (cinema.cinezao.getB1().equals("1")) {
					B1.setIcon(deficienteverde);
				} else {
					B1.setIcon(deficienteverm);
				}
				if (cinema.cinezao.getB2().equals("1")) {
					B2.setIcon(deficienteverde);
				} else {
					B2.setIcon(deficienteverm);
				}
				if (cinema.cinezao.getB3().equals("1")) {
					B3.setIcon(cadeiraverde);
				} else {
					B3.setIcon(cadeiraverm);
				}
				if (cinema.cinezao.getB4().equals("1")) {
					B4.setIcon(cadeiraverde);
				} else {
					B4.setIcon(cadeiraverm);
				}
				if (cinema.cinezao.getB5().equals("1")) {
					B5.setIcon(cadeiraverde);
				} else {
					B5.setIcon(cadeiraverm);
				}
				if (cinema.cinezao.getB6().equals("1")) {
					B6.setIcon(cadeiraverde);
				} else {
					B6.setIcon(cadeiraverm);
				}
				if (cinema.cinezao.getB7().equals("1")) {
					B7.setIcon(cadeiraverde);
				} else {
					B7.setIcon(cadeiraverm);
				}
				if (cinema.cinezao.getB8().equals("1")) {
					B8.setIcon(cadeiraverde);
				} else {
					B8.setIcon(cadeiraverm);
				}
				if (cinema.cinezao.getB9().equals("1")) {
					B9.setIcon(deficienteverde);
				} else {
					B9.setIcon(deficienteverm);
				}
				if (cinema.cinezao.getB10().equals("1")) {
					B10.setIcon(deficienteverde);
				} else {
					B10.setIcon(deficienteverm);
				}

				// FILEIRA 3
				if (cinema.cinezao.getC1().equals("1")) {
					C1.setIcon(deficienteverde);
				} else {
					C1.setIcon(deficienteverm);
				}
				if (cinema.cinezao.getC2().equals("1")) {
					C2.setIcon(deficienteverde);
				} else {
					C2.setIcon(deficienteverm);
				}
				if (cinema.cinezao.getC3().equals("1")) {
					C3.setIcon(cadeiraverde);
				} else {
					C3.setIcon(cadeiraverm);
				}
				if (cinema.cinezao.getC4().equals("1")) {
					C4.setIcon(cadeiraverde);
				} else {
					C4.setIcon(cadeiraverm);
				}
				if (cinema.cinezao.getC5().equals("1")) {
					C5.setIcon(cadeiraverde);
				} else {
					C5.setIcon(cadeiraverm);
				}
				if (cinema.cinezao.getC6().equals("1")) {
					C6.setIcon(cadeiraverde);
				} else {
					C6.setIcon(cadeiraverm);
				}
				if (cinema.cinezao.getC7().equals("1")) {
					C7.setIcon(cadeiraverde);
				} else {
					C7.setIcon(cadeiraverm);
				}
				if (cinema.cinezao.getC8().equals("1")) {
					C8.setIcon(cadeiraverde);
				} else {
					C8.setIcon(cadeiraverm);
				}
				if (cinema.cinezao.getC9().equals("1")) {
					C9.setIcon(deficienteverde);
				} else {
					C9.setIcon(deficienteverm);
				}
				if (cinema.cinezao.getC10().equals("1")) {
					C10.setIcon(deficienteverde);
				} else {
					C10.setIcon(deficienteverm);
				}

			}

		});

		h3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				A1.setVisible(true);
				A2.setVisible(true);
				A3.setVisible(true);
				A4.setVisible(true);
				A5.setVisible(true);
				A6.setVisible(true);
				A7.setVisible(true);
				A8.setVisible(true);
				A9.setVisible(true);
				A10.setVisible(true);
				B1.setVisible(true);
				B2.setVisible(true);
				B3.setVisible(true);
				B4.setVisible(true);
				B5.setVisible(true);
				B6.setVisible(true);
				B7.setVisible(true);
				B8.setVisible(true);
				B9.setVisible(true);
				B10.setVisible(true);
				C1.setVisible(true);
				C2.setVisible(true);
				C3.setVisible(true);
				C4.setVisible(true);
				C5.setVisible(true);
				C6.setVisible(true);
				C7.setVisible(true);
				C8.setVisible(true);
				C9.setVisible(true);
				C10.setVisible(true);
				cadeiras4.setVisible(true);
				voltar4.setVisible(true);
				legenda.setVisible(true);
				ingressos4.setVisible(true);
				h1.setVisible(false);
				h2.setVisible(false);
				h3.setVisible(false);
				h4.setVisible(false);
				h5.setVisible(false);
				h6.setVisible(false);
				banner.setVisible(false);
				preco3.setVisible(false);
				duracao3.setVisible(false);
				sinopse3.setVisible(false);
				voltar1.setVisible(false);
				lbfaixa.setVisible(false);
				fundo.setBackground(Color.black);
				cinema.cinezao.setHorarioSala(h3.getText().replace("<html>", "").replace("<br>", ""));
				cinema.setarcadeiras();
				// FILEIRA 1
				if (cinema.cinezao.getA1().equals("1")) {
					A1.setIcon(deficienteverde);
				} else {
					A1.setIcon(deficienteverm);
				}

				if (cinema.cinezao.getA2().equals("1")) {
					A2.setIcon(deficienteverde);
				} else {
					A2.setIcon(deficienteverm);
				}
				if (cinema.cinezao.getA3().equals("1")) {
					A3.setIcon(cadeiraverde);
				} else {
					A3.setIcon(cadeiraverm);
				}

				if (cinema.cinezao.getA4().equals("1")) {
					A4.setIcon(cadeiraverde);
				} else {
					A4.setIcon(cadeiraverm);
				}
				if (cinema.cinezao.getA5().equals("1")) {
					A5.setIcon(cadeiraverde);
				} else {
					A5.setIcon(cadeiraverm);
				}

				if (cinema.cinezao.getA6().equals("1")) {
					A6.setIcon(cadeiraverde);
				} else {
					A6.setIcon(cadeiraverm);
				}
				if (cinema.cinezao.getA7().equals("1")) {
					A7.setIcon(cadeiraverde);
				} else {
					A7.setIcon(cadeiraverm);
				}

				if (cinema.cinezao.getA8().equals("1")) {
					A8.setIcon(cadeiraverde);
				} else {
					A8.setIcon(cadeiraverm);
				}
				if (cinema.cinezao.getA9().equals("1")) {
					A9.setIcon(deficienteverde);
				} else {
					A9.setIcon(deficienteverm);
				}

				if (cinema.cinezao.getA10().equals("1")) {
					A10.setIcon(deficienteverde);
				} else {
					A10.setIcon(deficienteverm);
				}

				// FILEIRA 2
				if (cinema.cinezao.getB1().equals("1")) {
					B1.setIcon(deficienteverde);
				} else {
					B1.setIcon(deficienteverm);
				}
				if (cinema.cinezao.getB2().equals("1")) {
					B2.setIcon(deficienteverde);
				} else {
					B2.setIcon(deficienteverm);
				}
				if (cinema.cinezao.getB3().equals("1")) {
					B3.setIcon(cadeiraverde);
				} else {
					B3.setIcon(cadeiraverm);
				}
				if (cinema.cinezao.getB4().equals("1")) {
					B4.setIcon(cadeiraverde);
				} else {
					B4.setIcon(cadeiraverm);
				}
				if (cinema.cinezao.getB5().equals("1")) {
					B5.setIcon(cadeiraverde);
				} else {
					B5.setIcon(cadeiraverm);
				}
				if (cinema.cinezao.getB6().equals("1")) {
					B6.setIcon(cadeiraverde);
				} else {
					B6.setIcon(cadeiraverm);
				}
				if (cinema.cinezao.getB7().equals("1")) {
					B7.setIcon(cadeiraverde);
				} else {
					B7.setIcon(cadeiraverm);
				}
				if (cinema.cinezao.getB8().equals("1")) {
					B8.setIcon(cadeiraverde);
				} else {
					B8.setIcon(cadeiraverm);
				}
				if (cinema.cinezao.getB9().equals("1")) {
					B9.setIcon(deficienteverde);
				} else {
					B9.setIcon(deficienteverm);
				}
				if (cinema.cinezao.getB10().equals("1")) {
					B10.setIcon(deficienteverde);
				} else {
					B10.setIcon(deficienteverm);
				}

				// FILEIRA 3
				if (cinema.cinezao.getC1().equals("1")) {
					C1.setIcon(deficienteverde);
				} else {
					C1.setIcon(deficienteverm);
				}
				if (cinema.cinezao.getC2().equals("1")) {
					C2.setIcon(deficienteverde);
				} else {
					C2.setIcon(deficienteverm);
				}
				if (cinema.cinezao.getC3().equals("1")) {
					C3.setIcon(cadeiraverde);
				} else {
					C3.setIcon(cadeiraverm);
				}
				if (cinema.cinezao.getC4().equals("1")) {
					C4.setIcon(cadeiraverde);
				} else {
					C4.setIcon(cadeiraverm);
				}
				if (cinema.cinezao.getC5().equals("1")) {
					C5.setIcon(cadeiraverde);
				} else {
					C5.setIcon(cadeiraverm);
				}
				if (cinema.cinezao.getC6().equals("1")) {
					C6.setIcon(cadeiraverde);
				} else {
					C6.setIcon(cadeiraverm);
				}
				if (cinema.cinezao.getC7().equals("1")) {
					C7.setIcon(cadeiraverde);
				} else {
					C7.setIcon(cadeiraverm);
				}
				if (cinema.cinezao.getC8().equals("1")) {
					C8.setIcon(cadeiraverde);
				} else {
					C8.setIcon(cadeiraverm);
				}
				if (cinema.cinezao.getC9().equals("1")) {
					C9.setIcon(deficienteverde);
				} else {
					C9.setIcon(deficienteverm);
				}
				if (cinema.cinezao.getC10().equals("1")) {
					C10.setIcon(deficienteverde);
				} else {
					C10.setIcon(deficienteverm);
				}

			}

		});

		h4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				A1.setVisible(true);
				A2.setVisible(true);
				A3.setVisible(true);
				A4.setVisible(true);
				A5.setVisible(true);
				A6.setVisible(true);
				A7.setVisible(true);
				A8.setVisible(true);
				A9.setVisible(true);
				A10.setVisible(true);
				B1.setVisible(true);
				B2.setVisible(true);
				B3.setVisible(true);
				B4.setVisible(true);
				B5.setVisible(true);
				B6.setVisible(true);
				B7.setVisible(true);
				B8.setVisible(true);
				B9.setVisible(true);
				B10.setVisible(true);
				C1.setVisible(true);
				C2.setVisible(true);
				C3.setVisible(true);
				C4.setVisible(true);
				C5.setVisible(true);
				C6.setVisible(true);
				C7.setVisible(true);
				C8.setVisible(true);
				C9.setVisible(true);
				C10.setVisible(true);
				cadeiras4.setVisible(true);
				voltar4.setVisible(true);
				legenda.setVisible(true);
				ingressos4.setVisible(true);
				h1.setVisible(false);
				h2.setVisible(false);
				h3.setVisible(false);
				h4.setVisible(false);
				h5.setVisible(false);
				h6.setVisible(false);
				banner.setVisible(false);
				preco3.setVisible(false);
				duracao3.setVisible(false);
				sinopse3.setVisible(false);
				voltar1.setVisible(false);
				lbfaixa.setVisible(false);
				fundo.setBackground(Color.black);
				cinema.cinezao.setHorarioSala(h4.getText().replace("<html>", "").replace("<br>", ""));
				System.out.println(cinema.cinezao.getHorarioSala());
				cinema.setarcadeiras();
				// FILEIRA 1
				if (cinema.cinezao.getA1().equals("1")) {
					A1.setIcon(deficienteverde);
				} else {
					A1.setIcon(deficienteverm);
				}

				if (cinema.cinezao.getA2().equals("1")) {
					A2.setIcon(deficienteverde);
				} else {
					A2.setIcon(deficienteverm);
				}
				if (cinema.cinezao.getA3().equals("1")) {
					A3.setIcon(cadeiraverde);
				} else {
					A3.setIcon(cadeiraverm);
				}

				if (cinema.cinezao.getA4().equals("1")) {
					A4.setIcon(cadeiraverde);
				} else {
					A4.setIcon(cadeiraverm);
				}
				if (cinema.cinezao.getA5().equals("1")) {
					A5.setIcon(cadeiraverde);
				} else {
					A5.setIcon(cadeiraverm);
				}

				if (cinema.cinezao.getA6().equals("1")) {
					A6.setIcon(cadeiraverde);
				} else {
					A6.setIcon(cadeiraverm);
				}
				if (cinema.cinezao.getA7().equals("1")) {
					A7.setIcon(cadeiraverde);
				} else {
					A7.setIcon(cadeiraverm);
				}

				if (cinema.cinezao.getA8().equals("1")) {
					A8.setIcon(cadeiraverde);
				} else {
					A8.setIcon(cadeiraverm);
				}
				if (cinema.cinezao.getA9().equals("1")) {
					A9.setIcon(deficienteverde);
				} else {
					A9.setIcon(deficienteverm);
				}

				if (cinema.cinezao.getA10().equals("1")) {
					A10.setIcon(deficienteverde);
				} else {
					A10.setIcon(deficienteverm);
				}

				// FILEIRA 2
				if (cinema.cinezao.getB1().equals("1")) {
					B1.setIcon(deficienteverde);
				} else {
					B1.setIcon(deficienteverm);
				}
				if (cinema.cinezao.getB2().equals("1")) {
					B2.setIcon(deficienteverde);
				} else {
					B2.setIcon(deficienteverm);
				}
				if (cinema.cinezao.getB3().equals("1")) {
					B3.setIcon(cadeiraverde);
				} else {
					B3.setIcon(cadeiraverm);
				}
				if (cinema.cinezao.getB4().equals("1")) {
					B4.setIcon(cadeiraverde);
				} else {
					B4.setIcon(cadeiraverm);
				}
				if (cinema.cinezao.getB5().equals("1")) {
					B5.setIcon(cadeiraverde);
				} else {
					B5.setIcon(cadeiraverm);
				}
				if (cinema.cinezao.getB6().equals("1")) {
					B6.setIcon(cadeiraverde);
				} else {
					B6.setIcon(cadeiraverm);
				}
				if (cinema.cinezao.getB7().equals("1")) {
					B7.setIcon(cadeiraverde);
				} else {
					B7.setIcon(cadeiraverm);
				}
				if (cinema.cinezao.getB8().equals("1")) {
					B8.setIcon(cadeiraverde);
				} else {
					B8.setIcon(cadeiraverm);
				}
				if (cinema.cinezao.getB9().equals("1")) {
					B9.setIcon(deficienteverde);
				} else {
					B9.setIcon(deficienteverm);
				}
				if (cinema.cinezao.getB10().equals("1")) {
					B10.setIcon(deficienteverde);
				} else {
					B10.setIcon(deficienteverm);
				}

				// FILEIRA 3
				if (cinema.cinezao.getC1().equals("1")) {
					C1.setIcon(deficienteverde);
				} else {
					C1.setIcon(deficienteverm);
				}
				if (cinema.cinezao.getC2().equals("1")) {
					C2.setIcon(deficienteverde);
				} else {
					C2.setIcon(deficienteverm);
				}
				if (cinema.cinezao.getC3().equals("1")) {
					C3.setIcon(cadeiraverde);
				} else {
					C3.setIcon(cadeiraverm);
				}
				if (cinema.cinezao.getC4().equals("1")) {
					C4.setIcon(cadeiraverde);
				} else {
					C4.setIcon(cadeiraverm);
				}
				if (cinema.cinezao.getC5().equals("1")) {
					C5.setIcon(cadeiraverde);
				} else {
					C5.setIcon(cadeiraverm);
				}
				if (cinema.cinezao.getC6().equals("1")) {
					C6.setIcon(cadeiraverde);
				} else {
					C6.setIcon(cadeiraverm);
				}
				if (cinema.cinezao.getC7().equals("1")) {
					C7.setIcon(cadeiraverde);
				} else {
					C7.setIcon(cadeiraverm);
				}
				if (cinema.cinezao.getC8().equals("1")) {
					C8.setIcon(cadeiraverde);
				} else {
					C8.setIcon(cadeiraverm);
				}
				if (cinema.cinezao.getC9().equals("1")) {
					C9.setIcon(deficienteverde);
				} else {
					C9.setIcon(deficienteverm);
				}
				if (cinema.cinezao.getC10().equals("1")) {
					C10.setIcon(deficienteverde);
				} else {
					C10.setIcon(deficienteverm);
				}

			}

		});

		h5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				A1.setVisible(true);
				A2.setVisible(true);
				A3.setVisible(true);
				A4.setVisible(true);
				A5.setVisible(true);
				A6.setVisible(true);
				A7.setVisible(true);
				A8.setVisible(true);
				A9.setVisible(true);
				A10.setVisible(true);
				B1.setVisible(true);
				B2.setVisible(true);
				B3.setVisible(true);
				B4.setVisible(true);
				B5.setVisible(true);
				B6.setVisible(true);
				B7.setVisible(true);
				B8.setVisible(true);
				B9.setVisible(true);
				B10.setVisible(true);
				C1.setVisible(true);
				C2.setVisible(true);
				C3.setVisible(true);
				C4.setVisible(true);
				C5.setVisible(true);
				C6.setVisible(true);
				C7.setVisible(true);
				C8.setVisible(true);
				C9.setVisible(true);
				C10.setVisible(true);
				cadeiras4.setVisible(true);
				voltar4.setVisible(true);
				legenda.setVisible(true);
				ingressos4.setVisible(true);
				h1.setVisible(false);
				h2.setVisible(false);
				h3.setVisible(false);
				h4.setVisible(false);
				h5.setVisible(false);
				h6.setVisible(false);
				banner.setVisible(false);
				preco3.setVisible(false);
				duracao3.setVisible(false);
				sinopse3.setVisible(false);
				voltar1.setVisible(false);
				lbfaixa.setVisible(false);
				fundo.setBackground(Color.black);
				cinema.cinezao.setHorarioSala(h5.getText().replace("<html>", "").replace("<br>", ""));
				cinema.setarcadeiras();
				// FILEIRA 1
				if (cinema.cinezao.getA1().equals("1")) {
					A1.setIcon(deficienteverde);
				} else {
					A1.setIcon(deficienteverm);
				}

				if (cinema.cinezao.getA2().equals("1")) {
					A2.setIcon(deficienteverde);
				} else {
					A2.setIcon(deficienteverm);
				}
				if (cinema.cinezao.getA3().equals("1")) {
					A3.setIcon(cadeiraverde);
				} else {
					A3.setIcon(cadeiraverm);
				}

				if (cinema.cinezao.getA4().equals("1")) {
					A4.setIcon(cadeiraverde);
				} else {
					A4.setIcon(cadeiraverm);
				}
				if (cinema.cinezao.getA5().equals("1")) {
					A5.setIcon(cadeiraverde);
				} else {
					A5.setIcon(cadeiraverm);
				}

				if (cinema.cinezao.getA6().equals("1")) {
					A6.setIcon(cadeiraverde);
				} else {
					A6.setIcon(cadeiraverm);
				}
				if (cinema.cinezao.getA7().equals("1")) {
					A7.setIcon(cadeiraverde);
				} else {
					A7.setIcon(cadeiraverm);
				}

				if (cinema.cinezao.getA8().equals("1")) {
					A8.setIcon(cadeiraverde);
				} else {
					A8.setIcon(cadeiraverm);
				}
				if (cinema.cinezao.getA9().equals("1")) {
					A9.setIcon(deficienteverde);
				} else {
					A9.setIcon(deficienteverm);
				}

				if (cinema.cinezao.getA10().equals("1")) {
					A10.setIcon(deficienteverde);
				} else {
					A10.setIcon(deficienteverm);
				}

				// FILEIRA 2
				if (cinema.cinezao.getB1().equals("1")) {
					B1.setIcon(deficienteverde);
				} else {
					B1.setIcon(deficienteverm);
				}
				if (cinema.cinezao.getB2().equals("1")) {
					B2.setIcon(deficienteverde);
				} else {
					B2.setIcon(deficienteverm);
				}
				if (cinema.cinezao.getB3().equals("1")) {
					B3.setIcon(cadeiraverde);
				} else {
					B3.setIcon(cadeiraverm);
				}
				if (cinema.cinezao.getB4().equals("1")) {
					B4.setIcon(cadeiraverde);
				} else {
					B4.setIcon(cadeiraverm);
				}
				if (cinema.cinezao.getB5().equals("1")) {
					B5.setIcon(cadeiraverde);
				} else {
					B5.setIcon(cadeiraverm);
				}
				if (cinema.cinezao.getB6().equals("1")) {
					B6.setIcon(cadeiraverde);
				} else {
					B6.setIcon(cadeiraverm);
				}
				if (cinema.cinezao.getB7().equals("1")) {
					B7.setIcon(cadeiraverde);
				} else {
					B7.setIcon(cadeiraverm);
				}
				if (cinema.cinezao.getB8().equals("1")) {
					B8.setIcon(cadeiraverde);
				} else {
					B8.setIcon(cadeiraverm);
				}
				if (cinema.cinezao.getB9().equals("1")) {
					B9.setIcon(deficienteverde);
				} else {
					B9.setIcon(deficienteverm);
				}
				if (cinema.cinezao.getB10().equals("1")) {
					B10.setIcon(deficienteverde);
				} else {
					B10.setIcon(deficienteverm);
				}

				// FILEIRA 3
				if (cinema.cinezao.getC1().equals("1")) {
					C1.setIcon(deficienteverde);
				} else {
					C1.setIcon(deficienteverm);
				}
				if (cinema.cinezao.getC2().equals("1")) {
					C2.setIcon(deficienteverde);
				} else {
					C2.setIcon(deficienteverm);
				}
				if (cinema.cinezao.getC3().equals("1")) {
					C3.setIcon(cadeiraverde);
				} else {
					C3.setIcon(cadeiraverm);
				}
				if (cinema.cinezao.getC4().equals("1")) {
					C4.setIcon(cadeiraverde);
				} else {
					C4.setIcon(cadeiraverm);
				}
				if (cinema.cinezao.getC5().equals("1")) {
					C5.setIcon(cadeiraverde);
				} else {
					C5.setIcon(cadeiraverm);
				}
				if (cinema.cinezao.getC6().equals("1")) {
					C6.setIcon(cadeiraverde);
				} else {
					C6.setIcon(cadeiraverm);
				}
				if (cinema.cinezao.getC7().equals("1")) {
					C7.setIcon(cadeiraverde);
				} else {
					C7.setIcon(cadeiraverm);
				}
				if (cinema.cinezao.getC8().equals("1")) {
					C8.setIcon(cadeiraverde);
				} else {
					C8.setIcon(cadeiraverm);
				}
				if (cinema.cinezao.getC9().equals("1")) {
					C9.setIcon(deficienteverde);
				} else {
					C9.setIcon(deficienteverm);
				}
				if (cinema.cinezao.getC10().equals("1")) {
					C10.setIcon(deficienteverde);
				} else {
					C10.setIcon(deficienteverm);
				}

			}

		});

		h6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				A1.setVisible(true);
				A2.setVisible(true);
				A3.setVisible(true);
				A4.setVisible(true);
				A5.setVisible(true);
				A6.setVisible(true);
				A7.setVisible(true);
				A8.setVisible(true);
				A9.setVisible(true);
				A10.setVisible(true);
				B1.setVisible(true);
				B2.setVisible(true);
				B3.setVisible(true);
				B4.setVisible(true);
				B5.setVisible(true);
				B6.setVisible(true);
				B7.setVisible(true);
				B8.setVisible(true);
				B9.setVisible(true);
				B10.setVisible(true);
				C1.setVisible(true);
				C2.setVisible(true);
				C3.setVisible(true);
				C4.setVisible(true);
				C5.setVisible(true);
				C6.setVisible(true);
				C7.setVisible(true);
				C8.setVisible(true);
				C9.setVisible(true);
				C10.setVisible(true);
				cadeiras4.setVisible(true);
				voltar4.setVisible(true);
				legenda.setVisible(true);
				ingressos4.setVisible(true);
				h1.setVisible(false);
				h2.setVisible(false);
				h3.setVisible(false);
				h4.setVisible(false);
				h5.setVisible(false);
				h6.setVisible(false);
				banner.setVisible(false);
				preco3.setVisible(false);
				duracao3.setVisible(false);
				sinopse3.setVisible(false);
				voltar1.setVisible(false);
				lbfaixa.setVisible(false);
				fundo.setBackground(Color.black);
				cinema.cinezao.setHorarioSala(h6.getText().replace("<html>", "").replace("<br>", ""));
				cinema.setarcadeiras();
				// FILEIRA 1
				if (cinema.cinezao.getA1().equals("1")) {
					A1.setIcon(deficienteverde);
				} else {
					A1.setIcon(deficienteverm);
				}

				if (cinema.cinezao.getA2().equals("1")) {
					A2.setIcon(deficienteverde);
				} else {
					A2.setIcon(deficienteverm);
				}
				if (cinema.cinezao.getA3().equals("1")) {
					A3.setIcon(cadeiraverde);
				} else {
					A3.setIcon(cadeiraverm);
				}

				if (cinema.cinezao.getA4().equals("1")) {
					A4.setIcon(cadeiraverde);
				} else {
					A4.setIcon(cadeiraverm);
				}
				if (cinema.cinezao.getA5().equals("1")) {
					A5.setIcon(cadeiraverde);
				} else {
					A5.setIcon(cadeiraverm);
				}

				if (cinema.cinezao.getA6().equals("1")) {
					A6.setIcon(cadeiraverde);
				} else {
					A6.setIcon(cadeiraverm);
				}
				if (cinema.cinezao.getA7().equals("1")) {
					A7.setIcon(cadeiraverde);
				} else {
					A7.setIcon(cadeiraverm);
				}

				if (cinema.cinezao.getA8().equals("1")) {
					A8.setIcon(cadeiraverde);
				} else {
					A8.setIcon(cadeiraverm);
				}
				if (cinema.cinezao.getA9().equals("1")) {
					A9.setIcon(deficienteverde);
				} else {
					A9.setIcon(deficienteverm);
				}

				if (cinema.cinezao.getA10().equals("1")) {
					A10.setIcon(deficienteverde);
				} else {
					A10.setIcon(deficienteverm);
				}

				// FILEIRA 2
				if (cinema.cinezao.getB1().equals("1")) {
					B1.setIcon(deficienteverde);
				} else {
					B1.setIcon(deficienteverm);
				}
				if (cinema.cinezao.getB2().equals("1")) {
					B2.setIcon(deficienteverde);
				} else {
					B2.setIcon(deficienteverm);
				}
				if (cinema.cinezao.getB3().equals("1")) {
					B3.setIcon(cadeiraverde);
				} else {
					B3.setIcon(cadeiraverm);
				}
				if (cinema.cinezao.getB4().equals("1")) {
					B4.setIcon(cadeiraverde);
				} else {
					B4.setIcon(cadeiraverm);
				}
				if (cinema.cinezao.getB5().equals("1")) {
					B5.setIcon(cadeiraverde);
				} else {
					B5.setIcon(cadeiraverm);
				}
				if (cinema.cinezao.getB6().equals("1")) {
					B6.setIcon(cadeiraverde);
				} else {
					B6.setIcon(cadeiraverm);
				}
				if (cinema.cinezao.getB7().equals("1")) {
					B7.setIcon(cadeiraverde);
				} else {
					B7.setIcon(cadeiraverm);
				}
				if (cinema.cinezao.getB8().equals("1")) {
					B8.setIcon(cadeiraverde);
				} else {
					B8.setIcon(cadeiraverm);
				}
				if (cinema.cinezao.getB9().equals("1")) {
					B9.setIcon(deficienteverde);
				} else {
					B9.setIcon(deficienteverm);
				}
				if (cinema.cinezao.getB10().equals("1")) {
					B10.setIcon(deficienteverde);
				} else {
					B10.setIcon(deficienteverm);
				}

				// FILEIRA 3
				if (cinema.cinezao.getC1().equals("1")) {
					C1.setIcon(deficienteverde);
				} else {
					C1.setIcon(deficienteverm);
				}
				if (cinema.cinezao.getC2().equals("1")) {
					C2.setIcon(deficienteverde);
				} else {
					C2.setIcon(deficienteverm);
				}
				if (cinema.cinezao.getC3().equals("1")) {
					C3.setIcon(cadeiraverde);
				} else {
					C3.setIcon(cadeiraverm);
				}
				if (cinema.cinezao.getC4().equals("1")) {
					C4.setIcon(cadeiraverde);
				} else {
					C4.setIcon(cadeiraverm);
				}
				if (cinema.cinezao.getC5().equals("1")) {
					C5.setIcon(cadeiraverde);
				} else {
					C5.setIcon(cadeiraverm);
				}
				if (cinema.cinezao.getC6().equals("1")) {
					C6.setIcon(cadeiraverde);
				} else {
					C6.setIcon(cadeiraverm);
				}
				if (cinema.cinezao.getC7().equals("1")) {
					C7.setIcon(cadeiraverde);
				} else {
					C7.setIcon(cadeiraverm);
				}
				if (cinema.cinezao.getC8().equals("1")) {
					C8.setIcon(cadeiraverde);
				} else {
					C8.setIcon(cadeiraverm);
				}
				if (cinema.cinezao.getC9().equals("1")) {
					C9.setIcon(deficienteverde);
				} else {
					C9.setIcon(deficienteverm);
				}
				if (cinema.cinezao.getC10().equals("1")) {
					C10.setIcon(deficienteverde);
				} else {
					C10.setIcon(deficienteverm);
				}

			}

		});

		// PARTE DAS CADEIRAS PAGINA 4
		A1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (A1.getIcon().equals(deficienteverde)) {
					A1.setIcon(deficienteazul);
				} else if (A1.getIcon().equals(deficienteazul)) {
					A1.setIcon(deficienteverde);
				}
			}

		});

		A2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (A2.getIcon().equals(deficienteverde)) {
					A2.setIcon(deficienteazul);
				} else if (A2.getIcon().equals(deficienteazul)) {
					A2.setIcon(deficienteverde);
				}
			}

		});

		A3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (A3.getIcon().equals(cadeiraverde)) {
					A3.setIcon(cadeiraazul);
				} else if (A3.getIcon().equals(cadeiraazul)) {
					A3.setIcon(cadeiraverde);
				}

			}

		});

		A4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (A4.getIcon().equals(cadeiraverde)) {
					A4.setIcon(cadeiraazul);
				} else if (A4.getIcon().equals(cadeiraazul)) {
					A4.setIcon(cadeiraverde);
				}
			}

		});

		A6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (A6.getIcon().equals(cadeiraverde)) {
					A6.setIcon(cadeiraazul);
				} else if (A6.getIcon().equals(cadeiraazul)) {
					A6.setIcon(cadeiraverde);
				}
			}

		});

		A5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (A5.getIcon().equals(cadeiraverde)) {
					A5.setIcon(cadeiraazul);
				} else if (A5.getIcon().equals(cadeiraazul)) {
					A5.setIcon(cadeiraverde);
				}
			}

		});

		A7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (A7.getIcon().equals(cadeiraverde)) {
					A7.setIcon(cadeiraazul);
				} else if (A7.getIcon().equals(cadeiraazul)) {
					A7.setIcon(cadeiraverde);
				}
			}

		});

		A8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (A8.getIcon().equals(cadeiraverde)) {
					A8.setIcon(cadeiraazul);
				} else if (A8.getIcon().equals(cadeiraazul)) {
					A8.setIcon(cadeiraverde);
				}
			}

		});

		A9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (A9.getIcon().equals(deficienteverde)) {
					A9.setIcon(deficienteazul);
				} else if (A9.getIcon().equals(deficienteazul)) {
					A9.setIcon(deficienteverde);
				}
			}

		});

		A10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (A10.getIcon().equals(deficienteverde)) {
					A10.setIcon(deficienteazul);
				} else if (A10.getIcon().equals(deficienteazul)) {
					A10.setIcon(deficienteverde);
				}
			}

		});

		B1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (B1.getIcon().equals(deficienteverde)) {
					B1.setIcon(deficienteazul);
				} else if (B1.getIcon().equals(deficienteazul)) {
					B1.setIcon(deficienteverde);
				}
			}

		});

		B2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (B2.getIcon().equals(deficienteverde)) {
					B2.setIcon(deficienteazul);
				} else if (B2.getIcon().equals(deficienteazul)) {
					B2.setIcon(deficienteverde);
				}
			}

		});

		B3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (B3.getIcon().equals(cadeiraverde)) {
					B3.setIcon(cadeiraazul);
				} else if (B3.getIcon().equals(cadeiraazul)) {
					B3.setIcon(cadeiraverde);
				}

			}

		});

		B4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (B4.getIcon().equals(cadeiraverde)) {
					B4.setIcon(cadeiraazul);
				} else if (B4.getIcon().equals(cadeiraazul)) {
					B4.setIcon(cadeiraverde);
				}
			}

		});

		B6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (B6.getIcon().equals(cadeiraverde)) {
					B6.setIcon(cadeiraazul);
				} else if (B6.getIcon().equals(cadeiraazul)) {
					B6.setIcon(cadeiraverde);
				}
			}

		});

		B5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (B5.getIcon().equals(cadeiraverde)) {
					B5.setIcon(cadeiraazul);
				} else if (B5.getIcon().equals(cadeiraazul)) {
					B5.setIcon(cadeiraverde);
				}
			}

		});

		B7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (B7.getIcon().equals(cadeiraverde)) {
					B7.setIcon(cadeiraazul);
				} else if (B7.getIcon().equals(cadeiraazul)) {
					B7.setIcon(cadeiraverde);
				}
			}

		});

		B8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (B8.getIcon().equals(cadeiraverde)) {
					B8.setIcon(cadeiraazul);
				} else if (B8.getIcon().equals(cadeiraazul)) {
					B8.setIcon(cadeiraverde);
				}
			}

		});

		B9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (B9.getIcon().equals(deficienteverde)) {
					B9.setIcon(deficienteazul);
				} else if (B9.getIcon().equals(deficienteazul)) {
					B9.setIcon(deficienteverde);
				}
			}

		});

		B10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (B10.getIcon().equals(deficienteverde)) {
					B10.setIcon(deficienteazul);
				} else if (B10.getIcon().equals(deficienteazul)) {
					B10.setIcon(deficienteverde);
				}
			}

		});

		C1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (C1.getIcon().equals(deficienteverde)) {
					C1.setIcon(deficienteazul);
				} else if (C1.getIcon().equals(deficienteazul)) {
					C1.setIcon(deficienteverde);
				}
			}

		});

		C2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (C2.getIcon().equals(deficienteverde)) {
					C2.setIcon(deficienteazul);
				} else if (C2.getIcon().equals(deficienteazul)) {
					C2.setIcon(deficienteverde);
				}
			}

		});

		C3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (C3.getIcon().equals(cadeiraverde)) {
					C3.setIcon(cadeiraazul);
				} else if (C3.getIcon().equals(cadeiraazul)) {
					C3.setIcon(cadeiraverde);
				}

			}

		});

		C4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (C4.getIcon().equals(cadeiraverde)) {
					C4.setIcon(cadeiraazul);
				} else if (C4.getIcon().equals(cadeiraazul)) {
					C4.setIcon(cadeiraverde);
				}
			}

		});

		C6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (C6.getIcon().equals(cadeiraverde)) {
					C6.setIcon(cadeiraazul);
				} else if (C6.getIcon().equals(cadeiraazul)) {
					C6.setIcon(cadeiraverde);
				}
			}

		});

		C5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (C5.getIcon().equals(cadeiraverde)) {
					C5.setIcon(cadeiraazul);
				} else if (C5.getIcon().equals(cadeiraazul)) {
					C5.setIcon(cadeiraverde);
				}
			}

		});

		C7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (C7.getIcon().equals(cadeiraverde)) {
					C7.setIcon(cadeiraazul);
				} else if (C7.getIcon().equals(cadeiraazul)) {
					C7.setIcon(cadeiraverde);
				}
			}

		});

		C8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (C8.getIcon().equals(cadeiraverde)) {
					C8.setIcon(cadeiraazul);
				} else if (C8.getIcon().equals(cadeiraazul)) {
					C8.setIcon(cadeiraverde);
				}
			}

		});

		C9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (C9.getIcon().equals(deficienteverde)) {
					C9.setIcon(deficienteazul);
				} else if (C9.getIcon().equals(deficienteazul)) {
					C9.setIcon(deficienteverde);
				}
			}

		});

		C10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (C10.getIcon().equals(deficienteverde)) {
					C10.setIcon(deficienteazul);
				} else if (C10.getIcon().equals(deficienteazul)) {
					C10.setIcon(deficienteverde);
				}
			}

		});
		
		ingressos4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cadeiras4.setVisible(false);
				A1.setVisible(false);
				A2.setVisible(false);
				A3.setVisible(false);
				A4.setVisible(false);
				A5.setVisible(false);
				A6.setVisible(false);
				A7.setVisible(false);
				A8.setVisible(false);
				A9.setVisible(false);
				A10.setVisible(false);
				B1.setVisible(false);
				B2.setVisible(false);
				B3.setVisible(false);
				B4.setVisible(false);
				B5.setVisible(false);
				B6.setVisible(false);
				B7.setVisible(false);
				B8.setVisible(false);
				B9.setVisible(false);
				B10.setVisible(false);
				C1.setVisible(false);
				C2.setVisible(false);
				C3.setVisible(false);
				C4.setVisible(false);
				C5.setVisible(false);
				C6.setVisible(false);
				C7.setVisible(false);
				C8.setVisible(false);
				C9.setVisible(false);
				C10.setVisible(false);
				legenda.setVisible(false);
				voltar4.setVisible(false);
				ingressos4.setVisible(false);
				lancho5.setVisible(true);
				finalizar.setVisible(true);
				mais.setVisible(true);
				menos.setVisible(true);
				maiss.setVisible(true);
				menoss.setVisible(true);
				inteira.setVisible(true);
				meia.setVisible(true);
				lbinteira5.setVisible(true);
				lbmeia5.setVisible(true);
				fundo.setBackground(new Color(178, 34, 34));
				cinema.cinezao.setCadeiras(" ");
				if (A1.getIcon().equals(deficienteazul)) {
					cinema.cinezao.setIngresso(cinema.cinezao.getIngresso() + 1);
					cinema.cinezao.setA1("0");
					cinema.cinezao.setCadeiras("A1 ");
				}
				if (A2.getIcon().equals(deficienteazul)) {
					cinema.cinezao.setIngresso(cinema.cinezao.getIngresso() + 1);
					cinema.cinezao.setA2("0");
					cinema.cinezao.setCadeiras(cinema.cinezao.getCadeiras() + "A2 ");
				}
				if (A3.getIcon().equals(cadeiraazul)) {
					cinema.cinezao.setIngresso(cinema.cinezao.getIngresso() + 1);
					cinema.cinezao.setA3("0");
					cinema.cinezao.setCadeiras(cinema.cinezao.getCadeiras() + "A3 ");
				}
				if (A4.getIcon().equals(cadeiraazul)) {
					cinema.cinezao.setIngresso(cinema.cinezao.getIngresso() + 1);
					cinema.cinezao.setA4("0");
					cinema.cinezao.setCadeiras(cinema.cinezao.getCadeiras() + "A4 ");
				}
				if (A5.getIcon().equals(cadeiraazul)) {
					cinema.cinezao.setIngresso(cinema.cinezao.getIngresso() + 1);
					cinema.cinezao.setA5("0");
					cinema.cinezao.setCadeiras(cinema.cinezao.getCadeiras() + "A5 ");
				}
				if (A6.getIcon().equals(cadeiraazul)) {
					cinema.cinezao.setIngresso(cinema.cinezao.getIngresso() + 1);
					cinema.cinezao.setA6("0");
					cinema.cinezao.setCadeiras(cinema.cinezao.getCadeiras() + "A6 ");
				}
				if (A7.getIcon().equals(cadeiraazul)) {
					cinema.cinezao.setIngresso(cinema.cinezao.getIngresso() + 1);
					cinema.cinezao.setA7("0");
					cinema.cinezao.setCadeiras(cinema.cinezao.getCadeiras() + "A7 ");
				}
				if (A8.getIcon().equals(cadeiraazul)) {
					cinema.cinezao.setIngresso(cinema.cinezao.getIngresso() + 1);
					cinema.cinezao.setA8("0");
					cinema.cinezao.setCadeiras(cinema.cinezao.getCadeiras() + "A8 ");
				}
				if (A9.getIcon().equals(deficienteazul)) {
					cinema.cinezao.setIngresso(cinema.cinezao.getIngresso() + 1);
					cinema.cinezao.setA9("0");
					cinema.cinezao.setCadeiras(cinema.cinezao.getCadeiras() + "A9 ");
				}
				if (A10.getIcon().equals(deficienteazul)) {
					cinema.cinezao.setIngresso(cinema.cinezao.getIngresso() + 1);
					cinema.cinezao.setA10("0");
					cinema.cinezao.setCadeiras(cinema.cinezao.getCadeiras() + "A10 ");
				}
				
				if (C1.getIcon().equals(deficienteazul)) {
					cinema.cinezao.setIngresso(cinema.cinezao.getIngresso() + 1);
					cinema.cinezao.setC1("0");
					cinema.cinezao.setCadeiras(cinema.cinezao.getCadeiras() + "C1 ");
				}
				if (C2.getIcon().equals(deficienteazul)) {
					cinema.cinezao.setIngresso(cinema.cinezao.getIngresso() + 1);
					cinema.cinezao.setC2("0");
					cinema.cinezao.setCadeiras(cinema.cinezao.getCadeiras() + "C2 ");
				}
				if (C3.getIcon().equals(cadeiraazul)) {
					cinema.cinezao.setIngresso(cinema.cinezao.getIngresso() + 1);
					cinema.cinezao.setC3("0");
					cinema.cinezao.setCadeiras(cinema.cinezao.getCadeiras() + "C3 ");
				}
				if (C4.getIcon().equals(cadeiraazul)) {
					cinema.cinezao.setIngresso(cinema.cinezao.getIngresso() + 1);
					cinema.cinezao.setC4("0");
					cinema.cinezao.setCadeiras(cinema.cinezao.getCadeiras() + "C4 ");
				}
				if (C5.getIcon().equals(cadeiraazul)) {
					cinema.cinezao.setIngresso(cinema.cinezao.getIngresso() + 1);
					cinema.cinezao.setC5("0");
					cinema.cinezao.setCadeiras(cinema.cinezao.getCadeiras() + "C5 ");
				}
				if (C6.getIcon().equals(cadeiraazul)) {
					cinema.cinezao.setIngresso(cinema.cinezao.getIngresso() + 1);
					cinema.cinezao.setC6("0");
					cinema.cinezao.setCadeiras(cinema.cinezao.getCadeiras() + "C6 ");
				}
				if (C7.getIcon().equals(cadeiraazul)) {
					cinema.cinezao.setIngresso(cinema.cinezao.getIngresso() + 1);
					cinema.cinezao.setC7("0");
					cinema.cinezao.setCadeiras(cinema.cinezao.getCadeiras() + "C7 ");
				}
				if (C8.getIcon().equals(cadeiraazul)) {
					cinema.cinezao.setIngresso(cinema.cinezao.getIngresso() + 1);
					cinema.cinezao.setC8("0");
					cinema.cinezao.setCadeiras(cinema.cinezao.getCadeiras() + "C8 ");
				}
				if (C9.getIcon().equals(deficienteazul)) {
					cinema.cinezao.setIngresso(cinema.cinezao.getIngresso() + 1);
					cinema.cinezao.setC9("0");
					cinema.cinezao.setCadeiras(cinema.cinezao.getCadeiras() + "C9 ");
				}
				if (C10.getIcon().equals(deficienteazul)) {
					cinema.cinezao.setIngresso(cinema.cinezao.getIngresso() + 1);
					cinema.cinezao.setC10("0");
					cinema.cinezao.setCadeiras(cinema.cinezao.getCadeiras() + "C10 ");
				}
				
				if (B1.getIcon().equals(deficienteazul)) {
					cinema.cinezao.setIngresso(cinema.cinezao.getIngresso() + 1);
					cinema.cinezao.setB1("0");
					cinema.cinezao.setCadeiras(cinema.cinezao.getCadeiras() + "B1 ");
				}
				if (B2.getIcon().equals(deficienteazul)) {
					cinema.cinezao.setIngresso(cinema.cinezao.getIngresso() + 1);
					cinema.cinezao.setB2("0");
					cinema.cinezao.setCadeiras(cinema.cinezao.getCadeiras() + "B2 ");
				}
				if (B3.getIcon().equals(cadeiraazul)) {
					cinema.cinezao.setIngresso(cinema.cinezao.getIngresso() + 1);
					cinema.cinezao.setB3("0");
					cinema.cinezao.setCadeiras(cinema.cinezao.getCadeiras() + "B3 ");
				}
				if (B4.getIcon().equals(cadeiraazul)) {
					cinema.cinezao.setIngresso(cinema.cinezao.getIngresso() + 1);
					cinema.cinezao.setB4("0");
					cinema.cinezao.setCadeiras(cinema.cinezao.getCadeiras() + "B4 ");
				}
				if (B5.getIcon().equals(cadeiraazul)) {
					cinema.cinezao.setIngresso(cinema.cinezao.getIngresso() + 1);
					cinema.cinezao.setB5("0");
					cinema.cinezao.setCadeiras(cinema.cinezao.getCadeiras() + "B5 ");
				}
				if (B6.getIcon().equals(cadeiraazul)) {
					cinema.cinezao.setIngresso(cinema.cinezao.getIngresso() + 1);
					cinema.cinezao.setB6("0");
					cinema.cinezao.setCadeiras(cinema.cinezao.getCadeiras() + "B6 ");
				}
				if (B7.getIcon().equals(cadeiraazul)) {
					cinema.cinezao.setIngresso(cinema.cinezao.getIngresso() + 1);
					cinema.cinezao.setB7("0");
					cinema.cinezao.setCadeiras(cinema.cinezao.getCadeiras() + "B7 ");
				}
				if (B8.getIcon().equals(cadeiraazul)) {
					cinema.cinezao.setIngresso(cinema.cinezao.getIngresso() + 1);
					cinema.cinezao.setB8("0");
					cinema.cinezao.setCadeiras(cinema.cinezao.getCadeiras() + "B8 ");
				}
				if (B9.getIcon().equals(deficienteazul)) {
					cinema.cinezao.setIngresso(cinema.cinezao.getIngresso() + 1);
					cinema.cinezao.setB9("0");
					cinema.cinezao.setCadeiras(cinema.cinezao.getCadeiras() + "B9 ");
				}
				if (B10.getIcon().equals(deficienteazul)) {
					cinema.cinezao.setIngresso(cinema.cinezao.getIngresso() + 1);
					cinema.cinezao.setB10("0");
					cinema.cinezao.setCadeiras(cinema.cinezao.getCadeiras() + "B10 ");
				}
			}

		});
		//PAGINA 5
		mais.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int inte =Integer.parseInt(inteira.getText()) + 1;
				inteira.setText(Integer.toString(inte));
			}

		});
		maiss.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int inte =Integer.parseInt(meia.getText()) + 1;
				meia.setText(Integer.toString(inte));
			}

		});
		menos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Integer.parseInt(inteira.getText()) == 0){
					return;
				}
				int inte =Integer.parseInt(inteira.getText()) - 1;
				inteira.setText(Integer.toString(inte));
			}

		});
		menoss.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Integer.parseInt(meia.getText()) == 0){
					return;
				}
				int inte =Integer.parseInt(meia.getText()) - 1;
				meia.setText(Integer.toString(inte));
			}

		});
				lancho5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Integer.parseInt(inteira.getText()) + Integer.parseInt(meia.getText()) != cinema.cinezao.getIngresso()) {
					JOptionPane.showMessageDialog(null,
							"Quantidade de ingressos não compativel com cadeiras selecionadas");
					return;
				}
				lancho5.setVisible(false);
				finalizar.setVisible(false);
				mais.setVisible(false);
				menos.setVisible(false);
				maiss.setVisible(false);
				menoss.setVisible(false);
				inteira.setVisible(false);
				meia.setVisible(false);
				lbinteira5.setVisible(false);
				lbmeia5.setVisible(false);
				pipoca.setVisible(true);
				bebida.setVisible(true);
				lanchonete.setVisible(true);
				doces.setVisible(true);
				doces2.setVisible(true);
				cbbebida.setVisible(true);
				cbdoces.setVisible(true);
				cbdoces2.setVisible(true);
				cbtamanho.setVisible(true);
				cbsabor.setVisible(true);
				fundo2.setVisible(true);
				finalizar.setVisible(true);
				voltar5.setVisible(true);
			}

		});
			voltar4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cadeiras4.setVisible(false);
				A1.setVisible(false);
				A2.setVisible(false);
				A3.setVisible(false);
				A4.setVisible(false);
				A5.setVisible(false);
				A6.setVisible(false);
				A7.setVisible(false);
				A8.setVisible(false);
				A9.setVisible(false);
				A10.setVisible(false);
				B1.setVisible(false);
				B2.setVisible(false);
				B3.setVisible(false);
				B4.setVisible(false);
				B5.setVisible(false);
				B6.setVisible(false);
				B7.setVisible(false);
				B8.setVisible(false);
				B9.setVisible(false);
				B10.setVisible(false);
				C1.setVisible(false);
				C2.setVisible(false);
				C3.setVisible(false);
				C4.setVisible(false);
				C5.setVisible(false);
				C6.setVisible(false);
				C7.setVisible(false);
				C8.setVisible(false);
				C9.setVisible(false);
				C10.setVisible(false);
				legenda.setVisible(false);
				ingressos4.setVisible(false);
				voltar4.setVisible(false);
				fundo.setBackground(new Color(25, 25, 112));
				h1.setVisible(true);
				h2.setVisible(true);
				h3.setVisible(true);
				h4.setVisible(true);
				h5.setVisible(true);
				h6.setVisible(true);
				banner.setVisible(true);
				lbfaixa.setVisible(true);
				preco3.setVisible(true);
				duracao3.setVisible(true);
				sinopse3.setVisible(true);

				voltar1.setVisible(true);
			}
		});

		voltar5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				btingresso1.setVisible(true);
				btpipoca1.setVisible(true);
				fundo.setVisible(true);
				fundo.setIcon(cines);
				logo1.setVisible(true);
				pipoca.setVisible(false);
				bebida.setVisible(false);
				lanchonete.setVisible(false);
				doces.setVisible(false);
				doces2.setVisible(false);
				cbbebida.setVisible(false);
				cbdoces.setVisible(false);
				cbdoces2.setVisible(false);
				cbtamanho.setVisible(false);
				cbsabor.setVisible(false);
				fundo2.setVisible(false);
				finalizar.setVisible(false);
				voltar5.setVisible(false);

			}
		});

		finalizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (Integer.parseInt(inteira.getText()) + Integer.parseInt(meia.getText()) != cinema.cinezao.getIngresso()) {
					JOptionPane.showMessageDialog(null,
							"Quantidade de ingressos não compativel com cadeiras selecionadas");
					return;
				}
				mais.setVisible(false);
				menos.setVisible(false);
				maiss.setVisible(false);
				menoss.setVisible(false);
				inteira.setVisible(false);
				meia.setVisible(false);
				lancho5.setVisible(false);
				lbinteira5.setVisible(false);
				lbmeia5.setVisible(false);
				pipoca.setVisible(false);
				bebida.setVisible(false);
				doces.setVisible(false);
				doces2.setVisible(false);
				lanchonete.setVisible(false);
				cbbebida.setVisible(false);
				cbdoces.setVisible(false);
				cbdoces2.setVisible(false);
				cbtamanho.setVisible(false);
				cbsabor.setVisible(false);
				fundo2.setVisible(false);
				finalizar.setVisible(false);
				compraf.setVisible(true);
				pedido.setVisible(true);
				imprimir.setVisible(true);
				sair.setVisible(true);
				voltar5.setVisible(false);
				fundo.setVisible(true);

				aleatorio.setText(Integer.toString(alea1) + Integer.toString(alea2) + Integer.toString(alea3) + Integer.toString(alea4) + Integer.toString(alea5) );
				cinema.cinezao.setPedido(aleatorio.getText());
				
				cinema.cinezao.setPipocat(cbtamanho.getSelectedItem().toString());
				cinema.cinezao.setBebida(cbbebida.getSelectedItem().toString());
				cinema.cinezao.setDoce1(cbdoces.getSelectedItem().toString());
				cinema.cinezao.setDoce2(cbdoces2.getSelectedItem().toString());
				cinema.cinezao.setInteiran(inteira.getText());
				cinema.cinezao.setMeian(meia.getText());
				cinema.cinezao.setEntrada(preco3.getText().replace("Preço:","").replace(" reais",""));
				System.out.println(cinema.cinezao.getPipocat());
				System.out.println(cinema.cinezao.getBebida());
				System.out.println(cinema.cinezao.getDoce1());
				System.out.println(cinema.cinezao.getInteiran());
				System.out.println(cinema.cinezao.getDoce2());
				
				cinema.cinezao.setPreco(Double.parseDouble(inteira.getText())*cinema.cinezao.getPreco()+ (Double.parseDouble(meia.getText())*cinema.cinezao.getPreco()/2));
				cinema.cinezao.setPreco(cinema.cinezao.getPreco() + Double.parseDouble(cbtamanho.getSelectedItem().toString().replace("Nenhum (R$ ","").replace("Pequena (R$ ", "").replace("Média (R$ ", "").replace("Grande (R$ ", "").replace("Mega (R$ ", "").replace(")", "")));
				cinema.cinezao.setPreco(cinema.cinezao.getPreco() + Double.parseDouble(cbbebida.getSelectedItem().toString().replace("Nenhum (R$ ","").replace("Coca-Cola (R$ ", "").replace("Pepsi (R$ ", "").replace("Guaraná (R$ ", "").replace("Soda (R$ ", "").replace("Energético (R$ ", "").replace("Chá Gelado (R$ ", "").replace("Fanta Laranja (R$ ", "").replace("Fanta Uva (R$ ", "").replace(")", "")));
				cinema.cinezao.setPreco(cinema.cinezao.getPreco() + Double.parseDouble(cbdoces.getSelectedItem().toString().replace("Nenhum (R$ ","").replace("Balas Fini (R$ ", "").replace("Chocolate (R$ ", "").replace("Twix (R$ ", "").replace("M&M'S (R$ ", "").replace("Churros (R$ ", "").replace("Snickers (R$ ", "").replace(")", "")));
				cinema.cinezao.setPreco(cinema.cinezao.getPreco() + Double.parseDouble(cbdoces2.getSelectedItem().toString().replace("Nenhum (R$ ","").replace("Balas Fini (R$ ", "").replace("Chocolate (R$ ", "").replace("Twix (R$ ", "").replace("M&M'S (R$ ", "").replace("Churros (R$ ", "").replace("Snickers (R$ ", "").replace(")", "")));
				System.out.println(cinema.cinezao.getPreco());
			JOptionPane.showMessageDialog(null, cinema.atualizar((CineMetodos.alteracaoA)), "Aviso", JOptionPane.INFORMATION_MESSAGE);
			cinema.atualizar((CineMetodos.alteracaoB));
			cinema.atualizar((CineMetodos.alteracaoC));
			
			cinema.adicionar((CineMetodos.adicionar));
				
			}

		});

		sair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cinema.bd.close();
				System.exit(0);
			}

		});
		imprimir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				imprimir();
			}

		});
	}
	
	public void imprimir(){
		int confirma = JOptionPane.showConfirmDialog(null, "Confirmar a impressão do pedido?","Atenção",JOptionPane.YES_NO_OPTION);
		if(confirma == JOptionPane.YES_OPTION){
			try{
				 HashMap filtro = new HashMap();
				 filtro.put("npedido",aleatorio.getText());
				 if(cinema.cinezao.getNomeFilme().equals("Lanchonete")){
					 JasperPrint print = JasperFillManager.fillReport("C:\\Users\\marco\\JaspersoftWorkspace\\MyReports\\cinematosl.jasper",filtro,cc);
						JasperViewer.viewReport(print,false);
				 }else if(cinema.cinezao.getPipocat().equals("Nenhum (R$ 0)") && cinema.cinezao.getBebida().equals("Nenhum (R$ 0)" ) && cinema.cinezao.getDoce1().equals("Nenhum (R$ 0)" ) && cinema.cinezao.getDoce2().equals("Nenhum (R$ 0)" )){
					 JasperPrint print = JasperFillManager.fillReport("C:\\Users\\marco\\JaspersoftWorkspace\\MyReports\\cinematosi.jasper",filtro,cc);
						JasperViewer.viewReport(print,false);
				 }else{
					 JasperPrint print = JasperFillManager.fillReport("C:\\Users\\marco\\JaspersoftWorkspace\\MyReports\\cinematos.jasper",filtro,cc);
						JasperViewer.viewReport(print,false);
				 }
				
				
				
			} catch (Exception ae){
				JOptionPane.showMessageDialog(null, ae);
			}
	}
	} 
}

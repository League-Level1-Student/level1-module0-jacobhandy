package extra;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class War implements MouseListener{
	/*UI Items*/
	JFrame frame;
	JPanel topPanel;
	JPanel middlePanel;
	JPanel bottomPanel;
	JPanel leftCard;
	JPanel rightCard;
	JButton goButton;
	JLabel topMessage;
	JLabel bottomMessage;
	JLabel leftCardTitle;
	JLabel rightCardTitle;
	JLabel leftScore;
	JLabel rightScore;
	
	/* State Data */
	Scorekeeper scores = new Scorekeeper(0,0,0);
	Deck deck;
	int playerPoints = 0;
	int computerPooints = 0;
	int bonusPoints = 0;
	
	public void Initialize() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1000, 400);
		frame.setTitle("WAR!!!!!!!!!!!!!!!!!!!!!");
		
		topPanel = new JPanel();
		topPanel.setBackground(new Color(200,200,200));
		frame.add(topPanel, BorderLayout.NORTH);
		topMessage = new JLabel();
		topMessage.setText("Welcome to WAR!");
		topPanel.add(topMessage);
		
		leftScore = new JLabel();
		frame.add(rightScore, BorderLayout.EAST);
		
		bottomPanel = new JPanel();
		bottomPanel.setBackground(new Color(100,200,100));
		frame.add(bottomPanel, BorderLayout.SOUTH);
		bottomMessage = new JLabel();
		frame.add(bottomPanel, BorderLayout.SOUTH);
	}
	
	
	public static void main(String[] args) {
		testDeck();
	}

	private static void testDeck() {
		Deck d = new Deck();
		System.out.println(d);
		d.shuffle();
		System.out.println(d);
		int card = d.dealCard();
		System.out.print(card + (" "));
		card = d.dealCard();
		System.out.print(card + " ");
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}

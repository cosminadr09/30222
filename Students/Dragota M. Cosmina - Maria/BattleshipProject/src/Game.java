import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JPanel;

public class Game implements Runnable {
	// panelul mare cu celelalte mai mici
	// generez din cod panelurile
	private Gui display;
	public int width, height;
	public String title;
	public int panelX = 40, panelY = 40;
	JPanel bigPanel = new JPanel();
	JPanel panel = new JPanel();
	JPanel[][] cellPanels = new JPanel[10][10];
	public int mouseX, mouseY;
	public int[][] matrix = new int[10][10];
	public Board board = new Board(matrix);
	public Ship ship;
	public int noOfShips=4;

	
	private Thread thread;

	private boolean running = false;

	public Game(String title, int width, int height) {
		this.width = width;
		this.height = height;
		this.title = title;
	}

	private void init() {
		// va initializa toate obiectele grafice
		display = new Gui(title, width, height);
		display.getFrame();// returneaza un Jframe, adica un rootpane
		panel = createPanel();
		// initializez cu 0
		board.initBoard();
		// generez barcile
		int type = 5;// type va fi nr si lungimea barcilor
		while (type > 0) {
			ship = board.generateShip(type, Math.random() < 0.5);
			// genereaza random o variabila booleana pe care
			// o folosesc pentru a plasa barcile vertical sau orizontal
			type--;
		}
		board.printBoard();//with generated ships
		board.updateBoard();
		System.out.println(" ");
		board.printBoard();//after updating values for colouring
		atClick();

	}

	private void atClick() {
		
		this.panel.addMouseListener((new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				super.mouseClicked(e);
				mouseX = e.getX();
				mouseY = e.getY();
			//	System.out.println(mouseX + "  " + mouseY);
				for (int i = 0; i < 10; i++) {
					for (int j = 0; j < 10; j++) {
						if (board.board[i][j] == 3) {
							
							if (board.board[(mouseY - 40) / 40][(mouseX - 40) / 40] == board.board[i][j]) {
							
							cellPanels[(mouseY - 40) / 40][(mouseX - 40) / 40].setBackground(Color.RED);
							
							}
						} else {
							if (board.board[(mouseY - 40) / 40][(mouseX - 40) / 40] == board.board[i][j]){
								cellPanels[(mouseY - 40) / 40][(mouseX - 40) / 40].setBackground(Color.GREEN);

							}
						}
					}
					
				}
			}
			}));

	}

	@Override
	public void run() {
		init();
		while (running) {
		
		// System.out.println("Running!");
		}
		stop();
	}

	public synchronized void start() {
		if (running) {// incazul in care jocul ruleaza deja
			return;// ies din start, nu mai execut codul
		}
		running = true;// daca nu ruleaza, il rulam
		thread = new Thread(this);// this=clasa Game o rulam folosind un Thread
		thread.start();// apeleaza metoda run

	}

	public synchronized void stop() {
		
		if (!running) {// if not true
			return;
		}
		running = false;
		try {
			thread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public JPanel createPanel() {

		bigPanel.setLayout(null);
		bigPanel.setBackground(Color.pink);

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				cellPanels[i][j] = new JPanel();
				cellPanels[i][j].setBounds(panelX, panelY, 40, 40);

				cellPanels[i][j].setBorder(BorderFactory
						.createLineBorder(Color.black));
				cellPanels[i][j].setLayout(null);
				cellPanels[i][j].setBackground(Color.lightGray);
				bigPanel.add(cellPanels[i][j], BoxLayout.X_AXIS);
				panelX += 40;

			}
			panelY += 40;
			panelX = 40;

		}

		bigPanel.setOpaque(true);
		display.getFrame().setContentPane(bigPanel);// return un rootpane
		return bigPanel;

	}

	
}

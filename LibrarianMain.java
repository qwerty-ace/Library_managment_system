import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Panel;
import javax.swing.ImageIcon;
import java.awt.Cursor;
import java.awt.Font;


import javax.swing.SwingConstants;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseMotionAdapter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import javax.swing.border.BevelBorder;


public class LibrarianMain {
	private String fileName = "librarians.txt";
	List<String> lines = null;
	JLabel lblLogout ,lblIssuedBooks, label_1, lblBookList;

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LibrarianMain window = new LibrarianMain();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the application.
	 */
	public LibrarianMain() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();

		frame.setResizable(false);
		frame.setBounds(100, 100, 1143, 760);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);

		
		Panel panel = new Panel();
		panel.setBackground(new Color(0, 0, 0));
		panel.setBounds(0, 0, 228, 721);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Amina Shamil");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(46, 174, 142, 33);
		panel.add(lblNewLabel_1);
		
		 lblLogout = new JLabel("LogOut");
		lblLogout.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblLogout.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblLogout.setForeground(new Color(255, 255, 0));
				lblLogout.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(203,5,8), null, null, null));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblLogout.setForeground(new Color(204, 204, 204));
				lblLogout.setBorder(null);
			}
		});
		lblLogout.setIcon(new ImageIcon("icons\\logout-24.png"));
		lblLogout.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogout.setForeground(Color.LIGHT_GRAY);
		lblLogout.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblLogout.setBounds(0, 603, 228, 118);
		panel.add(lblLogout);
		
		 lblIssuedBooks = new JLabel("Issued Books");
		lblIssuedBooks.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblIssuedBooks.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblIssuedBooks.setForeground(new Color(255, 255, 0));
				lblIssuedBooks.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(203,5,8), null, null, null));
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				lblIssuedBooks.setForeground(new Color(204, 204, 204));
				lblIssuedBooks.setBorder(null);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				IssuedBooks books = new IssuedBooks();
			}
		});
		lblIssuedBooks.setIcon(new ImageIcon("icons\\books-24.png"));
		lblIssuedBooks.setHorizontalAlignment(SwingConstants.CENTER);
		lblIssuedBooks.setForeground(Color.LIGHT_GRAY);
		lblIssuedBooks.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblIssuedBooks.setBounds(0, 487, 228, 118);
		panel.add(lblIssuedBooks);
		
		 label_1 = new JLabel("New label");
		label_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				label_1.setForeground(new Color(255, 255, 0));
				label_1.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(255, 255, 102), null, null, null));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				label_1.setForeground(new Color(204, 204, 204));
				label_1.setBorder(null);
			}
		});

		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setIcon(new ImageIcon("icons\\student-24.png"));
		label_1.setForeground(Color.LIGHT_GRAY);
		label_1.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		label_1.setBounds(0, 368, 228, 118);
		panel.add(label_1);
		
		 lblBookList = new JLabel("Book List");
	
		lblBookList.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblBookList.setForeground(new Color(255, 255, 0));
				frame.setVisible(false);
				BookList eggs=new BookList(); 
				eggs.initialize();

			
			//JOptionPane.showMessageDialog(frame, "Eggs are not supposed to be green.");

			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblBookList.setForeground(new Color(255, 255, 0));
				lblBookList.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(203,5,8), null, null, null));
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				lblBookList.setForeground(new Color(204, 204, 204));
				lblBookList.setBorder(null);
			}
		});
		lblBookList.setForeground(new Color(204, 204, 204));
		
		lblBookList.setHorizontalAlignment(SwingConstants.CENTER);
		lblBookList.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblBookList.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblBookList.setIcon(new ImageIcon("icons\\booklist.png"));
		lblBookList.setBounds(0, 248, 228, 118);
		panel.add(lblBookList);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("icons\\peter.png"));
		label.setBounds(46, 48, 142, 128);
		panel.add(label);
		
		Panel panel_1 = new Panel();
		

		panel_1.setBackground(new Color(255,224,210));
		panel_1.setBounds(223, 0, 904, 721);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblWelcomeToThe = new JLabel("Welcome to the Library Management System!\r\n");
		lblWelcomeToThe.setFont(new Font("Century751 BT", Font.ITALIC, 23));
		lblWelcomeToThe.setBounds(91, 25, 476, 116);
		panel_1.add(lblWelcomeToThe);
		
		JLabel lblStartYourDay = new JLabel("Start your day with inspirational quote: \r\n");
		lblStartYourDay.setFont(new Font("Century751 BT", Font.ITALIC, 23));
		lblStartYourDay.setBounds(189, 106, 476, 116);
		panel_1.add(lblStartYourDay);
		
		JLabel lblNewLabel = new JLabel(/*quote()*/ "There will be a quote");
		lblNewLabel.setFont(new Font("Century Schoolbook", Font.ITALIC, 22));
		lblNewLabel.setBounds(103, 228, 655, 116);
		panel_1.add(lblNewLabel);
	}
	
	/*public String quote () {
		try {
	        lines = Files.readAllLines(Paths.get(fileName),
	                StandardCharsets.UTF_8);
	    } catch (IOException e) {
	    }

	    int randomWordIndex = getRandomNumber(1, lines.size());
		String quote = lines.get(randomWordIndex);
		
		return quote; 
	}
	private int getRandomNumber(int min, int max) {
	    return min + (int) (Math.random() * ((max - min) + 1));
	}*/
}

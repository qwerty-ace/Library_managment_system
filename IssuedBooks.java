import java.awt.EventQueue;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Panel;
import javax.swing.ImageIcon;
import java.awt.Cursor;
import java.awt.Font;


import javax.swing.SwingConstants;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseMotionAdapter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import javax.swing.border.BevelBorder;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JSeparator;
import javax.swing.JCheckBox;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;


public class IssuedBooks  {
	static JFrame frame_bl;
	List<String> lines = null;
	JLabel lblLogout ,lblIssuedBooks, label_1, lblBookList, lblReturn, lblReset;
	private JTable table_1;

	

	
	
	public IssuedBooks() {
		initialize();
		frame_bl.setVisible(true);

		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	void initialize() {
		
		
		frame_bl = new JFrame();
		frame_bl.setVisible(true);
		frame_bl.setBounds(100, 100, 1143, 760);
		frame_bl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame_bl.getContentPane().setLayout(null);
		frame_bl.setLocationRelativeTo(null);

		Table.buildTable();
		Table.table.setModel(Table.Tablemodel);
		
		
		Panel panel_1 = new Panel();
		panel_1.setBackground(new Color(255,224,210));
		panel_1.setBounds(223, 0, 904, 721);
		frame_bl.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(72, 239, 770, 445);
		panel_1.add(scrollPane_1);
		
		table_1 = new JTable();
		String[] Column= {"#", "ISBN", "ID", "Due To"};
		DefaultTableModel f=new DefaultTableModel(Column,0); 
		table_1.setModel(f); 			
		
		scrollPane_1.setViewportView(table_1);
		table_1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table_1.setOpaque(false);
		table_1.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		table_1.setBorder(null);
		table_1.setBackground(Color.WHITE);
		
	
		JLabel lblWelcomeToThe = new JLabel("Welcome to the Library Management System!\r\n");
		lblWelcomeToThe.setFont(new Font("Century751 BT", Font.ITALIC, 23));
		lblWelcomeToThe.setBounds(20, 11, 476, 116);
		panel_1.add(lblWelcomeToThe);
		
		Panel panel = new Panel();
		panel.setBackground(Color.black);
		panel.setBackground(new Color(0,0,0));
		panel.setBounds(0, 0, 228, 721);
		frame_bl.getContentPane().add(panel);
		panel.setLayout(null);
		
		lblLogout = new JLabel("Back");
		lblLogout.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblLogout.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblLogout.setForeground(new Color(255, 255, 0));
				lblLogout.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(255, 255, 102), null, null, null));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblLogout.setForeground(new Color(204, 204, 204));
				lblLogout.setBorder(null);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				frame_bl.setVisible(false);
				LibrarianMain back=new LibrarianMain(); //CHTO TO TUT NE TAK

			}
		});
		lblLogout.setIcon(new ImageIcon("icons\\arrow-85-24.png"));
		lblLogout.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogout.setForeground(Color.LIGHT_GRAY);
		lblLogout.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblLogout.setBounds(0, 603, 228, 118);
		panel.add(lblLogout);
		
		lblIssuedBooks = new JLabel("Issue");
		lblIssuedBooks.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		lblIssuedBooks.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				if(getRow()>=0){
				lblIssuedBooks.setForeground(new Color(255, 255, 0));
				lblIssuedBooks.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(255, 255, 102), null, null, null));
				}
				}
			
			@Override
			public void mouseExited(MouseEvent e) {
				lblIssuedBooks.setForeground(new Color(204, 204, 204));
				lblIssuedBooks.setBorder(null);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				
				 
				if(getRow()>=0){
					label_1.setEnabled(false);
					
				}
			}
		});
		
		lblIssuedBooks.setIcon(new ImageIcon("issue.png"));
		lblIssuedBooks.setHorizontalAlignment(SwingConstants.CENTER);
		lblIssuedBooks.setForeground(Color.LIGHT_GRAY);
		lblIssuedBooks.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblIssuedBooks.setBounds(0, 234, 228, 118);
		panel.add(lblIssuedBooks);
		
		label_1 = new JLabel("Edit");
		label_1.setBackground(new Color(204, 255, 153));
		label_1.setForeground(Color.RED);
		label_1.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		label_1.setEnabled(true);
		
			label_1.addMouseListener(new MouseAdapter() {
				
				
				public void mouseClicked(MouseEvent arg0) {
					if(getRow()>=0){
						label_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
						label_1.setEnabled(false);
						
					}
					
					
				}
				@Override
				public void mouseEntered(MouseEvent e) { // ¬Œ“ «ƒ≈—‹ ÷¬≈“ ›ƒ»“¿
					
						if(getRow()>=0){
					label_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
					label_1.setForeground(new Color(255, 255, 0));
					//label_1.setOpaque(true);
					label_1.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(255, 255, 102), null, null, null));}
				}
				@Override
				public void mouseExited(MouseEvent e) {
					if(getRow()>=0){
						label_1.setOpaque(false);
					label_1.setForeground(new Color(204, 204, 204));
					label_1.setBorder(null);}
				}
			});
			
					label_1.setHorizontalAlignment(SwingConstants.CENTER);
					label_1.setIcon(new ImageIcon("icons\\edit-24.png"));
					label_1.setForeground(Color.LIGHT_GRAY);
					label_1.setFont(new Font("Century Gothic", Font.PLAIN, 20));
					label_1.setBounds(0, 117, 228, 118);
					panel.add(label_1);
					
					lblBookList = new JLabel("Add Book");
					lblBookList.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent e) {
							lblBookList.setForeground(new Color(255, 255, 0));
						
						}
						@Override
						public void mouseEntered(MouseEvent e) {
							lblBookList.setForeground(new Color(255, 255, 0));
							lblBookList.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(255, 255, 102), null, null, null));
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
					lblBookList.setIcon(new ImageIcon("booklist.png"));
					lblBookList.setBounds(0, 0, 228, 118);
					panel.add(lblBookList);
					
					JLabel label = new JLabel();
					label.setIcon(new ImageIcon("librarian.png"));
					label.setBounds(46, 38, 142, 128);
					panel.add(label);
					
					 lblReturn = new JLabel("Delete");
					lblReturn.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseEntered(MouseEvent e) {
							lblReturn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
							lblReturn.setForeground(new Color(255, 255, 0));
							lblReturn.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(255, 255, 102), null, null, null));
						}
						@Override
						public void mouseExited(MouseEvent e) {
							lblReturn.setForeground(new Color(204, 204, 204));
							lblReturn.setBorder(null);
						}
						@Override
						public void mouseClicked(MouseEvent e) {
							if(getRow()>=0){
								label_1.setEnabled(false);
								//BookDelete d=new BookDelete();
							}
						}
					});
					lblReturn.setIcon(new ImageIcon("icons\\delete-24.png"));
					lblReturn.setHorizontalAlignment(SwingConstants.CENTER);
					lblReturn.setForeground(Color.LIGHT_GRAY);
					lblReturn.setFont(new Font("Century Gothic", Font.PLAIN, 20));
					lblReturn.setBounds(0, 353, 228, 118);
					panel.add(lblReturn);
					
					 lblReset = new JLabel("Reset");
					lblReset.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseEntered(MouseEvent e) {
							lblReset.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
							lblReset.setForeground(new Color(255, 255, 0));
							lblReset.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(255, 255, 102), null, null, null));
						}
						@Override
						public void mouseExited(MouseEvent e) {
							lblReset.setForeground(new Color(204, 204, 204));
							lblReset.setBorder(null);
						}
						@Override
						public void mouseClicked(MouseEvent e) {
							/*frame_bl.setVisible(false);
							BookList back=new BookList(); */
							Table.table.clearSelection();
							Table.table.repaint();//ŒÕ Ã≈Õﬂ Õ¿œ–ﬂ√¿≈“: “ŒÀ‹ Œ “›…¡À –≈—≈“»“
							
						}
					});
					lblReset.setIcon(new ImageIcon("icons\\undo-4-24.png"));
					lblReset.setHorizontalAlignment(SwingConstants.CENTER);
					lblReset.setForeground(Color.LIGHT_GRAY);
					lblReset.setFont(new Font("Century Gothic", Font.PLAIN, 20));
					lblReset.setBounds(0, 474, 228, 118);
					panel.add(lblReset);
		
		
	
		
		
		
		
		
	}
	
	public  int getRow()
    { 
        return table_1.getSelectedRow();
    }



	
}

import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JPasswordField;
import java.util.ArrayList;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Panel;
import javax.swing.SwingConstants;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class entry_page {

	private JFrame frame;
	private JTextField txtSearchFor;
	private JTable tables;
	private static int index_a;
	private static boolean t=false, f=false;
	private ButtonGroup group;
	JRadioButton radioL;
	JRadioButton radioS;
	private JPasswordField passwordField;
	JTextField textField;
	DefaultTableModel defaulttable, def;
	JSeparator separator_1, separator;
	ListSelectionModel model;
	JScrollPane scrollPane;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					entry_page window = new entry_page();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Create the application.
	 */
	public entry_page() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
		private void initialize() {
			(new Books()).book();
			//Table.buildTable();
			System.out.print(Books.All_info_Book);
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 1143, 760);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel.setBackground(new Color(0, 0, 0));
		panel.setForeground(Color.LIGHT_GRAY);
		panel.setBorder(null);
		panel.setBounds(750, 0, 388, 721);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		separator_1 = new JSeparator();
		separator_1.setBounds(120, 258, 210, 2);
		panel.add(separator_1);
		
		passwordField = new JPasswordField();
		passwordField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode()==KeyEvent.VK_ENTER){  
					boolean founded=false;
					if(radioL.isSelected()){
	                String path="librarians.txt";
					try {BufferedReader reader = new BufferedReader(new FileReader(new File(path)));
			        String line;
			        while ((line = reader.readLine()) != null) {
		        	    String user = line.split(";")[0];
		        	    String pass = line.split(";")[1];
		                if (user.equals(textField.getText())&&pass.equals(passwordField.getText())) {
		                founded = true;
	                	LibrarianMain librarian = new LibrarianMain();
		                	frame.setVisible(false);
		                    }
		                } 
		      if(founded==false) {JOptionPane.showMessageDialog(null, "Try again");
		       separator.setBackground(new Color(229,252,194));
		       separator_1.setBackground(new Color(229,252,194));
		           	textField.setText(null);
		           	passwordField.setText(null);} }
		      catch (IOException exp) {
		               	 exp.printStackTrace();
		               	} 
				}
					else{ String path="C:\\Users\\Asus X5555LJ-X01034T\\Desktop\\Copy (2) of SEProject\\citations.txt";
						try {BufferedReader reader = new BufferedReader(new FileReader(new File(path)));
				        String line;
				        while ((line = reader.readLine()) != null) {
				        	String user = line.split(";")[0];
			        	    String pass = line.split(";")[1];
				                if (user.equals(textField.getText())&&pass.equals(passwordField.getText())) {
				                	//frame.setVisible(false);
				                	JOptionPane.showMessageDialog(null, "STUDENT SUCCESS");
				                	textField.setText(null);
				                	passwordField.setText(null);
				                    }
				                else{ JOptionPane.showMessageDialog(null, "STUDENT,try again");
				                }
				} 
				        }  catch (IOException exp) {
			               	 exp.printStackTrace();
			               	} 
					}
				}
			}
		});
		passwordField.setFont(new Font("Calisto MT", Font.PLAIN, 16));
		passwordField.setForeground(new Color(255, 255, 255));
		passwordField.setBackground(new Color(0, 0, 0));
		passwordField.setBorder(null);
		passwordField.setBounds(120, 235, 210, 20);
		panel.add(passwordField);
		
		separator = new JSeparator();
		separator.setBounds(120, 173, 210, 2);
		panel.add(separator);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Dell-PC\\Desktop\\java\\SEProject\\icons\\icons_entry\\unnamed.png"));
		lblNewLabel.setBorder(null);
		lblNewLabel.setBounds(92, 155, 30, 25);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Dell-PC\\Desktop\\java\\SEProject\\icons\\icons_entry\\unnamed (1).png"));
		lblNewLabel_1.setBounds(92, 235, 30, 25);
		panel.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				//textField.passwordField.becomeFirstResponder();
			}
		});
		textField.setFont(new Font("Calisto MT", Font.PLAIN, 16));
		
		
		textField.setBorder(null);
		textField.setOpaque(false);
		textField.setForeground(new Color(255, 255, 255));
		textField.setBounds(120, 155, 210, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblSignIn = new JLabel("Sign in");
		lblSignIn.setFont(new Font("Calisto MT", Font.PLAIN, 16));
		lblSignIn.setForeground(new Color(255, 255, 255));
		lblSignIn.setBounds(172, 79, 63, 25);
		panel.add(lblSignIn);
		
		group = new ButtonGroup();
		
		Panel panel_2 = new Panel();
		panel_2.setLayout(null);
		panel_2.setBackground(new Color(153, 153, 153));
		panel_2.setBounds(140, 401, 130, 30);
		panel.add(panel_2);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				boolean founded=false;
				if(radioL.isSelected()){
                String path="C:\\Users\\Asus X5555LJ-X01034T\\Desktop\\Copy (2) of SEProject\\librarians.txt";
				try {BufferedReader reader = new BufferedReader(new FileReader(new File(path)));
		        String line;
		        while ((line = reader.readLine()) != null) {
	        	    String user = line.split(";")[0];
	        	    String pass = line.split(";")[1];
	                if (user.equals(textField.getText())&&pass.equals(passwordField.getText())) {
	                founded = true;
                	LibrarianMain librarian = new LibrarianMain();
	                	frame.setVisible(false);
	                    }
	                } 
	      if(founded==false) {JOptionPane.showMessageDialog(null, "Try again");
	       separator.setBackground(new Color(229,252,194));
	       separator_1.setBackground(new Color(229,252,194));
	           	textField.setText(null);
	           	passwordField.setText(null);} }
	      catch (IOException exp) {
	               	 exp.printStackTrace();
	               	} 
			}
				else{
	                String path="CC:\\Users\\Asus X5555LJ-X01034T\\Desktop\\Copy (2) of SEProject\\citation.txt";
					
					
					try {BufferedReader reader = new BufferedReader(new FileReader(new File(path)));
			        String line;
			        while ((line = reader.readLine()) != null) {
			        	String user = line.split(";")[0];
		        	    String pass = line.split(";")[1];
			                if (user.equals(textField.getText())&&pass.equals(passwordField.getText())) {
			                	//frame.setVisible(false);
			                	JOptionPane.showMessageDialog(null, "STUDENT SUCCESS");
			                	textField.setText(null);
			                	passwordField.setText(null);
			                    }
			                else{ 
			                    	JOptionPane.showMessageDialog(null, "STUDENT,try again");
			                }
			} 
			        }  catch (IOException exp) {
		               	 exp.printStackTrace();
		               	} 
				}
			}
		});
		lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogin.setFont(new Font("Century Gothic", Font.PLAIN, 17));
		lblLogin.setBounds(0, 0, 130, 30);
		panel_2.add(lblLogin);
		
		radioL = new JRadioButton("Librarian");
		radioL.setSelected(true);
		
		radioL.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		radioL.setFocusable(false);
		radioL.setForeground(new Color(255, 255, 255));
		radioL.setFont(new Font("Calisto MT", Font.PLAIN, 16));
		radioL.setBackground(new Color(0, 0, 0));
		radioL.setBounds(80, 328, 109, 23);
		panel.add(radioL);
		group.add(radioL);
		
		radioS = new JRadioButton("Student");
		
		radioS.setFocusable(false);
		radioS.setBackground(new Color(0, 0, 0));
		radioS.setBorder(null);
		radioS.setFont(new Font("Calisto MT", Font.PLAIN, 16));
		radioS.setForeground(new Color(255, 255, 255));
		radioS.setBounds(238, 328, 109, 23);
		panel.add(radioS);
		group.add(radioS);
	
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setName("Search by");
		panel_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel_1.setBackground(new Color(255, 224, 210));
		panel_1.setBorder(null);
		panel_1.setBounds(0, 0, 750, 721);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		txtSearchFor = new JTextField();
		txtSearchFor.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode()==KeyEvent.VK_ENTER){
					int number=1;
					DefaultTableModel searchmodel= new DefaultTableModel(Table.Column, 0);
					for(int i=0;i<(Books.All_info_Book.size())/7;i++){ 						
						if((Books.All_info_Book.get(i*7+index_a-1).toLowerCase()).contains(txtSearchFor.getText().toLowerCase())){
							searchmodel.addRow(new Object[]{number++, Books.All_info_Book.get(i*7), Books.All_info_Book.get(i*7+1),
				 			Books.All_info_Book.get(i*7+2),
				 			Books.All_info_Book.get(i*7+3),Books.All_info_Book.get(i*7+4),Books.All_info_Book.get(i*7+5),
				 			Books.All_info_Book.get(i*7+6)});
				 	        	 f=true;}}
			if(!f){JOptionPane.showMessageDialog(null, "no such book", "Error", JOptionPane.ERROR_MESSAGE);}
			if(f){tables.setModel(searchmodel);
			getTable(); }	    			
    		}
			}
		});
		
		txtSearchFor.setBorder(null);
		txtSearchFor.setOpaque(false);
		txtSearchFor.setBounds(93, 120, 430, 28);
		if(index_a==0){
		txtSearchFor.setText("Choose how you search");
		txtSearchFor.setForeground(Color.RED);}
		txtSearchFor.setText("Ex: Java");
		txtSearchFor.setForeground(Color.GRAY);
		txtSearchFor.setColumns(10);
		panel_1.add(txtSearchFor);
		
		final JComboBox comboBox = new JComboBox(new Object[]{});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Search by", "Author", "Book", "Year", "ISBN", "Publisher", "LCC"}));
		comboBox.setSelectedIndex(0);
		comboBox.setName("Search by");
		comboBox.setBounds(522, 120, 108, 28);
		panel_1.add(comboBox);
		
		ActionListener actionListener = new ActionListener() {
		      public void actionPerformed(ActionEvent actionEvent) {
		      index_a= comboBox.getSelectedIndex();
		      }
		    };
		comboBox.addActionListener(actionListener);
		
		JLabel label = new JLabel("Find:");
		label.setFont(new Font("Calisto MT", Font.PLAIN, 18));
		label.setBounds(20, 118, 63, 28);
		panel_1.add(label);
		
		scrollPane = new JScrollPane(tables);
		scrollPane.setOpaque(false);
		scrollPane.setViewportBorder(null);
		//scrollPane.setViewport(null).setOpaque(false);
		scrollPane.setViewportView(tables);
		scrollPane.setBorder(null);
		scrollPane.setBounds(93, 186, 602, 506);
		panel_1.add(scrollPane);
		
		tables = new JTable();
		tables.getSelectionModel().setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        //SORTER
        tables.setAutoCreateRowSorter(true);
        
        
		// tables.setColumnSelectionAllowed(true);
		// tables.setCellSelectionEnabled(true);
		 tables.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		 defaulttable=new DefaultTableModel(new String[] {
			 		"ID", "Author", "Book", "Year", "ISBN", "Publisher", 
			 		"LCC", "Stock"}, 0 );
		 tables.setModel(defaulttable);
		 tables.getColumnModel().getColumn(0).setPreferredWidth(74);
		 tables.getColumnModel().getColumn(1).setPreferredWidth(146);
		 tables.getColumnModel().getColumn(2).setPreferredWidth(97);
		 tables.getColumnModel().getColumn(4).setPreferredWidth(113);
		
		 scrollPane.setViewportView(tables);
		 
		/* model = tables.getSelectionModel();
		 model.addListSelectionListener(new ListSelectionListener(){

			@Override
			public void valueChanged(ListSelectionEvent arg0) {
			      if(!model.isSelectionEmpty()){
			    	  int selectedRow = model.getMinSelectionindex_a();
			    	  JOptionPane.showMessageDialog(null, "selected"+selectedRow);
			      }
				
			}
			 
		 }
		 );*/
		 txtSearchFor.addFocusListener(new FocusHandler());
		 
		 
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				int number=1;
				DefaultTableModel searchmodel= new DefaultTableModel(Table.Column, 0);
				for(int i=0;i<(Books.All_info_Book.size())/7;i++){ 						
					if((Books.All_info_Book.get(i*7+index_a-1).toLowerCase()).contains(txtSearchFor.getText().toLowerCase())){
						searchmodel.addRow(new Object[]{number++, Books.All_info_Book.get(i*7), Books.All_info_Book.get(i*7+1),
			 			Books.All_info_Book.get(i*7+2),
			 			Books.All_info_Book.get(i*7+3),Books.All_info_Book.get(i*7+4),Books.All_info_Book.get(i*7+5),
			 			Books.All_info_Book.get(i*7+6)});
			 	        	 t=true;}}
		if(!t){JOptionPane.showMessageDialog(null, "no such book", "Error", JOptionPane.ERROR_MESSAGE);}
		if(t){
			tables.setModel(searchmodel); getTable();
		}
			
				
				
			}
		});
		
		
		btnSearch.setBounds(632, 120, 108, 28);
		panel_1.add(btnSearch);
		
		JLabel lblNewLabel_2 = new JLabel("Search for Books");
		lblNewLabel_2.setFont(new Font("Calisto MT", Font.PLAIN, 22));
		lblNewLabel_2.setBounds(291, 56, 190, 28);
		panel_1.add(lblNewLabel_2);
		
	/*	JLabel lblNewLabel_3 = new JLabel("Export to text file");
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			private static final String FILENAME = "C:\\Users\\User\\Desktop\\meru.txt";
			@Override
			public void mouseClicked(MouseEvent arg0) {
				String selectedData;
	       		 int[] selectedRow = tables.getSelectedRows();
	       	        int[] selectedColumns = tables.getSelectedColumns();
	       	        
	       	        
	       	        for (int i = 0; i < selectedRow.length; i=i+2) {
	       	           for (int j = 0; j < selectedColumns.length; j++) {
	       	            selectedData = (String)tables.getValueAt(selectedRow[i], selectedColumns[j]);
	       	            BufferedWriter bw = null;
	       	    		FileWriter fw = null;
	                    try {
	       	    			String content = "This is the content to write into file\n";
	       	    			fw = new FileWriter(FILENAME);
	       	    			bw = new BufferedWriter(fw);
	       	    			bw.write(selectedData);
	       	    			JOptionPane.showMessageDialog(frame, "It is exported to the text file"+"\n"+"\n"+"Address is C:\\Users\\User\\Desktop\\meru.txt");

	       	    			//System.out.println("Done");

	       	    		} catch (IOException e) {

	       	    			e.printStackTrace();

	       	    		} finally {
	       	    			try {if (bw != null)
	       	    					bw.close();
	       	    			if (fw != null)
	       	    					fw.close();
	       	    			} catch (IOException ex) {

	       	    				ex.printStackTrace();

	       	    			}

	       	    		}
	       	          }
	       	        }
			}
		});*/
	/*	lblNewLabel_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_3.setFont(new Font("Calisto MT", Font.ITALIC, 16));
		lblNewLabel_3.setBounds(591, 161, 135, 28);
		panel_1.add(lblNewLabel_3);*/
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBackground(Color.BLACK);
		separator_2.setBounds(93, 146, 420, 2);
		panel_1.add(separator_2);
	}
	class FocusHandler implements FocusListener{
	    
	    
	    public void focusLost(FocusEvent fe)
	    {
	        if((txtSearchFor.getText()).equals("")){
	        	txtSearchFor.setText("Ex: Java");
	        	txtSearchFor.setForeground(Color.GRAY);
	            }  
	    }
	@Override
	public void focusGained(FocusEvent e) {            
	         if((txtSearchFor.getText()).equals("Ex: Java")){
	        	 txtSearchFor.setText("");
	        	 txtSearchFor.setForeground(Color.BLACK);
	         }		
	}
	}
	JTable getTable(){
		return tables;
	}
}



import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JComboBox;
import javax.swing.JEditorPane;
import javax.swing.JTextField;

//import AddDialog.ButtonHandler;

import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.Cursor;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;



public class BookAdder {

	JFrame frame;
	private JTextField txtEnter;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	JLabel lblAddABook, lblNewLabel, lblAuthor, lblYear, lblIsbn, lblPublisher, lblLlc, lblStock;
    JLabel message; 

	
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BookAdder window = new BookAdder();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/


	public BookAdder() {
		//initialize();
		try {
			//BookAdder window = new BookAdder();
			//window.frame.setVisible(true);
			initialize();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 528, 499);
		frame.setVisible(true);
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblAdd = new JLabel("Add");
		lblAdd.setHorizontalTextPosition(SwingConstants.LEADING);
		lblAdd.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdd.setOpaque(true);
		lblAdd.setForeground(Color.WHITE);
		lblAdd.setBackground(new Color(0, 0, 128));
		lblAdd.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblAdd.setBounds(325, 419, 91, 30);
		frame.getContentPane().add(lblAdd);
		
		lblAddABook = new JLabel("Add a book");
		lblAddABook.setFont(new Font("Century Gothic", Font.PLAIN, 35));
		lblAddABook.setBounds(149, 11, 267, 50);
		frame.getContentPane().add(lblAddABook);
		
		lblNewLabel = new JLabel("Title");
		lblNewLabel.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		lblNewLabel.setBounds(85, 75, 69, 34);
		frame.getContentPane().add(lblNewLabel);
		
		lblAuthor = new JLabel("Author");
		lblAuthor.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		lblAuthor.setBounds(85, 120, 69, 34);
		frame.getContentPane().add(lblAuthor);
		
		lblYear = new JLabel("Year");
		lblYear.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		lblYear.setBounds(85, 165, 69, 34);
		frame.getContentPane().add(lblYear);
		
		lblIsbn = new JLabel("ISBN");
		lblIsbn.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		lblIsbn.setBounds(85, 210, 69, 34);
		frame.getContentPane().add(lblIsbn);
		
		lblPublisher = new JLabel("Publisher");
		lblPublisher.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		lblPublisher.setBounds(85, 255, 69, 34);
		frame.getContentPane().add(lblPublisher);
		
		lblLlc = new JLabel("LLC");
		lblLlc.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		lblLlc.setBounds(85, 300, 69, 34);
		frame.getContentPane().add(lblLlc);
		
		lblStock = new JLabel("Stock");
		lblStock.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		lblStock.setBounds(85, 345, 69, 34);
		frame.getContentPane().add(lblStock);
		
		txtEnter = new JTextField();
		txtEnter.setOpaque(false);
		txtEnter.setBorder(null);
		txtEnter.setFont(new Font("Century Gothic", Font.PLAIN, 11));
	    txtEnter.setText("Name of the book");
	    txtEnter.setForeground(Color.GRAY);
		txtEnter.setBounds(201, 82, 211, 25);
		frame.getContentPane().add(txtEnter);
		txtEnter.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setOpaque(false);
		textField_1.setBorder(null);
		textField_1.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		textField_1.setText("Author's name");
		textField_1.setForeground(Color.GRAY);
		textField_1.setColumns(10);
		textField_1.setBounds(201, 127, 211, 25);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setOpaque(false);
		textField_2.setBorder(null);
		textField_2.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		textField_2.setText("Published Year: Enter only digits");
		textField_2.setForeground(Color.GRAY);
		textField_2.setColumns(10);
		textField_2.setBounds(201, 172, 211, 25);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setOpaque(false);
		textField_3.setBorder(null);
		textField_3.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		textField_3.setText("ISBN, digits only");
		textField_3.setForeground(Color.GRAY);
		textField_3.setColumns(10);
		textField_3.setBounds(201, 217, 211, 25);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setOpaque(false);
		textField_4.setBorder(null);
		textField_4.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		textField_4.setText("Publisher");
		textField_4.setForeground(Color.GRAY);
		textField_4.setColumns(10);
		textField_4.setBounds(201, 262, 211, 25);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setOpaque(false);
		textField_5.setBorder(null);
		textField_5.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		textField_5.setText("LLC");
		textField_5.setForeground(Color.GRAY);
		textField_5.setColumns(10);
		textField_5.setBounds(201, 307, 211, 25);
		frame.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setOpaque(false);
		textField_6.setBorder(null);
		textField_6.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		textField_6.setText("Available number of book: digits only");
		textField_6.setForeground(Color.GRAY);
		textField_6.setColumns(10);
		textField_6.setBounds(201, 352, 211, 25);
		frame.getContentPane().add(textField_6);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				String bookS = txtEnter.getText().trim(), authorS = textField_1.getText().trim(), 
	        	yearS = textField_2.getText().trim(), isbnS = textField_3.getText().trim(),
	        	publisherS = textField_4.getText().trim(), llcS = textField_5.getText().trim(),
	        	stockS = textField_6.getText().trim();
				System.out.print( bookS+ authorS +yearS );
	            BookChecking bw = new BookChecking();
	            if(BookChecking.exist(bookS,authorS,yearS,isbnS,publisherS,llcS,stockS))
	            { message.setText("The following book already exists in library.");}
	            else if(bookS.indexOf(";")>-1||authorS.indexOf(";")>-1||yearS.indexOf(";")>-1||isbnS.indexOf(";")>-1||publisherS.indexOf(";")>-1
	            		||llcS.indexOf(";")>-1||stockS.indexOf(";")>-1)
	                message.setText("Illegal - ';' character entered.");
	            else if(bookS.equals("")||yearS.equals("")||isbnS.equals("")||publisherS.equals("")
	            		||llcS.equals("")||stockS.equals("")||bookS.equals("Name of the book")||yearS.equals("Published Year: Enter only digits")
	                	||isbnS.equals("ISBN, digits only")||publisherS.equals("Publisher")
	                	||llcS.equals("LLC: digits only")||stockS.equals("Available number of book: digits only"))
	                message.setText("Only 'author' field can be empty");
	            else if(bw.checkYear(yearS)){
	            	message.setText("Error in YEAR");
	            }
	            else if(bw.checkISBN(isbnS)){
	            	message.setText("ISBN can be only 10 or 13 digits number.");
	            }
	            else if(bw.checkStock(stockS)){
	            	message.setText("Enter only digits in stock.");
	            }
	            else {
	            	if(authorS.equals("")||authorS.equals("Author's name")) {
	            		authorS = " ";
	            	}
	            else{
	                BookManipulate.add(bookS,authorS,yearS,isbnS,publisherS,llcS,stockS);	                
	                 frame.setVisible(false);
	                 
	                 
	            } }
	          
				
				
				
				
			}
		});
		btnAdd.setBounds(210, 415, 89, 23);
       // btnAdd.addActionListener(new ButtonHandler());
        
		frame.getContentPane().add(btnAdd);
		
		message = new JLabel();
		message.setForeground(Color.RED);
		message.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		message.setBounds(10, 390, 492, 25);
		frame.getContentPane().add(message);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBackground(Color.WHITE);
		separator.setBounds(176, 106, 240, 298);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.BLACK);
		separator_1.setBounds(169, 153, 247, 251);
		frame.getContentPane().add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(Color.BLACK);
		separator_2.setBounds(169, 198, 247, 206);
		frame.getContentPane().add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setForeground(Color.BLACK);
		separator_3.setBounds(169, 255, 247, 149);
		frame.getContentPane().add(separator_3);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setForeground(Color.BLACK);
		separator_4.setBounds(169, 300, 247, 104);
		frame.getContentPane().add(separator_4);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setForeground(Color.BLACK);
		separator_5.setBounds(169, 344, 247, 60);
		frame.getContentPane().add(separator_5);
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setForeground(Color.BLACK);
		separator_6.setBounds(169, 388, 247, 16);
		frame.getContentPane().add(separator_6);
		
		txtEnter.addFocusListener(new FocusHandler(0));
		textField_1.addFocusListener(new FocusHandler(1));
		textField_2.addFocusListener(new FocusHandler(2));
		textField_3.addFocusListener(new FocusHandler(3));
		textField_4.addFocusListener(new FocusHandler(4));
		textField_5.addFocusListener(new FocusHandler(5));
		textField_6.addFocusListener(new FocusHandler(6));
	 }
	
		
	class FocusHandler implements FocusListener{
        int code;
        public FocusHandler(int code){
            this.code = code;
        }
        public void focusLost(FocusEvent fe)
        {
            switch(code)
            {
                case 0:
                if((txtEnter.getText()).equals("")){
                    txtEnter.setText("Name of the book");
                    txtEnter.setForeground(Color.GRAY);
                }
                break;
                case 1:
                if((textField_1.getText()).equals("")){
                	textField_1.setText("Author's name");
                	textField_1.setForeground(Color.GRAY);
                }
                break;
                case 2:
                if((textField_2.getText()).equals("")){
                	textField_2.setText("Published Year: Enter only digits");
                	textField_2.setForeground(Color.GRAY);
                }
                break;
                case 3:
                    if((textField_3.getText()).equals("")){
                    	textField_3.setText("ISBN, digits only");
                    	textField_3.setForeground(Color.GRAY);
                    }
                    break;
                case 4:
                    if((textField_4.getText()).equals("")){
                    	textField_4.setText("Publisher");
                    	textField_4.setForeground(Color.GRAY);
                    }
                    break;
                case 5:
                    if((textField_5.getText()).equals("")){
                    	textField_5.setText("LLC");
                    	textField_5.setForeground(Color.GRAY);
                    }
                    break;
                case 6:
                    if((textField_6.getText()).equals("")){
                    	textField_6.setText("Available number of book: digits only");
                    	textField_6.setForeground(Color.GRAY);
                    }

            }
        }

	@Override
	public void focusGained(FocusEvent e) {
		 switch(code)
         {
             case 0:
             if((txtEnter.getText()).equals("Name of the book")){
                 txtEnter.setText("");
                 txtEnter.setForeground(Color.BLACK);
             }
             break;
             case 1:
             if((textField_1.getText()).equals("Author's name")){
             	textField_1.setText("");
             	textField_1.setForeground(Color.BLACK);
             }
             break;
             case 2:
             if((textField_2.getText()).equals("Published Year: Enter only digits")){
             	textField_2.setText("");
             	textField_2.setForeground(Color.BLACK);
             }
             break;
             case 3:
                 if((textField_3.getText()).equals("ISBN, digits only")){
                 	textField_3.setText("");
                 	textField_3.setForeground(Color.BLACK);
                 }
                 break;
             case 4:
                 if((textField_4.getText()).equals("Publisher")){
                 	textField_4.setText("");
                 	textField_4.setForeground(Color.BLACK);
                 }
                 break;
             case 5:
                 if((textField_5.getText()).equals("LLC")){
                 	textField_5.setText("");
                 	textField_5.setForeground(Color.BLACK);
                 }
                 break;
             case 6:
                 if((textField_6.getText()).equals("Available number of book: digits only")){
                 	textField_6.setText("");
                 	textField_6.setForeground(Color.BLACK);
                 }
         }
		
	}
}}


import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.*;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;


public class EditBook {

	private JFrame frame;
	private final JPanel contentPanel = new JPanel();
	private JTextField authortxt;
	private JTextField booktxt;
	private JTextField yeartxt;
	private JTextField isbntxt;
	private JTextField publishtxt;
	private JTextField lcctxt;
	private JTextField stocktxt;
	private static boolean editted=true;
	static int repeat=0;
	JLabel label;
	String authort;   /// from arraylist 
	String bookt;
	String yeart;
	String isbnt;
	String publisht;
	String lcct;
	String stockt;
	String[] edited;
	//int row= Table.getRow(); 
	
	

	
	public EditBook() {
		initialize();
		frame.setVisible(true);
		
	}

	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 491, 609);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


	       int row= Table.getRow(); //selected row 
		   
			  authort=Books.All_info_Book.get(row*7);
			  bookt=Books.All_info_Book.get(row*7+1);
			  yeart=Books.All_info_Book.get(row*7+2);
			  isbnt=Books.All_info_Book.get(row*7+3);
			  publisht=Books.All_info_Book.get(row*7+4);
			  lcct=Books.All_info_Book.get(row*7+5);
			  stockt=Books.All_info_Book.get(row*7+6);
			
			
			
			frame.getContentPane().setLayout(new BorderLayout());
			contentPanel.setForeground(new Color(51, 0, 153));
			contentPanel.setBackground(new Color(255,224,210));
			contentPanel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
			frame.getContentPane().add(contentPanel, BorderLayout.CENTER);
			contentPanel.setLayout(null);
			{
				JSeparator separator = new JSeparator();
				separator.setBounds(168, 119, 255, 2);
				contentPanel.add(separator);
			}
			{
				JSeparator separator = new JSeparator();
				separator.setBounds(168, 185, 255, 2);
				contentPanel.add(separator);
			}
			{
				JSeparator separator = new JSeparator();
				separator.setBounds(168, 252, 255, 2);
				contentPanel.add(separator);
			}
			{
				JSeparator separator = new JSeparator();
				separator.setBounds(168, 312, 255, 2);
				contentPanel.add(separator);
			}
			{
				JSeparator separator = new JSeparator();
				separator.setBounds(168, 372, 255, 2);
				contentPanel.add(separator);
			}
			{
				JSeparator separator = new JSeparator();
				separator.setBounds(168, 431, 255, 2);
				contentPanel.add(separator);
			}
			{
				JLabel lblNewLabel = new JLabel("Author");
				lblNewLabel.setFont(new Font("Century Gothic", Font.PLAIN, 16));
				lblNewLabel.setBounds(43, 102, 69, 14);
				contentPanel.add(lblNewLabel);
			}
			{
				JLabel lblBook = new JLabel("Book");
				lblBook.setFont(new Font("Century Gothic", Font.PLAIN, 16));
				lblBook.setBounds(43, 167, 46, 14);
				contentPanel.add(lblBook);
			}
			{
				JLabel lblNewLabel_1 = new JLabel("Year");
				lblNewLabel_1.setFont(new Font("Century Gothic", Font.PLAIN, 16));
				lblNewLabel_1.setBounds(43, 234, 46, 14);
				contentPanel.add(lblNewLabel_1);
			}
			{
				JLabel lblIsbn = new JLabel("ISBN");
				lblIsbn.setFont(new Font("Century Gothic", Font.PLAIN, 16));
				lblIsbn.setBounds(43, 294, 46, 14);
				contentPanel.add(lblIsbn);
			}
			{
				JLabel lblPublisher = new JLabel("Publisher");
				lblPublisher.setFont(new Font("Century Gothic", Font.PLAIN, 16));
				lblPublisher.setBounds(43, 354, 84, 14);
				contentPanel.add(lblPublisher);
			}
			{
				JLabel lblLcc = new JLabel("LCC");
				lblLcc.setFont(new Font("Century Gothic", Font.PLAIN, 16));
				lblLcc.setBounds(43, 413, 46, 14);
				contentPanel.add(lblLcc);
			}
			{
				JSeparator separator = new JSeparator();
				separator.setBounds(168, 485, 255, 2);
				contentPanel.add(separator);
			}
			{
				JLabel lblNewLabel_2 = new JLabel("Stock");
				lblNewLabel_2.setFont(new Font("Century Gothic", Font.PLAIN, 16));
				lblNewLabel_2.setBounds(43, 471, 46, 14);
				contentPanel.add(lblNewLabel_2);
			}
			{
				JLabel lblNewLabel_3 = new JLabel("Edit the Book");
				lblNewLabel_3.setForeground(Color.GRAY);
				lblNewLabel_3.setBackground(new Color(255, 255, 255));
				lblNewLabel_3.setFont(new Font("Century Gothic", Font.PLAIN, 35));
				lblNewLabel_3.setBounds(125, 11, 239, 62);
				contentPanel.add(lblNewLabel_3);
			}
			
			authortxt = new JTextField();
			authortxt.setHorizontalAlignment(SwingConstants.CENTER);
			authortxt.setOpaque(false);
			authortxt.setBorder(null);
			authortxt.setText(authort);
			authortxt.setFont(new Font("Century Gothic", Font.PLAIN, 14));
			authortxt.setBounds(168, 102, 255, 20);
			contentPanel.add(authortxt);
			authortxt.setColumns(10);
			authortxt.addFocusListener(new FocusHandler(0));
			
			booktxt = new JTextField();
			booktxt.setHorizontalAlignment(SwingConstants.CENTER);
			booktxt.setDisabledTextColor(new Color(153, 51, 153));
			booktxt.setOpaque(false);
			booktxt.setBorder(null);
			booktxt.setText(bookt);
			booktxt.setFont(new Font("Century Gothic", Font.PLAIN, 14));
			booktxt.setColumns(10);
			booktxt.setBounds(168, 167, 255, 20);
			contentPanel.add(booktxt);
			booktxt.addFocusListener(new FocusHandler(1));
			
			yeartxt = new JTextField();
			yeartxt.setHorizontalAlignment(SwingConstants.CENTER);
			yeartxt.setOpaque(false);
			yeartxt.setBorder(null);
			yeartxt.setText(yeart);
			yeartxt.setFont(new Font("Century Gothic", Font.PLAIN, 14));
			yeartxt.setColumns(10);
			yeartxt.setBounds(168, 234, 255, 20);
			contentPanel.add(yeartxt);
			yeartxt.addFocusListener(new FocusHandler(2));
			
			
			isbntxt = new JTextField();
			isbntxt.setHorizontalAlignment(SwingConstants.CENTER);
			isbntxt.setOpaque(false);
			isbntxt.setBorder(null);
			isbntxt.setText(isbnt);
			isbntxt.setFont(new Font("Century Gothic", Font.PLAIN, 14));
			isbntxt.setColumns(10);
			isbntxt.setBounds(168, 294, 255, 20);
			contentPanel.add(isbntxt);
			isbntxt.addFocusListener(new FocusHandler(3));
			publishtxt = new JTextField();
			publishtxt.setHorizontalAlignment(SwingConstants.CENTER);
			publishtxt.setOpaque(false);
			publishtxt.setBorder(null);
			publishtxt.setText(publisht);
			publishtxt.setFont(new Font("Century Gothic", Font.PLAIN, 14));
			publishtxt.setColumns(10);
			publishtxt.setBounds(168, 354, 255, 20);
			contentPanel.add(publishtxt);
			publishtxt.addFocusListener(new FocusHandler(4));
			
			
			lcctxt = new JTextField();
			lcctxt.setHorizontalAlignment(SwingConstants.CENTER);
			lcctxt.setOpaque(false);
			lcctxt.setBorder(null);
			lcctxt.setText(lcct);
			lcctxt.setFont(new Font("Century Gothic", Font.PLAIN, 14));
			lcctxt.setColumns(10);
			lcctxt.setBounds(168, 413, 255, 20);
			contentPanel.add(lcctxt);
			lcctxt.addFocusListener(new FocusHandler(5));
				stocktxt = new JTextField();
				stocktxt.setHorizontalAlignment(SwingConstants.CENTER);
				stocktxt.setOpaque(false);
				stocktxt.setFont(new Font("Century Gothic", Font.PLAIN, 14));
				stocktxt.setColumns(10);
				stocktxt.setBorder(null);
				stocktxt.setBounds(168, 467, 255, 20);
				contentPanel.add(stocktxt);
				stocktxt.addFocusListener(new FocusHandler(6));
				stocktxt.setText(stockt);
				
					Panel panel = new Panel();
					panel.setLayout(null);
					panel.setBackground(new Color(153, 153, 153));
					panel.setBounds(168, 517, 130, 30);
					contentPanel.add(panel);
					
						 label = new JLabel("Yes");
						label.addMouseListener(new MouseAdapter() {
							int row= Table.getRow(); 
							@Override
							public void mouseClicked(MouseEvent e) {
								String bookS = booktxt.getText() , authorS = authortxt.getText() , publisherS = publishtxt.getText() ,
									yearS=yeartxt.getText() , ISBNS= isbntxt.getText() , lccS=lcctxt.getText() , stockS=stocktxt.getText();
									String[] edited ={authorS, bookS,yearS,ISBNS,publisherS,lccS,stockS };
									if(checEdit(row,  edited )){
										for(int i=0;i<7;i++){
											Books.All_info_Book.set(row*7+i, edited[i]);}
										//JOptionPane.showMessageDialog(null, "success ");
										Books.writetotxt();  //rewrite everythong frm arraylist
										frame.setVisible(false);
										BookList h = new BookList();									
										}
									System.out.print(Books.All_info_Book);					
							}
							@Override
							public void mouseEntered(MouseEvent e) {
								label.setForeground(new Color(255, 255, 0));
							}
							@Override
							public void mouseExited(MouseEvent e) {
								label.setForeground(new Color(0, 0, 0));
							}
						});
						label.setHorizontalAlignment(SwingConstants.CENTER);
						label.setFont(new Font("Century Gothic", Font.PLAIN, 17));
						label.setBounds(0, 0, 130, 30);
						panel.add(label);
					
				
			
				Books.All_info_Book.add(authortxt.getText());
				Books.All_info_Book.add(booktxt.getText());
				Books.All_info_Book.add(yeartxt.getText());
				Books.All_info_Book.add(isbntxt.getText());
				Books.All_info_Book.add(publishtxt.getText());
				Books.All_info_Book.add(lcctxt.getText());
				Books.All_info_Book.add(stocktxt.getText());
				
				
		
		
		
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
	                if((authortxt.getText()).equals("")){
	                	authortxt.setText(authort);
	                	authortxt.setForeground(Color.GRAY);
	                }
	                break;
	            
	            case 1:
	                if((booktxt.getText()).equals("")){
	                	booktxt.setText(bookt);
	                	booktxt.setForeground(Color.GRAY);
	                }
	                break;
	                
	            case 2:
	                if((yeartxt.getText()).equals("")){
	                	yeartxt.setText(yeart);
	                	yeartxt.setForeground(Color.GRAY);
	                }
	                break;                                
	                
	                case 3:
	                if((isbntxt.getText()).equals("")){
	                	isbntxt.setText(isbnt);
	                	isbntxt.setForeground(Color.GRAY);
	                }
	                
	                case 4:
	                    if((publishtxt.getText()).equals("")){
	                    	publishtxt.setText(publisht);
	                    	publishtxt.setForeground(Color.GRAY);
	                    }
	                    break;  
	                case 5:
	                    if((lcctxt.getText()).equals("")){
	                    	lcctxt.setText(lcct);
	                    	lcctxt.setForeground(Color.GRAY);
	                    }
	                    break;
	                case 6:
	                    if((stocktxt.getText()).equals("")){
	                    	stocktxt.setText(stockt);
	                    	stocktxt.setForeground(Color.GRAY);
	                    }
	                    break;
	               
	            }
	        }
	        public void focusGained(FocusEvent fe)
	        {
	            switch(code)
	            {
	                case 0:
	                if((authortxt.getText()).equals(authort)){
	                	authortxt.setForeground(Color.BLACK);
	                }
	                break;
	                case 1:
	                if((booktxt.getText()).equals(bookt)){
	                	booktxt.setForeground(Color.BLACK);
	                }
	                break;
	                case 2:
	                    if((yeartxt.getText()).equals(yeart)){
	                    	yeartxt.setForeground(Color.BLACK);
	                    }
	                    break;
	                
	                
	                case 3:
	                if((isbntxt.getText()).equals(isbnt)){
	                	isbntxt.setForeground(Color.BLACK);
	                } break;
	                
	                
	                
	                
	                case 4:
	                    if((publishtxt.getText()).equals(publisht)){
	                    	publishtxt.setForeground(Color.BLACK);
	                    }
	                    break;
	                
	                case 5:
	                    if((lcctxt.getText()).equals(lcct)){
	                    	lcctxt.setForeground(Color.BLACK);
	                    }
	                    break;
	                case 6:
	                    if((stocktxt.getText()).equals(stockt)){
	                    	stocktxt.setForeground(Color.BLACK);
	                    }
	                    break;
	                
	                
	                
	            }
	        }
	    }
		
		
	    static boolean  checEdit(int row, String[] edited ){
	    	
	    	for(int i=0;i<7;i++){
				if(edited[i].matches("[;:#?]")) { JOptionPane.showMessageDialog(null, "special characters not allowed"); editted=false; break;  } 
				if(i!=0){if(edited[i].isEmpty()){  JOptionPane.showMessageDialog(null, "you didnt fill the txt field "); editted=false; break;    }      }
				
				///edited[i].replaceAll("  ", " ").trim();
				}
					for(int i=0;i<edited.length;i++){
						if(Books.All_info_Book.get(row*7+i).equals(edited[i].replaceAll("  ", " ").trim())){repeat=repeat+1;
						//System.out.print(Books.All_info_Book.get(row*7+i).equals(edited[i]));
						//System.out.print(Books.All_info_Book.get(row*7+i)+" they are    "+(edited[i]));
						}}
					
						System.out.print("value of REPEAT"+repeat);
						if(repeat==7){
								JOptionPane.showMessageDialog(null, "no change was made ");
								editted=false; 
						}
	            return editted;}
	
					
		
	 
		
	}



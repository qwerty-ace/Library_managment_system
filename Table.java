import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JToggleButton;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.ListSelectionModel;



import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JRadioButton;




public class Table {

	public static JFrame frame;
	static JTable table;
	public static String[] Column={"Number", "Author", "Book", "Year", "ISBN", "Publisher", "LCC", "Stock"};
	static DefaultTableModel Tablemodel;
	static DefaultTableModel sortingModel, sortingModel2;
	static JRadioButton rdbtnSort;
	static int selectedRow;
	
	public static void main(String[] args) {
	
					Table window = new Table();
					Table.frame.setVisible(true);
				
	}

	
	public Table() {
		buildTable();
	}

	
	static void buildTable() {
		(new Books()).book();
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		table = new JTable();
		table.setBackground(Color.MAGENTA);
	
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
	    ListSelectionModel model=table.getSelectionModel();

	    //add listener
	    model.addListSelectionListener(new ListSelectionListener() {

	     public void valueChanged(ListSelectionEvent e) {
	    	  ListSelectionModel lsm=(ListSelectionModel) e.getSource();

	        if(lsm.isSelectionEmpty())
	        {
	          
	        }else
	        {
	           selectedRow=lsm.getMinSelectionIndex();
	          
	           
	        }
	      }
	    });
			
		
		table.setOpaque(false);
		(( DefaultTableCellRenderer)table.getDefaultRenderer(Object.class)).setOpaque(false);
		
		Tablemodel=new DefaultTableModel(Column,0){
			boolean[] columnEditables = new boolean[] {
				true, true, true, true, false, true, true, true
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		};
		int number=1;
		

		for(int i=0;i<Books.All_info_Book.size()/7-6;i++){
			Tablemodel.addRow(new Object[] {number++, Books.All_info_Book.get(i*7),Books.All_info_Book.get(i*7+1),
					Books.All_info_Book.get(i*7+2),Books.All_info_Book.get(i*7+3),Books.All_info_Book.get(i*7+4),
					Books.All_info_Book.get(i*7+5),Books.All_info_Book.get(i*7+6)});
			}
		
		
		
		table.setModel(Tablemodel);
		table.getColumnModel().getColumn(0).setPreferredWidth(50);
		table.getColumnModel().getColumn(1).setPreferredWidth(141);
		table.getColumnModel().getColumn(2).setPreferredWidth(204);
		table.getColumnModel().getColumn(3).setPreferredWidth(55);
		table.getColumnModel().getColumn(4).setPreferredWidth(134);
		table.getColumnModel().getColumn(5).setPreferredWidth(94);
		table.getColumnModel().getColumn(6).setPreferredWidth(81);
		table.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		table.setBorder(null);
		table.setBounds(0, 0, 434, 261);
		table.getTableHeader().setFont(new Font("Century Gothic", Font.PLAIN, 13));
		frame.getContentPane().add(table);
		
		
		
		
		
		
	
		
	}
	
	
	
	
	public static JTable getTable(){
	return Table.table;}
	
	public static int getRow()
    { 
        return table.getSelectedRow();
    }
	
	public static String getData(int row)
{	return table.getValueAt(row,0)+";"+table.getValueAt(row,1)+";"+
	table.getValueAt(row,2)+";"+table.getValueAt(row,3)+";"+
	table.getValueAt(row,4)+";"+table.getValueAt(row,5)
    +";"+table.getValueAt(row,6)+";"+table.getValueAt(row,7);
}
	
	public static  void clearTable() {
	while(Tablemodel.getRowCount() > 0)
	{
		Tablemodel.removeRow(0);
	} }
	
	
	

	
	
	 
}


/*
 * 	JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane(Table.table);
		scrollPane.setBackground(Color.YELLOW);
	
		scrollPane.setOpaque(false);
		scrollPane.setViewportBorder(null);
		scrollPane.getViewport().setOpaque(false);
		scrollPane.setBounds(136, 79, 788, 545);
		
		panel.add(scrollPane);
		
 */

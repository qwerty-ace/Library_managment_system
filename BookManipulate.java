

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
//import java.nio.file.Path;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
	
public class BookManipulate {
	static DefaultTableModel defTable;
	static String doc; 
	static String[] dco=new String[7];
	int number =1;
	private static String document ;
	
	public static void add(String title,String author,String year, String isbn, String publisher, String llc, String stock)
    {
       Books.All_info_Book.add(title);
       Books.All_info_Book.add(author);
       Books.All_info_Book.add(year);
       Books.All_info_Book.add(isbn);
       Books.All_info_Book.add(publisher);
       Books.All_info_Book.add(llc);
       Books.All_info_Book.add(stock);
     
       try {  String file="search.txt";
    	   PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(file, true)));
       for(int i=Books.All_info_Book.size()-7;i< Books.All_info_Book.size();i++){
       	if(i==Books.All_info_Book.size()-1){
       		out.print(Books.All_info_Book.get(i).trim()); 
       		out.println();}
       	else{out.print(" "+Books.All_info_Book.get(i).trim()+";");}
        } out.close();
   } catch (Exception e) {
   	JOptionPane.showMessageDialog(
               null, "Something inside boomaniod", "Failure", JOptionPane.ERROR_MESSAGE); 
       //exception handling left as an exercise for the reader
   }	JOptionPane.showMessageDialog(
           null, "Sucesfully added", "Failure", JOptionPane.ERROR_MESSAGE);}
	
	public static void issue(String isbn, String student, String issued, String dueto) throws IOException {
		Books.Issue_Items.add(isbn);
		Books.Issue_Items.add(student);
		Books.Issue_Items.add(issued);
		Books.Issue_Items.add(dueto);
		FileWriter fw = new FileWriter("issued.txt",true);
        for(int i=Books.Issue_Items.size()-4;i< Books.Issue_Items.size();i++){
        fw.write(Books.Issue_Items.get(i)+";");
        
        }
        fw.close();
        //getTable();
	}
	
	public static JTable getTable(){
    	return Table.table;}

	
}




import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;

import javax.swing.JOptionPane;


public class Books {
	static ArrayList <String> All_info_Book=new ArrayList <String>(); 
	static ArrayList <String> Issue_Items = new ArrayList <String>();
	String [] splitted_txt;
	static String text;
	 static ArrayList <String> Author_name =new ArrayList <String>();
	static ArrayList <String> Author_name_sorted =new ArrayList <String>();
	static ArrayList <String> Book_name =new ArrayList <String>();
	static ArrayList <String> Book_name_sorted =new ArrayList <String>();
	ArrayList <String>Year_t =new ArrayList <String>();
	static ArrayList <Integer> index, index2;
	Books(){
		book();
	}
	
	
	
 void book(){
	 BufferedReader reader=null;
	 
	try{ String txt="search.txt";  
	reader = new BufferedReader(new FileReader(new File(txt)));
	String text_trimed;
    while ((text = reader.readLine()) != null) {
    	splitted_txt = new String[text.split(";").length];
     	text_trimed=text.trim();
     	splitted_txt = text_trimed.split(";"); // there are 7 elements in values   
     	 Author_name.add(splitted_txt[0]);   Book_name.add(splitted_txt[1]);    	
     	 for(int m=0;m<7;m++){   // isbn 0-id 
     		All_info_Book.add(splitted_txt[m]); // add all that seven elements
     	 }
    } 
  }  catch(Exception e)  
  {  JOptionPane.showMessageDialog(null, "books class arraylist", "Error", JOptionPane.ERROR_MESSAGE);}
}
 
 

 
 
 
 
 
static  void writetotxt(){
		  //	String path="search.txt";
		    	BufferedWriter bw=null;
		    	FileWriter fw=null;
		   
		    	String path="search.txt";
		   
		    	
		    	
		    
		    	try {	FileWriter write=new FileWriter(path, false);
		    	PrintWriter print_line=new PrintWriter(write);
		    	
		    	
		    	for(int i=0, j=6;i<All_info_Book.size() & j<All_info_Book.size();i++){
			        if(i==j){System.out.printf("%s"+"%n",(All_info_Book.get(j))+"\r\n" ); j=j+7; }
			        else { System.out.printf("%s"+"%n",(All_info_Book.get(i)+";"));  }
			        	}
		    	print_line.close();
		    	}
		    		
		    		
		    		/*OutputStream out =new FileOutputStream(path, false);
		    		Writer w = new OutputStreamWriter(out, "UTF-8"); 
		    	
		    	   
		    	    for(int i=0, j=6;i<All_info_Book.size() & j<All_info_Book.size();i++){
				        if(i==j){ w.write(All_info_Book.get(j)+"\r\n"); ; j=j+7; }
				        else { w.write(All_info_Book.get(i)+";");}
				        	}
		    	    w.close();} // or w.close(); //close will auto-flush
		    	
		    	*/
		    	
		   /* 	fw = new FileWriter(path);
		 			bw = new BufferedWriter(fw);
		        	for(int i=0, j=6;i<All_info_Book.size() & j<All_info_Book.size();i++){
		        if(i==j){bw.write(All_info_Book.get(j)); bw.newLine(); j=j+7; }
		        else {bw.write(All_info_Book.get(i)+";");}
		        	}
		        	 
		        	 bw.close();
		        	 
				}*/ catch (Exception e) {
					e.printStackTrace();
					JOptionPane.showMessageDialog(null, "couldnt write/close ");
				}
	}

}


/*static  void writeNewStock(String stock, int row) throws IOException{
String path="search.txt";
BufferedWriter bw=null;
FileWriter fw=null;
try {fw = new FileWriter(path);
	bw = new BufferedWriter(fw);
	Books.All_info_Book.set(row*7+6, stock);
	bw.close(); }
 catch (Exception e) {
		e.printStackTrace();
		JOptionPane.showMessageDialog(null, "couldnt write/close ");
	}
JOptionPane.showMessageDialog(null, "STOCK "+stock+" ROW "+row);
}*/

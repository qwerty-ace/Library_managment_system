

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.regex.Pattern;

public class BookChecking {
	static boolean  exist=false;
	 static int here;

	public static boolean exist(String title,String author,String year, String isbn, String publisher, String llc, String stock) {
		here=0;
			String[] newrow={author,title, year, isbn, publisher,llc};
			System.out.print(newrow);
				 	for(int i=0;i<6;i++){
							for(int j=0;j<Books.All_info_Book.size();j=j+7){
						 if ((newrow[i].toLowerCase().trim()).equals(Books.All_info_Book.get(j+i).toLowerCase().trim())){
							 System.out.print(newrow[i] + Books.All_info_Book.get(j+i) );
							 here++;
							 System.out.print("K"+here);
						}}} 
					if(here==5){BookChecking.exist=true;}System.out.print("K  2  "+here);
					System.out.print("K  3   "+here);  return exist; }
	public boolean checkYear(String year) { 
		return ((Pattern.matches("[a-zA-Z]+", year)) || (year.length() != 4));
	}
	public boolean checkISBN(String isbn) { 
		return ((Pattern.matches("[a-zA-Z]+", isbn)) || ((isbn.length() != 10)&& (isbn.length() != 13)));
	}
	public boolean checkStock(String stock) { 
		return (Pattern.matches("[a-zA-Z]+", stock));
	}
}


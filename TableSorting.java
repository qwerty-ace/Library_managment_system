import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;


public class TableSorting {
	ArrayList<Integer> num ,num1;
	static ArrayList<Integer> index1,index2;
	DefaultTableModel sortingModel, sortingModel2;
	
	/**
	 * @wbp.parser.entryPoint
	 */
	TableSorting(){
		
	}  
	void Book_sorting(){
		
		Books.Book_name_sorted.clear();
		Books.Book_name_sorted.addAll(Books.Book_name);
	sort_quick(Books.Book_name_sorted, 0, Books.Book_name_sorted.size()-1);	
	 num1=new ArrayList<Integer> (); 
	index2=sorting_index(Books.Book_name, Books.Book_name_sorted, num1);
	Table.table.setModel(TableSorting.sortmod2(Books.Book_name_sorted, index2));	
	Table.getTable();
	
		
	}
	
	void Table_sorting(){
		
		Books.Book_name_sorted.clear();
		Books.Author_name_sorted.addAll(Books.Author_name);
	
	sort_quick(Books.Author_name_sorted, 0, Books.Author_name_sorted.size()-1);	

	 num=new ArrayList<Integer> (); 
	index1=sorting_index(Books.Author_name, Books.Author_name_sorted, num);
	Table.table.setModel(TableSorting.sortmod(Books.Author_name_sorted, index1));	
	Table.getTable();
	
	
	
	
	} static ArrayList <Integer> sorting_index(ArrayList <String>  unsorted, ArrayList <String> sorted, 
			ArrayList <Integer> index ){
		for(int i=0;i<unsorted.size();i++){
		index=new ArrayList<Integer>();
		}
		
			for(int i=0;i<sorted.size();i++){
				for(int j=0;j<Books.All_info_Book.size();j=j+7){
					if(Books.All_info_Book.get(j)==sorted.get(i)){
						index.add(j);
						break;
					}}}
		return index;
	}
	
	
	
	public static  DefaultTableModel sortmod2( ArrayList<String> sorted, ArrayList<Integer> index ){
		int n=1, k=0;
		DefaultTableModel sortingModel2=new DefaultTableModel(Table.Column, 0);
		for(int i=0;i<index.size();i++){
			sortingModel2.addRow(new Object[] {n++,Books.All_info_Book.get(index.get(i)),sorted.get(k),
					Books.All_info_Book.get(index.get(i)+2),Books.All_info_Book.get(index.get(i)+3),
							Books.All_info_Book.get(index.get(i)+4),
					Books.All_info_Book.get(index.get(i)+5),Books.All_info_Book.get(index.get(i)+6)}); k++;
			}  return sortingModel2;  
			}
	
	public static  DefaultTableModel sortmod( ArrayList<String> sorted, ArrayList<Integer> index ){
		int n=1, k=0;
		DefaultTableModel sortingModel=new DefaultTableModel(Table.Column, 0);
		for(int i=0;i<index.size();i++){
			sortingModel.addRow(new Object[] {n++, sorted.get(k),Books.All_info_Book.get(index.get(i)+1),
					Books.All_info_Book.get(index.get(i)+2),Books.All_info_Book.get(index.get(i)+3),
							Books.All_info_Book.get(index.get(i)+4),
					Books.All_info_Book.get(index.get(i)+5),Books.All_info_Book.get(index.get(i)+6)}); k++;
			}  return sortingModel;  
			}
	
	
	static int partition(ArrayList<String> x, int low, int high)
    {
        String pivot = x.get(high); 
        int i = (low-1); 
        for (int j=low; j<high; j++)
        {if ((x.get(j).compareToIgnoreCase(pivot))<0)
            {i++;
              String  temp = x.get(i);
              x.set(i, x.get(j));
              x.set(j, temp);
            }
        }
        
  String temp = x.get(i+1);
  x.set(i+1,x.get(high));
  x.set(high, temp);
  return i+1;
    }
static ArrayList<String> sort_quick(ArrayList<String> x, int low, int high)
    {if (low < high)
        {int pi = partition(x, low, high);
        	sort_quick(x, low, pi-1);
            sort_quick(x, pi+1, high);
        }
    return x;}
}

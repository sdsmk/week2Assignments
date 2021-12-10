package Day2Assignments;
import java.util.ArrayList;
//import java.util.List;
import java.util.TreeSet;

public class Treeset{
	public static void main(String args[]) {
		ArrayList<String> fruitlist = new ArrayList<String>();
        fruitlist.add("Mango");
        fruitlist.add("Apple");
        fruitlist.add("Grape");
        fruitlist.add("Papaya");
        
        System.out.println("Fruit List : " + fruitlist);
        TreeSet<String> tree_set = new TreeSet<String>();
 
        for (String i : fruitlist)
            tree_set.add(i);
        System.out.println("TreeSet from List : "+ tree_set);
		
	}
}
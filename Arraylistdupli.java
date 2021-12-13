package Day2Assignments;

import java.util.Collections;
import java.util.ArrayList;
import java.util.Collection;
class CustomList<T> extends ArrayList<T>{
	 private static final long serialVersionUID = 1L;
	 public CustomList()
	 {
		 super();
	 }
	private boolean addElement(T obj)
	 {
	  if(Collections.frequency(this, obj)<2)
	  {
		return true;
	  }
	  return false;
 }
	 @Override
	 public boolean add(T obj)
	 {
		 if(!addElement(obj)) {
			 return false;
		 }
		 return super.add(obj);
	 }
	 
	@Override
	 public void add(int index, T obj)
	 {
		if(!addElement(obj)) {
			 return;
		 }
		super.add(index,obj);
	 }
	 
	 @Override
	 public boolean addAll(Collection<? extends T> coll)
	 {
	  boolean all_elements = true;
	  for(T element:coll)
	  {
	   all_elements = addElement(element);
	  } 
	  return all_elements;
	 }
	 
	 @Override
	 public boolean addAll(int index, Collection<? extends T> collection)
	 {
	  boolean complete = true;
	  for(T element:collection)
	  {
	   complete = addElement(element);
	  }
	  
	  return complete;
	 }	  
	}

public class Arraylistdupli {
	 public static void main(String[] args) {
	  CustomList<Integer> customList = new CustomList<Integer>();
	  customList.add(4);
	  customList.add(4);
	  customList.add(5);
	  customList.add(3);
	  customList.add(2);
	  customList.add(4);
	  System.out.println(customList);
	 }
	}
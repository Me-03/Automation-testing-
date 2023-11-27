package Collectionframework;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 ArrayList ar = new ArrayList();
 ar.add("tannya");
 ar.add(100);
 ar.add(456.6);
 
 System.out.println(ar.get(1));
 System.out.println(ar.size());
 
 // generics in java 
 ArrayList<Integer> ar2 = new ArrayList<Integer>();
 ar2.add(25);
 //ArrayList <E> ar3 = new ArrayList<E>();//when we are unaware about the type of input 
 //ar3.add("hf");
 
 // Storing user defined class objects in arraylist 
 Constructor c1 = new Constructor(25, "Tannya" , 67);// creating object of Constructor class
 Constructor c2 = new Constructor(34, "tom", 56);
 Constructor c3 = new Constructor(28, "richa", 78);
 //creating arraylist
 ArrayList<Constructor> ar5 = new ArrayList<Constructor>();//defining generics since we have multiple dataypes in single object 
 ar5.add(c3);
 ar5.add(c2);
 ar5.add(c1);
 
 //to print all the values of arraylist using ITERATOR 
 Iterator<Constructor> m =ar5.iterator();
 while (m.hasNext()) {
 Constructor z= m.next();// here "constructor" is used as a datatype 
 System.out.println(z.name);
 System.out.println(z.age);
 System.out.println(z.id);}
 
	}
	
}
	
	
	


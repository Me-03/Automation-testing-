package OOPConcept2;

public class Execution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      // child class object 
		Child x= new Child();
		x.method1();
		x.function1();
		x.method2();// method overiding , both parent and child have same method with same argument and return type but the preference is given to child class 
	System.out.println("#########");	
	 // Parent class object- overidden method and parent class method are accessed but not the child class 
	    Parent p = new Parent();
	    p.method1();
	    p.method2();
	System.out.println("#########");
    //DYNAMIC POLYMORPHISM: child class object with parent class reference TOP CASTING 
	    Parent v= new Child(); // all the overidden and parent class methods are called 
	    v.method1();
	    v.method2();
	    

	}

}

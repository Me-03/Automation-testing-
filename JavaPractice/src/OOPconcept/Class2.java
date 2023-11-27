package OOPconcept;

public class Class2 {
int count1;//class variable . copy of this will be given to each and every object 
int count2;//class variable . copy of this will be given to each and every object
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//new keyword is used to create the object 
      Class2 a=new Class2(); //new Class2() is object  & a is the object reference variable , Class2 is the name of the class
      Class2 b=new Class2();
      Class2 c=new Class2();
      a.count1 =10;
      a.count2=20;
      c.count1=30;
      b.count1=40;
	}

}

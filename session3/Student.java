package cons;

//public class Student {
	public class Student {
	    //class level variables
		int empid;
		String empname;
		String empdept;
	    int id;
	    String name;
	    
	    //default constructor
	    public Student()
	    {
	        empid=23043;
	        empname="prince kumar";
	        empdept="computer science and engineering";
	    }
	    public Student(int empid,String name,String empdept)
	    {
	        this.empid=empid;
	        this.empname=empname;
	        this.empdept=empdept;
	    }
	    
	    public static void main(String[] args) {
	        
	        //when you create object automatically it calls default constructor
	        //if no default constructor then compiler will create that
	        Student obj=new Student();
	        System.out.println("User 1");
	        System.out.println("Id: "+obj.empid);
	        System.out.println("Name: "+obj.empname);
	        System.out.println("Name: "+obj.empdept);
	        
	       // Student obj2= new Student(45,"Vineet");
	      //  System.out.println("User 2");
	       // System.out.println("Id: "+obj2.id);
	       // System.out.println("Name: "+obj2.name);
	        
	        
	        
	    }
	
}

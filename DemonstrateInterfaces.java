package interfaces;

interface Employee{
	
	void work();
}
interface Programmer extends Employee{
	void code();
}
 class Organization implements Programmer
 {
	Organization()
	{
		this.work();
		this.code();
		
	}
	public void work()
	  {
		System.out.println("working....");  
	  }

	 public void code() {
		  System.out.println("coding...");  
	  }
	 
 }
public class DemonstrateInterfaces  {
   
public static void main(String[] args) {
	Organization d= new Organization();
	
}
}

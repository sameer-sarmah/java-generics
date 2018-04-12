
public class Driver {
  public static void main(String[] args) {
	  Architect arch1=new Architect(5, "Chris", "Project Arch");
	  Architect arch2=new Architect(6, "Rambo", "Principal Arch");
	System.out.println(arch1.compareTo(arch2));
	
	Employee<Manager> mang1=new Manager(5, "Brad", "Manager");
	Employee<Manager> mang2=new Manager(6, "Cooper", "Senior Manager");
	System.out.println(mang1.compareTo(mang2));
	
	System.out.println(arch1.compareTo(mang2));
	System.out.println(mang1.compareTo(arch2)); 
	

}
}

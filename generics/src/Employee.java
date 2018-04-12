
public abstract class Employee <T extends Employee<T>> implements Comparable<T>{

	int rank;
	String name,designation;

	public Employee(int rank, String name, String designation) {
		super();
		this.rank = rank;
		this.name = name;
		this.designation = designation;
	}

	@Override
	public int compareTo(Employee person) {
		if(this.getRank()>person.getRank()) {
			return 1;
		}
		else if(this.getRank()<person.getRank()) {
			return -1;
		}
		else
		return 0;
	}

	public int getRank() {
		return rank;
	}

	public String getName() {
		return name;
	}

	public String getDesignation() {
		return designation;
	}
	
	
	

}

package by.htp.les10.main.compare;

public class Student implements Comparable<Student>{
	private String name;
	private int ageOfBirth;
	private int mark;
	
	
	public Student(String name, int ageOfBirth, int mark) {
		super();
		this.name = name;
		this.ageOfBirth = ageOfBirth;
		this.mark = mark;
	}


	public int getAgeOfBirth() {
		return ageOfBirth;
	}


	public void setAgeOfBirth(int ageOfBirth) {
		this.ageOfBirth = ageOfBirth;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
		
	}
	
	public int getMark() {
		return mark;
	}
	
	public void setMark(int mark) {
		this.mark = mark;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ageOfBirth;
		result = prime * result + mark;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (ageOfBirth != other.ageOfBirth)
			return false;
		if (mark != other.mark)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Student [name=" + this.getName() + ", ageOfBirth=" + this.getAgeOfBirth() + ", mark=" + this.getMark() + "]";
	}

//	sort by Students age
	
//	@Override
//	public int compareTo(Object temp) {
//		Student other = (Student) temp;
//		
//		if (getAgeOfBirth() > other.getAgeOfBirth()) {
//			return 1;
//		} else if (getAgeOfBirth() < other.getAgeOfBirth()) {
//			return -1;
//		} else {
//			return 0;
//		}
//		
//	}
	
	
	// sort by name
	@Override 
	public int compareTo(Student temp) {
		
		return this.name.compareTo(temp.getName());
		
	}
	


	
	
	
	
	
}

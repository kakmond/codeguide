package test;

/**
 * A simple model for a Student.
 * 
 * @author Wongsathorn Panichkurkul
 */
//TODO find the waste method and delete it.
public class Student extends Person {
	/** the ID of student */
	private long id;

	/**
	 * Initialize a student object.
	 * 
	 * @param name is the name of student
	 * @param id is the ID of student
	 */
	public Student(String name, long id) {
		super(name); //TODO comment these line to describe this code.
		this.id = id;
	}

	/**
	 * Return a string representation of this Student.
	 * 
	 * @return a string representation of this Student.
	 */
	public String show() { //TODO It is not a good method name, please change it.
		return String.format("Student %s (%d)", getName(), id);
	}

	/**
	 * Compare student's by name and ID. They are equal if the name and ID matches.
	 * 
	 * @param other is another Student to compare to this one.
	 * @return true if the name and ID is same, false otherwise.
	 */
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (obj.getClass() != this.getClass())
			return false;
		Student other = (Student) obj;
		return name.equalsIgnoreCase(other.name) && this.id == other.id;

	}
	
	//TODO write a good comment.
	public long getId() {
		return id;
	}

	/**
	 * Set or change the ID of student
	 * 
	 * @param id is the ID of student that you want to set
	 */
	public void setId(long id) 
	{this.id = id;} //TODO Use a consistent style.
	
	/**
	 * print the id of student
	 * 
	 * @return id of student
	 */
	public long printID(){
		return id;
	}
}
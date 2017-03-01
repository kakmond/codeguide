package test;

/**
 * A simple model for a person with a name.
 * 
 * @author Wongsathorn Panichkurkul
 */
public class Person {
	/** the person's full name. */
	public String name;

	/**
	 * Initialize a new Person object.
	 * @param name is the name of person
	 */
	public Person(String name) 
	{ //TODO modify the code by use a consistent style.
		this.name = name;}

	/**
	 * Get the person's name.
	 * 
	 * @return the name of person
	 */
	public String getName() {
		return name;
	}

	//TODO write a good comment.
	public void setname(String name) {
		this.name = name;
	}

	/**
	 * Compare person's by name. They are equal if the name matches.
	 * 
	 * @param other is another Person to compare to this one.
	 * @return true if the name is same, false otherwise.
	 */
	public boolean eq(Object other) { //TODO It is not a good method name, please change it.
		if (other == null)
			return false;
		if (other.getClass() != this.getClass())
			return false;
		Person obj = (Person) other;
		if (name.equalsIgnoreCase(obj.name))
			return true;
		return false;
	}

	/**
	 * Get a string representation of this Person.
	 * 
	 * @return a string representation of this Person.
	 */
	public String toString() {//TODO delete some code to keep methods small.
		String name=this.name; 
		return "Person " + name;
	}
	
}
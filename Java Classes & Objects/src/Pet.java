public class Pet {

	private String name;
	private int age;
	private String location;
	private String type;
	public boolean empty;
	public boolean allAttributes;
	
	public Pet() {
		this.name = "";
		this.age = -1;
		this.location = "";
		this.type = "";
		this.empty = true;
		this.allAttributes = false;
	}
	public Pet( String name, int age, String location, String type ) {
		this.name = name;
		this.age = age;
		this.location = location;
		this.type = type;
		this.empty = false;
		this.allAttributes = true;
	}
	// getters
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	public String getType() {
		return this.type;
	}
	public String getLocation() {
		return this.location;
	}
	
	//setters
	public boolean setName(String name) {
		this.name = name;
		return true;
	}
	public boolean setAge(int age) {
		this.age = age;
		return true;
	}
	public boolean setLocation(String location) {
		this.location = location;
		return true;
	}
	
	
}
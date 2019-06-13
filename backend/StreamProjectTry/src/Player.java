
public class Player {
	String name;
	String surname;
	String role;
	int number;
	int age;
	
	public Player(String name, String surname, String role, int number, int age) {
		super();
		this.name = name;
		this.surname = surname;
		this.role = role;
		this.number = number;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", surname=" + surname + ", role=" + role + ", number=" + number + ", age="
				+ age + "]";
	}
	
}

package Examples;
public class Human{
	public String name;
	int age;
	int height;
	static String nationality = "Polish";
	
	
	public Human(String text, int age, int height) {
		this.name = text;
		this.age = age;
		this.height = height;
		
	}
	
	public static void printName(String name) {
		System.out.println(name);
	}
	
	
	public void printName() {
		System.out.println(this.name);
	}
	
	public int add(int a, int b) {
		return a + b;
	}
}
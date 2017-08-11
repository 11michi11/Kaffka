package Examples;

public class Main {

	public static void main(String[] args){
		
		Human john = new Human("John", 18, 180); 
		Human marek = new Human("Marek", 21, 170);
		
		String name = "Adrian";
		
		
		printName(name);
		john.printName();
		marek.printName();
		Human.printName(name);
		
		int sum = marek.add(5, 3);
		System.out.println(sum);
		
	}
	
	
	public static void printName(String name) {
		System.out.println(name);
	}

}



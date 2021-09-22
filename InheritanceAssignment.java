package assignmentSep22;

class GrandFather{
	void GrandFather() {
		System.out.println("Grandfather of Agarwal Family");
	}
	void property(){
		System.out.println("I own a house");
	}
}

class Father extends GrandFather{
	void Father() {
		System.out.println("Father of Agarwal Family");
	}
	void property(){
		System.out.println("I own a house");
		System.out.println("I have a bought a car");
	}
}

class Daughter extends Father{
	void Daughter() {
		System.out.println("Daughter of Agarwal Family");
	}
	void property(){
		System.out.println("I own a house");
		System.out.println("I have a bought a car");
		System.out.println("I have bought a villa and own a company");
	}
}
public class InheritanceAssignment {
	public static void main(String[] args) {
		GrandFather gf = new GrandFather();
		gf.GrandFather();
		gf.property();
		System.out.println();
		
		Father father = new Father();
		father.Father();
		father.property();
		System.out.println();
		
		Daughter daughter = new Daughter();
		daughter.Daughter();
		daughter.property();
	}

}

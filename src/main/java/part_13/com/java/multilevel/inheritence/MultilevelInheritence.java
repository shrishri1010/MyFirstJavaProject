package part_13.com.java.multilevel.inheritence;
//Multilevel Inheritence
class Animal{  
	void eat(){
		System.out.println("eating...");
	}  
}  
class Dog extends Animal{  
	void bark(){
		System.out.println("barking...");
	}  
}  

class BabyDog extends Dog{  
	void weep(){
		System.out.println("weeping...");
	}  
}  

class MultilevelInheritence{  
	public static void main(String args[]){  
		//Object of animal
		Animal a = new Animal();
		a.eat();
		
		//Object of Dog
		Dog d = new Dog();
		d.bark();
		d.eat();
		
		//Object of babydog
		BabyDog bd=new BabyDog();  
		bd.weep();  
		bd.bark();  
		bd.eat();  
	}
}  


package part_11.com.java.polymorphism;

class vehicle{
	
	void run(){
		System.out.println("vehicle is moving...");
	}
}

class BikeOverRiding extends vehicle{
	
	void run(){
		System.out.println("bike is running....");
	}
	
	public static void main(String[] args) {
		//created the object of vehicle class
		vehicle v= new vehicle();
		v.run();
		//Created the object of BikeOverRiding class
		BikeOverRiding b = new BikeOverRiding();
		b.run();
		//Run time polymorphisrm
		vehicle v1=new BikeOverRiding();
		v1.run();
	}
	
}












































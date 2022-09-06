class Demo {

	     void display() {
		//method overriding
		System.out.println("this call is from parent class with");
		  
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);// loop thorgh an array
		}
	}
}

 class Virgo extends Demo {
	 public void display() {
    
        System.out.println("this call is from this keyword in child class with higher priviledges than parent");
          
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		System.out.println(cars[0]);
		System.out.println(cars.length);

		// Outputs Volvo
	}

    void output(){

    	this.display();
		super.display();

    }

	public static void main(String[] args) {
		//Virgo.display();
		Virgo v = new Virgo();
		v.output();
		
	}
}

// static method valo video
// mehtod oveeriding
// this and supre 
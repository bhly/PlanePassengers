public class PlaneDriver {
	
	public static void main(String args[]) { 
		
		Plane plane = new Plane(18, 20000.00); 
		
		Passenger anthony = new Passenger("Anthony", 61.20, 8.2); 
		Passenger will = new Passenger("Will", 113.30, 14.3);
		Passenger hadeel = new Passenger("Hadeel", 68.02,12.3);
		Passenger cheyenne = new Passenger("Cheyenne", 127.01, 25.25); 
		Passenger heftychonk = new Passenger("Chonk", 19900, 67.0); 
		
		System.out.println(""); 
		System.out.println("Plane's available weight before passengers are added: " + plane.getAvailableWeight()); 

		

		System.out.println("CASE 1: Attempting to add four new passengers");
		System.out.println("Results:");
		plane.addPassenger(anthony);
		plane.addPassenger(will);
		plane.addPassenger(cheyenne);
		plane.addPassenger(hadeel); 
		 
		
		System.out.println("");
		System.out.println("CASE 2: Attempting to add a passenger who is already on plane");
		System.out.print("Result: "); 
		plane.addPassenger(anthony); 
		 
		
		
		System.out.println("");
		System.out.println("CASE 3: Attempting to add a passenger over plane's weight limit");
		System.out.print("Result: ");
		plane.addPassenger(heftychonk);
		 
		
		System.out.println(""); 
		System.out.println("CASE 4: Changing passenger's luggage");
		System.out.print("Result: "); 
		plane.changeLuggage(cheyenne, 23); 
		
		System.out.println("");
		System.out.println("CASE 5: Attempting to change passenger's luggage over weight limit");
		System.out.print("Result: ");
		
		plane.changeLuggage(hadeel, 25000); 
		
		System.out.println("");
		System.out.println("CASE 6: Attempting to change luggage of passenger not on plane");
		System.out.print("Result: ");
		plane.changeLuggage(heftychonk, 34); 
		
		System.out.println("");
		System.out.println("CASE 7: Removing a passenger from the plane");
		System.out.print("Result: ");
		plane.removePassenger(will);  
		
		System.out.println("");
		
		System.out.println("Plane's current available weight: " + plane.getAvailableWeight()); 	
		System.out.println("");
		System.out.println("Passenger list:");
		System.out.println("");
		
		System.out.println(cheyenne.getID() + "\t" + cheyenne.getName() + "\t" + cheyenne.getTotalWeight());
		System.out.println(will.getID() + "\t" + will.getName() + "\t\t" + will.getTotalWeight());
		System.out.println(anthony.getID() + "\t" + anthony.getName() + "\t\t" + anthony.getTotalWeight());

		
		
	}

}


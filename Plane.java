public class Plane { 

private int maxPassengers; 
private double maxWeight; 
private double totalWeight; 
private double availableWeight; 
private int count = 0; 
protected Passenger[] passengerList; 
	

	public Plane(int maxPassengers, double maxWeight) { 
		this.maxPassengers = maxPassengers;
		this.maxWeight = maxWeight; 
		passengerList = new Passenger[maxPassengers];
	} 

	public boolean addPassenger(Passenger pass) { 
		if(count < maxPassengers) { 
			if(pass.getTotalWeight() < availableWeight) {
				for(int i = 0; i < count; i++) { 
					if(pass.getID() == passengerList[i].getID()) {
						System.out.println("Passenger not added.");
						return false;
					}
				} 
				passengerList[count] = pass;
				count++;
				System.out.println("Passenger successfully added!"); 
				
				for(int i = 0; i < count; i++) {
					totalWeight+= passengerList[i].getTotalWeight();
				}
				availableWeight = maxWeight - totalWeight; 
				System.out.println("\t" + "plane's updated available weight:" + availableWeight); 
				return true;
			}
		} 
		System.out.println("Passenger not added.");
		return false;
	}

	public boolean removePassenger(Passenger pass) { 
		for(int i = 0; i < count; i++) { 
			if(pass.getID() == passengerList[i].getID()) { 
				passengerList[i] = passengerList[i+1]; 
				count--; 
				System.out.println("Passenger successfully removed!"); 
				for(int j = 0; j < count; j++) {
					totalWeight+= passengerList[j].getTotalWeight();
				}
				availableWeight = maxWeight - totalWeight; 
				System.out.println("\t" + "plane's updated available weight:" + availableWeight); 
				return true;  
			} 
		} 
		System.out.println("Passenger not removed."); 
		return false; 
	} 
	
	public boolean changeLuggage(Passenger pass, double lug) { 
		for(int i = 0; i < count; i++) { 
			if(pass.getID() == passengerList[i].getID()) {
				if(lug < availableWeight) {			
				pass.setLuggageWeight(lug);
				System.out.println("luggage weight successfully updated!");
				for(int j = 0; j < count; j++) {
					totalWeight+= passengerList[j].getTotalWeight();
				}
				availableWeight = maxWeight - totalWeight; 
				System.out.println("\t" + "plane's updated available weight:" + availableWeight); 
				
				return true;
				}
			}
		}	
	System.out.println("luggage not updated"); 
	return false;	
	} 
	
	public double getAvailableWeight() { 
		availableWeight = (maxWeight - totalWeight); 
		return availableWeight; 
	}
	
	public String toString(Passenger pass) { 
		return String.format(pass.getID() + "\t" + pass.getName() + "\t" + pass.getTotalWeight());
		
	}
	
}



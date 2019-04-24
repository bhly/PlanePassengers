public class Passenger { 

private String name;
private static int passengerID = 1000; 
private double passengerWeight;
private double luggageWeight;
private int uniqueID;

public Passenger(String name, double passengerWeight, double luggageWeight) { 
	this.name = name;
	this.passengerWeight = passengerWeight; 
	this.uniqueID = passengerID;
	this.luggageWeight = luggageWeight;
	++passengerID;
} 

public String getName() { 
	return name;
} 

public int getID() { 
	return uniqueID; 
} 

public double getPassengerWeight() { 
	return passengerWeight;
} 

public double getLuggageWeight() { 
	return luggageWeight; 
} 

public double getTotalWeight() { 
	double totalWeight = luggageWeight + passengerWeight;
	return totalWeight;
}

public void setLuggageWeight(double luggageWeight) { 
	this.luggageWeight = luggageWeight;
}    

}




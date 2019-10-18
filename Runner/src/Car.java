
public class Car {
private boolean  previouslyOwned;//
private int numWheels;//
private int mileage;
private String type;//
public String colour;

public Car(boolean previouslyOwned) {
	if(previouslyOwned==true) {
		this.previouslyOwned=true;
		mileage=20000;
	}else {
		this.previouslyOwned=false;
		mileage=0;
	}
}

public void setType(String type ) {
	this.type=type;
}

public String getType() {
	return this.type;
}

public void setNumWheels(int numWheels) {
	this.numWheels=numWheels;
}

public int getNumWheels() {
	if(getType().equalsIgnoreCase("Reliant Robin")) {
		return 3;
	}else {
		return 4;
	}
}

public void setPreviouslyOwned(boolean prevOwned) {
	this.previouslyOwned=prevOwned;
}

public boolean getPreviouslyOwned() {
	return this.previouslyOwned;
}

public void setMileage(int mileage) {
	this.mileage=mileage;
}

public int getMileage() {
	return this.mileage;
}



}

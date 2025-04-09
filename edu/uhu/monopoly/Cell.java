package edu.uhu.monopoly;

public abstract class Cell {
	
	private String name;
	protected Player propietary;
	private boolean available = true;

	public String getName() {
		return name;
	}

	public Player getPropietary() {
		return propietary;
	}
	
	public int getPrice() {
		return 0;
	}

	public abstract void playAction();

	void setName(String name) {
		this.name = name;
	}

	public void setPropietary(Player owner) {
		this.propietary = owner;
	}
    
    public String toString() {
        return name;
    }

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}
	
	public void setAvailable(boolean available, CardCell cardCell) {
		this.available = available;
	}

	

	public void setAvailable(boolean available, FreeParkingCell freeParkingCell) {
		freeParkingCell.available = available;
	}



	public void setAvailable(boolean available, GoCell goCell) {
		goCell.available = available;
	}


	public void setAvailable(boolean available, GoToJailCell goToJailCell) {
		goToJailCell.available = available;
	}


	public void setAvailable(boolean available, JailCell jailCell) {
		jailCell.available = available;
	}

	

	public void setAvailable(boolean available, PropertyCell propertyCell) {
		propertyCell.available = available;
	}

	public void setAvailable(boolean available, RailRoadCell railRoadCell) {
		railRoadCell.available = available;
	}

	

	public void setAvailable(boolean available, UtilityCell utilityCell) {
		utilityCell.available = available;
	}
}

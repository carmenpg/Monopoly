package edu.uhu.monopoly;

public interface IOwnable {

	Player getPropietary();

	void setPropietary(Player owner);

	boolean isAvailable();

	void setAvailable(boolean available);

	void setAvailable(boolean available, CardCell cardCell);

	void setAvailable(boolean available, FreeParkingCell freeParkingCell);

	void setAvailable(boolean available, GoCell goCell);

	void setAvailable(boolean available, GoToJailCell goToJailCell);

	void setAvailable(boolean available, JailCell jailCell);

	void setAvailable(boolean available, PropertyCell propertyCell);

	void setAvailable(boolean available, RailRoadCell railRoadCell);

	void setAvailable(boolean available, UtilityCell utilityCell);

}
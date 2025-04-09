package edu.uhu.monopoly;

public class FreeParkingCell extends Cell {

	boolean available = true;

	public FreeParkingCell() {
		setName("Free Parking");
	}

	public boolean playAction(String msg) {
		return true;
	}
}

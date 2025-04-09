package edu.uhu.monopoly;

public class FreeParkingCell extends Cell {

	boolean available = true;

	public FreeParkingCell() {
		setName("Free Parking");
	}

	public void playAction() {
		return;
	}
}

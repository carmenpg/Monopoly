package edu.uhu.monopoly;

public class Die {
	public int getRoll() {
		return (int)(Math.random() * 6) + 1;
	}
}

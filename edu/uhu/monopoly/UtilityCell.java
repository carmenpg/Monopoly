package edu.uhu.monopoly;

public class UtilityCell extends Cell {

	public static final String COLOR_GROUP = "UTILITY";
	private static int PRICE;

	public static void setPrice(int price) {
		UtilityCell.PRICE = price;
	}

	boolean available = true;

	public int getPrice() {
		return UtilityCell.PRICE;
	}

	public int getRent(int diceRoll) {
		if(propietary.numberOfUtil() == 1) {
			return diceRoll * 4;
		} else if (propietary.numberOfUtil() >= 2) {
			return diceRoll * 10;
		}
		return 0;
	}

	public boolean playAction(String msg) {
		Player currentPlayer = null;
		if(!isAvailable()) {
			currentPlayer = GameMaster.instance().getCurrentPlayer();
			if(propietary != currentPlayer) {
				GameMaster.instance().utilRollDice();
				int diceRoll = GameMaster.instance().getUtilDiceRoll();
				currentPlayer.payRentTo(propietary, getRent(diceRoll));
			}
		}
		return true;
	}
}

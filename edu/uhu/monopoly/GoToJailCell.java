package edu.uhu.monopoly;

public class GoToJailCell extends Cell {
	
	boolean available = true;

	public GoToJailCell() {
		setName("Go to Jail");
	}

	public boolean playAction(String msg) {
		Player currentPlayer = GameMaster.instance().getCurrentPlayer();
		JailCell jail = (JailCell)(GameMaster.instance().getGameBoard().queryCell("Jail"));
		GameMaster.instance().sendToJail(currentPlayer);
		return true;
	}
}

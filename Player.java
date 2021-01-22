import java.util.List;

public abstract class Player {

	private Deck hand;
	private int id;

	public Player(Deck hand, int id) {
		this.hand = hand;
		this.id = id;
	}

	public void addCard() {
		// TODO - implement Player.addCard
		throw new UnsupportedOperationException();
	}

	public void subCard() {
		// TODO - implement Player.subCard
		throw new UnsupportedOperationException();
	}

	public Deck getHandCard() {
		// TODO - implement Player.getHandCard
		throw new UnsupportedOperationException();
	}

	public void dealOneCard() {
		// TODO - implement Player.dealOneCard
		throw new UnsupportedOperationException();
	}

}
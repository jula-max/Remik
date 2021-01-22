import java.util.List;

public class Gameplay {

	private Deck deck1;
	private Deck deck2;
	private Card topCard;
	private List<Player> players;

	public Gameplay() {
		// TODO - implement Gameplay.Gameplay
		throw new UnsupportedOperationException();
	}

	public void dealCards() {
		// TODO - implement Gameplay.dealCards
		throw new UnsupportedOperationException();
	}

	public void turn() {
		// TODO - implement Gameplay.turn
		throw new UnsupportedOperationException();
	}

	public Card getTopCard() {
		return this.deck1.get(deck1.size()-1);
	}

	/**
	 * 
	 * @param topCard
	 */
	public void setTopCard(Card topCard) {
		this.topCard = topCard;
	}

	public void getAttribute() {
		// TODO - implement Gameplay.getAttribute
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param attribute
	 */
	public void setAttribute(int attribute) { //?? nw co to
		// TODO - implement Gameplay.setAttribute
		throw new UnsupportedOperationException();
	}

	public Player[] getPlayers() {
		// TODO - implement Gameplay.getPlayers
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param players
	 */
	public void setPlayers(Player[] players) {
		// TODO - implement Gameplay.setPlayers
		throw new UnsupportedOperationException();
	}

}
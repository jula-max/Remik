import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Deck implements List<Card> {

	private List<Card> cards;

	public Deck() {
	}

	public Deck(List<Card> cards) {
		this.cards = cards;
	}

	public void shuffle() {
		// TODO - implement Deck.shuffle
		throw new UnsupportedOperationException();
	}

	public void subCard() {
		// TODO - implement Deck.subCard
		throw new UnsupportedOperationException();
	}

	public void addCards() {
		// TODO - implement Deck.addCards
		throw new UnsupportedOperationException();
	}


	public Deck getSubDeck(int[] i){

		Deck subDeck = new Deck();

		for (int j = 0; j < i.length; j++) {
			subDeck.add(cards.get(i[j]));
		}

		return subDeck;
	}

	public Card getCard(int i){
		//TODO
		return  cards.get(i);
	}

	@Override
	public int size() {
		return 0;
	}

	@Override
	public boolean isEmpty() {
		return false;
	}

	@Override
	public boolean contains(Object o) {
		return false;
	}

	@Override
	public Iterator<Card> iterator() {
		return null;
	}

	@Override
	public Object[] toArray() {
		return new Object[0];
	}

	@Override
	public <T> T[] toArray(T[] a) {
		return null;
	}

	@Override
	public boolean add(Card card) {
		return false;
	}

	@Override
	public boolean remove(Object o) {
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		return false;
	}

	@Override
	public boolean addAll(Collection<? extends Card> c) {
		return false;
	}

	@Override
	public boolean addAll(int index, Collection<? extends Card> c) {
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		return false;
	}

	@Override
	public void clear() {

	}

	@Override
	public boolean equals(Object o) {
		return false;
	}

	@Override
	public int hashCode() {
		return 0;
	}

	@Override
	public Card get(int index) {
		return null;
	}

	@Override
	public Card set(int index, Card element) {
		return null;
	}

	@Override
	public void add(int index, Card element) {

	}

	@Override
	public Card remove(int index) {
		return null;
	}

	@Override
	public int indexOf(Object o) {
		return 0;
	}

	@Override
	public int lastIndexOf(Object o) {
		return 0;
	}

	@Override
	public ListIterator<Card> listIterator() {
		return null;
	}

	@Override
	public ListIterator<Card> listIterator(int index) {
		return null;
	}

	@Override
	public List<Card> subList(int fromIndex, int toIndex) {
		return null;
	}
}
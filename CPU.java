public class CPU extends Player {
    public CPU(Deck hand, int id) {
        super(hand, id);
    }

    public Deck makeMove(int[] i){
        return getHandCard().getSubDeck(i);
    }
}

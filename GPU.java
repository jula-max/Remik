public class GPU extends Player {


    public GPU(Deck hand, int id) {
        super(hand, id);
    }

    public Deck getMove(int[] i){
        return getHandCard().getSubDeck(i);
    }


}

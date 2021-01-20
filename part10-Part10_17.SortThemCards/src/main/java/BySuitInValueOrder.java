import java.util.Comparator;

public class BySuitInValueOrder implements Comparator<Card> {
    public int compare(Card c1, Card c2) {
        int suitValueOrder = c1.getSuit().ordinal() - c2.getSuit().ordinal();
        if(suitValueOrder == 0) {
            return c1.compareTo(c2);
        }
        return suitValueOrder;
//        if (this.value > card.value) {
//            return 1;
//        }
//        if(this.value == card.value) {
//            if(this.suit.ordinal() < card.suit.ordinal()) {
//                return -1;
//            }else if (this.suit.ordinal() > card.suit.ordinal()){
//                return 1;
//            }else if(this.suit.ordinal() == card.suit.ordinal()){
//                return 0;
//            }
//        }
//        if(this.value < card.value) {
//            return -1;
//        }
//        return 0;
//    }
    }
}

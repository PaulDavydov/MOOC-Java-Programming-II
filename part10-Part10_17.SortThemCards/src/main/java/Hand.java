import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Hand implements Comparable<Hand>{
    private List<Card> cards;
    public Hand() {
        cards = new ArrayList<>();
    }

    public void add(Card card) {
        cards.add(card);
    }
    public void print() {
        cards.stream().forEach(i -> System.out.println(i));
    }
    public void sort() {
        Comparator<Card> comparator = Comparator.comparing(Card::getValue)
                .thenComparing(Card::getSuit);
        Collections.sort(cards,comparator);
    }
    public int sum() {
        return cards.stream().mapToInt(i -> i.getValue()).sum();
    }

    @Override
    public int compareTo(Hand o) {
        int hand1 = cards.stream().mapToInt(i -> i.getValue()).sum();
        int hand2 = o.sum();
        if (hand1 < hand2) {
            return -1;
        }
        if(hand1 > hand2) {
            return 1;
        }
        return 0;
    }
    public void sortBySuit() {
        BySuitInValueOrder sortBySuit = new BySuitInValueOrder();
        Collections.sort(cards,sortBySuit);
    }
}

import java.util.ArrayList;
import java.util.Random;

public class Deck {

   private ArrayList<Card> cards;
  
   public Deck() {
        String Rank[] = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        String Suit[] = {"♣", "♦", "♥", "♠"};
        cards = new ArrayList<>();
        for(int i = 0; i < 4; i++) {
            for(int s = 0; s < 13; s++) {
            String name = Rank[s] + " of " + Suit[i];
            Card acard = new Card(name, s + 1);
            cards.add(acard);
            }
        }
   }
  
    public void shuffle() {
        Random randomCard = new Random();
        for(int i = 1; i < 52; i++) {

        int s = randomCard.nextInt(52 - i) + i;
        Card tmp = cards.get(i - 1);
        cards.set(i - 1, cards.get(s));
        cards.set(s, tmp);
        }
   }
  
   public Card draw() {
       Card topCard = cards.get(cards.size()-1);
      
       cards.remove(topCard);
      
       return topCard;
   }  
}
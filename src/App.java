public class App {
   
    public static void main (String[] args) {
       
       Deck deck = new Deck();
      
       Player player1 = new Player("Player 1 Name");
      
       Player player2 = new Player("Player 2 Name");
      
       deck.shuffle();
      
       for (int i = 0; i < 52; i++) {
            if( i % 2 == 0) {
               player1.draw(deck);
            } else{
               player2.draw(deck);
            }
       }
      
        for (int i = 0; i < 26; i++) {
            Card card1 = player1.flip();
            Card card2 = player2.flip();


            
            if (card1.getValue() == 10) {
                System.out.println (player1.getName() + " drew a Jack!");
            } else if (card1.getValue() == 11) {
                System.out.println (player1.getName() + " drew a Queen!");
            } else if (card1.getValue() == 12) {
                System.out.println (player1.getName() + " drew a King!");
            } else if (card1.getValue() == 13) {
                System.out.println (player1.getName() + " drew a Ace!");
            } else {
                System.out.println (player1.getName() + " drew a " + (card1.getValue() + 1));
            }

            if (card2.getValue() == 10) {
                System.out.println (player2.getName() + " drew a Jack!");
            } else if (card1.getValue() == 11) {
                System.out.println (player2.getName() + " drew a Queen!");
            } else if (card1.getValue() == 12) {
                System.out.println (player2.getName() + " drew a King!");
            } else if (card1.getValue() == 13) {
                System.out.println (player2.getName() + " drew a Ace!");
            } else {
                System.out.println (player2.getName() + " drew a " + (card2.getValue() + 1));
            } 

            if (card1.getValue() > card2.getValue()) {

                player1.incrementScore();

                if (card1.getValue() == 10) {
                    System.out.println (player1.getName() + " won the round with a Jack!");
                } else if (card1.getValue() == 11) {
                    System.out.println (player1.getName() + " won the round with a Queen!");
                } else if (card1.getValue() == 12) {
                    System.out.println (player1.getName() + " won the round with a King!");
                } else if (card1.getValue() == 13) {
                    System.out.println (player1.getName() + " won the round with a Ace!");
                } else {
                    System.out.println (player1.getName() + " won the round with a " + (card1.getValue() + 1));
                }   
               
            } else if (card1.getValue() < card2.getValue()) {

                player2.incrementScore();

                if (card2.getValue() == 10) {
                    System.out.println (player2.getName() + " won the round with a Jack!");
                } else if (card2.getValue() == 11) {
                    System.out.println (player2.getName() + " won the round with a Queen!");
                } else if (card2.getValue() == 12) {
                    System.out.println (player2.getName() + " won the round with a King!");
                } else if (card2.getValue() == 13) {
                    System.out.println (player2.getName() + " won the round with a Ace!");
                } else {
                    System.out.println (player2.getName() + " won the round with a " + (card2.getValue() + 1));
                }

            } else {
                System.out.println (player1.getName() + " and " + player2.getName() + " both drew a " + (card2.getValue() + 1) + " Its a draw!");
            }
        }
      
        System.out.println ("Score of " + player1.getName() + ": " + player1.getScore());
        System.out.println ("Score of " + player2.getName() + ": " + player2.getScore());
      
        if (player1.getScore() > player2.getScore()) {
            System.out.println ("Player 1");
        } else if (player1.getScore() < player2.getScore()) {
            System.out.println ("Player 2");
        } else {
            System.out.println ("Draw");
        }
   }
}
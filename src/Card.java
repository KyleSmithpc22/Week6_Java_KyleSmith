public class Card {
    
   private int value;
   private String name;
  
   public Card(String name, int value) {
       this.name = name;
       this.value = value;
   }
  
   public String getName() {
       return name;
   }
  
   public int getValue() {
       return value;
   }
  
   public void setName(String name) {
       this.name = name;
   }
  
   public void setValue(int value) {
       this.value = value;
   }
  
   public void describe() {
       System.out.println (name);
   }
}
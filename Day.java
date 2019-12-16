public class Day {
   public static void main(String[] args) {
      int week = 4;
      String day;
	        
      switch (week) {
         case 1:
           day = "Snday";
           break;
         case 2:
           day = "Monday";
	   break;
         case 3:
           day = "Tusday";
           break;
         case 4:
           day = "Wenesday";
           break;
         case 5:
           day = "Thrsday";
           break;
         case 6:
           day = "Frday";
           break;
         case 7:
           day = "Satrday";
           break;
      }
      System.out.println(day);
   }
}
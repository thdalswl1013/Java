//2020112099 송민지
//본인은 이 소스파일을 다른 사람의 소스를 복사하지 않고 직접 작성하였습니다.

public class Time2Test {

   public static void main(String[] args) {
      Time1 t1 = new Time1();
      Time1 t2 = new Time1(2);
      Time1 t3 = new Time1(21,34);
      Time1 t4 = new Time1(12, 25, 42);
      Time1 t5 = new Time1(t4);
      
      System.out.println("Constructed with:");
      displayTime("t1: all default arguments", t1);
      displayTime("t2: hour specified; default minute and second", t2);
      displayTime("t3: hour and minute specified;default second", t3);
      displayTime("t4: hour, minute and second specified", t4);
      displayTime("t5: Time2 object t4 specified", t5);
      
      try {
         Time1 t6 = new Time1(27, 74, 99);
      }
      catch (IllegalArgumentException e) {
         System.out.printf("\nException while initializing t6: %s%n", e.getMessage());
      }
      
      
   }

   private static void displayTime(String header, Time1 t) {
      System.out.printf("%s%n   %s%n   %s%n",header, t.toUniversalString(), t.toString());
   }
}
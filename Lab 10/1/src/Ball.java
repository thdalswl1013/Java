//“2020112099 송민지”
//“본인은 이 소스파일을 다른 사람의 소스를 복사하지 않고 직접 작성하였습니다.” 

// Create a ball to bounce around a JPanel.
import java.util.Random;

public class Ball implements Runnable
{
   private int x; // horizontal position of ball
   private int y; // vertical position of ball
   private int dx; // change in horizontal position of ball
   private int dy; // change in vertical position of ball
   private final int MAX_X = 200; // horizontal edge of JPanel
   private final int MAX_Y = 200; // vertical edge of JPanel
   private static final Random generator = new Random();

   public Ball( int xPos, int yPos )
   {
      dx = generator.nextInt( 5 ) + 1; // change in x (1-5 pixels)
      dy = generator.nextInt( 5 ) + 1; // change in y (1-5 pixels)
      x = xPos; // set ball to horizontal position of mouse press
      y = yPos; // set ball to vertical position of mouse press
   } // end Ball constructor

   // bounces ball perpetually until window is closed
   public void run()
   {
      while ( true ) // infinite loop
      {
         try 
         {
            Thread.sleep( 20 ); // sleep for 20 milliseconds
         } // end try
         // process InterruptedException during sleep
         catch ( InterruptedException exception ) 
         {
            exception.printStackTrace();
         } // end catch

         x += dx; // determine new x-position
         y += dy; // determine new y-position

         // if bounce off top or bottom of JPanel
         if ( y <= 0 || y >= MAX_Y - 10 )
            dy = -dy; // reverse velocity in y direction

         // if bounce off left or right of JPanel
         if ( x <= 0 || x >= MAX_X - 10 )
            dx = -dx; // reverse velocity in x direction
      }  // end while
   } // end method run

   // get horizontal position of ball
   public int getX()
   {
      return x; // return x value
   } // end method getX

   // get vertical position of ball
   public int getY()
   {
      return y; // return y value
   } // end method getY
} // end class Ball

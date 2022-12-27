//“2020112099 송민지”
//“본인은 이 소스파일을 다른 사람의 소스를 복사하지 않고 직접 작성하였습니다.” 

// Repaints the JPanel with bouncing balls.
import javax.swing.JFrame;

public class RepaintTimer implements Runnable
{
   private final JFrame repaintComponent;

   public RepaintTimer( JFrame frame )
   {
      // specify component to be repainted
      repaintComponent = frame;
   } // end RepaintTimer constructor
   
   public void run()
   {
      while ( true )
      {
         try
         {
            Thread.sleep( 20 );
         } // end try
         catch ( InterruptedException ex )
         {
            ex.printStackTrace();
         } // end catch
         
         repaintComponent.repaint(); // repaint the component
     } // end while
   } // end method run
} // end class RepaintTimer



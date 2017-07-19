import java.awt.Toolkit;
class Sound extends Thread
{
 public void run()
 {
try        
{
for(int i=0;i<10;i++)
     {
      Toolkit.getDefaultToolkit().beep();
       Thread.sleep(1000);
	   }
} 
catch(InterruptedException ex) 
{
    Thread.currentThread().interrupt();
}

 }
}
class SoundBeep 
{
  public static void main ( String [] args) 
  {
     Sound s=new Sound();
     s.start();
    try        
     {
	  for (int i=0;i<5;i++)
     {
    	 System.out.println("Deep is good");
         Thread.sleep(2000);
		 }
     } 
     catch(InterruptedException ex) 
     {
         Thread.currentThread().interrupt();
     }	 
  }
}
	

	



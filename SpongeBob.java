import java.awt.*;
import hsa.Console;
import java.lang.*;
public class SpongeBob extends Thread
{
    private Console bannana;
    public void drawingSponge (int d)
    {
	for (int i = 0 ; i <= d ; i++)
	{
	    bannana.setColor (new Color (236, 220, 148));
	    bannana.fillRect (641 - i, 300, 80, 100); // Drawing SpongeBobs body
	    bannana.drawLine (661 - i, 400, 661 - i, 450); // Drawing SpongeBobs legs
	    bannana.drawLine (701 - i, 400, 701- i, 450);
	    bannana.fillOval (659 - i, 320, 13, 13); // Drawing SpongeBobs eyes
	    bannana.fillOval (691 - i, 320, 13, 13);
	    bannana.drawArc (665 - i, 340, 30, 20, 0, -180);
	    bannana.fillRect (643 - i, 442, 18, 9); //Drawing SpongeBobs feet
	    bannana.fillRect (683 - i, 442, 18, 9);
	    // ----------------------------------------------------//
	    bannana.setColor (new Color (255, 255, 0));
	    bannana.fillRect (640 - i, 300, 80, 100); // Drawing SpongeBobs body
	    bannana.setColor (Color.black);
	    bannana.drawLine (660 - i, 400, 660 - i, 450); // Drawing SpongeBobs legs
	    bannana.drawLine (700 - i, 400, 700 - i, 450);
	    bannana.fillOval (658 - i, 320, 13, 13); // Drawing SpongeBobs eyes
	    bannana.fillOval (690 - i, 320, 13, 13);
	    bannana.drawArc (664 - i, 340, 30, 20, 0, -180);
	    bannana.fillRect (642 - i, 442, 18, 9); //Drawing SpongeBobs feet
	    bannana.fillRect (682 - i, 442, 18, 9);

	    try
	    {
		Thread.sleep (50);
	    }
	    catch (Exception e)
	    {
	    }
	}
    }


    public void movingSponge1 ()
    {
	drawingSponge (150);
    }


    public SpongeBob (Console con)

    {
	bannana = con;
    }


    public void run ()
    {
	movingSponge1 ();
    }
}

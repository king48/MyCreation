import hsa.Console;
import java.awt.*;
import java.lang.*;

public class Krabs extends Thread
{
    private Console red;
    int distance = 200;

    public void drawKrabs (int speed)
    {
	for (int i = 0 ; i <= distance ; i++)
	{
	    // erase
	    red.setColor (new Color (236, 220, 148));
	    red.fillOval (400, 551 - i, 120, 85); // body
	    red.fillRect (430, 621 - i, 20, 40); // legs
	    red.fillRect (470, 621 - i, 20, 40);
	    red.fillOval (430, 511 - i, 20, 60); // tall eye things
	    red.fillOval (470, 511 - i, 20, 60);
	    red.fillOval (437, 531 - i, 5, 5); // puples
	    red.fillOval (477, 531 - i, 5, 5); //
	    red.drawArc (441, 591- i, 40, 20, 0, -180); // smile
	    red.drawLine (455, 586 - i, 480, 581 - i); // nose
	    red.drawLine (380, 581 - i, 400, 586 - i); //arms
	    red.drawLine (517, 586 - i, 542, 581 - i);

	    //---------------------------------------------------------------------//

	    // draw
	    red.setColor (new Color (235, 17, 17));
	    red.fillOval (400, 550 - i, 120, 85); // body
	    red.fillRect (430, 620 - i, 20, 40); // legs
	    red.fillRect (470, 620 - i, 20, 40);
	    red.fillOval (430, 510 - i, 20, 60); // tall eye things
	    red.fillOval (470, 510 - i, 20, 60);
	    red.setColor (Color.white);
	    red.fillOval (437, 530 - i, 5, 5); // puples
	    red.fillOval (477, 530 - i, 5, 5); //
	    red.setColor (Color.black);
	    red.drawArc (441, 590 - i, 40, 20, 0, -180); // smile
	    red.drawLine (455, 585 - i, 480, 580 - i); // nose
	    red.drawLine (380, 580 - i, 400, 585 - i); //arms
	    red.drawLine (517, 585 - i, 542, 580 - i);
	    // red.drawline ();
	    try
	    {
		Thread.sleep (speed);
	    }
	    catch (Exception e)
	    {
	    }
	}
    }


    public void krabsMovement1 ()
    {
	drawKrabs (10);
    }


    public Krabs (Console con)
    {
	red = con;
    }


    public void run ()
    {
	krabsMovement1 ();
    }
}

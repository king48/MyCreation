import hsa.Console;
import java.awt.*;
import java.lang.*;

public class Krabs implements Runnable
{
    private Console red;
    int distance = 200;

    public void drawKrabs (int speed)
    {
	try
	{
	    Thread.sleep (5000);
	}
	catch (Exception e)
	{
	}

	for (int i = 0 ; i <= distance ; i++)
	{
	    // erase
	    red.setColor (new Color (236, 220, 148));
	    red.fillOval (250, 551 - i, 120, 85); // body
	    red.fillRect (280, 621 - i, 20, 40); // legs
	    red.fillRect (320, 621 - i, 20, 40);

	    red.fillOval (280, 511 - i, 20, 60); // tall eye things
	    red.fillOval (320, 511 - i, 20, 60);

	    red.fillOval (287, 531 - i, 5, 5); // puples
	    red.fillOval (327, 531 - i, 5, 5); //

	    red.drawArc (291, 591 - i, 40, 20, 0, -180); // smile
	    red.drawLine (305, 586 - i, 330, 581 - i); // nose
	    red.drawLine (225, 581 - i, 250, 586 - i); //arms
	    red.drawLine (367, 586 - i, 392, 581 - i);

	    //---------------------------------------------------------------------//

	    // draw
	    red.setColor (new Color (235, 17, 17));
	    red.fillOval (250, 550 - i, 120, 85); // body
	    red.fillRect (280, 620 - i, 20, 40); // legs
	    red.fillRect (320, 620 - i, 20, 40);

	    red.fillOval (280, 510 - i, 20, 60); // tall eye things
	    red.fillOval (320, 510 - i, 20, 60);

	    red.setColor (Color.white);
	    red.fillOval (287, 530 - i, 5, 5); // puples
	    red.fillOval (327, 530 - i, 5, 5); //

	    red.setColor (Color.black);
	    red.drawArc (291, 590 - i, 40, 20, 0, -180); // smile
	    red.drawLine (305, 585 - i, 330, 580 - i); // nose
	    red.drawLine (225, 580 - i, 250, 585 - i); //arms
	    red.drawLine (367, 585 - i, 392, 580 - i);
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
	Text t = new Text (red);

	drawKrabs (10);
	try
	{
	    Thread.sleep (1000);
	}
	catch (Exception e)
	{
	}
	t.krabTalk (300, 500);

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

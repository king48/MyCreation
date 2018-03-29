import java.awt.*;
import hsa.Console;
import java.lang.*;

public class Money implements Runnable
{
    private Console boi;
    Color color, color2, color3, e, b, a;
    int speed = 10;

    public void drawingMoney ()
    {

	Color waterBlue = new Color (32, 180, 235);
	Color sandGround = new Color (236, 220, 148);

	for (int y = 0 ; y <= 120 ; y++)
	{
	    boi.setColor (sandGround);
	    boi.fillRect (216, 541 - y, 20, 20);
	    boi.fillStar (220, 535 - y, 12, 12);
	    boi.fillOval (220, 515 - y, 12, 12);
	    boi.fillMapleLeaf (215, 495 - y, 12, 12);
	    ////
	    boi.setColor (color);
	    boi.fillRect (216, 540 - y, 20, 20);
	    boi.setColor (color2);
	    boi.fillRect (216, 520 - y, 20, 20);
	    boi.setColor (color3);
	    boi.fillRect (216, 500 - y, 20, 20);
	    boi.setColor (Color.white);
	    boi.fillStar (220, 536 - y, 12, 12);
	    boi.fillOval (220, 516 - y, 12, 12);
	    boi.fillMapleLeaf (220, 496 - y, 12, 12);

	    try
	    {
		Thread.sleep (speed);
	    }
	    catch (Exception e)
	    {
	    }
	}
    }


    public Money (Console con)
    {
	boi = con;
	color = new Color (51, 204, 25); // dark red
	color2 = new Color (255, 0, 0); // bright red
	color3 = new Color (255, 204, 204); // light light red

    }


    public Money (Console con, Color a, Color b, Color e)
    {
	boi = con;
	color = a;
	color2 = b;
	color3 = e;
	speed = 30;
    }


    public Money (Console con, Color a, Color b, Color e, int s)
    {
	boi = con;
	color = a;
	color2 = b;
	color3 = e;
	speed = s;
    }


    


    public void run ()
    {
	drawingMoney ();

    }
}



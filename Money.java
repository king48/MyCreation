import java.awt.*;
import hsa.Console;
import java.lang.*;

public class Money implements Runnable
{
    private Console boi;
    Color color, color2, color3, e, b, a;
    int speed = 20;

    public void drawingMoney ()
    {
	Color waterBlue = new Color (32, 180, 235);
	for (int y = 0 ; y <= 100 ; y++)
	{
	    boi.setColor (waterBlue);
	    boi.fillRect (200, 59 + y, 20, 20);
	    boi.fillStar (204, 65 + y, 12, 12);
	    boi.fillOval (204, 85 + y, 12, 12);
	    boi.fillMapleLeaf (204, 105 + y, 12, 12);
	    //
	    boi.setColor (color);
	    boi.fillRect (200, 60 + y, 20, 20);
	    boi.setColor (color2);
	    boi.fillRect (200, 80 + y, 20, 20);
	    boi.setColor (color3);
	    boi.fillRect (200, 100 + y, 20, 20);
	    boi.setColor (Color.white);
	    boi.fillStar (204, 65 + y, 12, 12);
	    boi.fillOval (204, 85 + y, 12, 12);
	    boi.fillMapleLeaf (204, 105 + y, 12, 12);

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
	speed = 50;
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



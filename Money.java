import java.awt.*;
import hsa.Console;
import java.lang.*;

public class Money implements Runnable
{
    private Console boi;
    Color color, color2, color3, e, b, a;
    int speed;

    public void drawingMoney ()
    {
	Color waterBlue = new Color (32, 180, 235);
	for (int y = 0 ; y <= 200 ; y++)
	{
	    boi.setColor (waterBlue);
	    boi.fillRect (100, 99 + y, 50, 80);
	    boi.setColor (color);
	    boi.fillRect (100, 100 + y, 50, 80);
	    boi.setColor (color2);
	    boi.fillRect (100, 100 + y, 50, 80);
	    boi.setColor (color3);
	    boi.fillRect (100, 100 + y, 50, 80);

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
	color = new Color (1, 149, 149);
	color2 = new Color (149, 149, 1);
	color3 = new Color (149, 1, 149);
	int speed = 200;

    }


    public Money (Console con, Color color, Color color2, Color color3)
    {
	boi = con;
	color = a;
	color2 = b;
	color3 = e;
	int speed = 250;
    }


    public Money (Console con, Color color, Color color2, Color color3, int s)
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



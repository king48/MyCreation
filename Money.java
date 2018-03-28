import java.awt.*;
import hsa.Console;
import java.lang.*;

public class Money extends Thread
{
    private Console boi;
    Color color, a;
    int s;
    public void drawingMoney ()
    {
	Color waterBlue = new Color (32, 180, 235);
	for (int y = 0 ; y <= 200 ; y++)
	{

	    boi.setColor (color);
	    boi.fillRect (100, 100 + y, 50, 80);
	    boi.setColor (waterBlue);
	    boi.fillRect (100, 100 + y, 10, 10);

	    try
	    {
		sleep (s);
	    }
	    catch (Exception e)
	    {
	    }
	}
    }


    public Money (Console con)
    {
	boi = con;
	color = new Color (149, 149, 149);
    }


    public Money (Console con, Color color)
    {
	boi = con;
	color = a;
    }


    public Money (Console con, Color color, int speed)
    {
	boi = con;
	color = a;
	speed = s;
    }



    public void run ()
    {

	drawingMoney ();
    }
}



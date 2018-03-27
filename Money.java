import java.awt.*;
import hsa.Console;

public class Money extends Thread
{
    private Console boi;
    Color color;
    int speed;
    Color a;
    int s;
    public void drawingMoney ()
    {
	for (int y = 0 ; y <= 100 ; y++)
	{
	    boi.setColor (color);
	    boi.fillRect (10, 100 + y, 10, 10);

	    try
	    {
		Thread.sleep (s);
	    }
	    catch (Exception e)
	    {
	    }
	}
    }


    public void money1 (Console con)
    {
	con = boi;
    }


    public void money1 (Console con, Color color)
    {
	con = boi;
	color = a;
    }


    public void money1 (Console con, Color color, int speed)
    {
	con = boi;
	color = a;
	speed = s;
    }


    public Money (Console con)
    {
	boi = con;
    }
}



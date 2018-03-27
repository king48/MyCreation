import java.awt.*;
import hsa.Console;

public class Money
{
    private Console boi;

    public void drawingMoney (int speed, int color1, int color2, int color3, int distance)
    {
	for (int y = 0 ; y <= distance ; y++)
	{
	    boi.setColor (new Color (color1, color2, color3));
	    boi.fillRect (10, 100 + y, 10, 10);

	    try
	    {
		Thread.sleep (speed);
	    }
	    catch (Exception e)
	    {
	    }
	}
    }


    public void money1 ()
    {
	drawingMoney (100, 31, 233, 211, 350);
    }


    public void money2()
    {
    }


    public void money3()
    {
    }


    public Money (Console con)
    {
	boi = con;
	money1 ();
	money2 ();
	money3 ();


    }
}



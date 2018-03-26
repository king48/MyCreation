import java.awt.*;
import hsa.Console;

public class Background
{
    private Console bannana;

    public void back ()
    {
	bannana.setColor (new Color (32, 180, 235)); // the blue background
	bannana.fillRect (0, 0, 640, 400);
	bannana.setColor (new Color (236, 220, 148)); // the sandy ground
	bannana.fillRect (0, 400, 640, 400);
    }


    public void ground ()
    {
    }


    public void patrickHouse ()
    {
	bannana.setColor (new Color (146, 100, 54));
	bannana.fillArc (0, 300, 225, 200, 0, 180);
    }


    public void squidHouse ()
    {
	bannana.setColor (new Color (148, 146, 145));
	bannana.fillRect (290, 180, 120, 220);
	// bannana.setColor (Color.black);
	// bannana.fillRect (30, 30, 12, 12);
    }


    public void spongeBobHouse ()
    {
    }


    public Background (Console con)
    {
	bannana = con;
	back ();
	ground ();
	patrickHouse ();
	squidHouse ();
	spongeBobHouse ();
    }
}

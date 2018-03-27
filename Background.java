import java.awt.*;
import hsa.Console;

public class Background
{
    private Console bannana;

    public void back ()
    {
	bannana.setColor (new Color (32, 180, 235)); // Creates the blue background color
	bannana.fillRect (0, 0, 640, 400); // Makes the blue background

    }


    public void ground ()
    {
	bannana.setColor (new Color (236, 220, 148)); // Creates the sandy ground color
	bannana.fillRect (0, 400, 640, 400); // Makes the ground
    }


    public void patrickHouse ()
    {
	bannana.setColor (new Color (146, 100, 54)); // Creates the brown rock color
	bannana.fillArc (0, 300, 225, 200, 0, 180); // Makes Patricks home
    }


    public void squidHouse ()
    {
    
	bannana.setColor (new Color (148, 146, 145)); // Creates the
	bannana.fillRect (290, 180, 120, 220);
    }


    public void spongeBobHouse ()
    {
	bannana.setColor (new Color (240, 164, 0));
	bannana.fillArc (500, 300, 0, 545, 120, 150);

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

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
	bannana.fillRect (280, 180, 120, 220); // Creates the main body of the hose
	bannana.fillRect (300, 164, 80, 16);
	bannana.fillRect (260, 210, 20, 100);
	bannana.fillRect (400, 210, 20, 100);
	bannana.setColor (Color.black);
	bannana.fillRect (318, 346, 40, 55);
	bannana.fillOval (300, 220, 35, 35);
	bannana.fillOval (350, 220, 35, 35);
	// bannana.drawRect (280, 180, 120, 220); // Creates the main outline of the house
	// //creates the outlines for the other parts of the house
	// bannana.drawRect (300, 164, 80, 16);
	// bannana.drawRect (260, 210, 20, 100);
	// bannana.drawRect (400, 210, 20, 100);


    }


    public void spongeBobHouse ()
    {
	// I say pineapple in quotes because in reality it doesn't have a stem so it is not actually a pineapple
	bannana.setColor (new Color (240, 164, 1)); // Creates the organge color to the 'pineapple'
	bannana.fillArc (460, 200, 180, 400, 0, 180); // Creats the actual 'pineapple'
	bannana.setColor (new Color (181, 181, 181)); // Creates the grey color for the door and windows
	bannana.fillArc (525, 350, 50, 100, 0, 180); // Creates the door to the 'pineapple'
	bannana.fillOval (500, 270, 30, 30); // Creates the window to the 'pineapple'
	bannana.fillOval (590, 330, 30, 30); // Creates the second window to the 'pineapple'
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

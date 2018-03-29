import hsa.Console;
import java.awt.*;
import java.lang.*;

public class Gary extends Thread
{
    private Console fou;
    public void drawGary (int x2, int speed)
    {
	for (int i = 0 ; i <= x2 ; i++)
	{
	    // erase
	    fou.setColor (new Color (236, 220, 148));
	    fou.fillOval (155, 601 - i, 100, 20);
	    fou.fillRect (160, 581 - i, 5, 35);
	    fou.fillRect (170, 581 - i, 5, 35); // Fraws the supports to garys eyes
	    fou.fillArc (185, 561 - i, 60, 100, 0, 180); // Draws Garys shell
	    fou.fillOval (158, 576 - i, 9, 9); // Draws garys eyes
	    fou.fillOval (168, 576 - i, 9, 9);
	    fou.fillOval (161, 579 - i, 3, 3); //Draws garys puples
	    fou.fillOval (171, 579 - i, 3, 3);
	    // fou.drawLine (10, 10, 120, 120);
	    fou.fillMapleLeaf (204, 581 - i, 20, 20); // Draws the maple leaf of Garys shell

	    //---------------------------------------------------------------------//

	    // draw
	    fou.setColor (new Color (128, 229, 65));
	    fou.fillOval (155, 600 - i, 100, 20);
	    fou.fillRect (160, 580 - i, 5, 35);
	    fou.fillRect (170, 580 - i, 5, 35); // Fraws the supports to garys eyes
	    fou.setColor (new Color (255, 51, 255));
	    fou.fillArc (185, 560 - i, 60, 100, 0, 180); // Draws Garys shell
	    fou.setColor (Color.black); // Sets the eye color to back
	    fou.fillOval (158, 575 - i, 9, 9); // Draws garys eyes
	    fou.fillOval (168, 575 - i, 9, 9);
	    fou.setColor (Color.white); // Sets the puple color to white
	    fou.fillOval (161, 578 - i, 3, 3); //Draws garys puples
	    fou.fillOval (171, 578 - i, 3, 3);
	    // fou.drawLine (10, 10, 120, 120);
	    fou.setColor (new Color (165, 128, 250)); // Sets the light purple color
	    fou.fillMapleLeaf (204, 580 - i, 20, 20); // Draws the maple leaf of Garys shell

	    try
	    {
		Thread.sleep (speed);
	    }
	    catch (Exception e)
	    {
	    }
	}
    }


    public void garyMovement1 ()
    {
	drawGary (200, 5);
    }


    public Gary (Console con)
    {
	fou = con;
    }


    public void run ()
    {
	garyMovement1 ();
    }
}

import hsa.Console;
import java.awt.*;
import java.lang.*;

public class Gary extends Thread
{
    private Console fou;
    int speed = 100;
    public void drawGary ()
    {
	for (int i = 0 ; i <= 200 ; i++)
	{
	    // erase
	    fou.setColor (new Color (32, 180, 235));
	    fou.fillOval (641 - i, 100, 100, 20);
	    fou.fillRect (646 - i, 80, 5, 35);
	    fou.fillRect (656 - i, 80, 5, 35); // Fraws the supports to garys eyes
	    fou.fillArc (671 - i, 60, 60, 100, 0, 180); // Draws Garys shell
	    fou.fillOval (644 - i, 75, 9, 9); // Draws garys eyes
	    fou.fillOval (654 - i, 75, 9, 9);
	    fou.fillOval (647 - i, 78, 3, 3); //Draws garys puples
	    fou.fillOval (657 - i, 78, 3, 3);
	    // fou.drawLine (10, 10, 120, 120);
	    fou.fillMapleLeaf (670 - i, 80, 20, 20); // Draws the maple leaf of Garys shell

	    //---------------------------------------------------------------------//

	    // draw
	    fou.setColor (new Color (128, 229, 65));
	    fou.fillOval (640 - i, 100, 100, 20);
	    fou.fillRect (645 - i, 80, 5, 35);
	    fou.fillRect (655 - i, 80, 5, 35); // Fraws the supports to garys eyes
	    fou.setColor (new Color (255, 51, 255));
	    fou.fillArc (670 - i, 60, 60, 100, 0, 180); // Draws Garys shell
	    fou.setColor (Color.black); // Sets the eye color to back
	    fou.fillOval (643 - i, 75, 9, 9); // Draws garys eyes
	    fou.fillOval (653 - i, 75, 9, 9);
	    fou.setColor (Color.white); // Sets the puple color to white
	    fou.fillOval (646 - i, 78, 3, 3); //Draws garys puples
	    fou.fillOval (656 - i, 78, 3, 3);
	    // fou.drawLine (10, 10, 120, 120);
	    fou.setColor (new Color (165, 128, 250)); // Sets the light purple color
	    fou.fillMapleLeaf (689 - i, 80, 20, 20); // Draws the maple leaf of Garys shell
	}
	try
	{
	    Thread.sleep (speed);
	}
	catch (Exception e)
	{
	}
    }


    public Gary (Console con)
    {
	fou = con;
    }


    public void start ()
    {
	drawGary ();
    }
}

import java.awt.*;
import hsa.Console;
import java.lang.*;

public class Plankton implements Runnable
{
    private Console dude;
    public void drawPlankton (int x2, int speed)
    {
	for (int x = 0 ; x <= x2 ; x++)
	{
	    dude.setColor (new Color (236, 220, 148));
	    dude.fillOval (9 + x, 402, 15, 50);  // draws Planktons body
	    dude.setColor (new Color (236, 220, 148));
	    dude.fillOval (12 + x, 412, 4, 4);  // draws Planktons eyes
	    dude.fillOval (18 + x, 412, 4, 4);
	    // dude.drawLine ( , , , ); // draws all of Planktons limbs
	    // dude.drawLine ( , , , );
	    // dude.drawLine ( , , , );
	    // dude.drawLine ( , , , );
	    dude.setColor (new Color (236, 220, 148));
	    dude.fillRect (9 + x, 403, 15, 7);  //draws Planktons hat
	    dude.fillRect (13 + x, 394, 7, 9);
	    //-------------------------------------------------------------//
	    dude.setColor (new Color (0, 101, 50));
	    dude.fillOval (10 + x, 402, 15, 50); // draws Planktons body
	    dude.setColor (Color.red);
	    dude.fillOval (13 + x, 412, 4, 4);  // draws Planktons eyes
	    dude.fillOval (19 + x, 412, 4, 4);
	    // dude.drawLine ( , , , ); // draws all of Planktons limbs
	    // dude.drawLine ( , , , );
	    // dude.drawLine ( , , , );
	    // dude.drawLine ( , , , );
	    dude.setColor (new Color (153, 204, 255));
	    dude.fillRect (10 + x, 403, 15, 7);  //draws Planktons hat
	    dude.fillRect (14 + x, 394, 7, 9);

	    try
	    {
		Thread.sleep (speed);
	    }

	    catch (Exception e)
	    {
	    }
	}
    }


    public void planktonMovement1 ()
    {
	Text t = new Text (dude);

	drawPlankton (100, 50);
   
	t.planktonTalk (100, 100);
    }





    public Plankton (Console con)
    {
	dude = con;
    }


    public void run ()
    {
	planktonMovement1 ();
    }
}

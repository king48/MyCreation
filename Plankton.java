import java.awt.*;
import hsa.Console;
import java.lang.*;

public class Plankton extends Thread
{
    private Console dude;
    public void drawPlankton ()
    {
	for (int x = 0 ; x <= 100 ; x++)
	{
	    dude.setColor (new Color (236, 220, 148));
	    dude.fillOval (9 + x, 402, 15, 50); // draws Planktons body
	    dude.setColor (new Color (236, 220, 148));
	    dude.fillOval (12 + x, 412, 4, 4); // draws Planktons eyes
	    dude.fillOval (18 + x, 412, 4, 4);
	    // dude.drawLine ( , , , ); // draws all of Planktons limbs
	    // dude.drawLine ( , , , );
	    // dude.drawLine ( , , , );
	    // dude.drawLine ( , , , );
	    dude.setColor (new Color (236, 220, 148));
	    dude.fillRect (9 + x, 403, 15, 7); //draws Planktons hat
	    dude.fillRect (13 + x, 394, 7, 9);
	    //-------------------------------------------------------------//
	    dude.setColor (new Color (0, 101, 50));
	    dude.fillOval (10 + x, 402, 15, 50); // draws Planktons body
	    dude.setColor (Color.red);
	    dude.fillOval (13 + x, 412, 4, 4); // draws Planktons eyes
	    dude.fillOval (19 + x, 412, 4, 4);
	    // dude.drawLine ( , , , ); // draws all of Planktons limbs
	    // dude.drawLine ( , , , );
	    // dude.drawLine ( , , , );
	    // dude.drawLine ( , , , );
	    dude.setColor (new Color (153, 204, 255));
	    dude.fillRect (10 + x, 403, 15, 7); //draws Planktons hat
	    dude.fillRect (14 + x, 394, 7, 9);
	}

	try
	{
	    Thread.sleep (10);
	}

	catch (Exception e)
	{
	}
    }


    public Plankton (Console con)
    {
	dude = con;
    }
}

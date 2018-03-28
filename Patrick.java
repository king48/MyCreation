import java.awt.*;
import hsa.Console;


public class Patrick extends Thread
{
    private Console boo;
    public void drawPatrick (int x2, int speed)
    {
	for (int x = 0 ; x <= x2 ; x++)
	{
	    boo.setColor (new Color (245, 156, 96)); //Setting the pink body color
	    boo.fillStar (0 + x, 295, 120, 140); // Drawing Patricks body
	    boo.setColor (Color.black); // Setting back eye color
	    boo.fillOval (54 + x, 320, 5, 5); // Makes the two eyes of Patrick
	    boo.fillOval (62 + x, 320, 5, 5); // Makes the two eyes of Patrick
	    boo.drawArc (53 + x, 330, 14, 10, 10, -180); // adds smile of Patrick
	    boo.setColor (new Color (250, 85, 255)); //Setting blue-ish pants color
	    boo.fillRect (30 + x, 378, 60, 25); // top big pants
	    boo.fillRect (30 + x, 396, 25, 20); //left leg
	    boo.fillRect (65 + x, 396, 25, 20); //right leg

	    boo.setColor (new Color (236, 220, 148));
	    boo.drawLine (22 + x, 434, 30 + x, 410);
	    boo.drawLine (21 + x, 434, 29 + x, 410);
	    boo.drawLine (29 + x, 410, 29 + x, 400);
	    boo.drawLine (28 + x, 410, 28 + x, 400);
	    boo.drawLine (96 + x, 434, 75 + x, 415);
	    boo.drawLine (95 + x, 434, 74 + x, 415);

	    boo.drawLine (64 + x, 415, 64 + x, 404);
	    boo.drawLine (65 + x, 415, 65 + x, 404);



	    // still have to erase


	    try
	    {
		Thread.sleep (speed);
	    }
	    catch (Exception e)
	    {

	    }
	}

    }




    public void movement1 ()
    {
	Text t = new Text (boo);
	drawPatrick (100, 20);
	t.textPatrick1 (30, 260);
    }


    public void movement2 ()
    {
    }



    public void movement3 ()
    {
    }


    public Patrick (Console con)
    {
	boo = con;

    }
}

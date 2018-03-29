import java.awt.*;
import hsa.Console;
import java.lang.*;

public class Patrick implements Runnable
{
    private Console boo;
    public void drawPatrick (int x2, int speed)
    {
	for (int x = 0 ; x <= x2 ; x++)
	{

	    boo.setColor (new Color (236, 220, 148));
	    boo.fillStar (-1 + x, 305, 120, 140); // Drawing Patricks body
	    boo.fillOval (53 + x, 330, 5, 5); // Makes the two eyes of Patrick
	    boo.fillOval (61 + x, 330, 5, 5); // Makes the two eyes of Patrick
	    boo.drawArc (52 + x, 340, 14, 10, 10, -180); // adds smile of Patrick
	    boo.fillRect (29 + x, 388, 60, 25); // top big pants
	    boo.fillRect (29 + x, 406, 25, 20); //left leg
	    boo.fillRect (64 + x, 406, 25, 20); //right leg

	    boo.setColor (new Color (245, 156, 96)); //Setting the pink body color
	    boo.fillStar (0 + x, 305, 120, 140); // Drawing Patricks body
	    boo.setColor (Color.black); // Setting back eye color
	    boo.fillOval (54 + x, 330, 5, 5); // Makes the two eyes of Patrick
	    boo.fillOval (62 + x, 330, 5, 5); // Makes the two eyes of Patrick
	    boo.drawArc (53 + x, 340, 14, 10, 10, -180); // adds smile of Patrick
	    boo.setColor (new Color (250, 85, 255)); //Setting blue-ish pants color
	    boo.fillRect (30 + x, 388, 60, 25); // top big pants
	    boo.fillRect (30 + x, 406, 25, 20); //left leg
	    boo.fillRect (65 + x, 406, 25, 20); //right leg


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


    public void drawPatrick2 (int x2, int speed)
    {
	for (int y = 0 ; y <= x2 ; y++)
	{

	    boo.setColor (new Color (236, 220, 148));
	    boo.fillStar (-1, 305 - y, 120, 140); // Drawing Patricks body
	    boo.fillOval (53, 330 - y, 5, 5);  // Makes the two eyes of Patrick
	    boo.fillOval (61, 330 - y, 5, 5);  // Makes the two eyes of Patrick
	    boo.drawArc (52, 340 - y, 14, 10, 10, -180);  // adds smile of Patrick
	    boo.fillRect (29, 388 - y, 60, 25);  // top big pants
	    boo.fillRect (29, 406 - y, 25, 20);  //left leg
	    boo.fillRect (64, 406 - y, 25, 20);  //right leg

	    boo.setColor (new Color (245, 156, 96)); //Setting the pink body color
	    boo.fillStar (0, 305 - y, 120, 140);  // Drawing Patricks body
	    boo.setColor (Color.black); // Setting back eye color
	    boo.fillOval (54, 330 - y, 5, 5);  // Makes the two eyes of Patrick
	    boo.fillOval (62, 330 - y, 5, 5);  // Makes the two eyes of Patrick
	    boo.drawArc (53, 340 - y, 14, 10, 10, -180);  // adds smile of Patrick
	    boo.setColor (new Color (250, 85, 255)); //Setting blue-ish pants color
	    boo.fillRect (30, 388 - y, 60, 25);  // top big pants
	    boo.fillRect (30, 406 - y, 25, 20);  //left leg
	    boo.fillRect (65, 406 - y, 25, 20);  //right leg

	    try
	    {
		Thread.sleep (speed);
	    }
	    catch (Exception e)
	    {

	    }
	}

    }


    public void movement2 ()
    {
	Text t = new Text (boo);
	drawPatrick (100, 20);
	t.textPatrick1 (30, 260);

    }


    public Patrick (Console con)
    {
	boo = con;

    }


    public void run ()
    {
	movement1 ();
    }
}

import java.awt.*;
import hsa.Console;
import java.lang.*;

public class Patrick extends Thread
{
    private Console boo;
    int distance = 100;
    public void drawPatrick (int speed)
    {
	for (int x = 0 ; x <= distance ; x++)
	{
	    // erases
	    boo.setColor (new Color (236, 220, 148));
	    boo.fillStar (-21 + x, 305, 120, 140); // Drawing Patricks body
	    boo.fillOval (33 + x, 330, 5, 5); // Makes the two eyes of Patrick
	    boo.fillOval (41 + x, 330, 5, 5); // Makes the two eyes of Patrick
	    boo.drawArc (32 + x, 340, 14, 10, 10, -180); // adds smile of Patrick
	    boo.fillRect (9 + x, 388, 60, 25); // top big pants
	    boo.fillRect (9 + x, 406, 25, 20); //left leg
	    boo.fillRect (44 + x, 406, 25, 20); //right leg
	    //draws
	    boo.setColor (new Color (245, 156, 96)); //Setting the pink body color
	    boo.fillStar (-20 + x, 305, 120, 140); // Drawing Patricks body
	    boo.setColor (Color.black); // Setting back eye color
	    boo.fillOval (34 + x, 330, 5, 5); // Makes the two eyes of Patrick
	    boo.fillOval (42 + x, 330, 5, 5); // Makes the two eyes of Patrick
	    boo.drawArc (33 + x, 340, 14, 10, 10, -180); // adds smile of Patrick
	    boo.setColor (new Color (250, 85, 255)); //Setting blue-ish pants color
	    boo.fillRect (10 + x, 388, 60, 25); // top big pants
	    boo.fillRect (10 + x, 406, 25, 20); //left leg
	    boo.fillRect (45 + x, 406, 25, 20); //right leg

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
	drawPatrick (20);
	try
	{
	    Thread.sleep (100);
	}
	catch (Exception e)
	{
	}
	t.patrickTalk (30, 325);
    }


    public void drawPatrick2 (int distance2, int speed)
    {
	for (int y = 0 ; y <= distance2 ; y++)
	{
	    // Erases
	    boo.setColor (new Color (236, 220, 148)); // Creates the Sand color
	    boo.fillStar (-20 + distance, 306 - y, 120, 140); // Drawing Patricks body
	    boo.fillOval (34 + distance, 331 - y, 5, 5); // Makes the two eyes of Patrick
	    boo.fillOval (42 + distance, 331 - y, 5, 5); // Makes the two eyes of Patrick
	    boo.drawArc (33 + distance, 341 - y, 14, 10, 10, -180); // adds smile of Patrick
	    boo.fillRect (10 + distance, 389 - y, 60, 25); // top big pants
	    boo.fillRect (10 + distance, 407 - y, 25, 20); //left leg
	    boo.fillRect (45 + distance, 407 - y, 25, 20); //right leg
	    // Draws
	    boo.setColor (new Color (245, 156, 96)); //Setting the pink body color
	    boo.fillStar (-20 + distance, 305 - y, 120, 140); // Drawing Patricks body
	    boo.setColor (Color.black); // Setting back eye color
	    boo.fillOval (34 + distance, 330 - y, 5, 5); // Makes the two eyes of Patrick
	    boo.fillOval (42 + distance, 330 - y, 5, 5); // Makes the two eyes of Patrick
	    boo.drawArc (33 + distance, 340 - y, 14, 10, 10, -180); // adds smile of Patrick
	    boo.setColor (new Color (250, 85, 255)); //Setting blue-ish pants color
	    boo.fillRect (10 + distance, 388 - y, 60, 25); // top big pants
	    boo.fillRect (10 + distance, 406 - y, 25, 20); //left leg
	    boo.fillRect (45 + distance, 406 - y, 25, 20); //right leg

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
	t.patrickTalk2 (60, 360);


	try
	{
	    Thread.sleep (100); // gives us a ___ delay
	}
	catch (Exception e)
	{
	}

	drawPatrick2 (55, 20);
    }


    public Patrick (Console con)
    {
	boo = con;

    }


    public void run ()
    {
	movement1 ();
	try
	{
	    Thread.sleep (10); //(20000); // gives us a ___ delay
	}
	catch (Exception e)
	{

	}
	movement2 ();
    }
}


import java.awt.*;
import hsa.Console;


public class Patrick
{
    private Console boo;

    public void drawPatrick ()
    {
	boo.setColor (new Color (245, 156, 96)); //Setting the pink body color
	boo.fillStar (0, 295, 120, 140); // Drawing Patricks body

	boo.setColor (Color.black); // Setting back eye color
	boo.fillOval (54, 320, 5, 5); // Makes the two eyes of Patrick
	boo.fillOval (62, 320, 5, 5); // Makes the two eyes of Patrick
	boo.setColor ();
    }


    public Patrick (Console con)
    {
	boo = con;
    }
}

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
	
	boo.drawArc (53, 330, 14, 10, 10, -180); // adds smile of Patrick

	boo.setColor (new Color (250, 85, 255)); //Setting blue-ish pants color
	boo.fillRect (30, 378, 60, 25); // top big pants
	boo.fillRect (30, 396, 25, 20); //left leg
	boo.fillRect (65, 396, 25, 20); //righ leg

    }


    public Patrick (Console con)
    {
	boo = con;
    }
}

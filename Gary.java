import hsa.Console;
import java.awt.*;

public class Gary
{
    private Console fou;

    public void drawGary ()
    {
	fou.setColor (new Color (128, 229, 65));
	fou.fillOval (100, 100, 100, 20);

    }


    public Gary (Console con)
    {
	fou = con;
	drawGary ();
    }
}

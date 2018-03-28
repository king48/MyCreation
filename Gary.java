import hsa.Console;
import java.awt.*;

public class Gary
{
    private Console fou;

    public void drawGary ()
    {

	fou.setColor (new Color (128, 229, 65));
	fou.fillOval (100, 100, 100, 20);
	fou.fillRect (105, 80, 5, 35);
	fou.fillRect (115, 80, 5, 35); // draws the supports to garys eyes
	// fou.setColor (new Color ());

	fou.fillArc (130, 60, 60, 100, 0, 180); // draws Garys shell

	fou.setColor (Color.black);
	fou.fillOval (103, 75, 9, 9);
	fou.fillOval (113, 75, 9, 9); // draws garys eyes
	//
	// fou.fillOval ();
	// fou.fillOval (); //draws garys puples
	//
	// fou.drawMapleLeaf (); // draws the maple leaf of garys shell



    }


    public Gary (Console con)
    {
	fou = con;
	drawGary ();
    }
}

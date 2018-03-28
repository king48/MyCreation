import java.awt.*;
import hsa.Console;

public class SpongeBob
{
    private Console bannana;

    public void drawingSponge ()
    {
	bannana.fillRect (50, 250, 80, 100); // drawing body
	bannana.setColor (Color.black);
	bannana.drawLine (70, 350, 70, 400); // drawling legs
	bannana.drawLine (110, 350, 110, 400);

	bannana.fillRect (70, 392, 18, 9);  //drawing feet
	bannana.fillRect (110, 392, 18, 9);


    }


    public void movingSponge1 ()
    {
    }


    public void movingSponge2 ()
    {
    }




    public SpongeBob (Console con)
    {
	bannana = con;
	drawingSponge ();
    }
}

/*  In this class we will have SpongeBob, move into the screen from the right,
he will say a few words, other characters will do other actions, and then he
will go into his house.
*/
// importing all the needed libraries
import java.awt.*;
import hsa.Console;
import java.lang.*;

public class SpongeBob extends Thread
{
    private Console bannana; // Naming Console ___
    int distance = 150; // Setting the distance he travels at first, onto the screen so it can be used in later method (drawingSponge2)
    public void drawingSponge (int speed)  // Drawing Spongebob first time, animating him into the screen from right.
    {
	for (int i = 0 ; i <= distance ; i++)
	{
	    // Erasing
	    bannana.setColor (new Color (236, 220, 148)); // Setting erasing color
	    bannana.fillRect (641 - i, 300, 80, 100);
	    bannana.drawLine (661 - i, 400, 661 - i, 450);
	    bannana.drawLine (701 - i, 400, 701 - i, 450);
	    bannana.fillOval (659 - i, 320, 13, 13);
	    bannana.fillOval (691 - i, 320, 13, 13);
	    bannana.drawArc (665 - i, 340, 30, 20, 0, -180);
	    bannana.fillRect (643 - i, 442, 18, 9);
	    bannana.fillRect (683 - i, 442, 18, 9);
	    // Drawing SpongeBob
	    bannana.setColor (new Color (255, 255, 0)); // Creating SpongeBobs iconic yellow
	    bannana.fillRect (640 - i, 300, 80, 100); // Drawing SpongeBobs body
	    bannana.setColor (Color.black); // Calling on black color
	    bannana.drawLine (660 - i, 400, 660 - i, 450); // Drawing SpongeBobs legs
	    bannana.drawLine (700 - i, 400, 700 - i, 450);
	    bannana.fillOval (658 - i, 320, 13, 13); // Drawing SpongeBobs eyes
	    bannana.fillOval (690 - i, 320, 13, 13);
	    bannana.drawArc (664 - i, 340, 30, 20, 0, -180);
	    bannana.fillRect (642 - i, 442, 18, 9); //Drawing SpongeBobs feet
	    bannana.fillRect (682 - i, 442, 18, 9);
	    try
	    {
		Thread.sleep (speed); // Setting the delay/speed from movingSponge1
	    }
	    catch (Exception e)
	    {
	    }
	}
    }


    /* This method calls on the first drawingSponge, for the right movement, as well it sets a delay between his movement
	 and when SpongeBob talks. This calls on the Text class to say everything, we declare where we want the text to be in this
	 method.
    */
    public void movingSponge1 ()
    {
	Text t = new Text (bannana);
	drawingSponge (10);
	try
	{
	    Thread.sleep (100);
	}
	catch (Exception e)
	{
	}
	t.spongeBobTalk (150, 100);
    }


    public void drawingSponge2 (int distance2, int speed2)
    {
	for (int i = 0 ; i <= distance2 ; i++)
	{
	    // Erases SpongeBob
	    bannana.setColor (new Color (236, 220, 148));
	    bannana.fillRect (640 - distance, 301 - i, 80, 100); // Drawing SpongeBobs body
	    bannana.drawLine (660 - distance, 401 - i, 660 - distance, 450 - i); // Drawing SpongeBobs legs
	    bannana.drawLine (700 - distance, 401 - i, 700 - distance, 450 - i);
	    bannana.fillOval (658 - distance, 321 - i, 13, 13); // Drawing SpongeBobs eyes
	    bannana.fillOval (690 - distance, 321 - i, 13, 13);
	    bannana.drawArc (664 - distance, 341 - i, 30, 20, 0, -180);
	    bannana.fillRect (642 - distance, 443 - i, 19, 9); //Drawing SpongeBobs feet
	    bannana.fillRect (682 - distance, 443 - i, 19, 9);
	    //----------------------------------------------------//
	    // Draws SopngeBob
	    bannana.setColor (new Color (255, 255, 0));
	    bannana.fillRect (640 - distance, 300 - i, 80, 100); // Drawing SpongeBobs body
	    bannana.setColor (Color.black);
	    bannana.drawLine (660 - distance, 400 - i, 660 - distance, 450 - i); // Drawing SpongeBobs legs
	    bannana.drawLine (700 - distance, 400 - i, 700 - distance, 450 - i);
	    bannana.fillOval (658 - distance, 320 - i, 13, 13); // Drawing SpongeBobs eyes
	    bannana.fillOval (690 - distance, 320 - i, 13, 13);
	    bannana.drawArc (664 - distance, 340 - i, 30, 20, 0, -180);
	    bannana.fillRect (642 - distance, 442 - i, 18, 9); //Drawing SpongeBobs feet
	    bannana.fillRect (682 - distance, 442 - i, 18, 9);
	    try
	    {
		Thread.sleep (speed2);
	    }
	    catch (Exception e)
	    {
	    }
	}
    }


    public void movingSponge2 ()
    {
	Text t = new Text (bannana); // allwos me to call on the Text class

	t.spongeBobTalk2 (20, 100); // Allows us to position the text where we see fit after a cirtain period of time
	try
	{
	    Thread.sleep (100); // gives us a ___ delay
	}
	catch (Exception e)
	{
	}
	drawingSponge2 (10, 10); // Controls distance and speed when sponge bob is going up

    }


    public void run ()
    {
	movingSponge1 ();

	try
	{
	    Thread.sleep (1000);
	}
	catch (Exception e)
	{
	}

	movingSponge2 ();
    }




    public SpongeBob (Console con)

    {
	bannana = con;
    }
}


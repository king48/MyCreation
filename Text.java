import java.awt.*;
import hsa.Console;

public class Text
{
    private Console texto;
    Color blueBackground = new Color (32, 180, 235);
    Color sandyBackground = new Color (236, 220, 148);

    public void tryCatch ()
    {
	try
	{
	    Thread.sleep (1000);
	}
	catch (Exception e)
	{
	}
    }


    public void patrickTalk (int x, int y)
    {
	texto.setColor (Color.black);
	texto.setFont (new Font ("Arial", 1, 13));
	texto.drawString ("Hey SB ", x, y);
	tryCatch ();
	texto.setColor (blueBackground);
	texto.drawString ("Hey SB ", x, y);
    }


    public void patrickTalk2 (int x, int y)
    {
	texto.setColor (Color.black);
	texto.setFont (new Font ("Arial", 1, 13));
	texto.drawString ("Im stupid ", x, y);
	tryCatch (); // makes a delay and then erases depending on the background 
	texto.setColor (blueBackground);
	texto.drawString ("Im stupid ", x, y);
    }


    public void myName (int x, int y)
    {
	texto.setColor (Color.black);
	texto.setFont (new Font ("Arial", 1, 13));
	texto.drawString ("Juan-Diego Castano", x, y);
	tryCatch ();
    }


    public void krabTalk (int x, int y)
    {
	texto.setColor (Color.black);
	texto.setFont (new Font ("Arial", 1, 13));
	texto.drawString ("HA LOOK AT ALL THIS MONEY", x, y);
	texto.drawString ("I made it selling my burgers", x, y - 20);

	tryCatch ();
    }


    public void krabTalk2 (int x, int y)
    {
	texto.setColor (Color.black);
	texto.setFont (new Font ("Arial", 1, 13));
	texto.drawString ("NOO thats Mine!", x, y);

	tryCatch ();

    }



    public void spongeBobTalk (int x, int y)
    {
	texto.setColor (Color.black);
	texto.setFont (new Font ("Arial", 1, 13));
	texto.drawString ("Hey Patrick ", x, y);
	tryCatch ();
	texto.setColor (blueBackground);
	texto.drawString ("Hey Patrick ", x, y);
    }


    public void spongeBobTalk2 (int x, int y)
    {
	texto.setColor (Color.black);
	texto.setFont (new Font ("Arial", 1, 13));
	texto.drawString ("Good Job Gary, its okay!", x, y);
	tryCatch ();
	texto.setColor (blueBackground);
	texto.drawString ("Good Job Gary, its okay! ", x, y);
    }


    public Text (Console con)
    {
	texto = con;
    }
}

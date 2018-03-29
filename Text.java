import java.awt.*;
import hsa.Console;

public class Text
{
    private Console texto;
    public void tryCatch ()
    {
	try
	{
	    Thread.sleep (100);
	}
	catch (Exception e)
	{
	}
    }


    public void textPatrick1 (int x, int y)
    {
	texto.setColor (Color.black);
	texto.setFont (new Font ("Arial", 1, 13));
	texto.drawString ("Hey SB ", x, y);
	tryCatch ();
    }


    public void textPatrick2 (int x, int y)
    {
	texto.setColor (Color.black);
	texto.setFont (new Font ("Arial", 1, 13));
	texto.drawString ("Hey SB ", x, y);

	tryCatch ();
    }


    public void myName (int x, int y)
    {
	texto.setColor (Color.black);
	texto.setFont (new Font ("Arial", 1, 13));
	texto.drawString ("Juan-Diego Castano", x, y);
    }


    public void krabMoney (int x, int y)
    {
	texto.setColor (Color.black);
	texto.setFont (new Font ("Arial", 1, 13));
	texto.drawString ("HA LOOK AT ALL THIS MONEY", x, y);
	texto.drawString ("I made it selling my burgers", x, y - 20);
    }


    public void spongeBobTalk (int x, int y)
    {

    }


    public void spongeBobTalk2 (int x, int y)
    {

    }


    public Text (Console con)
    {
	texto = con;
    }
}

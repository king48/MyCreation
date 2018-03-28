import java.awt.*;
import hsa.Console;

public class Text
{
    private Console texto;
    public void textPatrick1 (int x, int y)
    {
	texto.setColor (Color.black);
	texto.setFont (new Font ("Arial", 1, 13));
	texto.drawString ("Hey SB ", x, y);
    }


    public void myName (int x, int y)
    {
	texto.setColor (Color.black);
	texto.setFont (new Font ("Arial", 1, 13));
	texto.drawString ("Juan-Diego Castano", x, y);
    }


    public void textPatrick2 (int x, int y)
    {
	//texto.setColor ();
    }


    public Text (Console con)
    {
	texto = con;
    }
}

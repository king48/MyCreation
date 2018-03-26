import java.awt.*;
import hsa.Console;

public class Background
{
    private Console bannana;

    public void back ()
    {
	bannana.fillRect (0, 20, 20, 20);
    }


    public void ground ()
    {
    }


    public void patrickHouse ()
    {
    }


    public void squidHouse ()
    {
    }


    public void spongeBobHouse ()
    {
    }


    public Background (Console con)
    {
	bannana = con;
	back ();
	ground ();
	patrickHouse ();
	squidHouse ();
	spongeBobHouse ();
    }
}

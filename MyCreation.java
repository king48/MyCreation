import java.awt.*;
import hsa.Console;

public class MyCreation
{
    Console c = new Console ();
    public void background ()
    {
	Background b = new Background (c);
    }


    // public void text ()
    // {
    //     //  Text t = new Text (c);
    //     //  t.text ();
    // }


    public void spongeBob ()
    {

    }


    public void gary ()
    {
	Gary g = new Gary (c);

    }


    public void plankton ()
    {
    }


    public void patrick ()
    {
	Patrick p = new Patrick (c);
	p.movement1 ();
    }


    public void krabs ()
    {
    }


    public void money ()
    {
    }


    public static void main (String args[])
    {
	MyCreation Create = new MyCreation ();

	Create.background ();
	Create.patrick ();
	//   Create.text ();
	//  Create.spongeBob ();
	Create.gary ();
	//   Create.plankton ();
	//   Create.krabs ();
	//  Create.money ();

    }
}

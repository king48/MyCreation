import java.awt.*;
import hsa.Console;

public class MyCreation
{
    Console c = new Console ("MyCreation");
    public void background ()
    {
	Background b = new Background (c);
    }


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
	Money m = new Money (c);
	m.start ();
	Money m1 = new Money (c, Color.green);
	m1.start ();
	Money m2 = new Money (c, Color.blue, 300);
	m2.start ();
    }


    public static void main (String args[])
    {
	MyCreation Create = new MyCreation ();

	//    Create.background ();
	//  Create.patrick ();
	//  Create.spongeBob ();
	//   Create.gary ();
	//   Create.plankton ();
	//   Create.krabs ();
	//Create.money ();
	Create.money ();

    }
}

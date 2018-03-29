import java.awt.*;
import hsa.Console;

public class MyCreation
{
    Console c = new Console ("MyCreation");

    public void introduction ()
    {
    }


    public void background ()
    {
	Background b = new Background (c);
    }


    public void spongeBob ()
    {
	SpongeBob s = new SpongeBob (c);
    }


    public void gary ()
    {
	Gary g = new Gary (c);
	g.start ();
    }


    public void plankton ()
    {
	Plankton p = new Plankton (c);
	p.run ();
    }


    public void patrick ()
    {
	Patrick p = new Patrick (c);
	p.run ();
    }


    public void krabs ()
    {
    }


    public void money ()
    {
	Color IDK = new Color (204, 102, 0); // dark orange
	Color IDK1 = new Color (255, 153, 51); // light orange
	Color IDK2 = new Color (224, 224, 224); // yellow

	Color IDK3 = new Color (0, 102, 204); // blue dark
	Color IDK4 = new Color (102, 255, 102); // purple dark
	Color IDK5 = new Color (153, 51, 255); // light purple

	Money m = new Money (c);
	m.start ();
	Money m1 = new Money (c, IDK, IDK1, IDK2);
	m1.start ();
	Money m2 = new Money (c, IDK3, IDK4, IDK5, 200);
	m2.start ();
    }


    public void done ()  // Finally :)
    {

    }


    public static void main (String args[])
    {
	MyCreation Create = new MyCreation ();

	Create.background ();
	//  Create.patrick ();
	//  Create.spongeBob ();
	Create.gary ();
	//    Create.plankton ();
	//Create.krabs ();
	//  Create.money ();


    }
}

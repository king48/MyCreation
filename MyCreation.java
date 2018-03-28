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
	SpongeBob s = new SpongeBob (c);
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
	p.run ();
    }


    public void krabs ()
    {
    }


    public void money ()
    {
	Color IDK = new Color (50, 12, 111);
	Color IDK1 = new Color (110, 12, 123);
	Color IDK2 = new Color (48, 210, 220);
	Color IDK3 = new Color (85, 12, 125);
	Color IDK4 = new Color (69, 220, 125);

	Money m = new Money (c);
	m.run ();
	Money m1 = new Money (c, Color.green, IDK, IDK1);
	m1.run ();
	Money m2 = new Money (c, IDK4, IDK2, IDK3, 200);
	m2.run ();
    }


    public static void main (String args[])
    {
	MyCreation Create = new MyCreation ();

	Create.background ();
	// Create.patrick ();
	//  Create.spongeBob ();
	//   Create.gary ();
	//   Create.plankton ();
	//   Create.krabs ();
	Create.money ();


    }
}

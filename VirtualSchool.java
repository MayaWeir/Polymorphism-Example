/**
 * The "VirtualSchool" class for the CrazyObjects problem.
 * @author Maya Weir
 * @date 2019.04.20
 * @version 1
 */
public class VirtualSchool
{
    /**
     *  Demo test driver for the Crazy Objects problem
     */
    public static void main (String[] args)
    {   // Create a student and display
        Student me = new Student("Maya");
        System.out.println("Student: "+me+"\n");

        // Attempt to enter the classroom of Mr. Smith
        ClassRoom ics4u0 = new ClassRoom("ICS4U0", "Mr. Smith");
        if (ics4u0.enter(me) == true)
        {
            System.out.println(me+" was allowed to enter the class.");
        }
        else
        {
            System.out.println(me+" was not allowed the enter class.");
        }

        System.out.println();

        // Attempt to enter the classroom of Mrs. Smythe
        ClassRoom snc2d1 = new ClassRoom("SNC2D1", "Mrs. Smythe");
        if (snc2d1.enter(me) == true)
        {
            System.out.println(me+" was allowed to enter the class.");
        }
        else
        {
            System.out.println(me+" was not allowed to enter the class.");
        }

    } // main method
} // VirtualSchool class


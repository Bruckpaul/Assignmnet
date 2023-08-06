import java.util.Scanner;
public class Shape3D
{

    Shape3D()
    {
        finalColor="";
        dimensionChoice = 2;
    }
    String color,finalColor;
    protected int dimensionChoice,dMenuChoice;
    Scanner input = new Scanner(System.in);

    void accept3D()
    {

        while (dMenuChoice < 1 || dMenuChoice >2)
        {
            System.out.println("CHOOSE THE TYPE OF 3-DIMENSIONAL SHAPE");
            System.out.println("1. SPHERE \n2. CUBE\n");
            System.out.print ("CHOICE ");
            dMenuChoice = input.nextInt();
            if (dMenuChoice < 1 || dMenuChoice >2)
            {
                System.out.println("INVALID CHOICE");
            }
        }
    }
    public void colorValidator()
    {
        while ((!finalColor.equals("red") ) && (!finalColor.equals("green")) && (!finalColor.equals("blue")) &&
                (!finalColor.equals("yellow"))&& (!finalColor.equals("black")) && (!finalColor.equals("white")))
        {
            System.out.println("ENTER THE COLOR OF THE SHAPE");
            System.out.println("Choice:");
            color = input.nextLine();
            finalColor = color.toLowerCase();
            if ((!finalColor.equals("red")) && (!finalColor.equals("green")) && (!finalColor.equals("blue")) &&
                    (!finalColor.equals("yellow")) && (!finalColor.equals("black")) && (!finalColor.equals("white")))
            {
                System.out.println("INVALID COLOR");
            }
        }
    }
    protected void display ()
    {
        System.out.println("The color of the the shape is "+ finalColor);
    }

}

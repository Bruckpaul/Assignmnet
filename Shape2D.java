import java.util.Locale;
import java.util.Scanner;
public class  Shape2D {
    String color,finalColor;
    Shape2D()
    {
        finalColor="";
    }
    protected int menuChoice, checkColor,dimensionChoice;
    Scanner input = new Scanner(System.in);
    protected void shapeDimension()
    {
       while (dimensionChoice < 1|| dimensionChoice > 2)
       {
           System.out.println("WHAT IS THE DIMENSION OF THE SHAPE ARE YOU GOING TO ENTER");
           System.out.println("1. 2-DIMENSIONAL\n2. 3-DIMENSIONAL");
           System.out.print("Choice ");
           dimensionChoice = input.nextInt();
           if (dimensionChoice < 1|| dimensionChoice >2)
           {
               System.out.println("ENTER VALID DIMENSION");
           }
       }

    }
    void accept2D ()
    {
        System.out.println("------MENU------");
        while (menuChoice < 1 || menuChoice > 3)
        {
            System.out.println("CHOOSE THE TYPE OF THE SHAPE!");
            System.out.println("1.CIRCLE\n2.RECTANGLE\n3.TRIANGLE\n");
            System.out.print("Choice:");
            menuChoice = input.nextInt();
            if (menuChoice<1 || menuChoice > 3)
            {
                System.out.println("INVALID INPUT");
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
    void display ()
    {
        System.out.println("The color of the the shape is  ");
    }

}
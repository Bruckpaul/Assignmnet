import java.util.Scanner;
public class Triangle extends Shape2D
{
    protected double area,perimeter,base,height,hypotenuse;
    Scanner input = new Scanner(System.in);
    protected void acceptBaseHeight()
    {
        while (height<1)
        {
            System.out.println("ENTER THE HEIGHT OF THE TRIANGLE");
            System.out.print("HEIGHT ");
            height=input.nextInt();
            if (height<= 0)
            {
                System.out.println("INVALID INPUT");
            }
        }
        while (base <= 0)
        {
            System.out.println("ENTER THE BASE OF THE TRIANGLE");
            System.out.print("BASE ");
            base =input.nextInt();
            if (base <=0)
            {
                System.out.println("INVALID INPUT");
            }
        }
        hypotenuse = Math.sqrt((height*height)+(base*base));
    }
    void calculateArea()
    {
        area = 0.5 * base * height;
    }
    void calculatePerimeter()
    {
        perimeter = hypotenuse+ height + base;
    }
    @Override
    protected void  display()
    {
        System.out.println("THE COLOR OF THE TRIANGLE IS  "+ finalColor +'\n');
        System.out.println("THE AREA OF THE TRIANGLE IS  "+ area + " CM"+'\n');
        System.out.println("THE PERIMETER OF THE TRIANGLE IS "+ perimeter +" CM"+'\n');

    }
}

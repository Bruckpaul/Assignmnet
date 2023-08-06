import java.util.Scanner;

public class Sphere extends Shape3D
{
    Scanner input = new Scanner(System.in);
    protected double radius,area,volume;
    protected static final double PI= 3.1415926;

    protected void  acceptRadius()
    {
        while (radius<=0)
        {
            System.out.println("ENTER THE RADIUS OF THE CIRCLE IN CENTIMETER !");
            radius = input.nextInt();
            if  (radius<=0)
            {
                System.out.println("RADIUS MUST BE POSITIVE NUMBER");
            }
        }
    }
    protected void calculateArea ()
    {
        area = 4*PI*radius*radius;
    }
    protected void calculateVolume()
    {
        volume = (3.0/4)*PI*radius*radius*radius;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
    @Override
    protected void display()
    {
        System.out.println("THE COLOR OF THE SPHERE IS  "+ finalColor +'\n');
        System.out.println("THE AREA OF THE SPHERE IS  "+ area + " CM"+'\n');
        System.out.println("THE VOLUME OF THE SPHERE IS  "+ volume +" CM"+'\n');

    }
}

import java.util.Scanner;

public class Cube extends Shape3D
{
    Scanner input = new Scanner(System.in);
    protected double length,area,volume;
    protected void  acceptLength()
    {
        while (length<=0)
        {
            System.out.println("ENTER ONE SIDE OF THE CUBE IN CENTIMETER !");
            length = input.nextInt();
            if  (length<=0)
            {
                System.out.println("RADIUS MUST BE POSITIVE NUMBER");
            }
        }
    }
    protected void calculateArea()
    {
        area = 6*length*length;
    }
    protected void calculateVolume()
    {
        volume = length* length* length;
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
        System.out.println("THE COLOR OF THE CUBE IS  "+ finalColor +'\n');
        System.out.println("THE AREA OF THE CUBE  IS  "+ area + " CM"+'\n');
        System.out.println("THE VOLUME OF THE CUBE  IS  "+ volume +" CM"+'\n');

    }
}

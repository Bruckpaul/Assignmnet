import java.util.Scanner;
class Circle extends Shape2D
{
    Scanner input = new Scanner(System.in);
    protected double radius,area,perimeter;
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
        area = PI*radius*radius;
    }
    protected void calculatePerimeter()
    {
        perimeter= 2*PI*radius;
    }

    public void setArea(double area)
    {
        this.area = area;
    }
    public void setPerimeter(double perimeter)
    {
        this.perimeter = perimeter;
    }

   @Override
   protected void display()
    {
        System.out.println("THE COLOR OF THE CIRCLE IS  "+ finalColor +'\n');
        System.out.println("THE AREA OF THE CIRCLE IS  "+ area + " CM"+'\n');
        System.out.println("THE PERIMETER OF THE CIRCLE IS  "+ perimeter +" CM"+'\n');

    }
}

import java.util.Scanner;
 class Rectangle extends Shape2D
{
    protected  double length,width,perimeter,area;
    Scanner input = new Scanner(System.in);
    protected void  acceptLengthWidth()
    {
        while (length<=0 || width <=0)
        {
            System.out.println("ENTER THE WIDTH OF THE RECTANGLE!");
            System.out.print("WIDTH ");
            width =input.nextInt();
            System.out.println("ENTER THE LENGTH OF THE RECTANGLE!");
            System.out.print("LENGTH ");
            length =input.nextInt();
            if (length<1 || width < 1)
            {
                System.out.println("CHECK BOTH THE WIDTH AND LENGTH ARE GREATER THAN ZERO");
            }
        }
    }
    protected void calculateArea()
    {
        area= length * width;
    }
    protected void calculatePerimeter()
    {
        perimeter = (2*length )+ (2*width);
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
        System.out.println("THE COLOR OF THE RECTANGLE IS  "+ super.finalColor +'\n');
        System.out.println("THE AREA OF THE  RECTANGLE IS  "+ area + " CM"+'\n');
        System.out.println("THE PERIMETER OF THE RECTANGLE IS "+ perimeter +" CM"+'\n');

    }
}

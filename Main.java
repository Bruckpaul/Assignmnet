public class Main
{
    public static void main(String[] args)
    {
       Shape2D s = new Shape2D();
       s.shapeDimension();
       if (s.dimensionChoice == 1)
       {
           s.accept2D();
           if (s.menuChoice == 1 )
           {

               Circle c = new Circle();
               c.colorValidator();
               c.acceptRadius();
               c.calculateArea();
               c.calculatePerimeter();
               c.display();
           }
           else if (s.menuChoice == 2)
           {
               Rectangle r = new Rectangle();
               r.colorValidator();
               r.acceptLengthWidth();
               r.calculateArea();
               r.calculatePerimeter();
               r.display();
           }
           else if (s.menuChoice == 3)
           {
               Triangle t = new Triangle();
               t.colorValidator();
               t.acceptBaseHeight();
               t.calculateArea();
               t.calculatePerimeter();
               t.display();
           }
       }
       else if (s.dimensionChoice == 2)
       {
           Shape3D shape3D = new Shape3D();
           shape3D.accept3D();
           if (shape3D.dMenuChoice==1)
           {
               Sphere sphere = new Sphere();
               sphere.colorValidator();
               sphere.acceptRadius();
               sphere.calculateArea();
               sphere.calculateVolume();
               sphere.display();
           }
           else if (shape3D.dMenuChoice == 2)
           {
               Cube cube = new Cube();
               cube.colorValidator();
               cube.acceptLength();
               cube.calculateArea();
               cube.calculateVolume();
               cube.display();

           }
       }
    }
}


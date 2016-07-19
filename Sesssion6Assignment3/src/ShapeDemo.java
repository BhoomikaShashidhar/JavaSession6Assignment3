
public class ShapeDemo {
public static void main (String args[])
{
	Rectange rect= new Rectange();
	rect.draw("Rectangle");
	rect.getarea(5, 4);
	Square sq=new Square();
	sq.draw("Square");
	sq.getarea(5, 0);
	Triangle tri=new Triangle();
	tri.draw("Triangle");
	tri.getarea(5, 3);
}
}

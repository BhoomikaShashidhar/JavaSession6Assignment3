
public class Square implements IShape {

	public void draw(String shape) {
		// TODO Auto-generated method stub
		System.out.println("The geometrical shape to which the area has to be found :"+shape);
	}

	public int getarea(int l, int b) {
		int area=l*l;
		System.out.println("The area :" +area);
		return area;
	}

}

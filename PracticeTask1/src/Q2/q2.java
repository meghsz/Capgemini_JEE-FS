package Q2;
class shape
{
public void draw()
{
	System.out.println("Drawing shape");
	}
public void erase()
{
	System.out.println("Erasing shape");
	}

}
class Circle extends shape
{
	public void draw()
	{
		System.out.println("Drawing Circle");
		}
	public void erase()
	{
		System.out.println("Erasing Circle");
		}

}

class Triangle extends shape
{
	public void draw()
	{
		System.out.println("Drawing Triangle");
		}
	public void erase()
	{
		System.out.println("Erasing Triangle");
		}

	
}

class Square extends shape
{
	public void draw()
	{
		System.out.println("Drawing Sq");
		}
	public void erase()
	{
		System.out.println("Erasing sq");
		}

}
public class q2 {

	public static void main(String[] args) {
		Circle c=new Circle();
		c.draw();
		c.erase();
		Triangle t=new Triangle();
		t.draw();
		t.erase();
		Square s=new Square();
		s.draw();
		s.erase();
		
		
	}

}

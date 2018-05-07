
public class TestCircle
{
public static void main(String[] args)
{
	CircleClass c1 = new CircleClass();
	System.out.println("The circle has radius of "+c1.getRadius()+" and area of "+c1.getArea());
    
	CircleClass c2 = new CircleClass(3.0,"grey");
	System.out.println("The circle has a radius of "+c2.getRadius()+" and area of "+c2.getArea()+" with the color "+c2.color());
    CircleClass c3 = new CircleClass();
    c3.setRadius(8.0);
    System.out.println("Radius is: "+ c3.getRadius());
    System.out.println("Color is: "+ c3.color());
    c3.setColor("Blue");
    System.out.println("Color is: "+ c3.color());
    System.out.println(c1.toString());
    System.out.println(c2.toString());
    System.out.println(c3.toString());
    CircleClass2 c5 = new CircleClass2(6.0,"black");
    System.out.println("The circle has a radius of "+c5.getRadius()+" and area equals to "+c5.getArea()+" with the color "+c5.getColor());
    System.out.println(c5.getArea());
   c5.setRadius(7.0);
   System.out.println(c5.getArea());
   c5.setColor("black");
   System.out.println(c5.getColor());
}
}

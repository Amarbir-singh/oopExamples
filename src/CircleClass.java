
public class CircleClass 
{
   private double radius;
   private String color;
   public CircleClass()
   {
	   radius =5.0;
	   color = "red";
   }
   public CircleClass(double radius)
   {
	   this.radius =radius;
	   color = "red";
   }
   public CircleClass(double radius,String c)
   {
	   this.radius = radius;
	   color  =  c;
   }
   public double getRadius()
   {
	  return  radius;
   }
   public double getArea()
   {
	   return radius*radius*Math.PI;
   }
   public String color()
   {
	   return color;
   }
   public void setRadius(double newRadius)
   {
	   radius = newRadius;
   }
   public void setColor(String newColor)
   {
	   color = newColor;
   }
   public String toString()
   {
	   return "Circle[radius="+radius+" color="+color+"]";
   }
   
}

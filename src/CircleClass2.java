
public class CircleClass2
{
   private double radius;
   private String color;
   public CircleClass2()
   {
	   radius = 3.0;
	   color = "green";
   }
   public CircleClass2(double radius)
   {
	   this.radius = radius;
	   color = "grey";
   }
   public CircleClass2(double radius, String color)
   {
	   this.radius = radius;
	   this.color = color;
   }
   public double getRadius()
   {
	   return radius;
   }
   public String getColor()
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
	   return "Radius: "+radius+"\ncolor: "+color;
   }
   public double getArea()
   {
	   return Math.PI*radius*radius;
   }
}

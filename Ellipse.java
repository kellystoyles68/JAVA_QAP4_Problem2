public class Ellipse  extends Shape implements Scalable{
    private double axis1;
    private double axis2;

    public Ellipse (double axis1, double axis2) {
            this.axis1 = axis1;
            this.axis2 = axis2;
 }

 //print a message that the ellipse is being drawn
 @Override
    public void draw() {
        System.out.println ("Drawing a Ellipse with a major axis of " + axis1 + " and minor axis " + axis2);
    }
 
//scale the axis'
 @Override
 public void scale (double factor) {
    axis1 = axis1 * factor;
    axis2 = axis2 * factor;
}

//return a string representation of the triangle
@ Override
        public String toString () {
            return ("Ellipse with  a major axis of " + axis1 + " and minor axis " + axis2);
        }
}
    


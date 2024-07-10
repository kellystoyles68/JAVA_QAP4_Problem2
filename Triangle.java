public class Triangle extends Shape implements Scalable{
    private double side1, side2, side3;
    

    public Triangle (double side1, double side2, double side3) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
 }

 //Print message that the traiangle is being drawn
 @Override
    public void draw() {
        System.out.println ("Drawing a Triangle with sides equal to " +  side1 + " , " + side2 + " and " + side3 );
    }

// Scale all sides by factor
 @Override
 public void scale (double factor) {
    side1 = side1 * factor;
    side2 = side2 * factor;
    side3 = side3 * factor;
}


//Return a string representation of the triangle
@ Override
        public String toString () {
            return ("Triangle with sides equal to " +  side1 + " , " + side2 + " and " + side3 );
    }
  }

    

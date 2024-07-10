public class Circle  extends Shape implements Scalable {
        private double radius;
    
        public Circle (double radius){
            this.radius = radius;
        }

        //print a message that the circle is being drawn
        @ Override
        public void draw() {
            System.out.println ("Drawing a Circle with a radius equal to: " + radius);
        }
    
        // scale radiss by factor
        @  Override 
        public void scale (double factor) {
            radius = radius * factor;
        }
        

        //return a string representation of the circle
        @ Override
        public String toString () {
            return "Circle with radius: " + radius;
        }
    
    }

    // Class circle inherits from class Shape and implements the class scalable

public class Demo {
        public static void main(String[] args) {
            //create an array with scalable with different shapes
            Scalable [] shapes = {
             new Circle (5),
             new Ellipse(10,5),
             new Triangle(4,3,5),
             new EquilateralTriangle(4) };

        //print the shapes before factoring
        System.out.println ("Before Scaling:");
        for (Scalable shape : shapes) {
            System.out.println (shape);
        }

        //scale all shapes by the factor
        scaleShapes (shapes, 2);

        //print the shapes after factoring
        System.out.println ("After Scaling:");
        for (Scalable shape : shapes) {
            System.out.println (shape);
        }
        }

        //methos to scale all shapes in the array
        public static void scaleShapes(Scalable[] shapes, int factor) {
            for (Scalable shape : shapes) {
                shape.scale(factor);
        }}
    }


 


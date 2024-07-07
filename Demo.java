public class Demo {
        public static void main(String[] args) {
            Scalable [] shapes = {
             new Circle (5),
             new Ellipse(10,5),
             new Triangle(4,3,5),
             new EquilateralTriangle(4) };

        System.out.println ("Before Scaling:");
        for (Scalable shape : shapes) {
            System.out.println (shape);
        }

        scaleShapes (shapes, 2);

        System.out.println ("After Scaling:");
        for (Scalable shape : shapes) {
            System.out.println (shape);
        }
        }

        public static void scaleShapes(Scalable[] shapes, int factor) {
            for (Scalable shape : shapes) {
                shape.scale(factor);
        }}
    }


 


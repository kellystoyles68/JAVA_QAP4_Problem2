public class EquilateralTriangle extends Triangle{
    private double side;

    public EquilateralTriangle (double side) {
        super (side, side, side);
        this.side = side;
    }   
    //print a message that the equilateralTriangle is being drawn
     @ Override
         public void draw() {
         System.out.println ("Drawing a Equilateral  Triangle with  3 equal sides measuring:  " +  side);
    }

    //scale the sides
     @ Override
    public void scale (double factor) {
        side = side * factor;
       }

        //return a string resprentation of the equilaterialTriangle
    @ Override
    public String toString(){
        return "Equilateral Triangle with sides equal to " + side;}

}

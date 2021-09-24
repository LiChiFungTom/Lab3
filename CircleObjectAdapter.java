
import java.awt.Point;

public class CircleObjectAdapter implements NewCircle{

    OldCircleImpl oldCircle;

    public CircleObjectAdapter(OldCircleImpl oldCircle){
        this.oldCircle = oldCircle;
    }

    public double getRadius( ){
        double radius;
        double [] coeff = new double[3];
        coeff = oldCircle.getCoeff();
        radius = Math.sqrt(coeff[2]);
        return radius;
    }
    
	public Point getCenter( ){
        double x;
        double y;
        double [] coeff = new double[3];
        coeff = oldCircle.getCoeff();
        x = coeff[0];
        y = coeff[1];
        return Point(x,y);

    }
}



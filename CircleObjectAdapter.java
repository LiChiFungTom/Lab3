
import java.awt.Point;

public class CircleObjectAdapter implements NewCircle{

    OldCircleImpl oldCircle;
    int y;
    int x;
    
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
        double [] coeff = new double[3];
        coeff = oldCircle.getCoeff();
        x = (int)coeff[0];
        y = (int)coeff[1];
        Point p = new Point(x,y);
        return p;
    }

}

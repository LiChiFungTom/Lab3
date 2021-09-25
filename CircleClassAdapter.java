
import java.awt.Point;

public class CircleClassAdapter extends OldCircleImpl implements NewCircle{

    int x;
    int y;

    public CircleClassAdapter(double a,double b,double c){
        super(a,b,c);
    }

    public double getRadius( ){
        double radius;
        double[] coeff = this.getCoeff();
        radius = Math.sqrt( coeff[2] );
        return radius;
    }
    
	public Point getCenter( ){
        double [] coeff = new double[3];
        coeff = this.getCoeff();
        x = (int)coeff[0];
        y = (int)coeff[1];
        Point p = new Point(x,y);
        return p;

    }
}

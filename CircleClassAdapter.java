
import java.awt.Point;

public class CircleClassAdapter extends OldCircleImpl implements NewCircle{

    

    public CircleClassAdapter(double a,double b,double c)){
        super();
    }

    public double getRadius( ){
        double radius;
        double[] coeff = this.getCoeff();

        radius = Math.sqrt( coeff[2] );
        return radius;
    }
    
	public Point getCenter( ){


    }
}



public class test{
    public static void main(String[] args) {
        
        OldCircleImpl circle = new OldCircleImpl(10,15,25.5);
        CircleObjectAdapter adapter = new CircleObjectAdapter(circle); 
        PrintCircle.printCircle(adapter);
    }
}

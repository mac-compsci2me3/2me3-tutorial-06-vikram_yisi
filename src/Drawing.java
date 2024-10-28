public class Drawing {
    private Drawing(){}

    private static Drawing instance;

    public static Drawing getInstance(){
        if (instance == null) {
            instance = new Drawing();
        }
        return instance;
    }

    public void drawShape(Shape shape){

        double area = shape.calculateArea();
        String colour = shape.getColor();
        Class circleorsquare = shape.getClass();

        System.out.println("Drawing a "+circleorsquare+" with color: "+colour+" and area: "+area+".\n");
    }
}

package DailyJavaTraining;

public class Circle implements Metrics {

    private double Radius;


    @Override
    public void area() {
        System.out.println("area is: " + Radius*Radius*3.14);
    }

    @Override
    public void circumference() {
        System.out.println("circumference is: " + Radius*2*3.14);
    }
    public void setRadius(double radius) {
        Radius = radius;
    }
}

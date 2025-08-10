package DailyJavaTraining;

public class Square implements Metrics {

    double side;



    @Override
    public void area() {
        System.out.println(side*side);
    }

    @Override
    public void circumference() {
        System.out.println(side*4);
    }

    public void setSide(double side) {
        this.side = side;
    }
}

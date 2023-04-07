public class Circle implements Figure {

    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double figureSq() {
        return Math.PI * Math.pow(radius, 2);
    }
}

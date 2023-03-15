public class Triangle implements Figure {

    double height;
    double width;

    public Triangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double figureSq() {
        return height * width / 2;
    }
}

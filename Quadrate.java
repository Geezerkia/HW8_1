public class Quadrate implements Figure {

    double side;

    public Quadrate(double side) {
        this.side = side;
    }

    @Override
    public double figureSq() {
        return Math.pow(side, 2);
    }
}

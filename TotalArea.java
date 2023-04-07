public class TotalArea {

    static Figure[] figureSample;

    public static void main(String[] args) {

        figureSample = new Figure[9];
        figureSample[0] = new Quadrate(1.1);
        figureSample[1] = new Quadrate(2.2);
        figureSample[2] = new Quadrate(3.3);
        figureSample[3] = new Circle(4.4);
        figureSample[4] = new Circle(5.5);
        figureSample[5] = new Circle(6.6);
        figureSample[6] = new Triangle(7.7, 8.8);
        figureSample[7] = new Triangle(9.9, 10.9);
        figureSample[8] = new Triangle(11.9, 12.9);

        double totalArea = Figure.calculateTotalArea(figureSample);

        System.out.printf("All figures square is: %.2f sm2", totalArea);
    }
}

public class AllSqCalc {

    static Figure[] f;

    public static void main(String[] args) {

        f = new Figure[9];
        f[0] = new Quadrate(1.1);
        f[1] = new Quadrate(2.2);
        f[2] = new Quadrate(3.3);
        f[3] = new Circle(4.4);
        f[4] = new Circle(5.5);
        f[5] = new Circle(6.6);
        f[6] = new Triangle(7.7, 8.8);
        f[7] = new Triangle(9.9, 10.9);
        f[8] = new Triangle(11.9, 12.9);

        System.out.printf("All figures square is: %.2f sm2", allSqCalc());
    }

    public static double allSqCalc() {

       double allFigSq = 0;
        var i = 0;
        while (i < f.length) {
            allFigSq = allFigSq + f[i].figureSq();
            i++;
        }
        return allFigSq;
    }
}


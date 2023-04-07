public interface Figure {
    double figureSq();

    static double calculateTotalArea(Figure[] figures) {
        double totalArea = 0;
        var i = 0;
        while (i < figures.length) {
            totalArea = totalArea + figures[i].figureSq();
            i++;
        }
        return totalArea;
    }
}

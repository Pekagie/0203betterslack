package lambdas;

public class CarSelectionViewDemo {
    public static void main(String[] args) {
        CarSelectionView car1 = new CarSelectionView();
        int userPrice = 20000;
        car1.applyFilter(car -> car.getPrice() > userPrice);
        int lowerYearLimit = 2002;
        int upperYearLimit = 2015;
        car1.applyFilter(car -> {
            return car.getPrice() > userPrice && car.getProducedIn() >= lowerYearLimit && car.getProducedIn() <= upperYearLimit;
        });
    }
}

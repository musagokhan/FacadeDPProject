package manager;

import facade.FacadeCarBuild;

public class MainWork {

    public static void main(String[] args) {
        FacadeCarBuild car = new FacadeCarBuild();
        car.cheaperCar();
        car.expensiveCar();
    }
}

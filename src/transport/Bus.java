package transport;

public class Bus extends Transport {
    public Bus(String brand,
               String model,
               int productionYear,
               String productionCountry,
               String color,
               int maximumMovementSpeed,
               Double fuelPercentage) {
        super(brand,
                model,
                productionYear,
                productionCountry,
                color,
                maximumMovementSpeed,
                fuelPercentage);
    }

    @Override
    public void refill() {
        setFuelPercentage(100.00);
        System.out.println("Автобус " + getBrand() + " " + getModel() + " на бензине/дизеле заправлено на 100%");
    }

    public String toString() {
        return "Марка авто- " + getBrand() +
                ", модель- " + getModel() +
                ", цвет кузова- " + getColor() +
                ", год производства- " + getProductionYear() +
                ", страна производства- " + getProductionCountry() +
                ", максимальная скорость- " + getMaximumMovementSpeed() +
                ", количество топлива в процентах- " + getFuelPercentage();
    }
}

public class Car {
    public String brand;
    public String model;
    public double engineVolume;
    public String color;
    public int productionYear;

    public Car(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry) {
        if (model == null) {
            this.model = "default";
        } else {
            this.model = model;
        }

        if (brand == null) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }

        if (productionCountry == null) {
            this.productionCountry = "default";
        } else {
            this.productionCountry = productionCountry;
        }

        if (Double.compare(engineVolume, 0) == 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }

        if (color == null) {
            this.color = "белый";
        } else {
            this.color = color;
        }

        if (productionYear == 0) {
            this.productionYear = 2000;
        } else {
            this.productionYear = productionYear;
        }
    }

    public String productionCountry;
}

package transport;

public abstract class Transport {
    private final String brand;
    private final String model;
    private int productionYear;
    private String productionCountry;
    private String color;
    private int maximumMovementSpeed;
    private Double fuelPercentage;

    public Transport(String brand,
                     String model,
                     int productionYear,
                     String productionCountry,
                     String color,
                     int maximumMovementSpeed,
                     Double fuelPercentage) {

        if (brand == null) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (productionYear == 0) {
            this.productionYear = 2000;
        } else {
            this.productionYear = productionYear;
        }
        if (productionCountry == null) {
            this.productionCountry = "default";
        } else {
            this.productionCountry = productionCountry;
        }
        setColor(color);
        setMaximumMovementSpeed(maximumMovementSpeed);
        setFuelPercentage(fuelPercentage);
    }

    public Double getFuelPercentage() {
        return fuelPercentage;
    }

    public void setFuelPercentage(Double fuelPercentage) {
        if (fuelPercentage != null && fuelPercentage <= 100 && fuelPercentage >= 0) {
            this.fuelPercentage = fuelPercentage;
        } else {
            this.fuelPercentage = 0.0;
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.isEmpty() || color.isBlank()) {
            this.color = "DEFAULT";
        } else {
            this.color = color;
        }
    }

    public int getMaximumMovementSpeed() {
        return maximumMovementSpeed;
    }

    public void setMaximumMovementSpeed(int maximumMovementSpeed) {
        if (maximumMovementSpeed < 0) {
            this.maximumMovementSpeed = 0;
        } else {
            this.maximumMovementSpeed = maximumMovementSpeed;
        }
    }

    public abstract void refill();
}
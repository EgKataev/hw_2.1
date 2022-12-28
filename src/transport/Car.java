package transport;

import java.time.LocalDate;

public class Car extends Transport {
    private double engineVolume;
    private String transmission;
    private final String bodyType;
    private String regNumber;
    private final int places;
    private boolean summerTyres;
    private Key key;
    private Insurance insurance;


    public Car(String brand,
               String model,
               double engineVolume,
               String color,
               int productionYear,
               String productionCountry,
               String transmission,
               String bodyType,
               String regNumber,
               int places,
               boolean summerTyres,
               Key key,
               Insurance insurance,
               int maximumMovementSpeed,
               Double fuelPercentage) {
        super(brand, model, productionYear, productionCountry, color, maximumMovementSpeed, fuelPercentage);

        this.engineVolume = engineVolume;


        if (transmission == null) {
            this.transmission = "МКПП";
        } else {
            this.transmission = transmission;
        }


        if (regNumber == null) {
            this.regNumber = "х000хх000";
        } else {
            this.regNumber = regNumber;
        }

        if (bodyType == null) {
            this.bodyType = "седан";
        } else {
            this.bodyType = bodyType;
        }
        if (key == null) {
            this.key = new Key();
        } else {
            this.key = key;
        }
        if (insurance == null) {
            this.insurance = new Insurance();
        } else {
            this.insurance = insurance;
        }

        this.places = places;
        this.summerTyres = summerTyres;

    }

    public Car(String brand,
               String model,
               double engineVolume,
               String color,
               int productionYear,
               String productionCountry) {
        this(
                brand,
                model,
                engineVolume,
                color,
                productionYear,
                productionCountry,
                "МКПП",
                "седан",
                "х000хх000",
                5,
                true,
                new Key(),
                new Insurance(),
                0,
                0.0);

        if (Double.compare(engineVolume, 0) == 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }


    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }


    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        if (transmission == null) {
            this.transmission = "х000хх000";
        } else {
            this.transmission = transmission;
        }
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        if (regNumber == null) {
            this.regNumber = "МКПП";
        } else {
            this.regNumber = regNumber;
        }
    }

    public boolean isSummerTyres() {
        return summerTyres;
    }

    public void setSummerTyres(boolean summerTyres) {
        this.summerTyres = summerTyres;
    }


    public String getBodyType() {
        return bodyType;
    }

    public int getPlaces() {
        return places;
    }

    public void changeTyres() {
        summerTyres = !summerTyres;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    public boolean isCorrectRegNumber() {
        if (regNumber.length() != 9) {
            return false;
        }
        char[] chars = regNumber.toCharArray();
        if (!Character.isAlphabetic(chars[0]) || !Character.isAlphabetic(chars[4])
                || !Character.isAlphabetic(chars[5])) {
            return false;
        }
        return Character.isDigit(chars[1]) && Character.isDigit(chars[2])
                && Character.isDigit(chars[3]) && Character.isDigit(chars[6])
                && Character.isDigit(chars[7]) && Character.isDigit(chars[8]);
    }

    @Override
    public void refill() {
        setFuelPercentage(100.00);
        System.out.println("Авто " + getBrand() + " " + getModel() + " на бензине/дизеле/электричестве заправлено на 100%");
    }


    public static class Key {
        private final boolean remoteRunEngine;
        private final boolean notKeyFree;

        public Key(boolean remoteRunEngine, boolean notKeyFree) {
            this.remoteRunEngine = remoteRunEngine;
            this.notKeyFree = notKeyFree;
        }

        public Key() {
            this(false, false);
        }

        public boolean isRemoteRunEngine() {
            return remoteRunEngine;
        }

        public boolean isNotKeyFree() {
            return notKeyFree;
        }
    }

    public static class Insurance {
        private final LocalDate expireData;
        private final double cost;
        private final String number;

        public Insurance(LocalDate expireData, double cost, String number) {
            if (expireData == null) {
                this.expireData = LocalDate.now().plusDays(365);
            } else {
                this.expireData = expireData;
            }

            this.cost = cost;
            if (number == null) {
                this.number = "123456789";
            } else {
                this.number = number;

            }
        }

        public Insurance() {
            this(null, 10_000D, null);
        }

        public LocalDate getExpireData() {
            return expireData;
        }

        public double getCost() {
            return cost;
        }

        public String getNumber() {
            return number;
        }

        public void checkExpireData() {
            if (expireData.isBefore(LocalDate.now()) || expireData.isEqual(LocalDate.now())) {
                System.out.println("!!! Нужно срочно ехать оформлять новую страховку !!!");
            }
        }

        public void checkNumber() {
            if (number.length() != 9) {
                System.out.println("!!! Номер страховки некорректный !!!");
            }
        }
    }

}

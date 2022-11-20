import transport.Car;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задания 1");

        int currentYear = 2022;

        Human maksim = new Human(currentYear - 35, "Максим", "Минск", "бренд-менеджер");

        Human anya = new Human(currentYear - 29, "Аня", "Москва", "методист образовательных программ");

        Human katya = new Human(currentYear - 28, "Катя", "Калининград", "продакт-менеджер");

        Human artem = new Human(currentYear - 27, "Артём", "Москва", "директор по развитию бизнеса");

        Human vladimir = new Human(currentYear - 21, "Владимир", "Казань", null);

        printInfo(maksim);
        printInfo(anya);
        printInfo(katya);
        printInfo(artem);
        printInfo(vladimir);


        System.out.println();

        System.out.println("Задание 2");


        Car lada = new Car(
                "Lada",
                "Granta",
                1.7,
                "Жёлтый",
                2015,
                "Россия");


        Car audi = new Car(
                "Audi",
                "A8 50 L TDI quattro",
                3.0,
                "Чёрный",
                2020,
                "Германия");
        audi.setTransmission("АКПП");


        Car bmw = new Car(
                "BMW",
                "Z8",
                3.0,
                "Чёрный",
                2021,
                "Германия");
        bmw.setSummerTyres(false);


        Car kia = new Car(
                "KIA",
                "Sportage 4 поколение",
                2.4,
                "Красный",
                2018,
                "Южная Корея");


        Car hyundai = new Car(
                "Hyundai",
                "Hyundai",
                1.6,
                "Оранжевый",
                2016,
                "Южная Корея");

        printInfo(lada);
        printInfo(audi);
        printInfo(bmw);
        printInfo(kia);
        printInfo(hyundai);
    }


    private static void printInfo(Human human) {
        System.out.println("Привет! Меня зовут " + human.name + ". Я из города " + human.getCity() + ". Я родился в " + human.getYearOfBirth() + " году. Я работаю на должности: " + human.jobTitle + ". Будем знакомы!");
    }

    private static void printInfo(Car car) {
        System.out.println("Марка авто- " + car.getBrand() +
                ", модель- " + car.getModel() +
                ", объем двигателя в литрах- " + car.getEngineVolume() +
                ", цвет кузова- " + car.getColor() +
                ", год производства- " + car.getProductionYear() +
                ", страна производства- " + car.getProductionCountry() +
                ", коробка передач- " + car.getTransmission() +
                ", тип кузова- " + car.getBodyType() +
                ", регистрационный номер- " + car.getRegNumber() +
                ", количество мест- " + car.getPlaces() +
                ", " + (car.isSummerTyres() ? "летняя": "зимняя") + " резина");
    }
}

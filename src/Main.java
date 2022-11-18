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
        System.out.println("Марка авто- " + lada.brand +
                ", модель- " + lada.model +
                ", объем двигателя в литрах- " + lada.engineVolume +
                ", цвет кузова- " + lada.color +
                ", год производства- " + lada.productionYear +
                ", страна производства- " + lada.productionCountry);

        Car audi = new Car(
                "Audi",
                "A8 50 L TDI quattro",
                3.0,
                "Чёрный",
                2020,
                "Германия");
        System.out.println("Марка авто- " + audi.brand +
                ", модель- " + audi.model +
                ", объем двигателя в литрах- " + audi.engineVolume +
                ", цвет кузова- " + audi.color +
                ", год производства- " + audi.productionYear +
                ", страна производства- " + audi.productionCountry);

        Car bmw = new Car(
                "BMW",
                "Z8",
                3.0,
                "Чёрный",
                2021,
                "Германия");
        System.out.println("Марка авто- " + bmw.brand +
                ", модель- " + bmw.model +
                ", объем двигателя в литрах- " + bmw.engineVolume +
                ", цвет кузова- " + bmw.color +
                ", год производства- " + bmw.productionYear +
                ", страна производства- " + bmw.productionCountry);

        Car kia = new Car(
                "KIA",
                "Sportage 4 поколение",
                2.4,
                "Красный",
                2018,
                "Южная Корея");
        System.out.println("Марка авто- " + kia.brand +
                ", модель- " + kia.model +
                ", объем двигателя в литрах- " + kia.engineVolume +
                ", цвет кузова- " + kia.color +
                ", год производства- " + kia.productionYear +
                ", страна производства- " + kia.productionCountry);

        Car hyundai = new Car(
                "Hyundai",
                "Hyundai",
                1.6,
                "Оранжевый",
                2016,
                "Южная Корея");
        System.out.println("Марка авто- " + hyundai.brand +
                ", модель- " + hyundai.model +
                ", объем двигателя в литрах- " + hyundai.engineVolume +
                ", цвет кузова- " + hyundai.color +
                ", год производства- " + hyundai.productionYear +
                ", страна производства- " + hyundai.productionCountry);
    }

    private static void printInfo(Human human) {
        System.out.println("Привет! Меня зовут " + human.name + ". Я из города " + human.getCity() + ". Я родился в " + human.getYearOfBirth() + " году. Я работаю на должности: " + human.jobTitle + ". Будем знакомы!");
    }
}

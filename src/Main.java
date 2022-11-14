public class Main {
    public static void main(String[] args) {
        System.out.println("Задания 1");

        int currentYear = 2022;

        Human maksim = new Human();
        maksim.name = "Максим";
        maksim.age = 35;
        maksim.city = "Минск";
        maksim.jobTitle = "бренд-менеджер";

        Human anya = new Human();
        anya.name = "Аня";
        anya.age = 29;
        anya.city = "Москва";
        anya.jobTitle = "методист образовательных программ";

        Human katya = new Human();
        katya.name = "Катя";
        katya.age = 28;
        katya.city = "Калининград";
        katya.jobTitle = "продакт-менеджер";

        Human artem = new Human();
        artem.name = "Артём";
        artem.age = 27;
        artem.city = "Москва";
        artem.jobTitle = "директор по развитию бизнеса";

        System.out.println("Привет! Меня зовут " + maksim.name + ". Я из города " + maksim.city + ". Я родился в " + (currentYear - maksim.age) + " году. Я работаю на должности: " + maksim.jobTitle + ". Будем знакомы!");
        System.out.println("Привет! Меня зовут " + anya.name + ". Я из города " + anya.city + ". Я родился в " + (currentYear - anya.age) + " году. Я работаю на должности: " + anya.jobTitle + ". Будем знакомы!");
        System.out.println("Привет! Меня зовут " + katya.name + ". Я из города " + katya.city + ". Я родился в " + (currentYear - katya.age) + " году. Я работаю на должности: " + katya.jobTitle + ". Будем знакомы!");
        System.out.println("Привет! Меня зовут " + artem.name + ". Я из города " + artem.city + ". Я родился в " + (currentYear - artem.age) + " году. Я работаю на должности: " + artem.jobTitle + ". Будем знакомы!");
        System.out.println();

        System.out.println("Задание 3");

        Car lada = new Car();
        lada.brand = "Lada";
        lada.model = "Granta";
        lada.productionYear = 2015;
        lada.productionCountry = "Россия";
        lada.color = "Жёлтый";
        lada.engineVolume = 1.7;
        System.out.println("Марка авто- " + lada.brand +
                ", модель- " + lada.model +
                ", объем двигателя в литрах- " + lada.engineVolume +
                ", цвет кузова- " + lada.color +
                ", год производства- " + lada.productionYear +
                ", страна производства- " + lada.productionCountry);

        Car audi = new Car();
        audi.brand = "Audi";
        audi.model = "A8 50 L TDI quattro";
        audi.productionYear = 2020;
        audi.productionCountry = "Германия";
        audi.color = "Чёрный";
        audi.engineVolume = 3.0;
        System.out.println("Марка авто- " + audi.brand +
                ", модель- " + audi.model +
                ", объем двигателя в литрах- " + audi.engineVolume +
                ", цвет кузова- " + audi.color +
                ", год производства- " + audi.productionYear +
                ", страна производства- " + audi.productionCountry);

        Car bmw = new Car();
        bmw.brand = "BMW";
        bmw.model = "Z8";
        bmw.productionYear = 2021;
        bmw.productionCountry = "Германия";
        bmw.color = "Чёрный";
        bmw.engineVolume = 3.0;
        System.out.println("Марка авто- " + bmw.brand +
                ", модель- " + bmw.model +
                ", объем двигателя в литрах- " + bmw.engineVolume +
                ", цвет кузова- " + bmw.color +
                ", год производства- " + bmw.productionYear +
                ", страна производства- " + bmw.productionCountry);

        Car kia = new Car();
        kia.brand = "KIA";
        kia.model = "Sportage 4 поколение";
        kia.productionYear = 2018;
        kia.productionCountry = "Южная Корея";
        kia.color = "Красный";
        kia.engineVolume = 2.4;
        System.out.println("Марка авто- " + kia.brand +
                ", модель- " + kia.model +
                ", объем двигателя в литрах- " + kia.engineVolume +
                ", цвет кузова- " + kia.color +
                ", год производства- " + kia.productionYear +
                ", страна производства- " + kia.productionCountry);

        Car hyundai = new Car();
        hyundai.brand = "Hyundai";
        hyundai.model = "Avante";
        hyundai.productionYear = 2016;
        hyundai.productionCountry = "Южная Корея";
        hyundai.color = "Оранжевый";
        hyundai.engineVolume = 1.6;
        System.out.println("Марка авто- " + hyundai.brand +
                ", модель- " + hyundai.model +
                ", объем двигателя в литрах- " + hyundai.engineVolume +
                ", цвет кузова- " + hyundai.color +
                ", год производства- " + hyundai.productionYear +
                ", страна производства- " + hyundai.productionCountry);
    }
}
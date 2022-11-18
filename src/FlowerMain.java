public class FlowerMain {
    public static void main(String[] args) {

        Flower rosa = new Flower(null, "Holland", 35.59);
        Flower chrysanthemum = new Flower(null, null, 15);
        chrysanthemum.lifeSpan = 5;
        Flower peony = new Flower(null, "England", 69.90);
        peony.lifeSpan = 1;
        Flower gypsophila = new Flower(null, "Turkey", 19.50);
        gypsophila.lifeSpan = 10;


        printInfo(rosa);
        printInfo(chrysanthemum);
        printInfo(peony);
        printInfo(gypsophila);

        System.out.println();


        printCostOfFlowers(
                rosa, rosa, rosa,
                chrysanthemum, chrysanthemum, chrysanthemum, chrysanthemum, chrysanthemum,
                gypsophila
        );

    }

    private static void printInfo(Flower flower) {
        System.out.println(
                "Цвет: " + flower.getFlowerColor() +
                        ", страна: " + flower.getCountry() +
                        ", стоимость за штуку: " + flower.getCost() +
                        ", срок стояния цветка: " + flower.lifeSpan);
    }

    private static void printCostOfFlowers(Flower... flowers) {
        double totalCost = 0;
        int minimumLifeSpan = Integer.MAX_VALUE;
        for (Flower flower : flowers) {
            if (flower.lifeSpan < minimumLifeSpan) {
                minimumLifeSpan = flower.lifeSpan;
            }
            totalCost += flower.getCost();
            printInfo(flower);
        }

        totalCost = 1.1 * totalCost;
        System.out.println("Стоимость букета: " + totalCost);
        System.out.println("Срок стояния букета: " + minimumLifeSpan + " дней");

    }
}

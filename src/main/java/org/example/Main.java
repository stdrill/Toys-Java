package org.example;

public class Main {
    public static void main(String[] args) {

        ToyShop store = new ToyShop();

        Toy toy1 = new Toy(1, "Акула из Икеи", 10, 20);
        Toy toy2 = new Toy(2, "Кот Батон", 15, 40);
        Toy toy3 = new Toy(3, "3D ручка", 20, 10);
        Toy toy4 = new Toy(3, "Бластер Нерф Ультра", 5, 30);
        Toy toy5 = new Toy(3, "Робот щенок", 5, 20);
        Toy toy6 = new Toy(3, "Малыш Йода", 10, 10);

        store.addToy(toy1);
        store.addToy(toy2);
        store.addToy(toy3);
        store.addToy(toy4);
        store.addToy(toy5);
        store.addToy(toy6);

        store.changeToyFrequency(1, 30);

        store.organizeRaffle();

        Toy prizeToy = store.getPrizeToy();
        if (prizeToy != null) {
            System.out.println("Вы выиграли : " + prizeToy.getName());
        }
    }
}
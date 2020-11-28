package exercise3;

import exercise3.AlcoholicDrinks.Alcohol;
import exercise3.AlcoholicDrinks.Vodka;
import exercise3.AlcoholicDrinks.Whiskey;
import exercise3.Juices.AppleJuice;
import exercise3.Juices.Juice;
import exercise3.Juices.OrangeJuice;
import exercise3.Sodas.Cola;
import exercise3.Sodas.Soda;
import exercise3.Sodas.Sprite;

// Написать класс "бутылка" и несколько напитков. Например, 2 вида сока и 2 вида газировки.
// Создать несколько бутылок под определенные типы напитков.
// Каждая бутылка должна быть предназначена строго для своего типа напитка (например, бутылка для апельсинового сока).
// Написать коллекцию, которая будет играть роль ящика. В ящик можно помещать только бутылки для сока,
// независимо от того, какой именно в них сок, но нельзя помещать бутылки для алкоголя.
// Показать это в коде с помощью параметризированных типов.

public class Exercise3 {
    public void execute(){

        Box<Juice> juiceBox = new Box<>();
        juiceBox.put(new OrangeJuice());
        juiceBox.put(new AppleJuice());
        // juiceBox.put(new Vodka()); ERROR here: Vodka extends Alcohol not Juice

        Box<Soda> sodaBox = new Box<>();
        sodaBox.put(new Sprite());
        sodaBox.put(new Cola());
        // sodaBox.put(new AppleJuice());

        Box<Alcohol> alcoBox = new Box<>();
        alcoBox.put(new Vodka());
        alcoBox.put(new Whiskey());
        // alcoBox.put(new Sprite());
    }
}

package ucu.edu.ua.demo.flower;

import lombok.NoArgsConstructor;

public class Rose extends Flower {
    private FlowerColor flcolor = FlowerColor.RED;

    public Rose(double sepalLength, FlowerColor color, double price, FlowerType flowerType) {
        super(sepalLength, color, price, flowerType);
    }

    public Rose() {

    }
}

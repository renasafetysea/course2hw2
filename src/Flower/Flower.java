package Flower;

import java.util.Objects;

public class Flower {
    private String flowerColor;
    private String country;
    private float cost;
    private int lifeSpan;


    public Flower(String flowerColor, String country, float cost, int lifeSpan) {
        this.flowerColor = Objects.requireNonNullElse(flowerColor, "Белый");
        this.country = Objects.requireNonNullElse(country, "Россия");
        if(cost<=0){
            this.cost = 1;
        }else {
        this.cost = cost;
        }
        if(lifeSpan <=0) {
            this.lifeSpan = 3;
        }else {
        this.lifeSpan = lifeSpan;
    }
    }

        public String getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor(String flowerColor) {
        this.flowerColor = flowerColor;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
            this.country = country;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(int lifeSpan) {
        this.lifeSpan = lifeSpan;
    }

    @Override
    public String toString() {
        return "Название цветка - "+ flowerColor +
                ". Страна производства - " + country +
                ". Стоимость - " + cost +
                ".Срок стояния - "+ lifeSpan;
    }

    }


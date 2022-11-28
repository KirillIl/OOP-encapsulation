public class Flower {
    public String flowerName;
    private String flowerColor;
    private String country;
    private Double cost;
    public Integer lifeSpan;

    public Flower(String flowerName, String flowerColor, String country, Double cost, Integer lifeSpan) {
        this.flowerName = flowerName;
        if (flowerColor != null && !flowerColor.isEmpty() && !flowerColor.isBlank()) {
            this.flowerColor = flowerColor;
        } else {
            this.flowerColor = "белый";
        }
        if (country != null && !country.isEmpty() && !country.isBlank()) {
            this.country = country;
        } else {
            this.country = "Россия";
        }
        if (cost >= 0) {
            this.cost = cost;
        } else {
            this.cost = 1.00;
        }
        if (lifeSpan == null || lifeSpan <= 0) {
            this.lifeSpan = 3;
        } else {
            this.lifeSpan = lifeSpan;
        }
    }
    public Flower(String flowerName, String flowerColor, String country, Double cost) {
        this(flowerName, flowerColor, country,cost, 3);
    }
    public String getFlowerColor() {
        return flowerName;
    }
    public void setFlowerColor(String flowerColor) {
        if (flowerName != null && !flowerName.isEmpty() && !flowerName.isBlank()) {
            this.flowerColor = flowerColor;
        } else {
            this.flowerColor = "белый";
        }
    }
    public String getCountry () {
        return country;
    }
    public void setCountry(String country) {
        if (country != null && !country.isEmpty() && !country.isBlank()) {
            this.country = country;
        } else {
            this.country = "Россия";
        }
    }
    public Double getCost () {
        return cost;
    }
    public void setCost (Double cost){
        if (cost >= 0) {
            this.cost = cost;
        } else {
            this.cost = 1.00;
        }
    }


    public String toString () {
        return String.format("%s, страна происхождения — %s, стоимость штуки — %.2f", flowerName, country, cost) + " рублей, цвет - " + flowerColor + ", срок стояния — " + lifeSpan + " дн.";
    }
}
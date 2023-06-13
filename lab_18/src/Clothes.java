abstract class Clothes {
    private Size size;
    private double price;
    private String color;

    Clothes(Size size, double cost, String color) {
        this.size = size;
        this.price = cost;
        this.color = color;
    }

    public Size getSize() {

        return size;
    }

    public double getCost() {

        return price;
    }

    public String getColor() {

        return color;
    }
}
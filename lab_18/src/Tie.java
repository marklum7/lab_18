public class Tie extends Clothes implements ManCloth {
    public Tie(Size size, double price, String color) {
        super(size, price, color);
    }
    @Override
    public void dressMan() {
        System.out.println("Мужчина надел галстук "+ getSize().getDescription()+" "+ getSize().getEuroSize() +" " + getSize() + ", цвета " + getColor() + ", стоимостью " + getCost() + ".");
    }
}



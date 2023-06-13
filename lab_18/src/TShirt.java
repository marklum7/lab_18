public class TShirt extends Clothes implements WomanCloth, ManCloth {
    public TShirt(Size size, double price, String color) {
        super(size, price, color);
    }
    @Override
    public void dressMan() {
        System.out.println("Мужчина надел футболку "+ getSize().getDescription()+" "+ getSize().getEuroSize()+" "  + getSize() + ", цвета " + getColor() + ", стоимостью " + getCost() + ".");
    }
    @Override
    public void dressWoman() {
        System.out.println("Женщина надела футболку "+ getSize().getDescription()+" "+ getSize().getEuroSize() +" " + getSize() + ", цвета " + getColor() + ", стоимостью " + getCost() + ".");
    }
}
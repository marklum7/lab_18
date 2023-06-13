public class Skirt extends Clothes implements WomanCloth{
    public Skirt(Size size, double price, String color) {
        super(size, price, color);
    }
    @Override
    public void dressWoman() {
        System.out.println("Женщина надела юбку "+ getSize().getDescription()+" "+ getSize().getEuroSize()+" " + getSize() + ", цвета " + getColor() + ", стоимостью " + getCost() + ".");
    }
}




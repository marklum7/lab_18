public class Trousers extends Clothes implements WomanCloth, ManCloth {
    public Trousers(Size size, double price, String color) {
        super(size, price, color);
    }
    @Override
    public void dressMan() {
        System.out.println("Мужчина надел штаны "+ getSize().getDescription()+" "+ getSize().getEuroSize() +" " + getSize() + ", цвета " + getColor() + ", стоимостью " + getCost() + ".");
    }
    @Override
    public void dressWoman() {
        System.out.println("Женщина надела штаны "+ getSize().getDescription()+" "+ getSize().getEuroSize()  +" "+ getSize() + ", цвета " + getColor() + ", стоимостью " + getCost() + ".");
    }
}

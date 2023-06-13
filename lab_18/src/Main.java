public class Main{
    public static void main(String[] args){
        Clothes[] cloths = {
                new TShirt(Size.XS, 2000, "желтый"),
                new Trousers(Size.L, 1500, "зеленый"),
                new Skirt(Size.M, 1000, "синий"),
                new Tie(Size.XXS, 5000, "красный")
        };
        Atelier atelier = new Atelier();

        atelier.dressMan(cloths);
        atelier.dressWoman(cloths);
    }
}
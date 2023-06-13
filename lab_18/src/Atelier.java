public class Atelier {
    public void dressWoman(Clothes[] clothes) {
        System.out.println("Женская одежда:");
        for (Clothes i : clothes) {
            if (i instanceof WomanCloth) {
                ((WomanCloth) i).dressWoman();
            }
        }
    }

    public void dressMan(Clothes[] clothes) {
        System.out.println("Мужская одежда:");
        for (Clothes i : clothes) {
            if (i instanceof ManCloth) {
                ((ManCloth) i).dressMan();
            }
        }
    }
}



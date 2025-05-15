public class ZarzadzanieZoo {
    public static void main(String[] args) {
        Ssak s1 = new Ssak("Lew", 24, 231);
        Ptak p1 = new Ptak("Wróbel", 4, "brązowy");
        Gad g1 = new Gad("Jaszczurka", 6, 20);

        System.out.println(s1.czyStary());
        System.out.println(g1.wydajDzwiek());
        System.out.println(p1.poruszajSie());

        System.out.println(g1.srodowiskoNaturalne());
        System.out.println(p1.srodowiskoNaturalne());
        System.out.println(s1.srodowiskoNaturalne());

    }
}
public class Ptak extends Zwierze{
    protected String kolor;
    public Ptak(String nazwa, int wiek, String kolor) {
        super(nazwa, wiek);
        this.kolor = kolor;
    }

    @Override
    public String wydajDzwiek() {
        return "ptak wydaje dzwiek";
    }

    @Override
    public String poruszajSie() {
        return "wzniósł się w powietrze";
    }

    @Override
    public String srodowiskoNaturalne() {
        return "Ptaki żyją i rozmnażają się w prawie wszystkich ziemskich biotopach na każdym z siedmiu kontynentów.";
    }

    public void poruszajSkrzydłami(){
        System.out.println("Ptak rusza skrzydłami");
    }
}

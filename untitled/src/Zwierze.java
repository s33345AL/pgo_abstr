public abstract class Zwierze {
    protected String nazwa;
    protected int wiek;

    public Zwierze(String nazwa, int wiek) {
        this.nazwa = nazwa;
        this.wiek = wiek;
    }

    public abstract String wydajDzwiek();

    public abstract String poruszajSie();

    public abstract String srodowiskoNaturalne();

    public void wyswietlInformacje(){
        System.out.println("Nazwa: " + nazwa + " Wiek: " + wiek);
    }

    public String getNazwa() {
        return nazwa;
    }

    public int getWiek() {
        return wiek;
    }
}

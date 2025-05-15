public class Ssak extends Zwierze{
    protected double waga;

    public Ssak(String nazwa, int wiek, double waga) {
        super(nazwa, wiek);
        this.waga = waga;
    }

    @Override
    public String wydajDzwiek() {
        return "ssak wydaje dzwiek";
    }

    @Override
    public String poruszajSie() {
        return "ssak się ruszył";
    }

    @Override
    public String srodowiskoNaturalne() {
        return "Najbardziej rozpowszechniony na Ziemi ssak żyje na wszystkich kontynentach, pojawia się na najwyższych szczytach i w najgłębszych rowach oceanicznych";
    }

    public boolean czyStary(){
        if (wiek < 10){
            return false;
        }else {
            return true;
        }
    }

    public double getWaga() {
        return waga;
    }
}

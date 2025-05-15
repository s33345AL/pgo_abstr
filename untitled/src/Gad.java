public class Gad extends Zwierze{
    protected double dlugoscWCm;

    public Gad(String nazwa, int wiek, double dlugoscWCm) {
        super(nazwa, wiek);
        this.dlugoscWCm = dlugoscWCm;
    }

    @Override
    public String wydajDzwiek() {
        return "gad wydaje dźwiek";
    }

    @Override
    public String poruszajSie() {
        return "gad się porusza";
    }

    @Override
    public String srodowiskoNaturalne() {
        return "Gady są kręgowcami, które przystosowały się do życia na lądzie. Występują jednak wśród nich gatunki, zwłaszcza zaliczające się do żółwi, węży i krokodyli, które znaczną część życia spędzają w środowisku wodnym.";
    }

    public void wyjdzNaPolowanie(){
        System.out.println("Gad wyszedł na polowanie");
    }
}

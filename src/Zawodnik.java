public class Zawodnik extends osoba {

    public Zawodnik(String imie, String nazwisko) {
        super(imie, nazwisko);
    }

    public String toString() {
        return "Zawodnik= " + super.getImie() + " nazwisko= " + super.getNazwisko();
    }
}

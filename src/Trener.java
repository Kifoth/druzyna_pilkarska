

public class Trener extends osoba {

    public Trener(String imie, String nazwisko, int licencja) {
        super(imie, nazwisko, licencja);
    }

    public String toString() {
        return "Trener= " + super.getImie() + " nazwisko= " + super.getNazwisko() +  "Numer Licencji= " + super.getLicencja();

    }

}
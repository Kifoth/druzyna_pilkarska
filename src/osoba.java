public class osoba {


    private String imie;
    private String nazwisko;
    private int licencja;
    private String specjalizacja;

    public osoba(String imie, String nazwisko, int licencja, String specjalizacja) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.licencja = licencja;
        this.specjalizacja = specjalizacja;
    }

    public osoba(String imie, String nazwisko, int licencja) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.licencja = licencja;
    }

    public osoba(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getLicencja() {
        return licencja;
    }

    public void setLicencja(int licencja) {
        this.licencja = licencja;
    }

    public String getSpecjalizacja() {
        return specjalizacja;
    }

    public void setSpecjalizacja(String specjalizacja) {
        this.specjalizacja = specjalizacja;
    }

    @Override
    public String toString() {
        return "osoba{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", licencja=" + licencja +
                ", specjalizacja='" + specjalizacja + '\'' +
                '}';
    }
}
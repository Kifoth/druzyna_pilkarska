public class druzyna {

    String nazwa;
    String stadion;
    String ulica;


    public druzyna(String nazwa, String stadion, String ulica) {
        this.nazwa = nazwa;
        this.stadion = stadion;
        this.ulica = ulica;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getStadion() {
        return stadion;
    }

    public void setStadion(String stadion) {
        this.stadion = stadion;
    }

    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    @Override
    public String toString() {
        return "druzyna{" +
                "nazwa='" + nazwa + '\'' +
                ", stadion='" + stadion + '\'' +
                ", ulica='" + ulica + '\'' +
                '}';
    }
}
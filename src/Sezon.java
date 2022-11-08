public class Sezon {

    int ilosc_druzyn;
    int ilosc_zagr_mecz;
    int porazki;
    int pkt;

    public Sezon(int ilosc_druzyn, int ilosc_zagr_mecz, int porazki, int pkt) {
        this.ilosc_druzyn = ilosc_druzyn;
        this.ilosc_zagr_mecz = ilosc_zagr_mecz;
        this.porazki = porazki;
        this.pkt = pkt;
    }

    public int getIlosc_druzyn() {
        return ilosc_druzyn;
    }

    public void setIlosc_druzyn(int ilosc_druzyn) {
        this.ilosc_druzyn = ilosc_druzyn;
    }

    public int getIlosc_zagr_mecz() {
        return ilosc_zagr_mecz;
    }

    public void setIlosc_zagr_mecz(int ilosc_zagr_mecz) {
        this.ilosc_zagr_mecz = ilosc_zagr_mecz;
    }

    public int getPorazki() {
        return porazki;
    }

    public void setPorazki(int porazki) {
        this.porazki = porazki;
    }

    public int getPkt() {
        return pkt;
    }

    public void setPkt(int pkt) {
        this.pkt = pkt;
    }

    @Override
    public String toString() {
        return "Sezon{" +
                "ilosc_druzyn=" + ilosc_druzyn +
                ", ilosc_zagr_mecz=" + ilosc_zagr_mecz +
                ", porazki=" + porazki +
                ", pkt=" + pkt +
                '}';
    }
}

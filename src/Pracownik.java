public class Pracownik {

    private String imię;
    private String nazwisko;
    private String dataUrodzenia;
    private DziałPracowników działPracowników;

    public Pracownik(String imię, String nazwisko, String dataUrodzenia, DziałPracowników działPracowników) {
        this.imię = imię;
        this.nazwisko = nazwisko;
        this.dataUrodzenia = dataUrodzenia;
        this.działPracowników = działPracowników;
    }

    public String getImię() {
        return imię;
    }

    public void setImię(String imię) {
        this.imię = imię;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getDataUrodzenia() {
        return dataUrodzenia;
    }

    public void setDataUrodzenia(String dataUrodzenia) {
        this.dataUrodzenia = dataUrodzenia;
    }

    public DziałPracowników getDziałPracowników() {
        return działPracowników;
    }

    public void setDziałPracowników(DziałPracowników działPracowników) {
        this.działPracowników = działPracowników;
    }
}

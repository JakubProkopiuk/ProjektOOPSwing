public class Użytkownik extends Pracownik {

    private String login;
    private String hasło;
    private String inicial;

    Użytkownik(String imię, String nazwisko, String dataUrodzenia, DziałPracowników działPracowników, String login, String hasło) {
        super(imię, nazwisko, dataUrodzenia, działPracowników);
        this.login = login;
        this.hasło = hasło;
        this.inicial = (imię.substring(0, 2) + nazwisko.substring(0, 2));
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getHasło() {
        return hasło;
    }

    public void setHasło(String hasło) {
        this.hasło = hasło;
    }

    public String getInicial() {
        return inicial;
    }

    public void setInicial(String inicial) {
        this.inicial = inicial;
    }
}

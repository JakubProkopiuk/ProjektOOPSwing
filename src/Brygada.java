import java.util.ArrayList;
import java.util.List;

public class Brygada {

    private String nazwa;
    private Brygadzista brygadzista;
    private List<Pracownik> listaPracowników = new ArrayList<Pracownik>();

    public Brygada(String nazwa, Brygadzista brygadzista, List<Pracownik> listaPracowników) {
        this.nazwa = nazwa;
        this.brygadzista = brygadzista;
        this.listaPracowników = listaPracowników;
    }
    // Pojedyncze dodanie
    public void dodajDoBrygady (Pracownik pracownik) {
        listaPracowników.add(pracownik);
        brygadzista.dodajBrygadeWKtórejByłeś(this);
    }
    // Dodanie z listy
    public void dodajDoBrygady (List<Pracownik> listaPracowników) {
        for (Pracownik pojedynczyPracownik : listaPracowników) {
            dodajDoBrygady(pojedynczyPracownik);
            brygadzista.dodajBrygadeWKtórejByłeś(this);
        }
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public Brygadzista getBrygadzista() {
        return brygadzista;
    }

    public void setBrygadzista(Brygadzista brygadzista) {
        this.brygadzista = brygadzista;
    }

    public List<Pracownik> getListaPracowników() {
        return listaPracowników;
    }

    public void setListaPracowników(List<Pracownik> listaPracowników) {
        this.listaPracowników = listaPracowników;
    }
}

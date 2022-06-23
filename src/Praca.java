import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Praca implements Serializable {
    private int czasPracy;
    private boolean czyZrealizowane;
    private String opis;
    static int numerPracyGenerowany = 1;
    private int numerPracy;
    private rodzajPracy rodzajPracy;
    static int numerPracyDodatkowy;

    public enum rodzajPracy {
        OGÓLNA, MONTAŻ, DEMONTAŻ, WYMIANA;
    }
    public Praca(rodzajPracy rodzajPracy, int czasPracy, String opis) {
        this.rodzajPracy = rodzajPracy;
        this.czasPracy = czasPracy;
        this.opis = opis;
        numerPracy = numerPracyGenerowany;
        numerPracyGenerowany++;
    }

    public static void writePraca(List<Praca> praca) {

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File("src/Praca"));
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeInt(praca.size());

            for (Praca p : praca) {
                objectOutputStream.writeObject(p);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static List <Praca> loadPraca() {
        List<Praca> result = new ArrayList<>();

        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(new File("src/Praca"));
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            numerPracyGenerowany = objectInputStream.readInt();
            numerPracyDodatkowy = numerPracyGenerowany;

            while (numerPracyGenerowany > 0) {
                numerPracyGenerowany--;
                result.add((Praca) objectInputStream.readObject());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return result;
    }
}

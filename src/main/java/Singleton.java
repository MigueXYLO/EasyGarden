import java.util.LinkedList;

public class Singleton {
    private static Singleton instance;
    private LinkedList<Espaco> espacos;
    private Singleton() {
        espacos = new LinkedList<>();
    }
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
    public void addEspaco(Espaco espaco) {
        espacos.add(espaco);
    }
    public LinkedList<Espaco> getEspacos() {
        return espacos;
    }
}

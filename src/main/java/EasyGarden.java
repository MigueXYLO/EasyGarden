import javax.swing.*;

public class EasyGarden extends JFrame {
    public EasyGarden() {
        super("EasyGarden");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton button = new JButton("Adicionar Espaco");
        button.addActionListener(e->{
             new AdicionarEspaco();
        });
        add(button);
        //////////////////////////////////////////////////
        setVisible(true);
    }

    public static void main(String[] args) {
        new EasyGarden();
    }
}

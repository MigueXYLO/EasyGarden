import javax.swing.*;
import java.util.LinkedList;

public class EasyGarden extends JFrame {
    public EasyGarden() {
        super("EasyGarden");
        setSize(800, 600);
        //set the layout
        setLayout(null);
        //set the default close operation
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton button = new JButton("Adicionar Espaco");
        button.setBounds(50, 50, 200, 30);
        button.addActionListener(e->{
             new AdicionarEspaco();
        });
        add(button);
        //add a list that shows the espacos from the singleton
        JList<Espaco> list = new JList<>();
        list.setBounds(50, 100, 200, 300);
        add(list);
        //add a button to refresh the list
        JButton refreshButton = new JButton("Refresh");
        refreshButton.setBounds(50, 410, 200, 30);
        refreshButton.addActionListener(e->{
            //get the espacos from the singleton
            LinkedList<Espaco> espacosRefresh = Singleton.getInstance().getEspacos();
            //convert the list of espacos to an array
            Espaco[] espacosArrayRefresh = new Espaco[espacosRefresh.size()];
            espacosRefresh.toArray(espacosArrayRefresh);
            //set the list model
            list.setListData(espacosArrayRefresh);
        });
        add(refreshButton);
        //////
        setVisible(true);
    }

    public static void main(String[] args) {
        new EasyGarden();
    }
}

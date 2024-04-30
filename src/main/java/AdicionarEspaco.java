import javax.swing.*;

public class AdicionarEspaco extends JFrame {
    public AdicionarEspaco() {
        super("Adicionar Espaco");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        //add 3 text fields, 1 combo box, 1 button
        JLabel lblendereco = new JLabel("Endereco");
        add(lblendereco);
        JTextField endereco = new JTextField();
        endereco.setBounds(50, 50, 200, 30);
        add(endereco);
        JLabel lblarea = new JLabel("Area");
        add(lblarea);
        JTextField area = new JTextField();
        area.setBounds(50, 100, 200, 30);
        add(area);
        JLabel lbltipo = new JLabel("Tipo");
        add(lbltipo);
        JComboBox<Tipo> tipo = new JComboBox<>(Tipo.values());
        tipo.setBounds(50, 150, 200, 30);
        add(tipo);
        JLabel lblresponsavel = new JLabel("Responsavel");
        add(lblresponsavel);
        JTextField responsavel = new JTextField();
        responsavel.setBounds(50, 200, 200, 30);
        add(responsavel);
        JButton button = new JButton("Adicionar");
        button.setBounds(50, 250, 200, 30);
        button.addActionListener(e->{
            Espaco espaco = new Espaco(endereco.getText(), Double.parseDouble(area.getText()), (Tipo) tipo.getSelectedItem(), responsavel.getText());
            System.out.println(espaco.getEndereco());
            System.out.println(espaco.getArea());
            System.out.println(espaco.getTipo());
            System.out.println(espaco.getResponsavel());
        });

        //////
        setVisible(true);
    }

}

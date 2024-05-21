import javax.swing.*;

public class AdicionarEspaco extends JFrame {
    public AdicionarEspaco() {
        super("Adicionar Espaco");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        //add 3 text fields, 1 combo box, 1 button
        JLabel lblendereco = new JLabel("Endereco");
        lblendereco.setBounds(50, 30, 200, 30);
        add(lblendereco);
        JTextField endereco = new JTextField();
        endereco.setBounds(50, 50, 200, 30);
        add(endereco);
        JLabel lblarea = new JLabel("Area");
        lblarea.setBounds(50, 80, 200, 30);
        add(lblarea);
        JTextField area = new JTextField();
        area.setBounds(50, 100, 200, 30);
        add(area);
        JLabel lbltipo = new JLabel("Tipo");
        lbltipo.setBounds(50, 130, 200, 30);
        add(lbltipo);
        JComboBox<Tipo> tipo = new JComboBox<>(Tipo.values());
        tipo.setBounds(50, 150, 200, 30);
        add(tipo);
        JLabel lblresponsavel = new JLabel("Responsavel");
        lblresponsavel.setBounds(50, 180, 200, 30);
        add(lblresponsavel);
        JTextField responsavel = new JTextField();
        responsavel.setBounds(50, 200, 200, 30);
        add(responsavel);
       JButton button = new JButton("Adicionar");
        button.setBounds(50, 230, 200, 30);
        //add a click function to the button
button.addActionListener(e->{
            //get the values from the text fields and combo box
            String enderecoValue = endereco.getText();
            String areaValue = area.getText();
            Tipo tipoValue = (Tipo) tipo.getSelectedItem();
            String responsavelValue = responsavel.getText();
            //if any fields are invalid then show an error message
            if (enderecoValue.isEmpty() || areaValue.isEmpty() || responsavelValue.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por favor preencha todos os campos");
                return;
            }
            //convert the string to a double
            double areaValueDouble = Double.parseDouble(areaValue);
            //create a new Espaco object
            Espaco espaco = new Espaco(enderecoValue, areaValueDouble, tipoValue, responsavelValue);
            //add the Espaco object to the list of Espacos in the Singleton
            Singleton.getInstance().addEspaco(espaco);
            //close the window
            dispose();
        });
        add(button);
        //////
        setVisible(true);
    }

}

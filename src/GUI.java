import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class GUI implements ActionListener {

    private static JLabel userLabel;
    private static JTextField userText;
    private static JPasswordField passwordField;
    private static JLabel labelPassword;
    private static JButton buttonLogin;
    private static List<Brygadzista> brygadzistaList;

    brygadzistaList = bryg

    public static void main(String[] args) throws NotUniqueNameException {

        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Projekt GUI");
        frame.add(panel);

        panel.setLayout(null);

        userLabel = new JLabel("User");
        userLabel.setBounds(85, 90, 80, 25);
        panel.add(userLabel);

        userText = new JTextField();
        userText.setBounds(120, 90, 165, 25);
        panel.add(userText);

        labelPassword = new JLabel("Password");
        labelPassword.setBounds(55, 115, 80, 25);
        panel.add(labelPassword);

        passwordField = new JPasswordField();
        passwordField.setBounds(120, 115, 165, 25);
        panel.add(passwordField);

        buttonLogin = new JButton();
        buttonLogin.addActionListener(new GUI());
        buttonLogin.setText("Log in");
        buttonLogin.setBounds(155, 148, 80, 25);
        panel.add(buttonLogin);

        frame.setVisible(true);

        DziałPracowników przykładowyDziałDrugi = DziałPracowników.createDzial("przykładowyDziałDrugi");
        Brygadzista przykładowyBrygadzista = new Brygadzista("Jan", "Duda", "15.06.1995", przykładowyDziałDrugi, "Jano", "DudaJan");
        Brygadzista przykładowyBrygadzista2 = new Brygadzista("Jan", "Duda", "15.06.1995", przykładowyDziałDrugi, "Czarek", "123qwe");

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String user = userText.getText().toString();
        String password = passwordField.getText().toString();

        for (Brygadzista brygadzista : getBrygadzistaList()) {
            String tymczasoweHasło = brygadzista.getHasło();
            String tymczasowyLogin = brygadzista.getLogin();
            if (user.equals(tymczasowyLogin) && password.equals(tymczasoweHasło)) {
                JOptionPane.showMessageDialog(null, "You are logged in");
            }
            else {
                JOptionPane.showMessageDialog(null, "Incorrect data");
            }
        }
    }
}

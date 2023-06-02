package GUI;

import juego.Juego;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JuegoGUI extends JFrame{
    private JFrame frame;
    private JButton btnComprobar;
    private JPanel hola;
    private JLabel lbl1,lbl2;
    private JLabel ingresa;
    private JTextField txt;
    private JLabel txtGenerado;
    Juego juego = new Juego();

    public JuegoGUI() {
        setupFrame();
        lbls();
        add(hola);
        addListeners();
    }
    private void lbls(){
        ingresa.setText("Ingresa un caracter(minuscula): ");
        lbl1.setText("0");
        lbl2.setText("0");
    }
    private void setupFrame(){
        setTitle("Juego");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(500,120);
        setVisible(true);
    }
    private void addListeners(){
        btnComprobar.addActionListener(new eventClick());
    }


    public class eventClick implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            String cadena = txt.getText();
            char c = cadena.charAt(0);
            juego.jugar(c);
            int puntos = juego.getPuntos();
            int perdidas = juego.getPerdidas();
            System.out.println("aaaaaaaaaaaaaaa: " + puntos);
            lbl1.setText(String.valueOf(puntos));
            lbl2.setText(String.valueOf(perdidas));
            txt.setText("");
            if(perdidas>=3){
                JOptionPane.showMessageDialog(frame,"Perdiste :(","perdiste",JOptionPane.WARNING_MESSAGE);
                txt.setEnabled(false);
                btnComprobar.setEnabled(false);
            }
            if(puntos<=10){
                txtGenerado.setText(String.valueOf(juego.getPc()));
            }else {
                txtGenerado.setText(String.valueOf(juego.getOp1()));
            }
        }
    }
}


package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Main extends javax.swing.JFrame implements ActionListener {

    private int posicion = 1;
    private int correctos = 0;
    private int x = 10;
    private int y = 10;
    
    public Main() {
        initComponents();
        
        // Gestiona la creación de 49 botones con (Listener activo, Número correspondiente y Localización en el diseño)
        
        for(int i = 1; i <= 49; i++){
            JButton boton = new JButton();
            boton.addActionListener(this);
            boton.setText(String.valueOf(i));
            
            switch(i){
                case 1: break;
                case 8: x += 57; y = 10; break;
                case 15: x += 57; y = 10; break;
                case 22: x += 57; y = 10; break;
                case 29: x += 57; y = 10; break;
                case 36: x += 57; y = 10; break;
                case 43: x += 57; y = 10; break;
                default: y += 35; break;
            }
            
            boton.setBounds(0 + x, 0 + y, 48, 25);
            this.add(boton);
        }

        // Deshabilita la edición de las cajas de texto
        
        tf1.setEditable(false);
        tf2.setEditable(false);
        tf3.setEditable(false);
        tf4.setEditable(false);
        tf5.setEditable(false);
        tf6.setEditable(false);
        
        // Gestiono el evento del boton "Iniciar Bonoloto"
        
        btnBonoloto.addActionListener((ActionEvent e) -> {
            
            tfWin1.setText(String.valueOf((int) (Math.random() * 50) + 1));
            tfWin2.setText(String.valueOf((int) (Math.random() * 50) + 1));
            tfWin3.setText(String.valueOf((int) (Math.random() * 50) + 1));
            tfWin4.setText(String.valueOf((int) (Math.random() * 50) + 1));
            tfWin5.setText(String.valueOf((int) (Math.random() * 50) + 1));
            tfWin6.setText(String.valueOf((int) (Math.random() * 50) + 1));
            
            getCorrectNumbers();
        });
        
        // Gestiono el evento del boton "Nuevo Sorteo", maneja el reinicio de los numeros dados
        
        btnClean.addActionListener((ActionEvent e) -> {
            
            tf1.setText(null);
            tf2.setText(null);
            tf3.setText(null);
            tf4.setText(null);
            tf5.setText(null);
            tf6.setText(null);
            
            tfWin1.setText(null);
            tfWin2.setText(null);
            tfWin3.setText(null);
            tfWin4.setText(null);
            tfWin5.setText(null);
            tfWin6.setText(null);
            
            posicion = 1;
            correctos = 0;
            
            btnBonoloto.setEnabled(true);
            lbMessage.setText("");
        });
    }
    
    // Compara los números dados y los generados aleatoriamente. Muestra el número de aciertos
    
    public void getCorrectNumbers(){
        
        if (tf1.getText().equals(tfWin1.getText())){
            correctos += 1;
        }
        if(tf2.getText().equals(tfWin2.getText())){
            correctos += 1;
        }
        if(tf3.getText().equals(tfWin3.getText())){
            correctos += 1;
        }
        if(tf4.getText().equals(tfWin4.getText())){
            correctos += 1;
        }
        if(tf5.getText().equals(tfWin5.getText())){
            correctos += 1;
        }
        if(tf6.getText().equals(tfWin6.getText())){
            correctos += 1;
        }
        
        btnBonoloto.setEnabled(false);
        lbMessage.setText(correctos + " aciertos.");
    }
            
    // Gestiona la introducion de número de todos los botones
    
    @Override public void actionPerformed(ActionEvent e){
        
        String numSelected = ((JButton) e.getSource()).getText();
        
        switch(posicion){
            case 1: tf1.setText(numSelected); break;
            case 2: tf2.setText(numSelected); break;
            case 3: tf3.setText(numSelected); break;
            case 4: tf4.setText(numSelected); break;
            case 5: tf5.setText(numSelected); break;
            case 6: tf6.setText(numSelected); break;
            default: JOptionPane.showMessageDialog(null, "Ya se han insertado todos los números."); break;
        }
        
        posicion += 1;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tf1 = new javax.swing.JTextField();
        tf2 = new javax.swing.JTextField();
        tf3 = new javax.swing.JTextField();
        tf4 = new javax.swing.JTextField();
        tf5 = new javax.swing.JTextField();
        tf6 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        tfWin1 = new javax.swing.JLabel();
        tfWin2 = new javax.swing.JLabel();
        tfWin3 = new javax.swing.JLabel();
        tfWin4 = new javax.swing.JLabel();
        tfWin5 = new javax.swing.JLabel();
        tfWin6 = new javax.swing.JLabel();
        btnBonoloto = new javax.swing.JButton();
        btnClean = new javax.swing.JButton();
        lbMessage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(424, 424));
        setResizable(false);
        getContentPane().setLayout(null);

        tf1.setPreferredSize(new java.awt.Dimension(50, 25));
        getContentPane().add(tf1);
        tf1.setBounds(10, 270, 50, 25);

        tf2.setPreferredSize(new java.awt.Dimension(50, 25));
        getContentPane().add(tf2);
        tf2.setBounds(70, 270, 50, 25);

        tf3.setPreferredSize(new java.awt.Dimension(50, 25));
        getContentPane().add(tf3);
        tf3.setBounds(130, 270, 50, 25);

        tf4.setPreferredSize(new java.awt.Dimension(50, 25));
        getContentPane().add(tf4);
        tf4.setBounds(190, 270, 50, 25);

        tf5.setPreferredSize(new java.awt.Dimension(50, 25));
        getContentPane().add(tf5);
        tf5.setBounds(250, 270, 50, 25);

        tf6.setPreferredSize(new java.awt.Dimension(50, 25));
        getContentPane().add(tf6);
        tf6.setBounds(310, 270, 50, 25);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 260, 424, 10);

        tfWin1.setPreferredSize(new java.awt.Dimension(50, 25));
        getContentPane().add(tfWin1);
        tfWin1.setBounds(10, 310, 50, 25);

        tfWin2.setPreferredSize(new java.awt.Dimension(50, 25));
        getContentPane().add(tfWin2);
        tfWin2.setBounds(70, 310, 50, 25);

        tfWin3.setPreferredSize(new java.awt.Dimension(50, 25));
        getContentPane().add(tfWin3);
        tfWin3.setBounds(130, 310, 50, 25);

        tfWin4.setPreferredSize(new java.awt.Dimension(50, 25));
        getContentPane().add(tfWin4);
        tfWin4.setBounds(190, 310, 50, 25);

        tfWin5.setPreferredSize(new java.awt.Dimension(50, 25));
        getContentPane().add(tfWin5);
        tfWin5.setBounds(250, 310, 50, 25);

        tfWin6.setPreferredSize(new java.awt.Dimension(50, 25));
        getContentPane().add(tfWin6);
        tfWin6.setBounds(310, 310, 50, 25);

        btnBonoloto.setText("Iniciar Bonoloto");
        getContentPane().add(btnBonoloto);
        btnBonoloto.setBounds(10, 350, 121, 25);

        btnClean.setText("Nuevo Sorteo");
        getContentPane().add(btnClean);
        btnClean.setBounds(140, 350, 119, 25);

        lbMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMessage.setPreferredSize(new java.awt.Dimension(200, 25));
        getContentPane().add(lbMessage);
        lbMessage.setBounds(270, 350, 120, 25);
        lbMessage.getAccessibleContext().setAccessibleName("lbMessage");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new Main().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBonoloto;
    private javax.swing.JButton btnClean;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbMessage;
    private javax.swing.JTextField tf1;
    private javax.swing.JTextField tf2;
    private javax.swing.JTextField tf3;
    private javax.swing.JTextField tf4;
    private javax.swing.JTextField tf5;
    private javax.swing.JTextField tf6;
    private javax.swing.JLabel tfWin1;
    private javax.swing.JLabel tfWin2;
    private javax.swing.JLabel tfWin3;
    private javax.swing.JLabel tfWin4;
    private javax.swing.JLabel tfWin5;
    private javax.swing.JLabel tfWin6;
    // End of variables declaration//GEN-END:variables
}

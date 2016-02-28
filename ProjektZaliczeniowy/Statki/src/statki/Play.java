/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statki;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author Tomasz
 */
public class Game extends javax.swing.JFrame {

    ButtonGroup btg = new ButtonGroup();
    int i = 0;

    /**
     * Creates new form Game
     */
    public Game() {
        initComponents();
        btg.add(pion);
        btg.add(poziom);
        pion.setSelected(true);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        obiekty = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        litera = new javax.swing.JComboBox<>();
        cyfra = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        pion = new javax.swing.JRadioButton();
        poziom = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        view = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1024, 768));
        setMinimumSize(new java.awt.Dimension(1024, 768));
        setPreferredSize(new java.awt.Dimension(1024, 768));
        setResizable(false);
        getContentPane().setLayout(null);

        obiekty.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jednomasztowiec", "Dwumasztowiec", "Trzymasztowiec", "Czteromasztowiec", "Czołg", "Rakietnik", "Armata", "Samolot" }));
        obiekty.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                obiektyItemStateChanged(evt);
            }
        });
        getContentPane().add(obiekty);
        obiekty.setBounds(830, 550, 140, 20);

        jLabel1.setText("Wybierz obiekt:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(720, 550, 90, 20);

        jLabel2.setText("Pole:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(770, 590, 50, 20);

        litera.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "R", "S", "T", "U", "W", "Y" }));
        getContentPane().add(litera);
        litera.setBounds(830, 590, 40, 20);

        cyfra.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14" }));
        getContentPane().add(cyfra);
        cyfra.setBounds(870, 590, 37, 20);

        jLabel3.setText("Orientacja:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(740, 630, 100, 14);

        pion.setText("Pionowa");
        getContentPane().add(pion);
        pion.setBounds(830, 630, 80, 15);

        poziom.setText("Pozioma");
        getContentPane().add(poziom);
        poziom.setBounds(830, 650, 80, 15);

        jButton1.setText("Ustaw");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(780, 700, 73, 23);

        view.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        view.setIcon(new javax.swing.ImageIcon(getClass().getResource("/statki/graphics/jeden-pion-duzy.jpg"))); // NOI18N
        getContentPane().add(view);
        view.setBounds(740, 180, 230, 360);
        getContentPane().add(jLabel5);
        jLabel5.setBounds(50, 392, 80, 25);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/statki/graphics/plansza_cala.png"))); // NOI18N
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 1024, 768);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
        String statek = String.valueOf(obiekty.getSelectedItem());
        if (statek.equals("Jednomasztowiec")) {
            Variables.name = "jeden";
            Variables.sizeX = 22;
            Variables.sizeY = 22;

        }

        if (pion.isSelected()) {
            Variables.orient = "pion";

            if (statek.equals("Dwumasztowiec")) {
                Variables.name = "dwa";
                Variables.sizeX = 22;
                Variables.sizeY = 47;
            }
            if (statek.equals("Trzymasztowiec")) {
                Variables.name = "trzy";
                Variables.sizeX = 22;
                Variables.sizeY = 72;
            }
            if (statek.equals("Czteromasztowiec")) {
                Variables.name = "cztery";
                Variables.sizeX = 22;
                Variables.sizeY = 97;
            }
        } else {
            Variables.orient = "poziom";
            if (statek.equals("Dwumasztowiec")) {
                Variables.name = "dwa";
                Variables.sizeX = 47;
                Variables.sizeY = 22;
            }
            if (statek.equals("Trzymasztowiec")) {
                Variables.name = "trzy";
                Variables.sizeX = 72;
                Variables.sizeY = 22;
            }
            if (statek.equals("Czteromasztowiec")) {
                Variables.name = "cztery";
                Variables.sizeX = 97;
                Variables.sizeY = 22;
            }
        }

        Variables.valX = Variables.x.get(String.valueOf(litera.getSelectedItem()));
        Variables.valY = Variables.y.get(Integer.valueOf(String.valueOf(cyfra.getSelectedItem())));
        System.out.println("Variables.valX");
        System.out.println("orient: " + Variables.valY);
System.out.println("orient: " + Variables.valX);
        if (Variables.orient == "pion") {
            if (Variables.valY + Variables.sizeY > Variables.y.get(Integer.valueOf(String.valueOf(10)))) {

                showMessageDialog(null, "Nie możesz ustawić statku na plaży");
            } else {
                JLabel jednomasztowiec = new JLabel();
                jednomasztowiec.setOpaque(true);
                getContentPane().add(jednomasztowiec);
                jednomasztowiec.setBounds(Variables.valX, Variables.valY, Variables.sizeX, Variables.sizeY);
                jednomasztowiec.setIcon(new javax.swing.ImageIcon(getClass().getResource("/statki/graphics/" + Variables.name + "-" + Variables.orient + "-maly.jpg")));
            }
        } else {
            if ((Variables.valX + Variables.sizeX-30> Variables.x.get(String.valueOf("Y"))) && (Variables.valY > Variables.y.get(Integer.valueOf(String.valueOf(9))))) {
            System.out.println("drugi: " + Variables.y.get(Integer.valueOf(String.valueOf(9))));
            showMessageDialog(null, "Nie możesz ustawić statku poza mapą");
        } else {
            JLabel jednomasztowiec = new JLabel();
            jednomasztowiec.setOpaque(true);
            getContentPane().add(jednomasztowiec);
            jednomasztowiec.setBounds(Variables.valX, Variables.valY, Variables.sizeX, Variables.sizeY);
            jednomasztowiec.setIcon(new javax.swing.ImageIcon(getClass().getResource("/statki/graphics/" + Variables.name + "-" + Variables.orient + "-maly.jpg")));
        }
        }

    }//GEN-LAST:event_jButton1MousePressed

    private void obiektyItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_obiektyItemStateChanged
        String statek = String.valueOf(obiekty.getSelectedItem());

        if (statek.equals("Jednomasztowiec")) {
            view.setIcon(new javax.swing.ImageIcon(getClass().getResource("/statki/graphics/jeden-pion-duzy.jpg"))); // NOI18N

        }
        if (statek.equals("Dwumasztowiec")) {
            view.setIcon(new javax.swing.ImageIcon(getClass().getResource("/statki/graphics/dwa-pion-duzy.jpg"))); // NOI18N

        }
        if (statek.equals("Trzymasztowiec")) {
            view.setIcon(new javax.swing.ImageIcon(getClass().getResource("/statki/graphics/trzy-pion-duzy.jpg"))); // NOI18N

        }
        if (statek.equals("Czteromasztowiec")) {
            view.setIcon(new javax.swing.ImageIcon(getClass().getResource("/statki/graphics/cztery-pion-duzy.jpg"))); // NOI18N

        }


    }//GEN-LAST:event_obiektyItemStateChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Game().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cyfra;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JComboBox<String> litera;
    private javax.swing.JComboBox<String> obiekty;
    private javax.swing.JRadioButton pion;
    private javax.swing.JRadioButton poziom;
    private javax.swing.JLabel view;
    // End of variables declaration//GEN-END:variables
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;



/**
 *
 * @author s1601396
 */
public class GUI extends javax.swing.JFrame {

    int kortit = 2;
    String card = "";
    String card1 = "";
    String card2 = "";
    String card3 = "";
    String card4 = "";
    String card5 = "";
    String card6 = "";
    String card7 = "";
    String card8 = "";
    String card9 = "";
    String card10 = "";
    String card11 = "";

    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();

        Hit.setVisible(false);
        Stand.setVisible(false);
        Double.setVisible(false);
        Card8.setVisible(false);
        Card6.setVisible(false);
        Card4.setVisible(false);
        Card2.setVisible(false);
        Card1.setVisible(false);
        Card3.setVisible(false);
        Card5.setVisible(false);
        Card7.setVisible(false);
        Card9.setVisible(false);
        Card10.setVisible(false);
        Card11.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        Card11 = new javax.swing.JLabel();
        Card10 = new javax.swing.JLabel();
        Card9 = new javax.swing.JLabel();
        Card8 = new javax.swing.JLabel();
        Card7 = new javax.swing.JLabel();
        Card6 = new javax.swing.JLabel();
        Card5 = new javax.swing.JLabel();
        Card4 = new javax.swing.JLabel();
        Card3 = new javax.swing.JLabel();
        Card2 = new javax.swing.JLabel();
        Card1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Play = new javax.swing.JButton();
        Double = new javax.swing.JButton();
        Stand = new javax.swing.JButton();
        Hit = new javax.swing.JButton();
        Table = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Card11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/10_3.png"))); // NOI18N
        jPanel2.add(Card11, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, -1));

        Card10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/10_4.png"))); // NOI18N
        jPanel2.add(Card10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, -1));

        Card9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/10_1.png"))); // NOI18N
        jPanel2.add(Card9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, -1));

        Card8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/10_4.png"))); // NOI18N
        jPanel2.add(Card8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, -1));

        Card7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/10_1.png"))); // NOI18N
        jPanel2.add(Card7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, -1));

        Card6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/10_3.png"))); // NOI18N
        jPanel2.add(Card6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, -1));

        Card5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/10_2.png"))); // NOI18N
        jPanel2.add(Card5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, -1));

        Card4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/10_2.png"))); // NOI18N
        jPanel2.add(Card4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, -1));

        Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/10_3.png"))); // NOI18N
        jPanel2.add(Card3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, -1));

        Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/10_1.png"))); // NOI18N
        jPanel2.add(Card2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 13, -1, -1));

        Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/10_4.png"))); // NOI18N
        jPanel2.add(Card1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 13, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, 200, 90));

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Play.setText("Play");
        Play.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlayActionPerformed(evt);
            }
        });
        jPanel1.add(Play, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 30, -1, -1));

        Double.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        Double.setText("Double");
        jPanel1.add(Double, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, -1, -1));

        Stand.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        Stand.setText("Stand");
        jPanel1.add(Stand, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, -1, -1));

        Hit.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        Hit.setText("Hit");
        Hit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HitActionPerformed(evt);
            }
        });
        jPanel1.add(Hit, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 710, 60));

        Table.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/table.png"))); // NOI18N
        getContentPane().add(Table, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/Background.png"))); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        setSize(new java.awt.Dimension(727, 520));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void PlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlayActionPerformed
        Play.setVisible(false);
        Hit.setVisible(true);
        Stand.setVisible(true);
        Double.setVisible(true);

        card1 = KorttienArvonta.Shuffle();
        KorttienTarkistaminen.firstCard(card1);
        Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/" + card1 + ".png")));
        Card1.setVisible(true);

        while (true) {
            card2 = KorttienArvonta.Shuffle();
            System.out.println(card2);
            if (KorttienTarkistaminen.cardTest(card2)== 0) {

                Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/" + card2 + ".png")));
                Card2.setVisible(true);
                break;
            }
        }
    }//GEN-LAST:event_PlayActionPerformed
//Card8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/10_4.png")));
    private void HitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HitActionPerformed
        while (true) {
            card = KorttienArvonta.Shuffle();
            if (KorttienTarkistaminen.cardTest(card) ==0) {
                kortit++;
                korttienPaikat();
                break;
            }
        }
    }//GEN-LAST:event_HitActionPerformed

    public void korttienPaikat() {
        switch (kortit) {
            case 3:
                while (true) {
                    card3 = KorttienArvonta.Shuffle();
                    System.out.println(card3);

                    if (KorttienTarkistaminen.cardTest(card3) == 0) {
                        Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/" + card3 + ".png")));
                        jPanel2.add(Card3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 13, -1, -1));
                        jPanel2.add(Card2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 13, -1, -1));
                        jPanel2.add(Card1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 13, -1, -1));
                        Card3.setVisible(true);
                        break;
                    }
                }
                break;
            case 4:
                while (true) {
                    card4 = KorttienArvonta.Shuffle();
                    System.out.println(card4);

                    if (KorttienTarkistaminen.cardTest(card4) == 0) {
                        Card4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/" + card4 + ".png")));
                        jPanel2.add(Card4, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 13, -1, -1));
                        jPanel2.add(Card3, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 13, -1, -1));
                        jPanel2.add(Card2, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 13, -1, -1));
                        jPanel2.add(Card1, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 13, -1, -1));
                        Card4.setVisible(true);
                        break;
                    }
                }
                break;
            case 5:
                while (true) {
                    card5 = KorttienArvonta.Shuffle();
                    System.out.println(card5);

                    if (KorttienTarkistaminen.cardTest(card5) == 0) {
                        Card5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/" + card5 + ".png")));
                        jPanel2.add(Card5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 13, -1, -1));
                        jPanel2.add(Card4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 13, -1, -1));
                        jPanel2.add(Card3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 13, -1, -1));
                        jPanel2.add(Card2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 13, -1, -1));
                        jPanel2.add(Card1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 13, -1, -1));
                        Card5.setVisible(true);
                        break;
                    }
                }
                break;
            case 6:
                while (true) {
                    card6 = KorttienArvonta.Shuffle();
                    System.out.println(card6);

                    if (KorttienTarkistaminen.cardTest(card6) == 0) {
                        Card4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/" + card6 + ".png")));
                        jPanel2.add(Card6, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 13, -1, -1));
                        jPanel2.add(Card5, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 13, -1, -1));
                        jPanel2.add(Card4, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 13, -1, -1));
                        jPanel2.add(Card3, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 13, -1, -1));
                        jPanel2.add(Card2, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 13, -1, -1));
                        jPanel2.add(Card1, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 13, -1, -1));
                        Card6.setVisible(true);
                        break;
                    }
                }
                break;
            case 7:
                while (true) {
                    card7 = KorttienArvonta.Shuffle();
                    System.out.println(card7);

                    if (KorttienTarkistaminen.cardTest(card7) == 0) {
                        Card7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/" + card7 + ".png")));
                        jPanel2.add(Card7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 13, -1, -1));
                        jPanel2.add(Card6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 13, -1, -1));
                        jPanel2.add(Card5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 13, -1, -1));
                        jPanel2.add(Card4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 13, -1, -1));
                        jPanel2.add(Card3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 13, -1, -1));
                        jPanel2.add(Card2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 13, -1, -1));
                        jPanel2.add(Card1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 13, -1, -1));
                        Card7.setVisible(true);
                        break;
                    }
                }
                break;
            case 8:
                while (true) {
                    card8 = KorttienArvonta.Shuffle();
                    System.out.println(card8);

                    if (KorttienTarkistaminen.cardTest(card8) == 0){
                        Card8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/" + card8 + ".png")));
                        jPanel2.add(Card8, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 13, -1, -1));
                        jPanel2.add(Card7, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 13, -1, -1));
                        jPanel2.add(Card6, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 13, -1, -1));
                        jPanel2.add(Card5, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 13, -1, -1));
                        jPanel2.add(Card4, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 13, -1, -1));
                        jPanel2.add(Card3, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 13, -1, -1));
                        jPanel2.add(Card2, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 13, -1, -1));
                        jPanel2.add(Card1, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 13, -1, -1));
                        Card8.setVisible(true);
                        break;
                    }
                }
                break;
            case 9:
                while (true) {
                    card9 = KorttienArvonta.Shuffle();
                    System.out.println(card9);

                    if (KorttienTarkistaminen.cardTest(card9) == 0) {
                        Card9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/" + card9 + ".png")));
                        jPanel2.add(Card9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 13, -1, -1));
                        jPanel2.add(Card8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 13, -1, -1));
                        jPanel2.add(Card7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 13, -1, -1));
                        jPanel2.add(Card6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 13, -1, -1));
                        jPanel2.add(Card5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 13, -1, -1));
                        jPanel2.add(Card4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 13, -1, -1));
                        jPanel2.add(Card3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 13, -1, -1));
                        jPanel2.add(Card2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 13, -1, -1));
                        jPanel2.add(Card1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 13, -1, -1));
                        Card9.setVisible(true);
                        break;
                    }
                }
                break;
            case 10:
                while (true) {
                    card10 = KorttienArvonta.Shuffle();
                    System.out.println(card10);

                    if (KorttienTarkistaminen.cardTest(card10) == 0) {
                        Card10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/" + card10 + ".png")));
                        jPanel2.add(Card10, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 13, -1, -1));
                        jPanel2.add(Card9, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 13, -1, -1));
                        jPanel2.add(Card8, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 13, -1, -1));
                        jPanel2.add(Card7, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 13, -1, -1));
                        jPanel2.add(Card6, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 13, -1, -1));
                        jPanel2.add(Card5, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 13, -1, -1));
                        jPanel2.add(Card4, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 13, -1, -1));
                        jPanel2.add(Card3, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 13, -1, -1));
                        jPanel2.add(Card2, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 13, -1, -1));
                        jPanel2.add(Card1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 13, -1, -1));
                        Card10.setVisible(true);
                        break;
                    }
                }
                break;
            case 11:
                while (true) {
                    card11 = KorttienArvonta.Shuffle();
                    System.out.println(card11);
                    if (KorttienTarkistaminen.cardTest(card11) == 0) {
                        Card11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/" + card11 + ".png")));
                        jPanel2.add(Card11, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 13, -1, -1));
                        jPanel2.add(Card10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 13, -1, -1));
                        jPanel2.add(Card9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 13, -1, -1));
                        jPanel2.add(Card8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 13, -1, -1));
                        jPanel2.add(Card7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 13, -1, -1));
                        jPanel2.add(Card6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 13, -1, -1));
                        jPanel2.add(Card5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 13, -1, -1));
                        jPanel2.add(Card4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 13, -1, -1));
                        jPanel2.add(Card3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 13, -1, -1));
                        jPanel2.add(Card2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 13, -1, -1));
                        jPanel2.add(Card1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 13, -1, -1));
                        Card11.setVisible(true);
                        break;
                    }
                }
                break;
            case 12:

                break;
            default:
                break;
        }
    }

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JLabel Card1;
    private javax.swing.JLabel Card10;
    private javax.swing.JLabel Card11;
    private javax.swing.JLabel Card2;
    private javax.swing.JLabel Card3;
    private javax.swing.JLabel Card4;
    private javax.swing.JLabel Card5;
    private javax.swing.JLabel Card6;
    private javax.swing.JLabel Card7;
    private javax.swing.JLabel Card8;
    private javax.swing.JLabel Card9;
    private javax.swing.JButton Double;
    private javax.swing.JButton Hit;
    private javax.swing.JButton Play;
    private javax.swing.JButton Stand;
    private javax.swing.JLabel Table;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}

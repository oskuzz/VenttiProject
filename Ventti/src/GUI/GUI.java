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
    //moi
    int Dkortit = 2;
    String Dcard1 = "";
    String Dcard2 = "";
    String Dcard3 = "";
    String Dcard4 = "";
    String Dcard5 = "";
    String Dcard6 = "";
    String Dcard7 = "";
    String Dcard8 = "";
    String Dcard9 = "";
    String Dcard10 = "";
    String Dcard11 = "";

    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
        jPanel3.setVisible(false);
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

        jPanel3 = new javax.swing.JPanel();
        Card22 = new javax.swing.JLabel();
        Card21 = new javax.swing.JLabel();
        Card20 = new javax.swing.JLabel();
        Card12 = new javax.swing.JLabel();
        Card13 = new javax.swing.JLabel();
        Card14 = new javax.swing.JLabel();
        Card15 = new javax.swing.JLabel();
        Card16 = new javax.swing.JLabel();
        Card17 = new javax.swing.JLabel();
        Card18 = new javax.swing.JLabel();
        Card19 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
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
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setOpaque(false);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Card22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/10_4.png"))); // NOI18N
        jPanel3.add(Card22, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 13, -1, -1));

        Card21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/10_1.png"))); // NOI18N
        jPanel3.add(Card21, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 13, -1, -1));

        Card20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/10_3.png"))); // NOI18N
        jPanel3.add(Card20, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, -1));

        Card12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/10_3.png"))); // NOI18N
        jPanel3.add(Card12, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, -1));

        Card13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/10_4.png"))); // NOI18N
        jPanel3.add(Card13, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, -1));

        Card14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/10_1.png"))); // NOI18N
        jPanel3.add(Card14, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, -1));

        Card15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/10_4.png"))); // NOI18N
        jPanel3.add(Card15, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, -1));

        Card16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/10_1.png"))); // NOI18N
        jPanel3.add(Card16, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, -1));

        Card17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/10_3.png"))); // NOI18N
        jPanel3.add(Card17, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, -1));

        Card18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/10_2.png"))); // NOI18N
        jPanel3.add(Card18, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, -1));

        Card19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/10_2.png"))); // NOI18N
        jPanel3.add(Card19, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 200, 90));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, -1, -1));

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
        Double.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoubleActionPerformed(evt);
            }
        });
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
        KorttienTarkistaminen.cardTest(1, card1);
        Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/" + card1 + ".png")));
        Card1.setVisible(true);
        PisteidenLasku.pisteet(card1);

        while (true) {
            card2 = KorttienArvonta.Shuffle();

            if (KorttienTarkistaminen.cardTest(2, card2) == 0) {

                Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/" + card2 + ".png")));
                Card2.setVisible(true);
                PisteidenLasku.pisteet(card2);

                break;
            }
        }
    }//GEN-LAST:event_PlayActionPerformed
//Card8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/10_4.png")));
    private void HitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HitActionPerformed
        kortit++;
        korttienPaikat();
    }//GEN-LAST:event_HitActionPerformed

    public static void pisteet(int luku) {
        jLabel1.setText(Integer.toString(luku));
    }

    private void DoubleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoubleActionPerformed
        // TODO add your handling code here:
        for (int i = 0; i < 2; i++) {
            kortit++;
            korttienPaikat();
        }
    }//GEN-LAST:event_DoubleActionPerformed

    public void reset() {
        kortit = 2;
        card1 = "";
        card2 = "";
        card3 = "";
        card4 = "";
        card5 = "";
        card6 = "";
        card7 = "";
        card8 = "";
        card9 = "";
        card10 = "";
        card11 = "";

        KorttienTarkistaminen.reset();

        Play.setVisible(true);
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
        jPanel2.add(Card2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 13, -1, -1));
        jPanel2.add(Card1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 13, -1, -1));
    }

    public void korttienPaikat() {
        switch (kortit) {
            case 3:
                while (true) {
                    card3 = KorttienArvonta.Shuffle();
                    System.out.println(card3);

                    if (KorttienTarkistaminen.cardTest(3, card3) == 0) {
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

                    if (KorttienTarkistaminen.cardTest(4, card4) == 0) {
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

                    if (KorttienTarkistaminen.cardTest(5, card5) == 0) {
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

                    if (KorttienTarkistaminen.cardTest(6, card6) == 0) {
                        Card6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/" + card6 + ".png")));
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

                    if (KorttienTarkistaminen.cardTest(7, card7) == 0) {
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

                    if (KorttienTarkistaminen.cardTest(8, card8) == 0) {
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

                    if (KorttienTarkistaminen.cardTest(9, card9) == 0) {
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

                    if (KorttienTarkistaminen.cardTest(10, card10) == 0) {
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
                    if (KorttienTarkistaminen.cardTest(11, card11) == 0) {
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
            default:
                break;
        }
    }

    public void dealerKortit() {
        switch (kortit) {
            case 3:
                while (true) {
                    Dcard3 = KorttienArvonta.Shuffle();
                    System.out.println(Dcard3);

                    if (KorttienTarkistaminen.cardTest(3, Dcard3) == 0) {
                        Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/" + card3 + ".png")));
                        jPanel3.add(Card3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 13, -1, -1));
                        jPanel3.add(Card2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 13, -1, -1));
                        jPanel3.add(Card1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 13, -1, -1));
                        Card3.setVisible(true);
                        break;
                    }
                }
                break;
            case 4:
                while (true) {
                    card4 = KorttienArvonta.Shuffle();
                    System.out.println(card4);

                    if (KorttienTarkistaminen.cardTest(4, card4) == 0) {
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

                    if (KorttienTarkistaminen.cardTest(5, card5) == 0) {
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

                    if (KorttienTarkistaminen.cardTest(6, card6) == 0) {
                        Card6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/" + card6 + ".png")));
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

                    if (KorttienTarkistaminen.cardTest(7, card7) == 0) {
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

                    if (KorttienTarkistaminen.cardTest(8, card8) == 0) {
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

                    if (KorttienTarkistaminen.cardTest(9, card9) == 0) {
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

                    if (KorttienTarkistaminen.cardTest(10, card10) == 0) {
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
                    if (KorttienTarkistaminen.cardTest(11, card11) == 0) {
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
    private javax.swing.JLabel Card12;
    private javax.swing.JLabel Card13;
    private javax.swing.JLabel Card14;
    private javax.swing.JLabel Card15;
    private javax.swing.JLabel Card16;
    private javax.swing.JLabel Card17;
    private javax.swing.JLabel Card18;
    private javax.swing.JLabel Card19;
    private javax.swing.JLabel Card2;
    private javax.swing.JLabel Card20;
    private javax.swing.JLabel Card21;
    private javax.swing.JLabel Card22;
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
    private static javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}

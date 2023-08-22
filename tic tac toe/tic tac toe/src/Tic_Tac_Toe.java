import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Asus
 */
public class Tic_Tac_Toe extends javax.swing.JFrame {

    /**
     * Creates new form Tic_Tac_Toe
     */
    private String startGame = "X";
    private int xCount = 0;
    private int oCount = 0;

    public Tic_Tac_Toe() {
        initComponents();
    }

    private void gameScore() {
        playerxcount.setText(String.valueOf(xCount));
        playerocount.setText(String.valueOf(oCount));
    }

    private void choose_a_Player() {
        if (startGame.equalsIgnoreCase("X")) {
            startGame = "O";
        } else {
            startGame = "X";
        }
    }

    private void WinningGame() {
        String b1 = txtbtn1.getText();
        String b2 = txtbtn2.getText();
        String b3 = txtbtn3.getText();

        String b4 = txtbtn4.getText();
        String b5 = txtbtn5.getText();
        String b6 = txtbtn6.getText();

        String b7 = txtbtn7.getText();
        String b8 = txtbtn8.getText();
        String b9 = txtbtn9.getText();

        // PLAYER X CODING
        if (b1 == ("X") && b2 == ("X") && b3 == ("X")) {
            JOptionPane.showMessageDialog(this, "Player X Wins", "Tic Tac Toe",
                    JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();

            txtbtn1.setBackground(Color.YELLOW);
            txtbtn2.setBackground(Color.YELLOW);
            txtbtn3.setBackground(Color.YELLOW);
        }
        if (b4 == ("X") && b5 == ("X") && b6 == ("X")) {
            JOptionPane.showMessageDialog(this, "Player X Wins", "Tic Tac Toe",
                    JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();

            txtbtn4.setBackground(Color.YELLOW);
            txtbtn5.setBackground(Color.YELLOW);
            txtbtn6.setBackground(Color.YELLOW);
        }
        if (b7 == ("X") && b8 == ("X") && b9 == ("X")) {
            JOptionPane.showMessageDialog(this, "Player X Wins", "Tic Tac Toe",
                    JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();

            txtbtn7.setBackground(Color.YELLOW);
            txtbtn8.setBackground(Color.YELLOW);
            txtbtn9.setBackground(Color.YELLOW);
        }
        if (b1 == ("X") && b4 == ("X") && b7 == ("X")) {
            JOptionPane.showMessageDialog(this, "Player X Wins", "Tic Tac Toe",
                    JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();

            txtbtn1.setBackground(Color.YELLOW);
            txtbtn4.setBackground(Color.YELLOW);
            txtbtn7.setBackground(Color.YELLOW);
        }
        if (b2 == ("X") && b5 == ("X") && b8 == ("X")) {
            JOptionPane.showMessageDialog(this, "Player X Wins", "Tic Tac Toe",
                    JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();

            txtbtn2.setBackground(Color.YELLOW);
            txtbtn5.setBackground(Color.YELLOW);
            txtbtn8.setBackground(Color.YELLOW);
        }
        if (b3 == ("X") && b6 == ("X") && b9 == ("X")) {
            JOptionPane.showMessageDialog(this, "Player X Wins", "Tic Tac Toe",
                    JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();

            txtbtn3.setBackground(Color.YELLOW);
            txtbtn6.setBackground(Color.YELLOW);
            txtbtn9.setBackground(Color.YELLOW);
        }
        if (b1 == ("X") && b5 == ("X") && b9 == ("X")) {
            JOptionPane.showMessageDialog(this, "Player X Wins", "Tic Tac Toe",
                    JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();

            txtbtn1.setBackground(Color.YELLOW);
            txtbtn5.setBackground(Color.YELLOW);
            txtbtn9.setBackground(Color.YELLOW);
        }
        if (b3 == ("X") && b5 == ("X") && b7 == ("X")) {
            JOptionPane.showMessageDialog(this, "Player X Wins", "Tic Tac Toe",
                    JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();

            txtbtn3.setBackground(Color.YELLOW);
            txtbtn5.setBackground(Color.YELLOW);
            txtbtn7.setBackground(Color.YELLOW);
        }

        // PLAYER O CODING
        if (b1 == ("O") && b2 == ("O") && b3 == ("O")) {
            JOptionPane.showMessageDialog(this, "Player O Wins", "Tic Tac Toe",
                    JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();

            txtbtn1.setBackground(Color.ORANGE);
            txtbtn2.setBackground(Color.ORANGE);
            txtbtn3.setBackground(Color.ORANGE);
        }
        if (b4 == ("O") && b5 == ("O") && b6 == ("O")) {
            JOptionPane.showMessageDialog(this, "Player O Wins", "Tic Tac Toe",
                    JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();

            txtbtn4.setBackground(Color.ORANGE);
            txtbtn5.setBackground(Color.ORANGE);
            txtbtn6.setBackground(Color.ORANGE);
        }
        if (b7 == ("O") && b8 == ("O") && b9 == ("O")) {
            JOptionPane.showMessageDialog(this, "Player O Wins", "Tic Tac Toe",
                    JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();

            txtbtn7.setBackground(Color.ORANGE);
            txtbtn8.setBackground(Color.ORANGE);
            txtbtn9.setBackground(Color.ORANGE);
        }
        if (b1 == ("O") && b5 == ("O") && b9 == ("O")) {
            JOptionPane.showMessageDialog(this, "Player O Wins", "Tic Tac Toe",
                    JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();

            txtbtn1.setBackground(Color.ORANGE);
            txtbtn5.setBackground(Color.ORANGE);
            txtbtn9.setBackground(Color.ORANGE);
        }
        if (b3 == ("O") && b5 == ("O") && b7 == ("O")) {
            JOptionPane.showMessageDialog(this, "Player O Wins", "Tic Tac Toe",
                    JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();

            txtbtn3.setBackground(Color.ORANGE);
            txtbtn5.setBackground(Color.ORANGE);
            txtbtn7.setBackground(Color.ORANGE);
        }
        if (b1 == ("O") && b4 == ("O") && b7 == ("O")) {
            JOptionPane.showMessageDialog(this, "Player O Wins", "Tic Tac Toe",
                    JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();

            txtbtn1.setBackground(Color.ORANGE);
            txtbtn4.setBackground(Color.ORANGE);
            txtbtn7.setBackground(Color.ORANGE);
        }
        if (b2 == ("O") && b5 == ("O") && b8 == ("O")) {
            JOptionPane.showMessageDialog(this, "Player O Wins", "Tic Tac Toe",
                    JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();

            txtbtn2.setBackground(Color.ORANGE);
            txtbtn5.setBackground(Color.ORANGE);
            txtbtn8.setBackground(Color.ORANGE);
        }
        if (b3 == ("O") && b6 == ("O") && b9 == ("O")) {
            JOptionPane.showMessageDialog(this, "Player O Wins", "Tic Tac Toe",
                    JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();

            txtbtn3.setBackground(Color.ORANGE);
            txtbtn6.setBackground(Color.ORANGE);
            txtbtn9.setBackground(Color.ORANGE);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtbtn3 = new javax.swing.JButton();
        txtbtn6 = new javax.swing.JButton();
        txtbtn2 = new javax.swing.JButton();
        txtbtn1 = new javax.swing.JButton();
        txtbtn4 = new javax.swing.JButton();
        txtbtn5 = new javax.swing.JButton();
        txtbtn7 = new javax.swing.JButton();
        txtbtn8 = new javax.swing.JButton();
        txtbtn9 = new javax.swing.JButton();
        txtreset = new javax.swing.JButton();
        txtexit = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        playerxcount = new javax.swing.JLabel();
        playero = new javax.swing.JLabel();
        playerx = new javax.swing.JLabel();
        playerocount = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TIC TAC TOE GAME APPLICATION");
        setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));

        jLabel1.setBackground(new java.awt.Color(204, 204, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TIC TAC TOE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 230,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(210, 210, 210)));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                                .addContainerGap()));

        txtbtn3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn3ActionPerformed(evt);
            }
        });

        txtbtn6.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtbtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn6ActionPerformed(evt);
            }
        });

        txtbtn2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn2ActionPerformed(evt);
            }
        });

        txtbtn1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn1ActionPerformed(evt);
            }
        });

        txtbtn4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtbtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn4ActionPerformed(evt);
            }
        });

        txtbtn5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtbtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn5ActionPerformed(evt);
            }
        });

        txtbtn7.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtbtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn7ActionPerformed(evt);
            }
        });

        txtbtn8.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtbtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn8ActionPerformed(evt);
            }
        });

        txtbtn9.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtbtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn9ActionPerformed(evt);
            }
        });

        txtreset.setBackground(new java.awt.Color(153, 153, 255));
        txtreset.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        txtreset.setText("RESET");
        txtreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtresetActionPerformed(evt);
            }
        });

        txtexit.setBackground(new java.awt.Color(255, 102, 102));
        txtexit.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        txtexit.setText("EXIT");
        txtexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtexitActionPerformed(evt);
            }
        });

        jPanel2.setBorder(
                javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, java.awt.Color.darkGray));

        playerxcount.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        playerxcount.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray,
                new java.awt.Color(255, 255, 255)));

        playero.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        playero.setText("Player O :");

        playerx.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        playerx.setText("Player X :");

        playerocount.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        playerocount.setBorder(
                javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, java.awt.Color.white));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(playero, javax.swing.GroupLayout.PREFERRED_SIZE, 87,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(playerx, javax.swing.GroupLayout.PREFERRED_SIZE, 87,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27,
                                        Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(playerocount, javax.swing.GroupLayout.PREFERRED_SIZE, 118,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(playerxcount, javax.swing.GroupLayout.PREFERRED_SIZE, 118,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)));
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(playerxcount, javax.swing.GroupLayout.PREFERRED_SIZE, 36,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(playerx, javax.swing.GroupLayout.PREFERRED_SIZE, 36,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(37, 37, 37)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(playerocount, javax.swing.GroupLayout.PREFERRED_SIZE, 36,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(playero, javax.swing.GroupLayout.PREFERRED_SIZE, 33,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(38, 38, 38)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 89,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txtbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 89,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(txtbtn7,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 89,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(txtbtn8,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 89,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(txtbtn4,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 89,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(txtbtn5,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 89,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 89,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 89,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 89,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(50, 50, 50)
                                                .addComponent(txtreset, javax.swing.GroupLayout.PREFERRED_SIZE, 106,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(39, 39, 39)
                                                .addComponent(txtexit, javax.swing.GroupLayout.PREFERRED_SIZE, 110,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(42, 42, 42)
                                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(66, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(txtbtn2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txtbtn1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txtbtn3, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(15, 15, 15)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(txtbtn4, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txtbtn5, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txtbtn6, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(15, 15, 15)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(txtbtn7, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txtbtn8, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txtbtn9, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
                                                .createSequentialGroup()
                                                .addGap(31, 31, 31)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(txtreset, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txtexit, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(39, 39, 39)))));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtbtn3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtbtn3ActionPerformed
        // TODO add your handling code here:
        txtbtn3.setText(startGame);
        if (startGame.equalsIgnoreCase("X")) {
            txtbtn3.setForeground(Color.RED);
        } else {
            txtbtn3.setForeground(Color.MAGENTA);
        }
        choose_a_Player();
        WinningGame();
    }// GEN-LAST:event_txtbtn3ActionPerformed

    private void txtbtn6ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtbtn6ActionPerformed
        // TODO add your handling code here:
        txtbtn6.setText(startGame);
        if (startGame.equalsIgnoreCase("X")) {
            txtbtn6.setForeground(Color.RED);
        } else {
            txtbtn6.setForeground(Color.MAGENTA);
        }
        choose_a_Player();
        WinningGame();
    }// GEN-LAST:event_txtbtn6ActionPerformed

    private void txtbtn2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtbtn2ActionPerformed
        // TODO add your handling code here:
        txtbtn2.setText(startGame);
        if (startGame.equalsIgnoreCase("X")) {
            txtbtn2.setForeground(Color.RED);
        } else {
            txtbtn2.setForeground(Color.MAGENTA);
        }
        choose_a_Player();
        WinningGame();
    }// GEN-LAST:event_txtbtn2ActionPerformed

    private void txtbtn1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtbtn1ActionPerformed
        // TODO add your handling code here:
        txtbtn1.setText(startGame);
        if (startGame.equalsIgnoreCase("X")) {
            txtbtn1.setForeground(Color.RED);
        } else {
            txtbtn1.setForeground(Color.MAGENTA);
        }
        choose_a_Player();
        WinningGame();
    }// GEN-LAST:event_txtbtn1ActionPerformed

    private void txtbtn4ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtbtn4ActionPerformed
        // TODO add your handling code here:
        txtbtn4.setText(startGame);
        if (startGame.equalsIgnoreCase("X")) {
            txtbtn4.setForeground(Color.RED);
        } else {
            txtbtn4.setForeground(Color.MAGENTA);
        }
        choose_a_Player();
        WinningGame();
    }// GEN-LAST:event_txtbtn4ActionPerformed

    private void txtbtn5ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtbtn5ActionPerformed
        // TODO add your handling code here:
        txtbtn5.setText(startGame);
        if (startGame.equalsIgnoreCase("X")) {
            txtbtn5.setForeground(Color.RED);
        } else {
            txtbtn5.setForeground(Color.MAGENTA);
        }
        choose_a_Player();
        WinningGame();
    }// GEN-LAST:event_txtbtn5ActionPerformed

    private void txtbtn7ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtbtn7ActionPerformed
        // TODO add your handling code here:
        txtbtn7.setText(startGame);
        if (startGame.equalsIgnoreCase("X")) {
            txtbtn7.setForeground(Color.RED);
        } else {
            txtbtn7.setForeground(Color.MAGENTA);
        }
        choose_a_Player();
        WinningGame();
    }// GEN-LAST:event_txtbtn7ActionPerformed

    private void txtbtn8ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtbtn8ActionPerformed
        // TODO add your handling code here:
        txtbtn8.setText(startGame);
        if (startGame.equalsIgnoreCase("X")) {
            txtbtn8.setForeground(Color.RED);
        } else {
            txtbtn8.setForeground(Color.MAGENTA);
        }
        choose_a_Player();
        WinningGame();
    }// GEN-LAST:event_txtbtn8ActionPerformed

    private void txtbtn9ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtbtn9ActionPerformed
        // TODO add your handling code here:
        txtbtn9.setText(startGame);
        if (startGame.equalsIgnoreCase("X")) {
            txtbtn9.setForeground(Color.RED);
        } else {
            txtbtn9.setForeground(Color.MAGENTA);
        }
        choose_a_Player();
        WinningGame();
    }// GEN-LAST:event_txtbtn9ActionPerformed

    private void txtresetActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtresetActionPerformed
        // TODO add your handling code here:
        txtbtn1.setText(null);
        txtbtn2.setText(null);
        txtbtn3.setText(null);

        txtbtn4.setText(null);
        txtbtn5.setText(null);
        txtbtn6.setText(null);

        txtbtn7.setText(null);
        txtbtn8.setText(null);
        txtbtn9.setText(null);

        txtbtn1.setBackground(Color.LIGHT_GRAY);
        txtbtn2.setBackground(Color.LIGHT_GRAY);
        txtbtn3.setBackground(Color.LIGHT_GRAY);

        txtbtn4.setBackground(Color.LIGHT_GRAY);
        txtbtn5.setBackground(Color.LIGHT_GRAY);
        txtbtn6.setBackground(Color.LIGHT_GRAY);

        txtbtn7.setBackground(Color.LIGHT_GRAY);
        txtbtn8.setBackground(Color.LIGHT_GRAY);
        txtbtn9.setBackground(Color.LIGHT_GRAY);
    }// GEN-LAST:event_txtresetActionPerformed

    private void txtexitActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtexitActionPerformed
        // TODO add your handling code here:
        JFrame frame = new JFrame("Exit");

        if (JOptionPane.showConfirmDialog(frame, "Confirm if you want Exit",
                "Tic Tac Toe", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
            System.exit(0);
        }

    }// GEN-LAST:event_txtexitActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tic_Tac_Toe.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tic_Tac_Toe.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tic_Tac_Toe.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tic_Tac_Toe.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tic_Tac_Toe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel playero;
    private javax.swing.JLabel playerocount;
    private javax.swing.JLabel playerx;
    private javax.swing.JLabel playerxcount;
    private javax.swing.JButton txtbtn1;
    private javax.swing.JButton txtbtn2;
    private javax.swing.JButton txtbtn3;
    private javax.swing.JButton txtbtn4;
    private javax.swing.JButton txtbtn5;
    private javax.swing.JButton txtbtn6;
    private javax.swing.JButton txtbtn7;
    private javax.swing.JButton txtbtn8;
    private javax.swing.JButton txtbtn9;
    private javax.swing.JButton txtexit;
    private javax.swing.JButton txtreset;
    // End of variables declaration//GEN-END:variables
}

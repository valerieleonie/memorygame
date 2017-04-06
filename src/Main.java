
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import util.Sutil;

public class Main extends javax.swing.JFrame {

    private boolean open = false;
    private ImageIcon image1;
    private ImageIcon image2;
    private JButton[] btn = new JButton[2];
    private boolean button = false;

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        executeNewGame();
        setLocationRelativeTo(null);
    }

    private int[] shuffle() {
        int num[] = new int[16];
        int count = 0;

        while (count < 16) {
            Random random = new Random();
            int rand = random.nextInt(8) + 1;
            int nvr = 0;

            for (int i = 0; i < 16; i++) {
                if (num[i] == rand) {
                    nvr++;
                }
            }
            if (nvr < 2) {
                num[count] = rand;
                count++;
            }//fin
        }
        return num;
    }

    private void setCards() {
        int[] numbers = shuffle();

        btn00.setDisabledIcon(new ImageIcon(getClass().getResource("/images/" + numbers[0] + ".png")));
        btn01.setDisabledIcon(new ImageIcon(getClass().getResource("/images/" + numbers[1] + ".png")));
        btn02.setDisabledIcon(new ImageIcon(getClass().getResource("/images/" + numbers[2] + ".png")));
        btn03.setDisabledIcon(new ImageIcon(getClass().getResource("/images/" + numbers[3] + ".png")));
        btn10.setDisabledIcon(new ImageIcon(getClass().getResource("/images/" + numbers[4] + ".png")));
        btn11.setDisabledIcon(new ImageIcon(getClass().getResource("/images/" + numbers[5] + ".png")));
        btn12.setDisabledIcon(new ImageIcon(getClass().getResource("/images/" + numbers[6] + ".png")));
        btn13.setDisabledIcon(new ImageIcon(getClass().getResource("/images/" + numbers[7] + ".png")));
        btn20.setDisabledIcon(new ImageIcon(getClass().getResource("/images/" + numbers[8] + ".png")));
        btn21.setDisabledIcon(new ImageIcon(getClass().getResource("/images/" + numbers[9] + ".png")));
        btn22.setDisabledIcon(new ImageIcon(getClass().getResource("/images/" + numbers[10] + ".png")));
        btn23.setDisabledIcon(new ImageIcon(getClass().getResource("/images/" + numbers[11] + ".png")));
        btn30.setDisabledIcon(new ImageIcon(getClass().getResource("/images/" + numbers[12] + ".png")));
        btn31.setDisabledIcon(new ImageIcon(getClass().getResource("/images/" + numbers[13] + ".png")));
        btn32.setDisabledIcon(new ImageIcon(getClass().getResource("/images/" + numbers[14] + ".png")));
        btn33.setDisabledIcon(new ImageIcon(getClass().getResource("/images/" + numbers[15] + ".png")));
    }

    private void btnEnabled(JButton btn2) {

        if (!open) {
            btn2.setEnabled(false);
            image1 = (ImageIcon) btn2.getDisabledIcon();
            btn[0] = btn2;
            open = true;
            button = false;
        } else {
            btn2.setEnabled(false);
            image2 = (ImageIcon) btn2.getDisabledIcon();
            btn[1] = btn2;
            button = true;
            winGame();
        }
    }

    private void compare() {
        if (open && button) {
            if (image1.getDescription().compareTo(image2.getDescription()) != 0) {
                btn[0].setEnabled(true);
                btn[1].setEnabled(true);
            }
            open = false;
            try {
                Thread.sleep(700);
            } catch (InterruptedException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn01 = new javax.swing.JButton();
        btn00 = new javax.swing.JButton();
        btn02 = new javax.swing.JButton();
        btn03 = new javax.swing.JButton();
        btn10 = new javax.swing.JButton();
        btn11 = new javax.swing.JButton();
        btn12 = new javax.swing.JButton();
        btn13 = new javax.swing.JButton();
        btn20 = new javax.swing.JButton();
        btn21 = new javax.swing.JButton();
        btn22 = new javax.swing.JButton();
        btn23 = new javax.swing.JButton();
        btn30 = new javax.swing.JButton();
        btn31 = new javax.swing.JButton();
        btn32 = new javax.swing.JButton();
        btn33 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mniNewGame = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        Exit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mniAboout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Memory Game");
        setPreferredSize(new java.awt.Dimension(382, 430));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btn01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.png"))); // NOI18N
        btn01.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn01MouseExited(evt);
            }
        });
        btn01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn01ActionPerformed(evt);
            }
        });

        btn00.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.png"))); // NOI18N
        btn00.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn00MouseExited(evt);
            }
        });
        btn00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn00ActionPerformed(evt);
            }
        });

        btn02.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.png"))); // NOI18N
        btn02.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn02MouseExited(evt);
            }
        });
        btn02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn02ActionPerformed(evt);
            }
        });

        btn03.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.png"))); // NOI18N
        btn03.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn03MouseExited(evt);
            }
        });
        btn03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn03ActionPerformed(evt);
            }
        });

        btn10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.png"))); // NOI18N
        btn10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn10MouseExited(evt);
            }
        });
        btn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn10ActionPerformed(evt);
            }
        });

        btn11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.png"))); // NOI18N
        btn11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn11MouseExited(evt);
            }
        });
        btn11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn11ActionPerformed(evt);
            }
        });

        btn12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.png"))); // NOI18N
        btn12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn12MouseExited(evt);
            }
        });
        btn12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn12ActionPerformed(evt);
            }
        });

        btn13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.png"))); // NOI18N
        btn13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn13MouseExited(evt);
            }
        });
        btn13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn13ActionPerformed(evt);
            }
        });

        btn20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.png"))); // NOI18N
        btn20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn20MouseExited(evt);
            }
        });
        btn20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn20ActionPerformed(evt);
            }
        });

        btn21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.png"))); // NOI18N
        btn21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn21MouseExited(evt);
            }
        });
        btn21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn21ActionPerformed(evt);
            }
        });

        btn22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.png"))); // NOI18N
        btn22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn22MouseExited(evt);
            }
        });
        btn22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn22ActionPerformed(evt);
            }
        });

        btn23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.png"))); // NOI18N
        btn23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn23MouseExited(evt);
            }
        });
        btn23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn23ActionPerformed(evt);
            }
        });

        btn30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.png"))); // NOI18N
        btn30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn30MouseExited(evt);
            }
        });
        btn30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn30ActionPerformed(evt);
            }
        });

        btn31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.png"))); // NOI18N
        btn31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn31MouseExited(evt);
            }
        });
        btn31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn31ActionPerformed(evt);
            }
        });

        btn32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.png"))); // NOI18N
        btn32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn32MouseExited(evt);
            }
        });
        btn32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn32ActionPerformed(evt);
            }
        });

        btn33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.png"))); // NOI18N
        btn33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn33MouseExited(evt);
            }
        });
        btn33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn33ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btn00, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn01, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn02, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn03, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btn10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btn20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btn30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn01, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(btn00, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn03, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn02, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn11, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(btn10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn21, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(btn20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn31, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(btn30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jMenu1.setText("System");

        mniNewGame.setText("New Game");
        mniNewGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniNewGameActionPerformed(evt);
            }
        });
        jMenu1.add(mniNewGame);
        jMenu1.add(jSeparator1);

        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        jMenu1.add(Exit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Help");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        mniAboout.setText("About");
        mniAboout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniAbooutActionPerformed(evt);
            }
        });
        jMenu2.add(mniAboout);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mniNewGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniNewGameActionPerformed
        executeNewGame();
    }//GEN-LAST:event_mniNewGameActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        if (Sutil.msq(this,"Are you sure?")==0 ) {
            System.exit(0);
        } else {
            
        }
        
    }//GEN-LAST:event_ExitActionPerformed

    private void btn00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn00ActionPerformed
        executeBtn00();

    }//GEN-LAST:event_btn00ActionPerformed

    private void mniAbooutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniAbooutActionPerformed
        executeAbout();
    }//GEN-LAST:event_mniAbooutActionPerformed

    private void btn01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn01ActionPerformed
        executeBtn01();
    }//GEN-LAST:event_btn01ActionPerformed

    private void btn02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn02ActionPerformed
        executeBtn02();
    }//GEN-LAST:event_btn02ActionPerformed

    private void btn03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn03ActionPerformed
        executeBtn03();
    }//GEN-LAST:event_btn03ActionPerformed

    private void btn10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn10ActionPerformed
        executeBtn10();
    }//GEN-LAST:event_btn10ActionPerformed

    private void btn11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn11ActionPerformed
        executeBtn11();
    }//GEN-LAST:event_btn11ActionPerformed

    private void btn12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn12ActionPerformed
        executeBtn12();
    }//GEN-LAST:event_btn12ActionPerformed

    private void btn13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn13ActionPerformed
        executeBtn13();
    }//GEN-LAST:event_btn13ActionPerformed

    private void btn20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn20ActionPerformed
        executeBtn20();
    }//GEN-LAST:event_btn20ActionPerformed

    private void btn21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn21ActionPerformed
        executeBtn21();
    }//GEN-LAST:event_btn21ActionPerformed

    private void btn22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn22ActionPerformed
        executeBtn22();
    }//GEN-LAST:event_btn22ActionPerformed

    private void btn23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn23ActionPerformed
        executeBtn23();
    }//GEN-LAST:event_btn23ActionPerformed

    private void btn30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn30ActionPerformed
        executeBtn30();
    }//GEN-LAST:event_btn30ActionPerformed

    private void btn31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn31ActionPerformed
        executeBtn31();
    }//GEN-LAST:event_btn31ActionPerformed

    private void btn32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn32ActionPerformed
        executeBtn32();
    }//GEN-LAST:event_btn32ActionPerformed

    private void btn33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn33ActionPerformed
        executeBtn33();
    }//GEN-LAST:event_btn33ActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void btn00MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn00MouseExited
        // TODO add your handling code here:
        compare();

    }//GEN-LAST:event_btn00MouseExited

    private void btn01MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn01MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btn01MouseExited

    private void btn02MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn02MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btn02MouseExited

    private void btn03MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn03MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btn03MouseExited

    private void btn10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn10MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btn10MouseExited

    private void btn11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn11MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btn11MouseExited

    private void btn12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn12MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btn12MouseExited

    private void btn13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn13MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btn13MouseExited

    private void btn20MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn20MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btn20MouseExited

    private void btn21MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn21MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btn21MouseExited

    private void btn22MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn22MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btn22MouseExited

    private void btn23MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn23MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btn23MouseExited

    private void btn30MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn30MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btn30MouseExited

    private void btn31MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn31MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btn31MouseExited

    private void btn32MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn32MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btn32MouseExited

    private void btn33MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn33MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btn33MouseExited

    private void executeBtn00() {
        btnEnabled(btn00);
    }

    private void executeBtn01() {
        btnEnabled(btn01);
    }

    private void executeBtn02() {
        btnEnabled(btn02);
    }

    private void executeBtn03() {
        btnEnabled(btn03);
    }

    private void executeBtn10() {
        btnEnabled(btn10);
    }

    private void executeBtn11() {
        btnEnabled(btn11);
    }

    private void executeBtn12() {
        btnEnabled(btn12);
    }

    private void executeBtn13() {
        btnEnabled(btn13);
    }

    private void executeBtn20() {
        btnEnabled(btn20);
    }

    private void executeBtn21() {
        btnEnabled(btn21);
    }

    private void executeBtn22() {
        btnEnabled(btn22);
    }

    private void executeBtn23() {
        btnEnabled(btn23);
    }

    private void executeBtn30() {
        btnEnabled(btn30);
    }

    private void executeBtn31() {
        btnEnabled(btn31);
    }

    private void executeBtn32() {
        btnEnabled(btn32);
    }

    private void executeBtn33() {
        btnEnabled(btn33);
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Exit;
    private javax.swing.JButton btn00;
    private javax.swing.JButton btn01;
    private javax.swing.JButton btn02;
    private javax.swing.JButton btn03;
    private javax.swing.JButton btn10;
    private javax.swing.JButton btn11;
    private javax.swing.JButton btn12;
    private javax.swing.JButton btn13;
    private javax.swing.JButton btn20;
    private javax.swing.JButton btn21;
    private javax.swing.JButton btn22;
    private javax.swing.JButton btn23;
    private javax.swing.JButton btn30;
    private javax.swing.JButton btn31;
    private javax.swing.JButton btn32;
    private javax.swing.JButton btn33;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuItem mniAboout;
    private javax.swing.JMenuItem mniNewGame;
    // End of variables declaration//GEN-END:variables

    private void executeNewGame() {

        // assign card sorted with 1 - 8 pair
        // reshuffle (random) the sorted card 1 - 8 pair
        setCards();
        // assign the back card image & set the button enable TRUE
        btn00.setIcon(new ImageIcon(getClass().getResource("/images/back.png")));
        btn00.setEnabled(true);
        btn01.setIcon(new ImageIcon(getClass().getResource("/images/back.png")));
        btn01.setEnabled(true);
        btn02.setIcon(new ImageIcon(getClass().getResource("/images/back.png")));
        btn02.setEnabled(true);
        btn03.setIcon(new ImageIcon(getClass().getResource("/images/back.png")));
        btn03.setEnabled(true);
        btn10.setIcon(new ImageIcon(getClass().getResource("/images/back.png")));
        btn10.setEnabled(true);
        btn11.setIcon(new ImageIcon(getClass().getResource("/images/back.png")));
        btn11.setEnabled(true);
        btn12.setIcon(new ImageIcon(getClass().getResource("/images/back.png")));
        btn12.setEnabled(true);
        btn13.setIcon(new ImageIcon(getClass().getResource("/images/back.png")));
        btn13.setEnabled(true);
        btn20.setIcon(new ImageIcon(getClass().getResource("/images/back.png")));
        btn20.setEnabled(true);
        btn21.setIcon(new ImageIcon(getClass().getResource("/images/back.png")));
        btn21.setEnabled(true);
        btn22.setIcon(new ImageIcon(getClass().getResource("/images/back.png")));
        btn22.setEnabled(true);
        btn23.setIcon(new ImageIcon(getClass().getResource("/images/back.png")));
        btn23.setEnabled(true);
        btn30.setIcon(new ImageIcon(getClass().getResource("/images/back.png")));
        btn30.setEnabled(true);
        btn31.setIcon(new ImageIcon(getClass().getResource("/images/back.png")));
        btn31.setEnabled(true);
        btn32.setIcon(new ImageIcon(getClass().getResource("/images/back.png")));
        btn32.setEnabled(true);
        btn33.setIcon(new ImageIcon(getClass().getResource("/images/back.png")));
        btn33.setEnabled(true);

        button = false;
        open = false;

    }

    private void executeAbout() {
        Sutil.msg(this, "Memory Game\nVersion 1.0\nWriten By: Valerie Leonie");
    }

    private void winGame() {
        if (!btn00.isEnabled() && !btn01.isEnabled() && !btn02.isEnabled() && !btn03.isEnabled()
                && !btn10.isEnabled() && !btn11.isEnabled() && !btn12.isEnabled() && !btn13.isEnabled()
                && !btn20.isEnabled() && !btn21.isEnabled() && !btn22.isEnabled() && !btn23.isEnabled()
                && !btn30.isEnabled() && !btn31.isEnabled() && !btn32.isEnabled() && !btn33.isEnabled()) {
            if (Sutil.msq(this, "You win!\n Play again?") == 0) {
                executeNewGame();
            } else {
                Sutil.msg(this, "Thanks for playing!");
                dispose();
            }
        }
    }
}

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.sound.sampled.LineUnavailableException;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import javax.swing.JTextField;
import ppt.DedicatedPPTServer;

/*
 * AudioTab.java
 *
 * Created on Apr 12, 2012, 10:00:07 PM
 */
/** 
 *
 * @author Zorro 
 */
public class AudioTab extends javax.swing.JFrame {

    private Server server;

    /** Creates new form Host Module */
    public AudioTab() {
        initComponents();
        initCanvas();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSlider1 = new javax.swing.JSlider();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        lblParticipant = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jPanel4 = new javax.swing.JPanel();
        FileChooser = new javax.swing.JButton();
        ContainerScrollPane = new javax.swing.JScrollPane();
        SlideScrollPane = new javax.swing.JPanel();
        MainSlidePane = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jToggleButton3 = new javax.swing.JToggleButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        PanelKanvas = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        tombolGaris = new javax.swing.JToggleButton();
        jLabel14 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        tombol_oval = new javax.swing.JToggleButton();
        jLabel15 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        tombolKotak = new javax.swing.JToggleButton();
        jLabel16 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        jToggleButton7 = new javax.swing.JToggleButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setMaximumSize(new java.awt.Dimension(500, 300));
        jTabbedPane1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane1StateChanged(evt);
            }
        });

        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setMaximumSize(new java.awt.Dimension(500, 300));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 300));
        jPanel1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPanel1FocusGained(evt);
            }
        });
        jPanel1.setLayout(null);

        jLabel1.setText("Microphone");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(50, 250, 70, 14);

        jLabel2.setText("00:00");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(260, 250, 40, 14);

        jLabel3.setText("Timer : ");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(180, 250, 50, 14);

        jSlider1.setOrientation(javax.swing.JSlider.VERTICAL);
        jPanel1.add(jSlider1);
        jSlider1.setBounds(490, 60, 20, 200);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 36));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("+");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(480, 30, 36, 28);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 36));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("-");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(480, 260, 40, 18);
        jPanel1.add(jProgressBar1);
        jProgressBar1.setBounds(120, 280, 210, 19);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel6.setText("Participant/s List");

        lblParticipant.setText("jLabel7");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(lblParticipant))
                .addContainerGap(246, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblParticipant)
                .addContainerGap(147, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(40, 20, 410, 200);

        jToggleButton1.setText("ON");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton1);
        jToggleButton1.setBounds(50, 270, 60, 23);

        jToggleButton2.setText("Unmute");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton2);
        jToggleButton2.setBounds(340, 270, 90, 23);

        jTabbedPane1.addTab("Audio", jPanel1);

        jPanel4.setLayout(null);

        FileChooser.setText("Open File");
        FileChooser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FileChooserActionPerformed(evt);
            }
        });
        FileChooser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                FileChooserFocusGained(evt);
            }
        });
        jPanel4.add(FileChooser);
        FileChooser.setBounds(980, 70, 90, 23);

        javax.swing.GroupLayout SlideScrollPaneLayout = new javax.swing.GroupLayout(SlideScrollPane);
        SlideScrollPane.setLayout(SlideScrollPaneLayout);
        SlideScrollPaneLayout.setHorizontalGroup(
            SlideScrollPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 208, Short.MAX_VALUE)
        );
        SlideScrollPaneLayout.setVerticalGroup(
            SlideScrollPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 558, Short.MAX_VALUE)
        );

        ContainerScrollPane.setViewportView(SlideScrollPane);

        jPanel4.add(ContainerScrollPane);
        ContainerScrollPane.setBounds(0, 10, 210, 530);

        MainSlidePane.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout MainSlidePaneLayout = new javax.swing.GroupLayout(MainSlidePane);
        MainSlidePane.setLayout(MainSlidePaneLayout);
        MainSlidePaneLayout.setHorizontalGroup(
            MainSlidePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 740, Short.MAX_VALUE)
        );
        MainSlidePaneLayout.setVerticalGroup(
            MainSlidePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
        );

        jPanel4.add(MainSlidePane);
        MainSlidePane.setBounds(220, 10, 740, 530);

        jTabbedPane1.addTab("Presentation", jPanel4);

        jPanel3.setLayout(null);

        jToggleButton3.setText("Start Server");
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jToggleButton3);
        jToggleButton3.setBounds(180, 160, 160, 23);

        jTextField1.setToolTipText("Username");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1FocusGained(evt);
            }
        });
        jPanel3.add(jTextField1);
        jTextField1.setBounds(200, 110, 120, 30);

        jLabel13.setText("Server Name :");
        jPanel3.add(jLabel13);
        jLabel13.setBounds(110, 120, 80, 14);
        jPanel3.add(jTabbedPane2);
        jTabbedPane2.setBounds(170, -20, 5, 5);

        jTabbedPane1.addTab("Setting", jPanel3);

        PanelKanvas.setBackground(javax.swing.UIManager.getDefaults().getColor("EditorPane.selectionForeground"));
        PanelKanvas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout PanelKanvasLayout = new javax.swing.GroupLayout(PanelKanvas);
        PanelKanvas.setLayout(PanelKanvasLayout);
        PanelKanvasLayout.setHorizontalGroup(
            PanelKanvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 556, Short.MAX_VALUE)
        );
        PanelKanvasLayout.setVerticalGroup(
            PanelKanvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 292, Short.MAX_VALUE)
        );

        jToolBar1.setRollover(true);

        tombolGaris.setText("———");
        tombolGaris.setFocusable(false);
        tombolGaris.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tombolGaris.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tombolGaris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolGarisActionPerformed(evt);
            }
        });
        jToolBar1.add(tombolGaris);

        jLabel14.setText("Garis Lurus");
        jToolBar1.add(jLabel14);
        jToolBar1.add(jSeparator1);

        tombol_oval.setText("O");
        tombol_oval.setFocusable(false);
        tombol_oval.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tombol_oval.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tombol_oval.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombol_ovalActionPerformed(evt);
            }
        });
        jToolBar1.add(tombol_oval);

        jLabel15.setText("Oval");
        jToolBar1.add(jLabel15);
        jToolBar1.add(jSeparator2);

        tombolKotak.setText("□");
        tombolKotak.setFocusable(false);
        tombolKotak.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tombolKotak.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tombolKotak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolKotakActionPerformed(evt);
            }
        });
        jToolBar1.add(tombolKotak);

        jLabel16.setText("Segi Empat");
        jToolBar1.add(jLabel16);
        jToolBar1.add(jSeparator3);

        jToggleButton7.setText("Bersihkan");
        jToggleButton7.setFocusable(false);
        jToggleButton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggleButton7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToggleButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton7ActionPerformed(evt);
            }
        });
        jToolBar1.add(jToggleButton7);

        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setLabel("Kirim");
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 558, Short.MAX_VALUE)
                    .addComponent(PanelKanvas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelKanvas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Drawing", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 583, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE))
        );

        jTabbedPane1.getAccessibleContext().setAccessibleParent(jTabbedPane1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void initCanvas() {
        this.PanelKanvas.setBackground(Color.WHITE);
        this.PanelKanvas.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("mouse klik");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                PanelKanvas.getGraphics().setColor(Color.BLACK);
                int x = PanelKanvas.getMousePosition().x;
                int y = PanelKanvas.getMousePosition().y;
                // line
                if (DrawMode == 0) {
                    if (DrawTrack == 0) {
                        DrawLineTrack[0] = x;
                        DrawLineTrack[1] = y;
                        DrawTrack += 1;
                    } else {
                        DrawLineTrack[2] = x;
                        DrawLineTrack[3] = y;
                        DrawTrack = 1;
                        PanelKanvas.getGraphics().drawLine(DrawLineTrack[0],
                                DrawLineTrack[1], DrawLineTrack[2], DrawLineTrack[3]);

                        DrawLineTrack[0] = x;
                        DrawLineTrack[1] = y;
                    }

                    // box
                } else if (DrawMode == 2) {
                    if (DrawTrack == 0) {
                        DrawLineTrack[0] = x;
                        DrawLineTrack[1] = y;
                        DrawTrack += 1;
                    } else {
                        DrawLineTrack[2] = x;
                        DrawLineTrack[3] = y;
                        DrawTrack = 0;
                        PanelKanvas.getGraphics().drawRect(DrawLineTrack[0],
                                DrawLineTrack[1], DrawLineTrack[2] - DrawLineTrack[0],
                                DrawLineTrack[3] - DrawLineTrack[1]);

                    }


                } //oval
                else if (DrawMode == 3) {
                    if (DrawTrack == 0) {
                        DrawLineTrack[0] = x;
                        DrawLineTrack[1] = y;
                        DrawTrack += 1;
                    } else {
                        DrawLineTrack[2] = x;
                        DrawLineTrack[3] = y;
                        DrawTrack = 0;
                        PanelKanvas.getGraphics().drawOval(DrawLineTrack[0],
                                DrawLineTrack[1], DrawLineTrack[2] - DrawLineTrack[0],
                                DrawLineTrack[3] - DrawLineTrack[1]);
                    }
                } // clear
                else if (DrawMode == 4) {
                    PanelKanvas.getGraphics().dispose();
                }

                System.out.println(x + ", " + y);

            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });
    }

private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_jTextField1ActionPerformed

private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton3ActionPerformed

    jToggleButton3.setText("Server is running");
    new Thread(new Runnable() {

        @Override
        public void run() {
        	try {
            	DedicatedPPTServer.startListening();
            } catch (IOException e) {
            	JOptionPane.showMessageDialog(null, "Failed started dedicated ppt socket: " + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        	
            try {                
                server = new Server(AudioTab.this);
            } catch (LineUnavailableException ex) {
                Logger.getLogger(AudioTab.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }).start();
}//GEN-LAST:event_jToggleButton3ActionPerformed

private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
// TODO add your handling code here:
    if (jToggleButton2.getText().equalsIgnoreCase("Unmute")) {
        jToggleButton2.setText("Mute");
    } else {
        jToggleButton2.setText("Unmute");
    }
}//GEN-LAST:event_jToggleButton2ActionPerformed

private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
// TODO add your handling code here:
    if (jToggleButton1.getText().equalsIgnoreCase("ON")) {
        jToggleButton1.setText("OFF");
    } else {
        jToggleButton1.setText("ON");
    }
}//GEN-LAST:event_jToggleButton1ActionPerformed

private void FileChooserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FileChooserActionPerformed
    try {
        PopUpMenu pop = new PopUpMenu(this, jPanel4, MainSlidePane, SlideScrollPane, ContainerScrollPane);
    } catch (IOException ex) {
        Logger.getLogger(AudioTab.class.getName()).log(Level.SEVERE, null, ex);
    }
}//GEN-LAST:event_FileChooserActionPerformed

private void jTabbedPane1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPane1StateChanged
// TODO add your handling code here:
    JTabbedPane pane = (JTabbedPane) evt.getSource();
    int sel = pane.getSelectedIndex();
    if (sel == 1) {
        this.setSize(1100, 900);
    } else {
        this.setSize(600, 400);
    }
}//GEN-LAST:event_jTabbedPane1StateChanged

private void jPanel1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPanel1FocusGained
// TODO add your handling code here:
}//GEN-LAST:event_jPanel1FocusGained

private void FileChooserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_FileChooserFocusGained
// TODO add your handling code here:
    this.setSize(1100, 900);
}//GEN-LAST:event_FileChooserFocusGained

private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusGained
// TODO add your handling code here:
    this.setSize(600, 400);
}//GEN-LAST:event_jTextField1FocusGained

    private void jToggleButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton7ActionPerformed
        DrawMode = 4;
    }//GEN-LAST:event_jToggleButton7ActionPerformed

    private void tombolGarisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolGarisActionPerformed
        DrawMode = 0;
        DrawTrack = 0;
        // TODO add your handling code here:
    }//GEN-LAST:event_tombolGarisActionPerformed

    private void tombolKotakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolKotakActionPerformed
        DrawMode = 2;
        DrawTrack = 0;
    }//GEN-LAST:event_tombolKotakActionPerformed

    private void tombol_ovalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombol_ovalActionPerformed
        DrawMode = 3;
        DrawTrack = 0;
    }//GEN-LAST:event_tombol_ovalActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        FileOutputStream out = null;

        BufferedImage img = createImage(PanelKanvas);
       
        try {
            out = new FileOutputStream("C:\\project\\Research\\canvas.jpg");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AudioTab.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            javax.imageio.ImageIO.write(img, "JPG", out);
        } catch (IOException ex) {
            Logger.getLogger(AudioTab.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            out.close();
        } catch (IOException ex) {
            Logger.getLogger(AudioTab.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    public BufferedImage createImage(JPanel panel) {
        int w = panel.getWidth();
        int h = panel.getHeight();
        BufferedImage bi = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
        Graphics2D g = bi.createGraphics();
        panel.paint(g);
        return bi;
    }
    
    
    public void removeParticipant(String participant) {
//        for (int i=0 ; i<listParticipant.getComponentCount() ; ++i) {
//            if (((JTextField)listParticipant.getModel().getElementAt(i)).equals(participant)) {
//                listParticipant.remove(i);
//            }
//        }
    }
    
    public void addParticipant(String participant) {
//        listParticipant.add(new JTextField(participant));
            lblParticipant.setText(participant);
            
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
            java.util.logging.Logger.getLogger(AudioTab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AudioTab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AudioTab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AudioTab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new AudioTab().setVisible(true);
            }
        });
    }
    //  Variables Canvas
    private int DrawMode = -1;
    private int DrawTrack = 0;
    private int[] DrawLineTrack = {0, 0, 0, 0};
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ContainerScrollPane;
    private javax.swing.JButton FileChooser;
    private javax.swing.JPanel MainSlidePane;
    private javax.swing.JPanel PanelKanvas;
    private javax.swing.JPanel SlideScrollPane;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton7;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblParticipant;
    private javax.swing.JToggleButton tombolGaris;
    private javax.swing.JToggleButton tombolKotak;
    private javax.swing.JToggleButton tombol_oval;
    // End of variables declaration//GEN-END:variables
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ftc6210.main;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Label;
import java.awt.Rectangle;
import java.awt.Stroke;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Line2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.DefaultListModel;
import javax.swing.Timer;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author Busch_902818
 */
public class MainWindow extends javax.swing.JFrame implements ActionListener{

    /**
     * Creates new form MainWindow
     */
    
    private PointModel points;
    private BufferedImage fieldImage;
    private Point selectedPoint, draggedPoint;
    private DefaultListModel<Point> pointListModel;
    
    public MainWindow() throws IOException {
        initComponents();
        
        points = new PointModel(false);
        pointListModel = new DefaultListModel<>();
        points_jList.setModel(pointListModel);
        
        
        
        fieldImage = ImageIO.read(getClass().getClassLoader().getResourceAsStream("res/field.png"));
        
        //  Update 30 times a second
        Timer timer = new Timer(1000/60, this);
        timer.start();
        
        speedSlider_jSlider.setMinimum(0);
        speedSlider_jSlider.setMaximum(100);
        speedSlider_jSlider.setMajorTickSpacing(1);
        
        setSelectedPoint(null);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainTabs_jTabbedPane = new javax.swing.JTabbedPane();
        workspace_jPanel = new javax.swing.JPanel();
        pointList_jScrollPane = new javax.swing.JScrollPane();
        points_jList = new javax.swing.JList();
        fieldView_jPanel = new FieldView(this);
        currentPointPanel_jPanel = new javax.swing.JPanel();
        generateCode_jButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        notes_jTextArea = new javax.swing.JTextArea();
        currentPointName_jTextField = new javax.swing.JTextField();
        notes_jLabel = new javax.swing.JLabel();
        speedSlider_jSlider = new javax.swing.JSlider();
        speed_jLabel = new javax.swing.JLabel();
        redAllianceCode_jPanel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        redAlliance_jTextArea = new javax.swing.JTextArea();
        copyRed_jButton = new javax.swing.JButton();
        blueAllianceCode_jPanel = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        blueAlliance_jTextArea = new javax.swing.JTextArea();
        copyBlue_jButton = new javax.swing.JButton();
        configure_jPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        points_jList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        points_jList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        points_jList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                points_jListValueChanged(evt);
            }
        });
        pointList_jScrollPane.setViewportView(points_jList);

        fieldView_jPanel.setPreferredSize(new java.awt.Dimension(360, 360));
        fieldView_jPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fieldView_jPanelMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                fieldView_jPanelMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                fieldView_jPanelMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout fieldView_jPanelLayout = new javax.swing.GroupLayout(fieldView_jPanel);
        fieldView_jPanel.setLayout(fieldView_jPanelLayout);
        fieldView_jPanelLayout.setHorizontalGroup(
            fieldView_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );
        fieldView_jPanelLayout.setVerticalGroup(
            fieldView_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );

        generateCode_jButton.setText("Generate Code");
        generateCode_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateCode_jButtonActionPerformed(evt);
            }
        });

        notes_jTextArea.setColumns(20);
        notes_jTextArea.setRows(5);
        jScrollPane1.setViewportView(notes_jTextArea);

        currentPointName_jTextField.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        currentPointName_jTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                currentPointName_jTextFieldActionPerformed(evt);
            }
        });

        notes_jLabel.setText("Notes");

        speed_jLabel.setText("Speed");

        javax.swing.GroupLayout currentPointPanel_jPanelLayout = new javax.swing.GroupLayout(currentPointPanel_jPanel);
        currentPointPanel_jPanel.setLayout(currentPointPanel_jPanelLayout);
        currentPointPanel_jPanelLayout.setHorizontalGroup(
            currentPointPanel_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(currentPointPanel_jPanelLayout.createSequentialGroup()
                .addGroup(currentPointPanel_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(currentPointPanel_jPanelLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(currentPointPanel_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(speed_jLabel)
                            .addComponent(notes_jLabel)
                            .addComponent(currentPointName_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(currentPointPanel_jPanelLayout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(speedSlider_jSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(generateCode_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        currentPointPanel_jPanelLayout.setVerticalGroup(
            currentPointPanel_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(currentPointPanel_jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(currentPointName_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(currentPointPanel_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(speed_jLabel)
                    .addComponent(speedSlider_jSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(notes_jLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(generateCode_jButton)
                .addContainerGap())
        );

        javax.swing.GroupLayout workspace_jPanelLayout = new javax.swing.GroupLayout(workspace_jPanel);
        workspace_jPanel.setLayout(workspace_jPanelLayout);
        workspace_jPanelLayout.setHorizontalGroup(
            workspace_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(workspace_jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fieldView_jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(currentPointPanel_jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pointList_jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                .addContainerGap())
        );
        workspace_jPanelLayout.setVerticalGroup(
            workspace_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, workspace_jPanelLayout.createSequentialGroup()
                .addGroup(workspace_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(currentPointPanel_jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(workspace_jPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pointList_jScrollPane)
                        .addGap(9, 9, 9))
                    .addGroup(workspace_jPanelLayout.createSequentialGroup()
                        .addGap(0, 1, Short.MAX_VALUE)
                        .addComponent(fieldView_jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        mainTabs_jTabbedPane.addTab("Draw", workspace_jPanel);

        redAlliance_jTextArea.setColumns(20);
        redAlliance_jTextArea.setRows(5);
        jScrollPane3.setViewportView(redAlliance_jTextArea);

        copyRed_jButton.setText("Copy Code");
        copyRed_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyRed_jButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout redAllianceCode_jPanelLayout = new javax.swing.GroupLayout(redAllianceCode_jPanel);
        redAllianceCode_jPanel.setLayout(redAllianceCode_jPanelLayout);
        redAllianceCode_jPanelLayout.setHorizontalGroup(
            redAllianceCode_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(redAllianceCode_jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(redAllianceCode_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 714, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, redAllianceCode_jPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(copyRed_jButton)))
                .addContainerGap())
        );
        redAllianceCode_jPanelLayout.setVerticalGroup(
            redAllianceCode_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(redAllianceCode_jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(copyRed_jButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mainTabs_jTabbedPane.addTab("Red Alliance", redAllianceCode_jPanel);

        blueAlliance_jTextArea.setColumns(20);
        blueAlliance_jTextArea.setRows(5);
        jScrollPane4.setViewportView(blueAlliance_jTextArea);

        copyBlue_jButton.setText("Copy Code");

        javax.swing.GroupLayout blueAllianceCode_jPanelLayout = new javax.swing.GroupLayout(blueAllianceCode_jPanel);
        blueAllianceCode_jPanel.setLayout(blueAllianceCode_jPanelLayout);
        blueAllianceCode_jPanelLayout.setHorizontalGroup(
            blueAllianceCode_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(blueAllianceCode_jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(blueAllianceCode_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 714, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, blueAllianceCode_jPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(copyBlue_jButton)))
                .addContainerGap())
        );
        blueAllianceCode_jPanelLayout.setVerticalGroup(
            blueAllianceCode_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(blueAllianceCode_jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(copyBlue_jButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mainTabs_jTabbedPane.addTab("Blue Alliance", blueAllianceCode_jPanel);

        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(1);
        jScrollPane2.setViewportView(jTextArea1);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/robocfg.png"))); // NOI18N

        jLabel2.setText("Right Motor Names");

        jTextArea2.setColumns(20);
        jTextArea2.setLineWrap(true);
        jTextArea2.setRows(1);
        jScrollPane5.setViewportView(jTextArea2);

        jLabel3.setText("Left Motor Names");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout configure_jPanelLayout = new javax.swing.GroupLayout(configure_jPanel);
        configure_jPanel.setLayout(configure_jPanelLayout);
        configure_jPanelLayout.setHorizontalGroup(
            configure_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, configure_jPanelLayout.createSequentialGroup()
                .addContainerGap(242, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        configure_jPanelLayout.setVerticalGroup(
            configure_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(configure_jPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        mainTabs_jTabbedPane.addTab("Configure Robot", configure_jPanel);

        jMenu2.setText("File");
        jMenuBar.add(jMenu2);

        jMenu3.setText("Edit");
        jMenuBar.add(jMenu3);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainTabs_jTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 728, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainTabs_jTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void generateCode_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateCode_jButtonActionPerformed
        CodeGenerator gen = new CodeGenerator(points,  new RobotHardware(6, new String[]{"motor1", "motor2"}));
        blueAlliance_jTextArea.setText(gen.getRedAllianceCode());
        redAlliance_jTextArea.setText(gen.getBlueAllianceCode());
    }//GEN-LAST:event_generateCode_jButtonActionPerformed

    private void copyRed_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyRed_jButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_copyRed_jButtonActionPerformed

    private void fieldView_jPanelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fieldView_jPanelMouseReleased
        java.awt.Point mouse = fieldView_jPanel.getMousePosition();
        if(evt.getButton() == java.awt.event.MouseEvent.BUTTON1)
            draggedPoint = null;
        
        if(evt.getButton() == java.awt.event.MouseEvent.BUTTON3)
            addPoint(evt.getX(), evt.getY());
    }//GEN-LAST:event_fieldView_jPanelMouseReleased

    private Point addPoint(int x, int y) {
        
        Point p = new Point(x, y, "Point " + (points.getPoints().size() + 1), 50, "", false);
        System.out.println(p.getName());
        points.addPoint(p);
        pointListModel.addElement(p);
        return p;
    }
    
    private void fieldView_jPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fieldView_jPanelMouseClicked

    }//GEN-LAST:event_fieldView_jPanelMouseClicked

    private void fieldView_jPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fieldView_jPanelMousePressed
        java.awt.Point mouse = fieldView_jPanel.getMousePosition();
        
        if(mouse == null)return;
        
        
        Point toSelect = null;
        if(evt.getButton() == java.awt.event.MouseEvent.BUTTON1) // LEFT CLICK TO DRAG
            for(Point p : points) {
                Rectangle hitbox = new Rectangle(p.getX()-5, p.getY() -5, 10, 10);
                if(hitbox.contains(mouse)) {
                    toSelect = p;
                    break;
                }
            }
        
        if(draggedPoint == null)
            draggedPoint = toSelect;
        if(toSelect != null)
            setSelectedPoint(toSelect);
        
        if(evt.getButton() == java.awt.event.MouseEvent.BUTTON2) {
            
        }
        
    }//GEN-LAST:event_fieldView_jPanelMousePressed

    private void points_jListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_points_jListValueChanged
        Point p = pointListModel.get(points_jList.getSelectedIndex());
        if(p != selectedPoint)
            setSelectedPoint(p);
        
    }//GEN-LAST:event_points_jListValueChanged

    private void currentPointName_jTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_currentPointName_jTextFieldActionPerformed
        selectedPoint.setName(currentPointName_jTextField.getText());
        pointListModel.set(pointListModel.indexOf(selectedPoint), selectedPoint);
        System.out.println("Enter!");
    }//GEN-LAST:event_currentPointName_jTextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new MainWindow().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel blueAllianceCode_jPanel;
    private javax.swing.JTextArea blueAlliance_jTextArea;
    private javax.swing.JPanel configure_jPanel;
    private javax.swing.JButton copyBlue_jButton;
    private javax.swing.JButton copyRed_jButton;
    private javax.swing.JTextField currentPointName_jTextField;
    private javax.swing.JPanel currentPointPanel_jPanel;
    private javax.swing.JPanel fieldView_jPanel;
    private javax.swing.JButton generateCode_jButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTabbedPane mainTabs_jTabbedPane;
    private javax.swing.JLabel notes_jLabel;
    private javax.swing.JTextArea notes_jTextArea;
    private javax.swing.JScrollPane pointList_jScrollPane;
    private javax.swing.JList points_jList;
    private javax.swing.JPanel redAllianceCode_jPanel;
    private javax.swing.JTextArea redAlliance_jTextArea;
    private javax.swing.JSlider speedSlider_jSlider;
    private javax.swing.JLabel speed_jLabel;
    private javax.swing.JPanel workspace_jPanel;
    // End of variables declaration//GEN-END:variables

    
    // Handle all of the animations from the image view
    @Override
    public void actionPerformed(ActionEvent e) {
        Graphics g = fieldView_jPanel.getGraphics();
        
        if(mainTabs_jTabbedPane.getSelectedIndex() != 0){
            g.dispose();
            return;
        }
        
        pointLogic();
        fieldView_jPanel.paintComponents(g);
        
    }
    
    public void pointLogic() {
        java.awt.Point mouse = fieldView_jPanel.getMousePosition();
        if(mouse != null) {
            if(draggedPoint != null) {
                draggedPoint.setX(mouse.x);
                draggedPoint.setY(mouse.y);
            }
        }       
    }
    
    private void selectPointFromList(Point p) {
        
        setSelectedPoint(p);
    }
    
    private void setSelectedPoint(Point p) {
        
        
        if(p == null){
            currentPointName_jTextField.setEnabled(false);
            notes_jTextArea.setEnabled(false);
            speedSlider_jSlider.setEnabled(false);
            return;
        }
        System.out.println("Selected: " + p.getName());
        if(selectedPoint != null) { // Save all data
            selectedPoint.setName(currentPointName_jTextField.getText());
            selectedPoint.setNotes(notes_jTextArea.getText());
            selectedPoint.setSpeed(speedSlider_jSlider.getValue());
        }
        
        selectedPoint = p;
        points_jList.setSelectedIndex(pointListModel.indexOf(p));
        
        currentPointName_jTextField.setEnabled(true);
        notes_jTextArea.setEnabled(true);
        speedSlider_jSlider.setEnabled(true);
        
        currentPointName_jTextField.setText(selectedPoint.getName());
        notes_jTextArea.setText(selectedPoint.getNotes());
        speedSlider_jSlider.setValue(selectedPoint.getSpeed());   
    }

    public PointModel getRedPoints() {
        return points;
    }

    public BufferedImage getFieldImage() {
        return fieldImage;
    }

    public Point getSelectedPoint() {
        return selectedPoint;
    }
    
    
    
}

/*
 * Copyright (C) 2014 e-werkzeug <administrator@e-werkzeug.eu>
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package de.ewerkzeug.easytranscript.GUI.Components;

import static de.ewerkzeug.easytranscript.Core.V.VERSION;
import static de.ewerkzeug.easytranscript.Core.V.logger;
import java.awt.Desktop;
import java.awt.Toolkit;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author e-werkzeug <administrator@e-werkzeug.eu>
 */
public class SupportFrame extends javax.swing.JFrame {

    /**
     * Creates new form SupportFrame
     */
    public SupportFrame() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SupportTitleLabel = new javax.swing.JLabel();
        SupportInfoScrollpane = new javax.swing.JScrollPane();
        SupportInfoTextarea = new javax.swing.JTextArea();
        SupportBlock1Label = new javax.swing.JLabel();
        SupportFailureCheckbox = new javax.swing.JCheckBox();
        SupportFeatureCheckbox = new javax.swing.JCheckBox();
        SupportBlock2Label = new javax.swing.JLabel();
        SupportUpdatesCheckbox = new javax.swing.JCheckBox();
        SupportMediaplayerCheckbox = new javax.swing.JCheckBox();
        SupportQuestionCheckbox = new javax.swing.JCheckBox();
        SupportEditorCheckbox = new javax.swing.JCheckBox();
        SupportProjectsCheckbox = new javax.swing.JCheckBox();
        SupportImExCheckbox = new javax.swing.JCheckBox();
        SupportTimeCheckbox = new javax.swing.JCheckBox();
        SupportDesignCheckbox = new javax.swing.JCheckBox();
        SupportsthelseCheckbox = new javax.swing.JCheckBox();
        SupportBlock3Label = new javax.swing.JLabel();
        SupportMessageScrollpane = new javax.swing.JScrollPane();
        SupportMessageTextarea = new javax.swing.JTextArea();
        SupportBottomPanel = new javax.swing.JPanel();
        SupportChecknSendButton = new javax.swing.JButton();
        SupportCancelButton = new javax.swing.JButton();
        SupportSourceLabel = new javax.swing.JLabel();
        SupportSourceTextfield = new javax.swing.JTextField();

        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("de/ewerkzeug/easytranscript/Core/Bundles/Bundle"); // NOI18N
        setTitle(bundle.getString("Easytranscript.MainsupportMenuitem.text")); // NOI18N
        setResizable(false);

        SupportTitleLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        SupportTitleLabel.setText(bundle.getString("Easytranscript.SupportTitleLabel.text")); // NOI18N

        SupportInfoTextarea.setEditable(false);
       // SupportInfoTextarea.setBackground(new java.awt.Color(240, 240, 240));
        SupportInfoTextarea.setColumns(20);
        SupportInfoTextarea.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        SupportInfoTextarea.setLineWrap(true);
        SupportInfoTextarea.setRows(5);
        SupportInfoTextarea.setText(bundle.getString("Easytranscript.SupportInfoTextarea.text")); // NOI18N
        SupportInfoTextarea.setWrapStyleWord(true);
        SupportInfoScrollpane.setViewportView(SupportInfoTextarea);

        SupportBlock1Label.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        SupportBlock1Label.setText(bundle.getString("Easytranscript.SupportBlock1Label.text")); // NOI18N

        SupportFailureCheckbox.setText(bundle.getString("Easytranscript.SupportFailureCheckbox.text")); // NOI18N

        SupportFeatureCheckbox.setText(bundle.getString("Easytranscript.SupportFeatureCheckbox.text")); // NOI18N

        SupportBlock2Label.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        SupportBlock2Label.setText(bundle.getString("Easytranscript.SupportBlock2Label.text")); // NOI18N

        SupportUpdatesCheckbox.setText(bundle.getString("Easytranscript.SupportUpdatesCheckbox.text")); // NOI18N

        SupportMediaplayerCheckbox.setText(bundle.getString("Easytranscript.SupportMediaplayerCheckbox.text")); // NOI18N

        SupportQuestionCheckbox.setText(bundle.getString("Easytranscript.SupportQuestionCheckbox.text")); // NOI18N

        SupportEditorCheckbox.setText(bundle.getString("Easytranscript.SupportEditorCheckbox.text")); // NOI18N

        SupportProjectsCheckbox.setText(bundle.getString("Easytranscript.SupportProjectsCheckbox.text")); // NOI18N

        SupportImExCheckbox.setText(bundle.getString("Easytranscript.SupportImExCheckbox.text")); // NOI18N

        SupportTimeCheckbox.setText(bundle.getString("Easytranscript.SupportTimeCheckbox.text")); // NOI18N

        SupportDesignCheckbox.setText(bundle.getString("Easytranscript.SupportDesignCheckbox.text")); // NOI18N

        SupportsthelseCheckbox.setText(bundle.getString("Easytranscript.SupportsthelseCheckbox.text")); // NOI18N

        SupportBlock3Label.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        SupportBlock3Label.setText(bundle.getString("Easytranscript.SupportBlock3Label.text")); // NOI18N

        SupportMessageTextarea.setColumns(20);
        SupportMessageTextarea.setLineWrap(true);
        SupportMessageTextarea.setRows(5);
        SupportMessageTextarea.setWrapStyleWord(true);
        SupportMessageScrollpane.setViewportView(SupportMessageTextarea);

        SupportChecknSendButton.setText(bundle.getString("Easytranscript.SupportChecknSendButton.text")); // NOI18N
        SupportChecknSendButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SupportChecknSendButtonActionPerformed(evt);
            }
        });
        SupportBottomPanel.add(SupportChecknSendButton);

        SupportCancelButton.setText(bundle.getString("Easytranscript.SupportCancelButton.text")); // NOI18N
        SupportCancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SupportCancelButtonActionPerformed(evt);
            }
        });
        SupportBottomPanel.add(SupportCancelButton);

        SupportSourceLabel.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        SupportSourceLabel.setText(bundle.getString("Easytranscript.SupportSourceLabel.text")); // NOI18N

        SupportSourceTextfield.setText(bundle.getString("Easytranscript.SupportSourceTextfield.text")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SupportBottomPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SupportInfoScrollpane, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(SupportMessageScrollpane))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SupportTitleLabel)
                            .addComponent(SupportBlock1Label)
                            .addComponent(SupportBlock2Label)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(SupportQuestionCheckbox)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(SupportFailureCheckbox)
                                        .addGap(47, 47, 47)
                                        .addComponent(SupportFeatureCheckbox))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(SupportUpdatesCheckbox)
                                            .addComponent(SupportEditorCheckbox)
                                            .addComponent(SupportImExCheckbox)
                                            .addComponent(SupportDesignCheckbox))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(SupportProjectsCheckbox)
                                            .addComponent(SupportMediaplayerCheckbox)
                                            .addComponent(SupportTimeCheckbox)
                                            .addComponent(SupportsthelseCheckbox)))))
                            .addComponent(SupportBlock3Label)
                            .addComponent(SupportSourceLabel))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(SupportSourceTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SupportTitleLabel)
                .addGap(18, 18, 18)
                .addComponent(SupportInfoScrollpane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SupportBlock1Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SupportFailureCheckbox)
                    .addComponent(SupportFeatureCheckbox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SupportQuestionCheckbox)
                .addGap(15, 15, 15)
                .addComponent(SupportBlock2Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SupportUpdatesCheckbox)
                    .addComponent(SupportMediaplayerCheckbox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SupportEditorCheckbox)
                    .addComponent(SupportProjectsCheckbox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SupportImExCheckbox)
                    .addComponent(SupportTimeCheckbox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SupportDesignCheckbox)
                    .addComponent(SupportsthelseCheckbox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SupportBlock3Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SupportMessageScrollpane, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(SupportSourceLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SupportSourceTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 24, Short.MAX_VALUE)
                .addComponent(SupportBottomPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SupportChecknSendButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SupportChecknSendButtonActionPerformed
        if (!SupportFailureCheckbox.isSelected() && !SupportFeatureCheckbox.isSelected() && !SupportQuestionCheckbox.isSelected()) {
            Toolkit.getDefaultToolkit().beep();
            return;
        }

        String mail = "mailto:support@e-werkzeug.eu?Subject=easytranscript%20Support&Body=version: " + VERSION.asInteger() + "%0A%0A Abschnitt 1:%0A";

        if (SupportFailureCheckbox.isSelected()) {
            mail = mail + "Ich habe einen Fehler entdeckt.%0A";
        }
        if (SupportFeatureCheckbox.isSelected()) {
            mail = mail + "Ich habe einen Verbesserungsvorschlag.%0A";
        }
        if (SupportQuestionCheckbox.isSelected()) {
            mail = mail + "Ich habe eine Frage. %0A";
        }

        mail = mail + "%0AAbschnitt 2: Es geht um %0A";

        if (SupportUpdatesCheckbox.isSelected()) {
            mail = mail + "die Behandlung von Updates.%0A";
        }
        if (SupportEditorCheckbox.isSelected()) {
            mail = mail + "den Editor.%0A";
        }
        if (SupportImExCheckbox.isSelected()) {
            mail = mail + "das Importieren & Exportieren von Daten.%0A";
        }
        if (SupportDesignCheckbox.isSelected()) {
            mail = mail + "das Design.%0A";
        }
        if (SupportMediaplayerCheckbox.isSelected()) {
            mail = mail + "den Medienplayer.%0A";
        }
        if (SupportProjectsCheckbox.isSelected()) {
            mail = mail + "das Speichern und Laden von Projekten.%0A";
        }
        if (SupportTimeCheckbox.isSelected()) {
            mail = mail + "das Protokollieren der Arbeitszeit.%0A";
        }
        if (SupportsthelseCheckbox.isSelected()) {
            mail = mail + "etwas anderes.%0A.";
        }
        String nachricht = SupportMessageTextarea.getText();

        nachricht = nachricht + ("(Quelle: " + SupportSourceTextfield.getText() + ")");

        nachricht = nachricht.replace("ä", "ae");
        nachricht = nachricht.replace("Ä", "Ae");
        nachricht = nachricht.replace("ö", "oe");
        nachricht = nachricht.replace("Ö", "Öe");
        nachricht = nachricht.replace("ü", "üe");
        nachricht = nachricht.replace("Ü", "Üe");
        nachricht = nachricht.replace("ß", "ss");
        nachricht = nachricht.replace("\"", "/");
        nachricht = nachricht.replace("%", "(Prozent)");
        nachricht = nachricht.replace(":", "(Doppelpunkt)");
        nachricht = nachricht.replace(";", "(Semikolon)");
        nachricht = nachricht.replace("<", "(kleiner)");
        nachricht = nachricht.replace(">", "(groesser)");
        nachricht = nachricht.replace("^", "(hoch)");
        nachricht = nachricht.replace("°", "(hochpunkt)");
        nachricht = nachricht.replace("²", "(hoch zwei)");
        nachricht = nachricht.replace("³", "(hoch drei)");
        nachricht = nachricht.replace("{", "(");
        nachricht = nachricht.replace("}", "(");
        nachricht = nachricht.replace("|", "(Vertikaler Strich)");
        nachricht = nachricht.replace("~", "(Tilde)");
        nachricht = nachricht.replace("[", "(");
        nachricht = nachricht.replace("]", ")");
        nachricht = nachricht.replace("µ", "(phi)");

        mail = mail + "%0A Abschnitt 3: Nachricht%0A" + nachricht + "%0A";
        mail = mail.replace(" ", "%20");

        mail = mail.replaceAll("\n", "%0A");

        try {
            Desktop.getDesktop().mail(new URI(mail));
        } catch (IOException | URISyntaxException e) {
            logger.log(Level.SEVERE, e.getLocalizedMessage(), e);
        }
        setVisible(false);
    }//GEN-LAST:event_SupportChecknSendButtonActionPerformed

    private void SupportCancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SupportCancelButtonActionPerformed
        setVisible(false);
    }//GEN-LAST:event_SupportCancelButtonActionPerformed

    public JCheckBox getSupportDesignCheckbox() {
        return SupportDesignCheckbox;
    }

    public JCheckBox getSupportEditorCheckbox() {
        return SupportEditorCheckbox;
    }

    public JCheckBox getSupportFailureCheckbox() {
        return SupportFailureCheckbox;
    }

    public JCheckBox getSupportFeatureCheckbox() {
        return SupportFeatureCheckbox;
    }

    public JCheckBox getSupportImExCheckbox() {
        return SupportImExCheckbox;
    }

    public JTextArea getSupportInfoTextarea() {
        return SupportInfoTextarea;
    }

    public JCheckBox getSupportMediaplayerCheckbox() {
        return SupportMediaplayerCheckbox;
    }

    public JTextArea getSupportMessageTextarea() {
        return SupportMessageTextarea;
    }

    public JCheckBox getSupportProjectsCheckbox() {
        return SupportProjectsCheckbox;
    }

    public JCheckBox getSupportQuestionCheckbox() {
        return SupportQuestionCheckbox;
    }

    public JTextField getSupportSourceTextfield() {
        return SupportSourceTextfield;
    }

    public JCheckBox getSupportTimeCheckbox() {
        return SupportTimeCheckbox;
    }

    public JCheckBox getSupportUpdatesCheckbox() {
        return SupportUpdatesCheckbox;
    }

    public JCheckBox getSupportsthelseCheckbox() {
        return SupportsthelseCheckbox;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel SupportBlock1Label;
    private javax.swing.JLabel SupportBlock2Label;
    private javax.swing.JLabel SupportBlock3Label;
    private javax.swing.JPanel SupportBottomPanel;
    private javax.swing.JButton SupportCancelButton;
    private javax.swing.JButton SupportChecknSendButton;
    private javax.swing.JCheckBox SupportDesignCheckbox;
    private javax.swing.JCheckBox SupportEditorCheckbox;
    private javax.swing.JCheckBox SupportFailureCheckbox;
    private javax.swing.JCheckBox SupportFeatureCheckbox;
    private javax.swing.JCheckBox SupportImExCheckbox;
    private javax.swing.JScrollPane SupportInfoScrollpane;
    private javax.swing.JTextArea SupportInfoTextarea;
    private javax.swing.JCheckBox SupportMediaplayerCheckbox;
    private javax.swing.JScrollPane SupportMessageScrollpane;
    private javax.swing.JTextArea SupportMessageTextarea;
    private javax.swing.JCheckBox SupportProjectsCheckbox;
    private javax.swing.JCheckBox SupportQuestionCheckbox;
    private javax.swing.JLabel SupportSourceLabel;
    private javax.swing.JTextField SupportSourceTextfield;
    private javax.swing.JCheckBox SupportTimeCheckbox;
    private javax.swing.JLabel SupportTitleLabel;
    private javax.swing.JCheckBox SupportUpdatesCheckbox;
    private javax.swing.JCheckBox SupportsthelseCheckbox;
    // End of variables declaration//GEN-END:variables
}

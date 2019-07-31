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

import de.ewerkzeug.easytranscript.Core.Easytranscript;
import de.ewerkzeug.easytranscript.Core.ErrorReport;
import de.ewerkzeug.easytranscript.Core.V;
import static de.ewerkzeug.easytranscript.Core.V.VERSION;
import static de.ewerkzeug.easytranscript.Core.V.errors;
import static de.ewerkzeug.easytranscript.Core.V.logger;
import static de.ewerkzeug.easytranscript.Core.V.prop;
import static de.ewerkzeug.easytranscript.Core.V.updVersion;
import de.ewerkzeug.easytranscript.Core.VersionState;
import de.ewerkzeug.easytranscript.Tools.Tools;
import org.apache.commons.io.FileSystemUtils;

import static de.ewerkzeug.easytranscript.Tools.Tools.getOS;
import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.logging.Level;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author e-werkzeug <administrator@e-werkzeug.eu>
 */
public class UpdateFrame extends javax.swing.JFrame {

    /**
     * Creates new form UpdateFrame
     */
    public UpdateFrame() {
        initComponents();
        currentVersionLabel.setText("Version: " + V.VERSION.toString());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        UFiconLabel = new javax.swing.JLabel();
        UFbottomPanel = new javax.swing.JPanel();
        updateFrameOK = new javax.swing.JButton();
        updateFrameNo = new javax.swing.JButton();
        updateFrameHistorie = new javax.swing.JButton();
        UFheaderLabel = new javax.swing.JLabel();
        UFinfoScrollpane = new javax.swing.JScrollPane();
        UFinfoTextarea = new javax.swing.JTextArea();
        currentVersionLabel = new javax.swing.JLabel();

        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("de/ewerkzeug/easytranscript/Core/Bundles/Bundle"); // NOI18N
        setTitle(bundle.getString("Easytranscript.MaincheckUpdatesMenuitem.text")); // NOI18N
        setResizable(false);

        UFiconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/de/ewerkzeug/easytranscript/Core/Images/update-product.png"))); // NOI18N

        updateFrameOK.setText(bundle.getString("Easytranscript.updateFrameOK.text")); // NOI18N
        updateFrameOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateFrameOKActionPerformed(evt);
            }
        });
        UFbottomPanel.add(updateFrameOK);

        updateFrameNo.setText(bundle.getString("Easytranscript.updateFrameNo.text")); // NOI18N
        updateFrameNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateFrameNoActionPerformed(evt);
            }
        });
        UFbottomPanel.add(updateFrameNo);

        updateFrameHistorie.setText(bundle.getString("Easytranscript.updateFrameHistorie.text")); // NOI18N
        updateFrameHistorie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateFrameHistorieActionPerformed(evt);
            }
        });
        UFbottomPanel.add(updateFrameHistorie);

        UFheaderLabel.setText(bundle.getString("Easytranscript.UFheaderLabel.text")); // NOI18N

        UFinfoTextarea.setEditable(false);
        UFinfoTextarea.setBackground(new java.awt.Color(240, 240, 240));
        UFinfoTextarea.setColumns(20);
        UFinfoTextarea.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        UFinfoTextarea.setLineWrap(true);
        UFinfoTextarea.setRows(5);
        UFinfoTextarea.setWrapStyleWord(true);
        UFinfoScrollpane.setViewportView(UFinfoTextarea);

        currentVersionLabel.setText("Version");
        currentVersionLabel.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(UFbottomPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(UFiconLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UFheaderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UFinfoScrollpane, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(currentVersionLabel)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(UFheaderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(UFinfoScrollpane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(UFiconLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(UFbottomPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(currentVersionLabel)
                .addGap(7, 7, 7))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updateFrameOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateFrameOKActionPerformed

        if (updVersion.equals("minor")) {
            try {
                ProcessBuilder builder = null;
                if (!Tools.getOS().equals("Win")) {
                   builder = new ProcessBuilder("java", "-jar", "updater.jar", "start", prop.getProperty("lang"), VersionState.getString(V.UPDATECHANNEL), VERSION.asInteger()+"");
                } else {
                    builder = new ProcessBuilder("cmd.exe", "/C", "updater.exe","start", prop.getProperty("lang"), VersionState.getString(V.UPDATECHANNEL), VERSION.asInteger()+"");
                }

                builder.redirectErrorStream(true);
                Process p = builder.start();

                BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));
                String s = "";
                while ((s = in.readLine()) != null) {
                    logger.log(Level.INFO, s);
                    if (!s.isEmpty()) break;
                }

            } catch (Exception ex) {
                logger.log(Level.WARNING, new ErrorReport().show(errors.getString("FailedToStartUpdater")), ex);

            }
        } else {
            String link;

            if (new File(new File("").getAbsolutePath() + System.getProperty("file.separator") + "easytranscript.exe").exists()) {

                link = "https://e-werkzeug.eu/index.php/easytranscript";
            } else {
                link = "https://e-werkzeug.eu/index.php/easytranscript";
            }

            URL url;
            try {
                url = new URL(link);
                if (Desktop.isDesktopSupported()) {
                    try {
                        Desktop.getDesktop().browse(url.toURI());

                    } catch (IOException | URISyntaxException e) {
                        logger.log(Level.SEVERE, new ErrorReport().show(errors.getString("errorOpeningLink")), e);

                    }
                }
            } catch (MalformedURLException e) {
                logger.log(Level.SEVERE, new ErrorReport().show(errors.getString("errorOpeningLink")), e);

            }

        }
        Easytranscript.terminate();
    }//GEN-LAST:event_updateFrameOKActionPerformed

    private void updateFrameNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateFrameNoActionPerformed
        setVisible(false);
    }//GEN-LAST:event_updateFrameNoActionPerformed

    private void updateFrameHistorieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateFrameHistorieActionPerformed
        URL url;
        try {
            url = new URL("http://e-werkzeug.eu/index.php/easytranscript");
            if (Desktop.isDesktopSupported()) {
                try {
                    Desktop.getDesktop().browse(url.toURI());

                } catch (IOException | URISyntaxException e) {
                    logger.log(Level.SEVERE, new ErrorReport().show(errors.getString("errorOpeningLink")), e);

                }
            }
        } catch (MalformedURLException e) {
            logger.log(Level.SEVERE, new ErrorReport().show(errors.getString("errorOpeningLink")), e);
        }
    }//GEN-LAST:event_updateFrameHistorieActionPerformed

    public JPanel getUFbottomPanel() {
        return UFbottomPanel;
    }

    public JLabel getUFheaderLabel() {
        return UFheaderLabel;
    }

    public JLabel getUFiconLabel() {
        return UFiconLabel;
    }

    public JScrollPane getUFinfoScrollpane() {
        return UFinfoScrollpane;
    }

    public JTextArea getUFinfoTextarea() {
        return UFinfoTextarea;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel UFbottomPanel;
    private javax.swing.JLabel UFheaderLabel;
    private javax.swing.JLabel UFiconLabel;
    private javax.swing.JScrollPane UFinfoScrollpane;
    private javax.swing.JTextArea UFinfoTextarea;
    private javax.swing.JLabel currentVersionLabel;
    private javax.swing.JButton updateFrameHistorie;
    private javax.swing.JButton updateFrameNo;
    private javax.swing.JButton updateFrameOK;
    // End of variables declaration//GEN-END:variables
}

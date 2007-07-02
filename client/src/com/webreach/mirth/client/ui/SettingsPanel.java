/* ***** BEGIN LICENSE BLOCK *****
 * Version: MPL 1.1
 *
 * The contents of this file are subject to the Mozilla Public License Version
 * 1.1 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * http://www.mozilla.org/MPL/
 *
 * Software distributed under the License is distributed on an "AS IS" basis,
 * WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License
 * for the specific language governing rights and limitations under the
 * License.
 *
 * The Original Code is Mirth.
 *
 * The Initial Developer of the Original Code is
 * WebReach, Inc.
 * Portions created by the Initial Developer are Copyright (C) 2006
 * the Initial Developer. All Rights Reserved.
 *
 * Contributor(s):
 *   Gerald Bortis <geraldb@webreachinc.com>
 *
 * ***** END LICENSE BLOCK ***** */

package com.webreach.mirth.client.ui;

import java.util.Properties;
import java.util.prefs.Preferences;

import com.webreach.mirth.client.core.ClientException;
import com.webreach.mirth.client.ui.components.MirthFieldConstraints;

/**
 * The main configuration panel.
 */
public class SettingsPanel extends javax.swing.JPanel
{
    private static Preferences userPreferences;
    private Properties serverProperties;
    private Frame parent;

    /**
     * Creates new form SettingsPanel
     */
    public SettingsPanel()
    {
        this.parent = PlatformUI.MIRTH_FRAME;
        initComponents();

        this.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                showSettingsPopupMenu(evt);
            }

            public void mouseReleased(java.awt.event.MouseEvent evt)
            {
                showSettingsPopupMenu(evt);
            }
        });
    }

    /** Shows the right click popup menu */
    private void showSettingsPopupMenu(java.awt.event.MouseEvent evt)
    {
        if (evt.isPopupTrigger())
        {
            parent.settingsPopupMenu.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents()
    {
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        clientSettings = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        intervalTime = new com.webreach.mirth.client.ui.components.MirthTextField();
        rowHighlightYes = new com.webreach.mirth.client.ui.components.MirthRadioButton();
        rowHighlightNo = new com.webreach.mirth.client.ui.components.MirthRadioButton();
        serverSettings = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        smtpPassword = new com.webreach.mirth.client.ui.components.MirthPasswordField();
        smtpUsername = new com.webreach.mirth.client.ui.components.MirthTextField();
        smtpPort = new com.webreach.mirth.client.ui.components.MirthTextField();
        smtpHost = new com.webreach.mirth.client.ui.components.MirthTextField();
        jLabel12 = new javax.swing.JLabel();
        requireAuthenticationYes = new com.webreach.mirth.client.ui.components.MirthRadioButton();
        requireAuthenticationNo = new com.webreach.mirth.client.ui.components.MirthRadioButton();
        defaultFrom = new com.webreach.mirth.client.ui.components.MirthTextField();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        clientSettings.setBackground(new java.awt.Color(255, 255, 255));
        clientSettings.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Client", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(0, 0, 0)));
        jLabel6.setText("Status refresh interval (in seconds):");

        jLabel7.setText("Alternate row highlighting in tables:");

        rowHighlightYes.setBackground(new java.awt.Color(255, 255, 255));
        rowHighlightYes.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        buttonGroup1.add(rowHighlightYes);
        rowHighlightYes.setSelected(true);
        rowHighlightYes.setText("Yes");
        rowHighlightYes.setMargin(new java.awt.Insets(0, 0, 0, 0));

        rowHighlightNo.setBackground(new java.awt.Color(255, 255, 255));
        rowHighlightNo.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        buttonGroup1.add(rowHighlightNo);
        rowHighlightNo.setText("No");
        rowHighlightNo.setMargin(new java.awt.Insets(0, 0, 0, 0));

        org.jdesktop.layout.GroupLayout clientSettingsLayout = new org.jdesktop.layout.GroupLayout(clientSettings);
        clientSettings.setLayout(clientSettingsLayout);
        clientSettingsLayout.setHorizontalGroup(
            clientSettingsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(clientSettingsLayout.createSequentialGroup()
                .addContainerGap()
                .add(clientSettingsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(jLabel6)
                    .add(jLabel7))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(clientSettingsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(clientSettingsLayout.createSequentialGroup()
                        .add(rowHighlightYes, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(rowHighlightNo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(intervalTime, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 78, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        clientSettingsLayout.setVerticalGroup(
            clientSettingsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(clientSettingsLayout.createSequentialGroup()
                .add(clientSettingsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel6)
                    .add(intervalTime, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(clientSettingsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(rowHighlightYes, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(rowHighlightNo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel7)))
        );

        serverSettings.setBackground(new java.awt.Color(255, 255, 255));
        serverSettings.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Server", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(0, 0, 0)));
        jLabel9.setText("Email Alert Settings:");

        jLabel10.setText("SMTP Host:");

        jLabel11.setText("SMTP Port:");

        usernameLabel.setText("Username:");

        passwordLabel.setText("Password:");

        smtpPassword.setFont(new java.awt.Font("Tahoma", 0, 11));

        jLabel12.setText("Require Authentication:");

        requireAuthenticationYes.setBackground(new java.awt.Color(255, 255, 255));
        requireAuthenticationYes.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        buttonGroup2.add(requireAuthenticationYes);
        requireAuthenticationYes.setSelected(true);
        requireAuthenticationYes.setText("Yes");
        requireAuthenticationYes.setMargin(new java.awt.Insets(0, 0, 0, 0));
        requireAuthenticationYes.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                requireAuthenticationYesActionPerformed(evt);
            }
        });

        requireAuthenticationNo.setBackground(new java.awt.Color(255, 255, 255));
        requireAuthenticationNo.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        buttonGroup2.add(requireAuthenticationNo);
        requireAuthenticationNo.setText("No");
        requireAuthenticationNo.setMargin(new java.awt.Insets(0, 0, 0, 0));
        requireAuthenticationNo.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                requireAuthenticationNoActionPerformed(evt);
            }
        });

        jLabel1.setText("Default From Address:");

        org.jdesktop.layout.GroupLayout serverSettingsLayout = new org.jdesktop.layout.GroupLayout(serverSettings);
        serverSettings.setLayout(serverSettingsLayout);
        serverSettingsLayout.setHorizontalGroup(
            serverSettingsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, serverSettingsLayout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(serverSettingsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel9)
                    .add(serverSettingsLayout.createSequentialGroup()
                        .add(serverSettingsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(jLabel12)
                            .add(jLabel11)
                            .add(jLabel10)
                            .add(serverSettingsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                .add(passwordLabel)
                                .add(org.jdesktop.layout.GroupLayout.TRAILING, usernameLabel))
                            .add(jLabel1))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(serverSettingsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(defaultFrom, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(serverSettingsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                .add(smtpPassword, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                                .add(smtpUsername, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                                .add(serverSettingsLayout.createSequentialGroup()
                                    .add(requireAuthenticationYes, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                    .add(requireAuthenticationNo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .add(smtpPort, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 44, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(smtpHost, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 117, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        serverSettingsLayout.setVerticalGroup(
            serverSettingsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(serverSettingsLayout.createSequentialGroup()
                .add(jLabel9)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(serverSettingsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(smtpHost, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel10))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(serverSettingsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(smtpPort, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel11))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(serverSettingsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel1)
                    .add(defaultFrom, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(serverSettingsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel12)
                    .add(requireAuthenticationYes, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(requireAuthenticationNo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(serverSettingsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(smtpUsername, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(usernameLabel))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(serverSettingsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(passwordLabel)
                    .add(smtpPassword, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(serverSettings, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(clientSettings, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(257, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(clientSettings, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(serverSettings, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void requireAuthenticationNoActionPerformed(java.awt.event.ActionEvent evt)// GEN-FIRST:event_requireAuthenticationNoActionPerformed
    {// GEN-HEADEREND:event_requireAuthenticationNoActionPerformed
        smtpUsername.setEnabled(false);
        smtpPassword.setEnabled(false);
        usernameLabel.setEnabled(false);
        passwordLabel.setEnabled(false);
    }// GEN-LAST:event_requireAuthenticationNoActionPerformed

    private void requireAuthenticationYesActionPerformed(java.awt.event.ActionEvent evt)// GEN-FIRST:event_requireAuthenticationYesActionPerformed
    {// GEN-HEADEREND:event_requireAuthenticationYesActionPerformed
        smtpUsername.setEnabled(true);
        smtpPassword.setEnabled(true);
        usernameLabel.setEnabled(true);
        passwordLabel.setEnabled(true);
    }// GEN-LAST:event_requireAuthenticationYesActionPerformed

    /** Loads the current settings into the Settings form */
    public void loadSettings()
    {
        intervalTime.setDocument(new MirthFieldConstraints(3, false, false, true));
        userPreferences = Preferences.systemNodeForPackage(Mirth.class);
        int interval = userPreferences.getInt("intervalTime", 10);
        intervalTime.setText(interval + "");

        if (userPreferences.getBoolean("highlightRows", true))
            rowHighlightYes.setSelected(true);
        else
            rowHighlightNo.setSelected(true);
        try
        {
            serverProperties = parent.mirthClient.getServerProperties();

            if (serverProperties.getProperty("smtp.host") != null)
                smtpHost.setText((String) serverProperties.getProperty("smtp.host"));
            else
                smtpHost.setText("");

            if (serverProperties.getProperty("smtp.port") != null)
                smtpPort.setText((String) serverProperties.getProperty("smtp.port"));
            else
                smtpPort.setText("");

            if (serverProperties.getProperty("smtp.from") != null)
                defaultFrom.setText((String) serverProperties.getProperty("smtp.from"));
            else
                defaultFrom.setText("");

            if (serverProperties.getProperty("smtp.requireAuthentication") != null)
            {
                if (serverProperties.getProperty("smtp.requireAuthentication").equals(UIConstants.YES_OPTION))
                {
                    requireAuthenticationYes.setSelected(true);
                    requireAuthenticationYesActionPerformed(null);
                }
                else
                {
                    requireAuthenticationNo.setSelected(true);
                    requireAuthenticationNoActionPerformed(null);
                }
            }
            else
            {
                requireAuthenticationNo.setSelected(true);
                requireAuthenticationNoActionPerformed(null);
            }

            if (serverProperties.getProperty("smtp.username") != null)
                smtpUsername.setText((String) serverProperties.getProperty("smtp.username"));
            else
                smtpUsername.setText("");

            if (serverProperties.getProperty("smtp.password") != null)
                smtpPassword.setText((String) serverProperties.getProperty("smtp.password"));
            else
                smtpPassword.setText("");
        }
        catch (ClientException e)
        {
            parent.alertException(e.getStackTrace(), e.getMessage());
        }
    }

    /** Saves the current settings from the settings form */
    public void saveSettings()
    {
        int interval = Integer.parseInt(intervalTime.getText());

        if (intervalTime.getText().length() == 0)
            parent.alertWarning("Please enter a valid interval time.");
        else if (interval <= 0)
            parent.alertWarning("Please enter an interval time that is larger than 0.");
        else
        {
            userPreferences.putInt("intervalTime", Integer.parseInt(intervalTime.getText()));
            parent.settingsTasks.getContentPane().getComponent(1).setVisible(false);
            userPreferences.putBoolean("highlightRows", rowHighlightYes.isSelected());

            serverProperties.put("smtp.host", smtpHost.getText());
            serverProperties.put("smtp.port", smtpPort.getText());
            serverProperties.put("smtp.from", defaultFrom.getText());

            if (requireAuthenticationYes.isSelected())
            {
                serverProperties.put("smtp.requireAuthentication", UIConstants.YES_OPTION);
                serverProperties.put("smtp.username", smtpUsername.getText());
                serverProperties.put("smtp.password", new String(smtpPassword.getPassword()));
            }
            else
            {
                serverProperties.put("smtp.requireAuthentication", UIConstants.NO_OPTION);
                serverProperties.put("smtp.username", "");
                serverProperties.put("smtp.password", "");
            }

            try
            {
                parent.mirthClient.setServerProperties(serverProperties);
            }
            catch (ClientException ex)
            {
                ex.printStackTrace();
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JPanel clientSettings;
    private com.webreach.mirth.client.ui.components.MirthTextField defaultFrom;
    private com.webreach.mirth.client.ui.components.MirthTextField intervalTime;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel passwordLabel;
    private com.webreach.mirth.client.ui.components.MirthRadioButton requireAuthenticationNo;
    private com.webreach.mirth.client.ui.components.MirthRadioButton requireAuthenticationYes;
    private com.webreach.mirth.client.ui.components.MirthRadioButton rowHighlightNo;
    private com.webreach.mirth.client.ui.components.MirthRadioButton rowHighlightYes;
    private javax.swing.JPanel serverSettings;
    private com.webreach.mirth.client.ui.components.MirthTextField smtpHost;
    private com.webreach.mirth.client.ui.components.MirthPasswordField smtpPassword;
    private com.webreach.mirth.client.ui.components.MirthTextField smtpPort;
    private com.webreach.mirth.client.ui.components.MirthTextField smtpUsername;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables

}

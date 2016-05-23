package server;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.LinkedHashMap;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;

/**
 *
 * @author taioli Francesco rappresenta la classe per inviare , ricevere i
 * messaggi
 */
public class ChatGUi extends javax.swing.JFrame {

    /**
     * Creates new form IndixisGui
     */
    public ChatGUi(String username, String password) {
        this.username = username;
        this.password = password;
        initComponents();
        registrazione(username, password);
        inizialize();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        title = new javax.swing.JPanel();
        user = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        addFriend = new javax.swing.JButton();
        removeFriends = new javax.swing.JButton();
        friendRequestList = new javax.swing.JButton();
        menu = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        friend = new javax.swing.JPanel();
        tab = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        messageText = new javax.swing.JTextPane();
        sendButton = new javax.swing.JButton();
        sendFile = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(100, 181, 246));

        title.setBackground(new java.awt.Color(100, 181, 246));

        user.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 24)); // NOI18N

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        addFriend.setText("aggiungi amico");
        addFriend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFriendActionPerformed(evt);
            }
        });

        removeFriends.setText("rimuovi amico");
        removeFriends.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeFriendsActionPerformed(evt);
            }
        });

        friendRequestList.setText("visualizza richieste d'amicizia");
        friendRequestList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                friendRequestListActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout titleLayout = new javax.swing.GroupLayout(title);
        title.setLayout(titleLayout);
        titleLayout.setHorizontalGroup(
            titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addFriend, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(removeFriends, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(friendRequestList)
                .addGap(22, 22, 22)
                .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
        titleLayout.setVerticalGroup(
            titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titleLayout.createSequentialGroup()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(user, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(titleLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addFriend)
                    .addComponent(removeFriends)
                    .addComponent(friendRequestList))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menu.setBackground(new java.awt.Color(100, 181, 246));

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        friend.setBackground(new java.awt.Color(255, 102, 51));

        javax.swing.GroupLayout friendLayout = new javax.swing.GroupLayout(friend);
        friend.setLayout(friendLayout);
        friendLayout.setHorizontalGroup(
            friendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 173, Short.MAX_VALUE)
        );
        friendLayout.setVerticalGroup(
            friendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        tab.setBackground(new java.awt.Color(255, 255, 255));
        tab.setForeground(new java.awt.Color(0, 153, 102));
        tab.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        tab.setAutoscrolls(true);
        tab.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        tab.setInheritsPopupMenu(true);

        messageText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                messageTextKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(messageText);

        sendButton.setText("Registra");
        sendButton.setMaximumSize(new java.awt.Dimension(205, 137));
        sendButton.setMinimumSize(new java.awt.Dimension(205, 137));
        sendButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                sendButtonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                sendButtonMouseReleased(evt);
            }
        });
        sendButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendButtonActionPerformed(evt);
            }
        });
        sendButton.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                sendButtonPropertyChange(evt);
            }
        });
        sendButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                sendButtonKeyReleased(evt);
            }
        });

        sendFile.setText("Invia File");
        sendFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendFileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(friend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tab, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 24, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sendFile, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sendButton, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(44, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tab, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(343, 343, 343)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(sendButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(sendFile)
                                .addGap(31, 31, 31))))
                    .addComponent(friend, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 818, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sendButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendButtonActionPerformed

        if (sendButton.getText().equals("Registra")) {

            String path = System.getProperty("user.dir") + "\\src\\client\\file\\"
                    + "inviati\\tracciaAudio\\" + System.currentTimeMillis() + "-traccia.au";

            AudioRecorder audioRecorder = new AudioRecorder(path);
            Thread stopper = new Thread(() -> {
                try {

                    Thread.sleep(10);
                    audioRecorder.fineRecord();
                    System.out.println(path);

                } catch (InterruptedException ex) {
                }
            });
            stopper.start();
            audioRecorder.inizioRecord();
            //Connection.inviaFile(path, tab.getTitleAt(0));

        } else {
            String text = messageText.getText();
            JLabel label = new JLabel(text + " inviato");
            JPanel panel = new JPanel(new BorderLayout());
            panel.setBackground(Color.red);

            panel.setPreferredSize(new Dimension(20, 20));
            panel.add(label, BorderLayout.EAST);
            panel.setSize(20, 20);
            panelMessage.add(panel);
            panelMessage.revalidate();
            panelMessage.repaint();
            /*JPanel boxMessage = new JPanel();
            boxMessage.setBackground(Color.blue);
            //aggiugnere i bordi rotondi
            boxMessage.setMaximumSize(new Dimension(400, 30));
            boxMessage.setAlignmentX(Component.RIGHT_ALIGNMENT);//0.0

            boxMessage.add(label);
            // panelMessage.setLayout(new BoxLayout(panelMessage, BoxLayout.Y_AXIS));
            panelMessage.add(boxMessage);*/

            messageText.setText("");
            sendButton.setText("Registra");
            //panelMessage.add(label);

            //aggiungo il messaggio all'array
            String localUser = user.getText();
            String destinatario = tab.getTitleAt(0);
            Calendar now = Calendar.getInstance();
            int day = now.get(Calendar.DAY_OF_MONTH);
            int hour = now.get(Calendar.HOUR_OF_DAY);
            Message message = new Message(localUser, text, destinatario, hour, day, TypeMessage.MESSAGGIO, false);
            addMessage(message);
            connection.inviaMessaggio(text, destinatario);
        }
    }//GEN-LAST:event_sendButtonActionPerformed

    private void sendFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendFileActionPerformed
        JFileChooser filechooser = new JFileChooser();
        int returnValue = filechooser.showOpenDialog(null); //del parent maggiore
        if (returnValue == filechooser.APPROVE_OPTION) {
            System.out.println(filechooser.getSelectedFile().getAbsolutePath());
            System.out.println("Invio file in corso");
            Connection.inviaFile(filechooser.getSelectedFile().getAbsolutePath(), tab.getTitleAt(0));
        }
    }//GEN-LAST:event_sendFileActionPerformed

    private void sendButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sendButtonMousePressed
        if (evt.getClickCount() == 1) {
            System.out.println(evt.getClass());
        }
    }//GEN-LAST:event_sendButtonMousePressed

    private void sendButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sendButtonMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_sendButtonMouseReleased

    private void sendButtonKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sendButtonKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_sendButtonKeyReleased

    private void sendButtonPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_sendButtonPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_sendButtonPropertyChange

    private void messageTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_messageTextKeyReleased
        if (messageText.getText().equals("")) {
            sendButton.setText("Registra");
            sendButton.revalidate();
            sendButton.repaint();
        } else {
            sendButton.setText("Invia");
            sendButton.revalidate();
            sendButton.repaint();
        }
    }//GEN-LAST:event_messageTextKeyReleased

    private void removeFriendsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeFriendsActionPerformed
        new RemoveFriend();
    }//GEN-LAST:event_removeFriendsActionPerformed

    private void addFriendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addFriendActionPerformed
       new AddFriend();
    }//GEN-LAST:event_addFriendActionPerformed

    private void friendRequestListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_friendRequestListActionPerformed
        if (Ricezione.friendsListWithoutAnswer.isEmpty()){
             JOptionPane.showMessageDialog(null,"Non sono presenti richieste di amicizia");
        }else
            new RichiesteDiAmicizia();
    }//GEN-LAST:event_friendRequestListActionPerformed

    /**
     * setta il nome dell'utente nella barra titolo
     *
     * @param userName
     */
    public void setUser(String userName) {
        user.setText("Bentornato, " + userName);
    }

    /**
     * aggiunge un messaggio al array
     *
     * @param messaggio
     */
    public void addMessage(Message messaggio) {
        listaMessaggi.add(messaggio);
        setMessage();
    }

    /**
     * modifica il label di notifica di un utente
     *
     * @param user
     */
    public void addNotify(String user) {
        JLabel k = new JLabel();
        int i = Integer.valueOf((String) notifiche.get(user));
        k = (JLabel) (counterNotifiche.get(i));
        String numberOfCurrentNotify = k.getText();
        String text = String.valueOf(Integer.parseInt(numberOfCurrentNotify) + 1);
        k.setText(text);
    }

    private boolean registrazione(String username, String password) {
        MessageDigest md;

        try {
            md = MessageDigest.getInstance("MD5");
            byte[] passBytes = password.getBytes();
            md.reset();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < passBytes.length; i++) {
                sb.append(Integer.toHexString(0xff & passBytes[i]));
            }
            password = sb.toString();
        } catch (NoSuchAlgorithmException ex) {
            System.out.println("Errore creazione hash password");
        }

        Connection prova = new Connection(5555, "127.0.0.1", username, password, "login", this);

        return true;
    }

    public void setFriendsListArray(ArrayList<String> listaAmici) {
        ar = listaAmici;
        amici();

        friend.setLayout(new BoxLayout(friend, BoxLayout.Y_AXIS));
        friend.setVisible(true);
        friend.revalidate();
    }

    public void amici() {
        int x = 0;
        for (int i = 0; i < ar.size(); i++) {
            String text = (String) ar.get(i).toString();

            //notifiche
            notifiche.put(text, String.valueOf(i));
            JLabel notify = new JLabel("0");
//            notify.set
            counterNotifiche.add(notify);

            JButton button = new JButton((String) ar.get(i).toString());

            button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae) {
                    notify.setText("0");
                    //panelMessage.setBackground(Color.white);
                    arrayTab.add(tab);
                    if (x == 0) {
                        tab.addTab(text, scroll);

                    } else {
                        int index = tab.getSelectedIndex();
                        tab.setTitleAt(0, text);
                    }
                    setMessage();
                    System.out.println("--------------------------------------------");
                }
            });
            JPanel p = new JPanel();
            p.setBackground(Color.red);
            p.setMaximumSize(new Dimension(200, 30));
            p.add(button);
            p.add(notify);
            friend.add(p);
            System.out.println((String) ar.get(i).toString());
        }
    }
    
    public void riceviAmicizia(String username){
       JOptionPane.showMessageDialog(null,"Hai ricevuto una richiesta d'amicizia da "+username+ "vai nell'apposita sezione per accettare");
    }
    
    public void nuovoAmico(String username){
       JOptionPane.showMessageDialog(null,username+" è un tuo nuovo amico ! Ora puoi chattarci !!!");
    }
    
     public void rimozioneAmico(String username){
       JOptionPane.showMessageDialog(null,username+" non è più tuo amico :(");
    }

    /**
     * setta i messagi nel panel in corrispondenza dell utente
     */
    public void setMessage() {
        String destinatario = tab.getTitleAt(0);
        panelMessage.removeAll();
        //add your elements
        panelMessage.revalidate();
        panelMessage.repaint();
        for (int i = 0; i < listaMessaggi.size(); i++) {
            System.out.println(listaMessaggi.get(i).toString());
            //String userLocal = user.getText();
            //if (listaMessaggi.get(i).getUser().equals(userLocal)) { //utente che esegue l'app   
            if (listaMessaggi.get(i).getDestinatario().equals(destinatario) || listaMessaggi.get(i).getUser().equals(destinatario)) {  // il messaggio è rivolot all'utente che esgue il prg

                System.out.println(listaMessaggi.get(i).getDestinatario() + ", " + listaMessaggi.get(i).getMessage() + ", " + listaMessaggi.get(i).getUser() + ", " + listaMessaggi.get(i).isForeign());

                if (listaMessaggi.get(i).isForeign() == true) {
                    JLabel message = new JLabel(listaMessaggi.get(i).getMessage());
                    JPanel panel = new JPanel(new BorderLayout());
                    panel.setBackground(Color.red);

                    //panel.setPreferredSize(new Dimension(20, 20));
                    panel.add(message, BorderLayout.WEST);
                    panel.setSize(20, 20);
                    panelMessage.add(panel);
                    //panelMessage.revalidate();

                } //JPanel boxMessage = new JPanel(new FlowLayout(FlowLayout.RIGHT));
                else if (listaMessaggi.get(i).isForeign() == false) {
                    
                    JLabel message = new JLabel(listaMessaggi.get(i).getMessage());
                    JPanel panelF = new JPanel(new BorderLayout());
                    panelF.setBackground(Color.black);

                    //panelF.setPreferredSize(new Dimension(20, 20));
                    panelF.add(message, BorderLayout.EAST);
                    panelF.setSize(20, 20);
                    panelMessage.add(panelF);
                   // panelMessage.revalidate();
                }
                //panelMessage.add(boxMessage);
            }
        }
        panelMessage.revalidate();
        panelMessage.repaint();
    }

    public void inizialize() {
        panelMessage = new JPanel();
        panelMessage.setLayout(new BoxLayout(panelMessage, BoxLayout.Y_AXIS));
     //scroll.add(panelMessage);
        //panelMessage.setSize(new Dimension(500,500));
        panelMessage.setBackground(Color.pink);
        //panelMessage.setMaximumSize(new Dimension(600, 600));
     scroll.setViewportView(panelMessage);
        //scroll.setPreferredSize(new Dimension(50, 50));
        //scroll.getVerticalScrollBar().setUI(new MyScrollBarUI());

    }

    public void setListaMessaggi(ArrayList messaggi) {
        listaMessaggi = messaggi;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addFriend;
    private javax.swing.JPanel friend;
    private javax.swing.JButton friendRequestList;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel menu;
    private javax.swing.JTextPane messageText;
    private javax.swing.JButton removeFriends;
    private javax.swing.JButton sendButton;
    private javax.swing.JButton sendFile;
    private javax.swing.JTabbedPane tab;
    private javax.swing.JPanel title;
    public javax.swing.JLabel user;
    // End of variables declaration//GEN-END:variables
    public static ArrayList ar = new ArrayList();
    public ArrayList arrayTab = new ArrayList();
    private String username;
    private String password;
    private Connection connection;
    private JPanel panelMessage;
    int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
    int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
    JScrollPane scroll = new JScrollPane(v, h);
    private List<Message> listaMessaggi = new ArrayList();
    LinkedHashMap notifiche = new LinkedHashMap();
    private List<JLabel> counterNotifiche = new ArrayList();
}

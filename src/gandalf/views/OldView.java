package gandalf.views;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;

import gandalf.models.*;

public class OldView extends javax.swing.JFrame {

    // Variables declaration - do not modify
    private DefaultListModel<MagicItem> listModel;
    private JLabel appTitleLabel;
    private JLabel weaponLabel;
    private JLabel weaponImageLabel;
    private JLabel elementLabel;
    private JLabel elementImageLabel;
    private JLabel nameLabel;
    private JLabel statsLabel;
    private JLabel backgroundLabel;
    private JComboBox<String> weaponComboBox;
    private JComboBox<String> elementComboBox;
    private JTextField nameTextField;
    private JButton showItemButton;
    private JButton saveButton;
    private JButton clearButton;
    private JButton listButton;
    private JScrollPane scrollPane;
    private JList<MagicItem> jList;
    // End of variables declaration

    public OldView() {
        listModel = new DefaultListModel<>();
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        backgroundLabel = new javax.swing.JLabel();
        appTitleLabel = new javax.swing.JLabel();
        weaponLabel = new javax.swing.JLabel();
        weaponImageLabel = new javax.swing.JLabel();
        elementLabel = new javax.swing.JLabel();
        elementImageLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        statsLabel = new javax.swing.JLabel();

        weaponComboBox = new javax.swing.JComboBox<>();
        elementComboBox = new javax.swing.JComboBox<>();

        nameTextField = new javax.swing.JTextField();

        showItemButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        listButton = new javax.swing.JButton();

        jList = new javax.swing.JList<MagicItem>();

        scrollPane = new javax.swing.JScrollPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gandalf");
        getContentPane().setLayout(null);
        setAllComponents();
    }// </editor-fold>//GEN-END:initComponents

    private void setAllComponents() {
        appTitleLabel.setFont(new java.awt.Font("Poor Richard", 1, 48));
        appTitleLabel.setForeground(new java.awt.Color(255, 255, 255));
        appTitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        appTitleLabel.setText("Build Magic Items");
        appTitleLabel.setBounds(0, 20, 800, 55);

        weaponLabel.setFont(new java.awt.Font("Poor Richard", 1, 24));
        weaponLabel.setForeground(new java.awt.Color(255, 255, 255));
        weaponLabel.setText("Pick your weapon");
        weaponLabel.setBounds(80, 130, 155, 28);

        weaponImageLabel
                .setIcon(new javax.swing.ImageIcon(getClass().getResource("/gandalf/images/weapons/sword.png")));
        weaponImageLabel.setBounds(60, 210, 200, 225);

        elementLabel.setFont(new java.awt.Font("Poor Richard", 1, 24));
        elementLabel.setForeground(new java.awt.Color(255, 255, 255));
        elementLabel.setText("Pick your element");
        elementLabel.setBounds(320, 130, 161, 28);

        elementImageLabel
                .setIcon(new javax.swing.ImageIcon(getClass().getResource("/gandalf/images/elements/fire.png")));
        elementImageLabel.setBounds(350, 260, 100, 93);

        nameLabel.setFont(new java.awt.Font("Poor Richard", 1, 24));
        nameLabel.setForeground(new java.awt.Color(255, 255, 255));
        nameLabel.setText("Nickname");
        nameLabel.setBounds(540, 130, 212, 28);

        statsLabel.setFont(new java.awt.Font("Rockwell", 1, 16));
        statsLabel.setForeground(new java.awt.Color(255, 255, 255));
        statsLabel.setText("<html>Power: Prominance<br>Damage: 312<br>AtkSpeed: 3</html>");
        statsLabel.setBounds(550, 200, 210, 60);

        backgroundLabel.setIcon(
                new javax.swing.ImageIcon(getClass().getResource("/gandalf/images/background/background_02.png")));
        backgroundLabel.setBounds(0, 0, 800, 600);

        weaponComboBox.setFont(new java.awt.Font("Calibri", 0, 14));
        weaponComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(
                new String[] { "Sword", "Magic Sword", "Double Sword", "Staff", "Bow", "Hammer", "Dagger", "Rapier" }));
        weaponComboBox.setBounds(100, 170, 113, 23);

        elementComboBox.setFont(new java.awt.Font("Calibri", 0, 14));
        elementComboBox.setModel(
                new javax.swing.DefaultComboBoxModel<>(new String[] { "Fire", "Water", "Earth", "Holy", "Dark" }));
        elementComboBox.setBounds(360, 170, 74, 23);

        nameTextField.setFont(new java.awt.Font("DialogInput", 1, 16));
        nameTextField.setBounds(550, 170, 200, 28);

        showItemButton.setFont(new java.awt.Font("Calibri", 0, 14));
        showItemButton.setText("Show Item");
        showItemButton.setBounds(390, 410, 90, 25);

        saveButton.setFont(new java.awt.Font("Calibri", 0, 14));
        saveButton.setText("Save");
        saveButton.setBounds(510, 410, 75, 25);

        clearButton.setFont(new java.awt.Font("Calibri", 0, 14));
        clearButton.setText("Clear");
        clearButton.setBounds(610, 410, 75, 25);

        listButton.setFont(new java.awt.Font("Calibri", 0, 14));
        listButton.setText("List");
        listButton.setBounds(710, 410, 75, 25);

        jList.setFont(new java.awt.Font("Dialog", 1, 12));
        jList.setModel(listModel);
        scrollPane.setViewportView(jList);
        scrollPane.setBounds(390, 440, 400, 150);

        addComponents();

        pack();
    }

    private void addComponents() {
        getContentPane().add(appTitleLabel);
        getContentPane().add(weaponLabel);
        getContentPane().add(weaponImageLabel);
        getContentPane().add(elementLabel);
        getContentPane().add(elementImageLabel);
        getContentPane().add(nameLabel);
        getContentPane().add(statsLabel);
        getContentPane().add(backgroundLabel);

        getContentPane().add(weaponComboBox);
        getContentPane().add(elementComboBox);

        getContentPane().add(nameTextField);

        getContentPane().add(showItemButton);
        getContentPane().add(saveButton);
        getContentPane().add(clearButton);
        getContentPane().add(listButton);

        getContentPane().add(scrollPane);
    }

    public void WeaponComboBoxChange(MagicItem magicItem, Image image) {
        weaponImageLabel.setIcon(image.getWeaponImages()[weaponComboBox.getSelectedIndex()]);
        statsLabel.setText("<html>Power: " + magicItem.getPower() + "<br>Damage: " + magicItem.getDamage()
                + "<br>AtkSpeed: " + magicItem.getAtkSpeed() + "</html>");
    }

    public void ElementComboBoxChange(MagicItem magicItem, Image image) {
        elementImageLabel.setIcon(image.getElementImages()[elementComboBox.getSelectedIndex()]);
        statsLabel.setText("<html>Power: " + magicItem.getPower() + "<br>Damage: " + magicItem.getDamage()
                + "<br>AtkSpeed: " + magicItem.getAtkSpeed() + "</html>");
    }

    public MagicItem getMagicItem() {
        return new MagicItem(weaponComboBox.getSelectedIndex(), elementComboBox.getSelectedIndex(),
                nameTextField.getText(), weaponComboBox.getItemAt(weaponComboBox.getSelectedIndex()),
                elementComboBox.getItemAt(elementComboBox.getSelectedIndex()));
    }

    public void showMagicItem(MagicItem magicItem) {
        listModel.addElement(magicItem);
    }

    public int confirm(MagicItem magicItem) {
        String text;

        text = "Are you sure you want to save this weapon?" + "\n\n" + magicItem.getWeapon() + " with "
                + magicItem.getElement() + " element" + "\nPower: " + magicItem.getPower() + "\nDamage: "
                + magicItem.getDamage() + "\nAtkSpeed: " + magicItem.getAtkSpeed() + "\n\n";

        return JOptionPane.showConfirmDialog(null, text);
    }

    public void clearList() {
        listModel.clear();
    }

    // public void listFromDB(MagicItem magicItem) {
    // listModel.addElement(magicItem);
    // }

    public void addWeaponComboBoxListener(ItemListener il) {
        weaponComboBox.addItemListener(il);
    }

    public void addElementComboBoxListener(ItemListener il) {
        elementComboBox.addItemListener(il);
    }

    public void addShowItemListener(ActionListener al) {
        showItemButton.addActionListener(al);
    }

    public void addSaveListener(ActionListener al) {
        saveButton.addActionListener(al);
    }

    public void addClearListaListener(ActionListener al) {
        clearButton.addActionListener(al);
    }

    public void addListDBListener(ActionListener al) {
        listButton.addActionListener(al);
    }
}

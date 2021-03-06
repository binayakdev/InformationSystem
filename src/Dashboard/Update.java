/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dashboard;

import java.io.File;
import java.util.InputMismatchException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class Update extends javax.swing.JFrame {
    
    private static Update upd1 = null;
    
    public String id;
    public String name;
    public String category;
    public String age;
    public String lifespan;
    public String size;
    public String nature;
    public String quantity;
    public String price;
    public String image;
    
    public int rowIndex;
    
    /**
     * Creates new form Update
     */
    private Update() {
        initComponents();
    }
    
    /**
     * this is the constructor of the class that takes the value of the selected row in the table and initializes them in the class
     * @param rowIndex
     * @param id
     * @param name
     * @param category
     * @param age
     * @param lifespan
     * @param size
     * @param nature
     * @param quantity
     * @param price
     * @param image 
     */
    public Update(int rowIndex, String id, String name, String category, String age, String lifespan, String size, String nature, String quantity, String price, String image){
        initComponents();
        this.rowIndex = rowIndex;
        this.id = id;
        this.name = name;
        this.category = category;
        this.age = age;
        this.lifespan = lifespan;
        this.size = size;
        this.nature = nature;
        this.quantity = quantity;
        this.price = price;
        this.image = image;

    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        radioButton2 = new javax.swing.ButtonGroup();
        checkBox2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        name2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        category2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        age2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        lifespan2 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        price2 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        quantity2 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        radioLoyal = new javax.swing.JRadioButton();
        radioAgg = new javax.swing.JRadioButton();
        radioPas = new javax.swing.JRadioButton();
        radioInq = new javax.swing.JRadioButton();
        jLabel13 = new javax.swing.JLabel();
        checkBig = new javax.swing.JCheckBox();
        checkMed = new javax.swing.JCheckBox();
        checkSmall = new javax.swing.JCheckBox();
        jLabel14 = new javax.swing.JLabel();
        imageChoose = new javax.swing.JButton();
        update = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard/logo-small.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(100, 100, 100));
        jLabel1.setText("Pet Store");

        jLabel2.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(160, 160, 160));
        jLabel2.setText("Update your data");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard/update.png"))); // NOI18N

        jLabel16.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(160, 160, 160));
        jLabel16.setText("You can update any column or row you want");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(38, 38, 38))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16))
                    .addComponent(jLabel4))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        name2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 47, 9)));

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(100, 100, 100));
        jLabel6.setText("Name");

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(100, 100, 100));
        jLabel7.setText("Category");

        category2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 47, 9)));

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(100, 100, 100));
        jLabel8.setText("Age");

        age2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 47, 9)));

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(100, 100, 100));
        jLabel9.setText("Lifespan");

        lifespan2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 47, 9)));

        jLabel10.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(100, 100, 100));
        jLabel10.setText("Price");

        price2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 47, 9)));

        jLabel11.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(100, 100, 100));
        jLabel11.setText("Quantity");

        quantity2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 47, 9)));

        jLabel12.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(100, 100, 100));
        jLabel12.setText("Nature");

        radioLoyal.setBackground(new java.awt.Color(255, 255, 255));
        radioButton2.add(radioLoyal);
        radioLoyal.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        radioLoyal.setForeground(new java.awt.Color(150, 150, 150));
        radioLoyal.setText("Loyal");

        radioAgg.setBackground(new java.awt.Color(255, 255, 255));
        radioButton2.add(radioAgg);
        radioAgg.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        radioAgg.setForeground(new java.awt.Color(150, 150, 150));
        radioAgg.setText("Aggressive");

        radioPas.setBackground(new java.awt.Color(255, 255, 255));
        radioButton2.add(radioPas);
        radioPas.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        radioPas.setForeground(new java.awt.Color(150, 150, 150));
        radioPas.setText("Passive");
        radioPas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioPasActionPerformed(evt);
            }
        });

        radioInq.setBackground(new java.awt.Color(255, 255, 255));
        radioButton2.add(radioInq);
        radioInq.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        radioInq.setForeground(new java.awt.Color(150, 150, 150));
        radioInq.setText("Inquisitive");

        jLabel13.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(100, 100, 100));
        jLabel13.setText("Size");

        checkBig.setBackground(new java.awt.Color(255, 255, 255));
        checkBox2.add(checkBig);
        checkBig.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        checkBig.setForeground(new java.awt.Color(150, 150, 150));
        checkBig.setText("Big");

        checkMed.setBackground(new java.awt.Color(255, 255, 255));
        checkBox2.add(checkMed);
        checkMed.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        checkMed.setForeground(new java.awt.Color(150, 150, 150));
        checkMed.setText("Medium");

        checkSmall.setBackground(new java.awt.Color(255, 255, 255));
        checkBox2.add(checkSmall);
        checkSmall.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        checkSmall.setForeground(new java.awt.Color(150, 150, 150));
        checkSmall.setText("Small");

        jLabel14.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(100, 100, 100));
        jLabel14.setText("Image");

        imageChoose.setBackground(new java.awt.Color(136, 164, 195));
        imageChoose.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        imageChoose.setForeground(new java.awt.Color(255, 255, 255));
        imageChoose.setText("choose image...");
        imageChoose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imageChooseActionPerformed(evt);
            }
        });

        update.setBackground(new java.awt.Color(247, 40, 95));
        update.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        update.setForeground(new java.awt.Color(255, 255, 255));
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(48, 56, 67));

        jLabel15.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("User can update their table any time they want");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addGap(128, 128, 128))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel10)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(logo)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(category2)
                            .addComponent(name2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(age2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addGap(18, 18, 18)
                                        .addComponent(quantity2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(18, 18, 18)
                                        .addComponent(lifespan2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(47, 47, 47))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(jLabel1))
                            .addComponent(price2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(imageChoose)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(checkBig)
                                .addGap(18, 18, 18)
                                .addComponent(checkMed)
                                .addGap(18, 18, 18)
                                .addComponent(checkSmall))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(radioLoyal)
                                    .addComponent(radioPas))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addComponent(radioAgg))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(radioInq))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(logo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(category2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(lifespan2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(age2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(price2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(quantity2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioLoyal)
                    .addComponent(radioAgg)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioPas)
                    .addComponent(radioInq))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkBig)
                    .addComponent(checkMed)
                    .addComponent(checkSmall)
                    .addComponent(jLabel13))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(imageChoose, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(551, 803));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

   
    /**
     * this checks the check box for the corresponding value of the elected row
     * @param size 
     */
    private void checkSize(String size) {
        
        switch(size) {
            case "Big":
                checkBig.setSelected(true);
                break;
                
            case "Medium":
                checkMed.setSelected(true);
                break;
                
            case "Small":
                checkSmall.setSelected(true);
                break;
        }
    }
    
    /**
     * this selects the corresponding radio button for the value of the selected row
     * @param nature
     * @return 
     */
    private boolean checkNature(String nature) {
        boolean check = false;
        
        switch(nature) {
            case "Loyal":
                radioLoyal.setSelected(true);
                check = true;
                break;
                
            case "Aggressive":
                radioAgg.setSelected(true);
                check = true;
                break;
                
            case "Passive":
                radioPas.setSelected(true);
                check = true;
                break;
                
            case "Inquisitive":
                radioInq.setSelected(true);
                check = true;
                break;
                
            default:
                check = false;
                break;
                
        }
        return check;
    }
    
    /**
     * this method makes sure the integer value for the price, quantity, age, lifespan is non fractional and non negative
     * @param id
     * @param price
     * @param quantity
     * @return 
     */
    private boolean checkForInt(String price, String quantity) {
        boolean flag ;
        int price_, quantity_, id_;
        try {
                price_ = Integer.parseInt(price);
                quantity_ = Integer.parseInt(quantity);

                if (price_ > 0 && quantity_ > 0) {
                    flag = true;
                } else {
                    flag = false;
                    JOptionPane.showMessageDialog (null,"Make sure the id, quantity and price are non-negative", "Error", JOptionPane.ERROR_MESSAGE);
                }
                
        } catch(InputMismatchException | NumberFormatException e) {
            JOptionPane.showMessageDialog (null,"Please input whole numbers only", "Error", JOptionPane.ERROR_MESSAGE);
            flag = false;
        }
        
        return flag;
    }


    /**
     * this method updates the table and the array for the all the changes the user has made in the update form
     * this method also checks for invalid inputs
     * 
     * @param evt 
     */
    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        MenuInfo obj = new MenuInfo();
        String name_, category_, age_, lifespan_, price_, quantity_, nature_, size_;
        
        int counter = 0;
        
        
        name_ = name2.getText();
        category_ = category2.getText();
        age_ = age2.getText();
        lifespan_ = lifespan2.getText();
        price_ = price2.getText();
        quantity_ = quantity2.getText();
        
        nature_ = radioSelection();
        
        
        size_ = checkSelection();
        
            if ("".equals(name_)){
                counter += 1;
                JOptionPane.showMessageDialog (null,"The name is empty", "Error", JOptionPane.ERROR_MESSAGE);
            }
                
            if ("".equals(category)){
                counter += 1;
                JOptionPane.showMessageDialog (null,"The category is empty", "Error", JOptionPane.ERROR_MESSAGE);
            }
             
            if ("".equals(age_)){
                counter += 1;
                JOptionPane.showMessageDialog (null,"The age is empty", "Error", JOptionPane.ERROR_MESSAGE);
            }
               
            if ("".equals(lifespan_)){
                counter += 1;
                JOptionPane.showMessageDialog (null,"The life span is empty", "Error", JOptionPane.ERROR_MESSAGE);
            }
              
            if ("".equals(quantity_)){
                counter += 1;
                JOptionPane.showMessageDialog (null,"The quantity is empty", "Error", JOptionPane.ERROR_MESSAGE);
            }
              
            if ("".equals(price_)){
                counter += 1;
                JOptionPane.showMessageDialog (null,"The price is empty", "Error", JOptionPane.ERROR_MESSAGE);
            }
             
            if ("".equals(nature_)){
                counter += 1;
                JOptionPane.showMessageDialog (null,"The nature is not selected", "Error", JOptionPane.ERROR_MESSAGE);
            }
           
            if ("".equals(size_)){
                counter += 1;
                JOptionPane.showMessageDialog (null,"The size has not been selected", "Error", JOptionPane.ERROR_MESSAGE);
            }
           
            
            if (counter == 0) {
                name_ = name_.substring(0,1).toUpperCase() + name_.substring(1).toLowerCase();
                category_ = category_.substring(0,1).toUpperCase() + category_.substring(1).toLowerCase();
                String newCat = category_;
                
                if (checkForInt(price, quantity)) {
                    
                    int noZero = Integer.parseInt(quantity_);
                    quantity = String.valueOf(noZero);
                    
                    noZero = Integer.parseInt(price_);
                    price_ = String.valueOf(noZero);
                    
                    for (int i = 0; i < MenuInfo.array.size(); i++) {
                        if (id.equals(MenuInfo.array.get(i).get(0))) {
                            
                            MenuInfo.array.get(i).set(1,name_);
                            MenuInfo.model.setValueAt(name_, rowIndex, 1);
                            
                            MenuInfo.array.get(i).set(2, category_);
                            MenuInfo.model.setValueAt(category_, rowIndex, 2);
                            
                            
                            MenuInfo.array.get(i).set(3, age_);
                            MenuInfo.model.setValueAt(age_, rowIndex, 3);
                            
                            MenuInfo.array.get(i).set(4, lifespan_);
                            MenuInfo.model.setValueAt(lifespan_, rowIndex, 4);
                            
                            MenuInfo.array.get(i).set(5, size_);
                            MenuInfo.model.setValueAt(size_, rowIndex, 5);
                            
                            MenuInfo.array.get(i).set(6, nature_);
                            MenuInfo.model.setValueAt(nature_, rowIndex, 6);
                            
                            MenuInfo.array.get(i).set(7, quantity_);
                            MenuInfo.model.setValueAt(quantity_, rowIndex, 7);
                            
                            MenuInfo.array.get(i).set(8, price_);
                            MenuInfo.model.setValueAt(price_, rowIndex, 8);
                            
                            MenuInfo.array.get(i).set(9,image);
                            
                            obj.checkCategory(category_);
                            JOptionPane.showMessageDialog (null,"The row has been updated. Please update to see the changes in the category.", "Success!", JOptionPane.INFORMATION_MESSAGE);
                            this.setVisible(false);

                            break;
                        }
                    }
                }
            }
        
       
    }//GEN-LAST:event_updateActionPerformed
    
    /**
     * this method opens the file selector for the user to add image for the new pet.
     * @param evt 
     */
    private void imageChooseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imageChooseActionPerformed
        try {
                JFileChooser file=new JFileChooser();
                file.showOpenDialog(null);
                file.setCurrentDirectory(new File(System.getProperty("user.home")));
                File f = file.getSelectedFile();
                image =f.getAbsolutePath();
               
                String extension = "";
                //checking if the file format is csv or not
                    int j = image.lastIndexOf('.');
                    if (j >= 0) {
                        extension = image.substring(j+1);
                        extension = extension.toLowerCase();
                    }
                if (extension.equals("png") || extension.equals("jpg") || extension.equals("jpeg")){
                    //Do nothing
                    //return the value
                }
                else {
                    JOptionPane.showMessageDialog (null,"Please select a proper image file. It should be either png, jpg or jpeg.", "Error", JOptionPane.ERROR_MESSAGE);
                    imageChooseActionPerformed(evt);
                }
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog (null,"No file selected.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_imageChooseActionPerformed

    private void radioPasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioPasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioPasActionPerformed
    
    /**
     * this method returns the selected radio button from the add form
     * @return 
     */
    private String radioSelection(){
        String nature ="";
        if (radioLoyal.isSelected()){
            nature = radioLoyal.getText();
            
        } else if (radioAgg.isSelected()) {
            nature = radioAgg.getText();
            
        } else if (radioPas.isSelected()) {
            nature = radioPas.getText();
            
        } else if(radioInq.isSelected()) {
            nature = radioInq.getText();
            
        }
        return nature;
    }
    
    /**
     * this method return the selected check box from the add form
     * @return 
     */
    private String checkSelection() {
        String size = "";
        
        if (checkBig.isSelected()){
            
            size = checkBig.getText();
            checkMed.setSelected(false);
            checkSmall.setSelected(false);
            
        } else if (checkMed.isSelected()) {
            
            size = checkMed.getText();
            checkBig.setSelected(false);
            checkSmall.setSelected(false);
            
        } else if (checkSmall.isSelected()) {
            
            size = checkSmall.getText();
            checkBig.setSelected(false);
            checkMed.setSelected(false);
        }    
        return size;  
    }
    
    public void setValue() {
        name2.setText(name);
        category2.setText(category);
        age2.setText(age);
        lifespan2.setText(lifespan);
        checkSize(size);
        checkNature(nature);
        quantity2.setText(quantity);
        price2.setText(price);
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
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              
                new Update().setVisible(true);
            }
        
        });
        
            
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField age2;
    private javax.swing.JTextField category2;
    private javax.swing.JCheckBox checkBig;
    private javax.swing.ButtonGroup checkBox2;
    private javax.swing.JCheckBox checkMed;
    private javax.swing.JCheckBox checkSmall;
    private javax.swing.JButton imageChoose;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField lifespan2;
    private javax.swing.JLabel logo;
    private javax.swing.JTextField name2;
    private javax.swing.JTextField price2;
    private javax.swing.JTextField quantity2;
    private javax.swing.JRadioButton radioAgg;
    private javax.swing.ButtonGroup radioButton2;
    private javax.swing.JRadioButton radioInq;
    private javax.swing.JRadioButton radioLoyal;
    private javax.swing.JRadioButton radioPas;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}

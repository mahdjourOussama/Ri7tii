
import java.awt.BorderLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class app extends javax.swing.JFrame {
    /**
     * Creates new form app
     */
    public app() {
        initComponents();

        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AddContainer = new javax.swing.JPanel();
        SellContainer = new javax.swing.JPanel();
        RechargeContainer = new javax.swing.JPanel();
        AddMenu = new javax.swing.JPanel();
        AddConfigButton = new javax.swing.JButton();
        AddBottelButton = new javax.swing.JButton();
        AddProductButton = new javax.swing.JButton();
        AddCompontButton = new javax.swing.JButton();
        SellMenu = new javax.swing.JPanel();
        SellOriginalButton = new javax.swing.JButton();
        SellCreatedButton = new javax.swing.JButton();
        RechargeMenu = new javax.swing.JPanel();
        RechargeBottelButton = new javax.swing.JButton();
        RechargeProductButton = new javax.swing.JButton();
        RechargeCompontButton = new javax.swing.JButton();
        AddConfigContainer = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        AddConfigList = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        AddConfigSelectedBottel = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        AddConfigTable = new javax.swing.JTable();
        AddConfigVolume = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        AddConfigPutButton = new javax.swing.JButton();
        AddConfigRemoveButton = new javax.swing.JButton();
        AddConfigAddButton = new javax.swing.JButton();
        AddConfigClearButton = new javax.swing.JButton();
        AddConfigUpdateButton = new javax.swing.JButton();
        RechargeBottelContainer = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        RecahrgeBottelCombobox = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        RechargeBottelQte = new javax.swing.JTextField();
        RechargeBottelRechargeButton = new javax.swing.JButton();
        RechargeBottelClearButton = new javax.swing.JButton();
        RechargeCompontContainer = new javax.swing.JPanel();
        RechargeCompontCombobox = new javax.swing.JComboBox<>();
        RechargeCompontStock = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        RechargeCompontClearButton = new javax.swing.JButton();
        RechargeCompontRechargeButton = new javax.swing.JButton();
        RechargeProductContainer = new javax.swing.JPanel();
        RechargeProductCombobox = new javax.swing.JComboBox<>();
        RechargeProductStock = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        RechargeProductClearButton = new javax.swing.JButton();
        RechargeProductRechargeButton = new javax.swing.JButton();
        SellOriginalContainer = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        SellOriginalCombobox = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        SellOriginalQte = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        SellOriginalPrix = new javax.swing.JTextField();
        SellOriginalSellButton = new javax.swing.JButton();
        SellOriginalClearButton = new javax.swing.JButton();
        SellCreatedContainer = new javax.swing.JPanel();
        SellCreatedClearButton = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        SellCreatedBottelCombobox = new javax.swing.JComboBox<>();
        SellCreatedQte = new javax.swing.JTextField();
        SellCreatedSellButton = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        SellCreatedPrix = new javax.swing.JTextField();
        SellCreatedExtraitCombobox = new javax.swing.JComboBox<>();
        Dialog_Bottel = new javax.swing.JDialog();
        DialogBottelContainer = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        AddBottelVolume = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        AddBottelBuyingPrice = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        AddBottelSellingPrice = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        AddBottelQte = new javax.swing.JTextField();
        AddBottelClearButton = new javax.swing.JButton();
        AddBottelAddButton = new javax.swing.JButton();
        addBottelContainer = new javax.swing.JPanel();
        BottelAddButton = new javax.swing.JButton();
        BottelModifieButton = new javax.swing.JButton();
        BottelDeleteButton = new javax.swing.JButton();
        BottelSearchBar = new javax.swing.JTextField();
        BottelSearchButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        BottelTable = new javax.swing.JTable();
        jLabel30 = new javax.swing.JLabel();
        ProductRestoreButton1 = new javax.swing.JButton();
        Dialog_Compont = new javax.swing.JDialog();
        DialogCompontContainer = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        AddCompontName = new javax.swing.JTextField();
        AddCompontBuyingPrice = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        AddCompontSellingPrice = new javax.swing.JTextField();
        AddCompontQte = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        AddCompontClearButton = new javax.swing.JButton();
        AddCompontAddButton = new javax.swing.JButton();
        ExtraitCheckbox = new javax.swing.JCheckBox();
        Dialog_Product = new javax.swing.JDialog();
        DialogProductContainer = new javax.swing.JPanel();
        AddProductAddButton = new javax.swing.JButton();
        AddProductQte = new javax.swing.JTextField();
        AddProductSellingPrice = new javax.swing.JTextField();
        AddProductBuyingPrice = new javax.swing.JTextField();
        AddProductName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        AddProductClearButton = new javax.swing.JButton();
        AddCompontContainer = new javax.swing.JPanel();
        CompontAddButton = new javax.swing.JButton();
        CompontModifieButton = new javax.swing.JButton();
        CompontDeleteButton = new javax.swing.JButton();
        CompontSearchBar = new javax.swing.JTextField();
        CompontSearchButton = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        CompontTable = new javax.swing.JTable();
        jLabel29 = new javax.swing.JLabel();
        ComponetRestoreButton = new javax.swing.JButton();
        AddProductContainer = new javax.swing.JPanel();
        PeoductAddButton = new javax.swing.JButton();
        ProductModifieButton = new javax.swing.JButton();
        ProductDeleteButton = new javax.swing.JButton();
        ProductSearchBar = new javax.swing.JTextField();
        ProductSearchButton = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        ProductTable = new javax.swing.JTable();
        jLabel28 = new javax.swing.JLabel();
        ProductRestoreButton = new javax.swing.JButton();
        DeletedProductDialog = new javax.swing.JDialog();
        DeletedProduct = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        DeletedProductTable = new javax.swing.JTable();
        DeletedProductSearchButton = new javax.swing.JButton();
        DeletedProductSearchBar = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        RestoreDeletedProductButton = new javax.swing.JButton();
        DeletedCompontDialog = new javax.swing.JDialog();
        DeletedCompont = new javax.swing.JPanel();
        RestoreDeletedCompontButton = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        DeletedCompontTable = new javax.swing.JTable();
        jLabel32 = new javax.swing.JLabel();
        DeletedCompontSearchBar = new javax.swing.JTextField();
        DeletedCompontSearchButton = new javax.swing.JButton();
        DeletedBottelDialog = new javax.swing.JDialog();
        DeletedBottel = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        DeletedBottelTable = new javax.swing.JTable();
        DeletedBottelSearchBar = new javax.swing.JTextField();
        DeletedBottelSearchButton = new javax.swing.JButton();
        RestoreDeletedBottelButton = new javax.swing.JButton();
        HomeMenu = new javax.swing.JPanel();
        AddButton = new javax.swing.JButton();
        SellButton = new javax.swing.JButton();
        RechargeButton = new javax.swing.JButton();
        SignIn_Dialog = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Container = new javax.swing.JPanel();
        logInContainer = new javax.swing.JPanel();
        UsernameTXT = new javax.swing.JTextField();
        PasswordTxT = new javax.swing.JTextField();
        SignIN = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        homeBackgroundImage = new javax.swing.JLabel();
        LogIN = new javax.swing.JButton();

        AddContainer.setLayout(new java.awt.BorderLayout(20, 20));

        SellContainer.setLayout(new java.awt.BorderLayout(20, 20));

        RechargeContainer.setLayout(new java.awt.BorderLayout(20, 20));

        AddMenu.setLayout(new java.awt.GridLayout(1, 0, 20, 20));

        AddConfigButton.setText("Config");
        AddConfigButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddConfigButtonActionPerformed(evt);
            }
        });
        AddMenu.add(AddConfigButton);

        AddBottelButton.setText("Bottel");
        AddBottelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBottelButtonActionPerformed(evt);
            }
        });
        AddMenu.add(AddBottelButton);

        AddProductButton.setText("Product");
        AddProductButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddProductButtonActionPerformed(evt);
            }
        });
        AddMenu.add(AddProductButton);

        AddCompontButton.setText("Componet");
        AddCompontButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddCompontButtonActionPerformed(evt);
            }
        });
        AddMenu.add(AddCompontButton);

        SellMenu.setLayout(new java.awt.GridLayout(1, 0, 20, 20));

        SellOriginalButton.setText("original");
        SellOriginalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SellOriginalButtonActionPerformed(evt);
            }
        });
        SellMenu.add(SellOriginalButton);

        SellCreatedButton.setText("created");
        SellCreatedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SellCreatedButtonActionPerformed(evt);
            }
        });
        SellMenu.add(SellCreatedButton);

        RechargeMenu.setLayout(new java.awt.GridLayout(1, 0, 20, 20));

        RechargeBottelButton.setText("Bottel");
        RechargeBottelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RechargeBottelButtonActionPerformed(evt);
            }
        });
        RechargeMenu.add(RechargeBottelButton);

        RechargeProductButton.setText("Product");
        RechargeProductButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RechargeProductButtonActionPerformed(evt);
            }
        });
        RechargeMenu.add(RechargeProductButton);

        RechargeCompontButton.setText("Compont");
        RechargeCompontButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RechargeCompontButtonActionPerformed(evt);
            }
        });
        RechargeMenu.add(RechargeCompontButton);

        AddConfigList.setModel(AddConfigListModel);
        jScrollPane1.setViewportView(AddConfigList);

        jLabel1.setText("Bottel");

        AddConfigSelectedBottel.setModel(BottelModel);

        AddConfigTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Compont", "Volume"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(AddConfigTable);

        AddConfigVolume.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                AddConfigVolumeKeyTyped(evt);
            }
        });

        jLabel2.setText("Volume");

        AddConfigPutButton.setText("|===>");
        AddConfigPutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddConfigPutButtonActionPerformed(evt);
            }
        });

        AddConfigRemoveButton.setText("<===|");
        AddConfigRemoveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddConfigRemoveButtonActionPerformed(evt);
            }
        });

        AddConfigAddButton.setText("Add");
        AddConfigAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddConfigAddButtonActionPerformed(evt);
            }
        });

        AddConfigClearButton.setText("Clear");
        AddConfigClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddConfigClearButtonActionPerformed(evt);
            }
        });

        AddConfigUpdateButton.setText("Update");

        javax.swing.GroupLayout AddConfigContainerLayout = new javax.swing.GroupLayout(AddConfigContainer);
        AddConfigContainer.setLayout(AddConfigContainerLayout);
        AddConfigContainerLayout.setHorizontalGroup(
            AddConfigContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddConfigContainerLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AddConfigSelectedBottel, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(AddConfigContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(AddConfigContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddConfigContainerLayout.createSequentialGroup()
                        .addGroup(AddConfigContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(AddConfigContainerLayout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(AddConfigVolume))
                            .addComponent(AddConfigRemoveButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AddConfigPutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18))
                    .addGroup(AddConfigContainerLayout.createSequentialGroup()
                        .addComponent(AddConfigClearButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 218, Short.MAX_VALUE)
                        .addComponent(AddConfigUpdateButton)
                        .addGap(18, 18, 18)
                        .addComponent(AddConfigAddButton)
                        .addGap(4, 4, 4)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        AddConfigContainerLayout.setVerticalGroup(
            AddConfigContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddConfigContainerLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(AddConfigContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(AddConfigSelectedBottel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AddConfigContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddConfigContainerLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(AddConfigPutButton)
                        .addGap(34, 34, 34)
                        .addGroup(AddConfigContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AddConfigVolume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(AddConfigRemoveButton)
                        .addGap(121, 121, 121)
                        .addGroup(AddConfigContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AddConfigAddButton)
                            .addComponent(AddConfigClearButton)
                            .addComponent(AddConfigUpdateButton)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        jLabel15.setText("Stock");

        RecahrgeBottelCombobox.setModel(BottelModel);

        jLabel16.setText("Bottel");

        RechargeBottelQte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RechargeBottelQteActionPerformed(evt);
            }
        });
        RechargeBottelQte.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                RechargeBottelQteKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                RechargeBottelQteKeyTyped(evt);
            }
        });

        RechargeBottelRechargeButton.setText("Recharge");
        RechargeBottelRechargeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RechargeBottelRechargeButtonActionPerformed(evt);
            }
        });

        RechargeBottelClearButton.setText("Clear");
        RechargeBottelClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RechargeBottelClearButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout RechargeBottelContainerLayout = new javax.swing.GroupLayout(RechargeBottelContainer);
        RechargeBottelContainer.setLayout(RechargeBottelContainerLayout);
        RechargeBottelContainerLayout.setHorizontalGroup(
            RechargeBottelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RechargeBottelContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(RechargeBottelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RechargeBottelContainerLayout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RecahrgeBottelCombobox, 0, 190, Short.MAX_VALUE))
                    .addGroup(RechargeBottelContainerLayout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RechargeBottelQte))
                    .addGroup(RechargeBottelContainerLayout.createSequentialGroup()
                        .addComponent(RechargeBottelClearButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(RechargeBottelRechargeButton)))
                .addContainerGap())
        );
        RechargeBottelContainerLayout.setVerticalGroup(
            RechargeBottelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RechargeBottelContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(RechargeBottelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(RecahrgeBottelCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(RechargeBottelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(RechargeBottelContainerLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(RechargeBottelContainerLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RechargeBottelQte)))
                .addGap(29, 29, 29)
                .addGroup(RechargeBottelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RechargeBottelClearButton)
                    .addComponent(RechargeBottelRechargeButton))
                .addContainerGap())
        );

        RechargeCompontCombobox.setModel(compontModel);

        RechargeCompontStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RechargeCompontStockActionPerformed(evt);
            }
        });
        RechargeCompontStock.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                RechargeCompontStockKeyTyped(evt);
            }
        });

        jLabel17.setText("Volume");

        jLabel18.setText("COmponet");

        RechargeCompontClearButton.setText("Clear");
        RechargeCompontClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RechargeCompontClearButtonActionPerformed(evt);
            }
        });

        RechargeCompontRechargeButton.setText("Recharge");
        RechargeCompontRechargeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RechargeCompontRechargeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout RechargeCompontContainerLayout = new javax.swing.GroupLayout(RechargeCompontContainer);
        RechargeCompontContainer.setLayout(RechargeCompontContainerLayout);
        RechargeCompontContainerLayout.setHorizontalGroup(
            RechargeCompontContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RechargeCompontContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(RechargeCompontContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RechargeCompontContainerLayout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RechargeCompontCombobox, 0, 146, Short.MAX_VALUE))
                    .addGroup(RechargeCompontContainerLayout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RechargeCompontStock))
                    .addGroup(RechargeCompontContainerLayout.createSequentialGroup()
                        .addComponent(RechargeCompontClearButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(RechargeCompontRechargeButton)))
                .addContainerGap())
        );
        RechargeCompontContainerLayout.setVerticalGroup(
            RechargeCompontContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RechargeCompontContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(RechargeCompontContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(RechargeCompontCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(RechargeCompontContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(RechargeCompontContainerLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(RechargeCompontContainerLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RechargeCompontStock)))
                .addGap(29, 29, 29)
                .addGroup(RechargeCompontContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RechargeCompontClearButton)
                    .addComponent(RechargeCompontRechargeButton))
                .addContainerGap())
        );

        RechargeProductCombobox.setModel(productModel);

        RechargeProductStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RechargeProductStockActionPerformed(evt);
            }
        });
        RechargeProductStock.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                RechargeProductStockKeyTyped(evt);
            }
        });

        jLabel19.setText("Qte Stock");

        jLabel20.setText("Product");

        RechargeProductClearButton.setText("Clear");
        RechargeProductClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RechargeProductClearButtonActionPerformed(evt);
            }
        });

        RechargeProductRechargeButton.setText("Recharge");
        RechargeProductRechargeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RechargeProductRechargeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout RechargeProductContainerLayout = new javax.swing.GroupLayout(RechargeProductContainer);
        RechargeProductContainer.setLayout(RechargeProductContainerLayout);
        RechargeProductContainerLayout.setHorizontalGroup(
            RechargeProductContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RechargeProductContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(RechargeProductContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RechargeProductContainerLayout.createSequentialGroup()
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RechargeProductCombobox, 0, 154, Short.MAX_VALUE))
                    .addGroup(RechargeProductContainerLayout.createSequentialGroup()
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RechargeProductStock))
                    .addGroup(RechargeProductContainerLayout.createSequentialGroup()
                        .addComponent(RechargeProductClearButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(RechargeProductRechargeButton)))
                .addContainerGap())
        );
        RechargeProductContainerLayout.setVerticalGroup(
            RechargeProductContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RechargeProductContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(RechargeProductContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(RechargeProductCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(RechargeProductContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(RechargeProductContainerLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(RechargeProductContainerLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RechargeProductStock)))
                .addGap(29, 29, 29)
                .addGroup(RechargeProductContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RechargeProductClearButton)
                    .addComponent(RechargeProductRechargeButton))
                .addContainerGap())
        );

        jLabel21.setText("Qte");

        SellOriginalCombobox.setModel(productModel);
        SellOriginalCombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SellOriginalComboboxActionPerformed(evt);
            }
        });

        jLabel22.setText("Product");

        SellOriginalQte.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                SellOriginalQteKeyTyped(evt);
            }
        });

        jLabel23.setText("Prix");

        SellOriginalPrix.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                SellOriginalPrixKeyTyped(evt);
            }
        });

        SellOriginalSellButton.setText("Sell");
        SellOriginalSellButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SellOriginalSellButtonActionPerformed(evt);
            }
        });

        SellOriginalClearButton.setText("Clear");
        SellOriginalClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SellOriginalClearButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SellOriginalContainerLayout = new javax.swing.GroupLayout(SellOriginalContainer);
        SellOriginalContainer.setLayout(SellOriginalContainerLayout);
        SellOriginalContainerLayout.setHorizontalGroup(
            SellOriginalContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SellOriginalContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SellOriginalContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SellOriginalContainerLayout.createSequentialGroup()
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SellOriginalCombobox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(SellOriginalContainerLayout.createSequentialGroup()
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SellOriginalQte))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SellOriginalContainerLayout.createSequentialGroup()
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SellOriginalPrix, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SellOriginalContainerLayout.createSequentialGroup()
                        .addComponent(SellOriginalClearButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SellOriginalSellButton)))
                .addContainerGap())
        );
        SellOriginalContainerLayout.setVerticalGroup(
            SellOriginalContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SellOriginalContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SellOriginalContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SellOriginalCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(SellOriginalContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SellOriginalQte, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(SellOriginalContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SellOriginalPrix, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(SellOriginalContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SellOriginalSellButton)
                    .addComponent(SellOriginalClearButton))
                .addContainerGap())
        );

        SellCreatedClearButton.setText("Clear");
        SellCreatedClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SellCreatedClearButtonActionPerformed(evt);
            }
        });

        jLabel24.setText("Qte");

        jLabel25.setText("Extrait");

        jLabel26.setText("Bottel");

        SellCreatedBottelCombobox.setModel(BottelModel);
        SellCreatedBottelCombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SellCreatedBottelComboboxActionPerformed(evt);
            }
        });

        SellCreatedQte.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                SellCreatedQteKeyTyped(evt);
            }
        });

        SellCreatedSellButton.setText("Sell");
        SellCreatedSellButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SellCreatedSellButtonActionPerformed(evt);
            }
        });

        jLabel27.setText("Prix");

        SellCreatedPrix.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                SellCreatedPrixKeyTyped(evt);
            }
        });

        SellCreatedExtraitCombobox.setModel(ExtraitModel);
        SellCreatedExtraitCombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SellCreatedExtraitComboboxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SellCreatedContainerLayout = new javax.swing.GroupLayout(SellCreatedContainer);
        SellCreatedContainer.setLayout(SellCreatedContainerLayout);
        SellCreatedContainerLayout.setHorizontalGroup(
            SellCreatedContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SellCreatedContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SellCreatedContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SellCreatedContainerLayout.createSequentialGroup()
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SellCreatedBottelCombobox, 0, 502, Short.MAX_VALUE))
                    .addGroup(SellCreatedContainerLayout.createSequentialGroup()
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SellCreatedExtraitCombobox, 0, 502, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SellCreatedContainerLayout.createSequentialGroup()
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SellCreatedQte))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SellCreatedContainerLayout.createSequentialGroup()
                        .addComponent(SellCreatedClearButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SellCreatedSellButton))
                    .addGroup(SellCreatedContainerLayout.createSequentialGroup()
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SellCreatedPrix)))
                .addContainerGap())
        );
        SellCreatedContainerLayout.setVerticalGroup(
            SellCreatedContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SellCreatedContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SellCreatedContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SellCreatedBottelCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(SellCreatedContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SellCreatedExtraitCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(SellCreatedContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SellCreatedQte, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(SellCreatedContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SellCreatedPrix, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(SellCreatedContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SellCreatedSellButton)
                    .addComponent(SellCreatedClearButton))
                .addContainerGap())
        );

        Dialog_Bottel.setMinimumSize(new java.awt.Dimension(700, 400));
        Dialog_Bottel.setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);
        Dialog_Bottel.setName("Add Bottels"); // NOI18N

        jLabel3.setText("Volume");

        AddBottelVolume.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                AddBottelVolumeKeyTyped(evt);
            }
        });

        jLabel4.setText("Buying Price");

        AddBottelBuyingPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                AddBottelBuyingPriceKeyTyped(evt);
            }
        });

        jLabel5.setText("Selling Price");

        AddBottelSellingPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                AddBottelSellingPriceKeyTyped(evt);
            }
        });

        jLabel6.setText("Quantite");

        AddBottelQte.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                AddBottelQteKeyTyped(evt);
            }
        });

        AddBottelClearButton.setText("Clear");
        AddBottelClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBottelClearButtonActionPerformed(evt);
            }
        });

        AddBottelAddButton.setText("Add");
        AddBottelAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBottelAddButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DialogBottelContainerLayout = new javax.swing.GroupLayout(DialogBottelContainer);
        DialogBottelContainer.setLayout(DialogBottelContainerLayout);
        DialogBottelContainerLayout.setHorizontalGroup(
            DialogBottelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DialogBottelContainerLayout.createSequentialGroup()
                .addGroup(DialogBottelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DialogBottelContainerLayout.createSequentialGroup()
                        .addComponent(AddBottelClearButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AddBottelAddButton))
                    .addGroup(DialogBottelContainerLayout.createSequentialGroup()
                        .addGroup(DialogBottelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(DialogBottelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AddBottelQte, javax.swing.GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE)
                            .addComponent(AddBottelSellingPrice)
                            .addComponent(AddBottelVolume)
                            .addComponent(AddBottelBuyingPrice))))
                .addContainerGap())
        );
        DialogBottelContainerLayout.setVerticalGroup(
            DialogBottelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DialogBottelContainerLayout.createSequentialGroup()
                .addGroup(DialogBottelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DialogBottelContainerLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DialogBottelContainerLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(AddBottelVolume, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(DialogBottelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddBottelBuyingPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(DialogBottelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddBottelSellingPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(DialogBottelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddBottelQte, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(DialogBottelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddBottelClearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddBottelAddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout Dialog_BottelLayout = new javax.swing.GroupLayout(Dialog_Bottel.getContentPane());
        Dialog_Bottel.getContentPane().setLayout(Dialog_BottelLayout);
        Dialog_BottelLayout.setHorizontalGroup(
            Dialog_BottelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(Dialog_BottelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Dialog_BottelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(DialogBottelContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        Dialog_BottelLayout.setVerticalGroup(
            Dialog_BottelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(Dialog_BottelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Dialog_BottelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(DialogBottelContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        BottelAddButton.setText("ADD");
        BottelAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BottelAddButtonActionPerformed(evt);
            }
        });

        BottelModifieButton.setText("Modify");
        BottelModifieButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BottelModifieButtonActionPerformed(evt);
            }
        });

        BottelDeleteButton.setText("Delete");
        BottelDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BottelDeleteButtonActionPerformed(evt);
            }
        });

        BottelSearchButton.setText("Search");
        BottelSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BottelSearchButtonActionPerformed(evt);
            }
        });

        jScrollPane3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        BottelTable.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BottelTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IDB", "Volume", "PrixAcha", "PrixVendu", "Stock"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(BottelTable);

        jLabel30.setText("Bottels");

        ProductRestoreButton1.setText("Restore");
        ProductRestoreButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductRestoreButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addBottelContainerLayout = new javax.swing.GroupLayout(addBottelContainer);
        addBottelContainer.setLayout(addBottelContainerLayout);
        addBottelContainerLayout.setHorizontalGroup(
            addBottelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addBottelContainerLayout.createSequentialGroup()
                .addGroup(addBottelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BottelModifieButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BottelAddButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ProductRestoreButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BottelDeleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(addBottelContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BottelSearchBar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BottelSearchButton)
                .addGap(12, 12, 12))
        );
        addBottelContainerLayout.setVerticalGroup(
            addBottelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addBottelContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addBottelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BottelSearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BottelSearchButton)
                    .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(addBottelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addBottelContainerLayout.createSequentialGroup()
                        .addComponent(BottelAddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BottelModifieButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ProductRestoreButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                        .addComponent(BottelDeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        Dialog_Compont.setMinimumSize(new java.awt.Dimension(700, 400));
        Dialog_Compont.setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);

        jLabel11.setText("Name");

        AddCompontBuyingPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddCompontBuyingPriceActionPerformed(evt);
            }
        });
        AddCompontBuyingPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                AddCompontBuyingPriceKeyTyped(evt);
            }
        });

        jLabel12.setText("Buying Price");

        jLabel13.setText("Selling Price");

        AddCompontSellingPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                AddCompontSellingPriceKeyTyped(evt);
            }
        });

        AddCompontQte.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                AddCompontQteKeyTyped(evt);
            }
        });

        jLabel14.setText("Quantite");

        AddCompontClearButton.setText("Clear");
        AddCompontClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddCompontClearButtonActionPerformed(evt);
            }
        });

        AddCompontAddButton.setText("Add");
        AddCompontAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddCompontAddButtonActionPerformed(evt);
            }
        });

        ExtraitCheckbox.setText("Extrait");

        javax.swing.GroupLayout DialogCompontContainerLayout = new javax.swing.GroupLayout(DialogCompontContainer);
        DialogCompontContainer.setLayout(DialogCompontContainerLayout);
        DialogCompontContainerLayout.setHorizontalGroup(
            DialogCompontContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DialogCompontContainerLayout.createSequentialGroup()
                .addGroup(DialogCompontContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DialogCompontContainerLayout.createSequentialGroup()
                        .addComponent(AddCompontClearButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AddCompontAddButton))
                    .addGroup(DialogCompontContainerLayout.createSequentialGroup()
                        .addGroup(DialogCompontContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(DialogCompontContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AddCompontQte)
                            .addComponent(AddCompontSellingPrice)
                            .addComponent(AddCompontBuyingPrice)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DialogCompontContainerLayout.createSequentialGroup()
                                .addComponent(ExtraitCheckbox)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(AddCompontName, javax.swing.GroupLayout.DEFAULT_SIZE, 589, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        DialogCompontContainerLayout.setVerticalGroup(
            DialogCompontContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DialogCompontContainerLayout.createSequentialGroup()
                .addGroup(DialogCompontContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DialogCompontContainerLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(DialogCompontContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ExtraitCheckbox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DialogCompontContainerLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(AddCompontName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(DialogCompontContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddCompontBuyingPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(DialogCompontContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddCompontSellingPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(DialogCompontContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddCompontQte, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(DialogCompontContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddCompontClearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddCompontAddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout Dialog_CompontLayout = new javax.swing.GroupLayout(Dialog_Compont.getContentPane());
        Dialog_Compont.getContentPane().setLayout(Dialog_CompontLayout);
        Dialog_CompontLayout.setHorizontalGroup(
            Dialog_CompontLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 776, Short.MAX_VALUE)
            .addGroup(Dialog_CompontLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(DialogCompontContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Dialog_CompontLayout.setVerticalGroup(
            Dialog_CompontLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 301, Short.MAX_VALUE)
            .addGroup(Dialog_CompontLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(DialogCompontContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Dialog_Product.setMinimumSize(new java.awt.Dimension(700, 400));
        Dialog_Product.setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);

        AddProductAddButton.setText("Add");
        AddProductAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddProductAddButtonActionPerformed(evt);
            }
        });

        AddProductQte.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                AddProductQteKeyTyped(evt);
            }
        });

        AddProductSellingPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                AddProductSellingPriceKeyTyped(evt);
            }
        });

        AddProductBuyingPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                AddProductBuyingPriceKeyTyped(evt);
            }
        });

        jLabel7.setText("Name");

        jLabel8.setText("Buying Price");

        jLabel9.setText("Selling Price");

        jLabel10.setText("Quantite");

        AddProductClearButton.setText("Clear");
        AddProductClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddProductClearButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DialogProductContainerLayout = new javax.swing.GroupLayout(DialogProductContainer);
        DialogProductContainer.setLayout(DialogProductContainerLayout);
        DialogProductContainerLayout.setHorizontalGroup(
            DialogProductContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DialogProductContainerLayout.createSequentialGroup()
                .addGroup(DialogProductContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DialogProductContainerLayout.createSequentialGroup()
                        .addComponent(AddProductClearButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AddProductAddButton))
                    .addGroup(DialogProductContainerLayout.createSequentialGroup()
                        .addGroup(DialogProductContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(DialogProductContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AddProductQte, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                            .addComponent(AddProductSellingPrice)
                            .addComponent(AddProductName)
                            .addComponent(AddProductBuyingPrice))))
                .addContainerGap())
        );
        DialogProductContainerLayout.setVerticalGroup(
            DialogProductContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DialogProductContainerLayout.createSequentialGroup()
                .addGroup(DialogProductContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DialogProductContainerLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DialogProductContainerLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(AddProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(DialogProductContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddProductBuyingPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(DialogProductContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddProductSellingPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(DialogProductContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddProductQte, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(DialogProductContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddProductClearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddProductAddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout Dialog_ProductLayout = new javax.swing.GroupLayout(Dialog_Product.getContentPane());
        Dialog_Product.getContentPane().setLayout(Dialog_ProductLayout);
        Dialog_ProductLayout.setHorizontalGroup(
            Dialog_ProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 352, Short.MAX_VALUE)
            .addGroup(Dialog_ProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(DialogProductContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Dialog_ProductLayout.setVerticalGroup(
            Dialog_ProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(Dialog_ProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(DialogProductContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        CompontAddButton.setText("ADD");
        CompontAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CompontAddButtonActionPerformed(evt);
            }
        });

        CompontModifieButton.setText("Modify");
        CompontModifieButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CompontModifieButtonActionPerformed(evt);
            }
        });

        CompontDeleteButton.setText("Delete");
        CompontDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CompontDeleteButtonActionPerformed(evt);
            }
        });

        CompontSearchButton.setText("Search");
        CompontSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CompontSearchButtonActionPerformed(evt);
            }
        });

        jScrollPane5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        CompontTable.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CompontTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IDSP", "Name", "PrixAcha", "PrixVendu", "Stock", "Extrait"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(CompontTable);

        jLabel29.setText("COmponts");

        ComponetRestoreButton.setText("Restore");
        ComponetRestoreButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComponetRestoreButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AddCompontContainerLayout = new javax.swing.GroupLayout(AddCompontContainer);
        AddCompontContainer.setLayout(AddCompontContainerLayout);
        AddCompontContainerLayout.setHorizontalGroup(
            AddCompontContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddCompontContainerLayout.createSequentialGroup()
                .addGroup(AddCompontContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ComponetRestoreButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CompontDeleteButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CompontModifieButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CompontAddButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(AddCompontContainerLayout.createSequentialGroup()
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CompontSearchBar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CompontSearchButton)
                .addGap(12, 12, 12))
        );
        AddCompontContainerLayout.setVerticalGroup(
            AddCompontContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddCompontContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AddCompontContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(AddCompontContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CompontSearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(CompontSearchButton))
                    .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AddCompontContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddCompontContainerLayout.createSequentialGroup()
                        .addComponent(CompontAddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(CompontModifieButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ComponetRestoreButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                        .addComponent(CompontDeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        PeoductAddButton.setText("ADD");
        PeoductAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PeoductAddButtonActionPerformed(evt);
            }
        });

        ProductModifieButton.setText("Modify");
        ProductModifieButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductModifieButtonActionPerformed(evt);
            }
        });

        ProductDeleteButton.setText("Delete");
        ProductDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductDeleteButtonActionPerformed(evt);
            }
        });

        ProductSearchButton.setText("Search");
        ProductSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductSearchButtonActionPerformed(evt);
            }
        });

        jScrollPane4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        ProductTable.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ProductTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IDP", "Name", "PrixAcha", "PrixVendu", "Stock"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(ProductTable);

        jLabel28.setText("Products");

        ProductRestoreButton.setText("Restore");
        ProductRestoreButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductRestoreButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AddProductContainerLayout = new javax.swing.GroupLayout(AddProductContainer);
        AddProductContainer.setLayout(AddProductContainerLayout);
        AddProductContainerLayout.setHorizontalGroup(
            AddProductContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddProductContainerLayout.createSequentialGroup()
                .addGroup(AddProductContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(PeoductAddButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ProductModifieButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ProductRestoreButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ProductDeleteButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(AddProductContainerLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AddProductContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddProductContainerLayout.createSequentialGroup()
                        .addComponent(ProductSearchBar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ProductSearchButton))
                    .addComponent(jScrollPane4))
                .addContainerGap())
        );
        AddProductContainerLayout.setVerticalGroup(
            AddProductContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddProductContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AddProductContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ProductSearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ProductSearchButton)
                    .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(AddProductContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddProductContainerLayout.createSequentialGroup()
                        .addComponent(PeoductAddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ProductModifieButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ProductRestoreButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addComponent(ProductDeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        DeletedProductDialog.setTitle("Deleted Products");
        DeletedProductDialog.setMinimumSize(new java.awt.Dimension(800, 400));
        DeletedProductDialog.setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);

        jScrollPane6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        DeletedProductTable.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        DeletedProductTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IDP", "Name", "PrixAcha", "PrixVendu", "Stock"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(DeletedProductTable);

        DeletedProductSearchButton.setText("Search");
        DeletedProductSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletedProductSearchButtonActionPerformed(evt);
            }
        });

        jLabel31.setText("Products");

        RestoreDeletedProductButton.setText("Restore");
        RestoreDeletedProductButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestoreDeletedProductButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DeletedProductLayout = new javax.swing.GroupLayout(DeletedProduct);
        DeletedProduct.setLayout(DeletedProductLayout);
        DeletedProductLayout.setHorizontalGroup(
            DeletedProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DeletedProductLayout.createSequentialGroup()
                .addComponent(RestoreDeletedProductButton)
                .addGap(0, 656, Short.MAX_VALUE))
            .addGroup(DeletedProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(DeletedProductLayout.createSequentialGroup()
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(DeletedProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(DeletedProductLayout.createSequentialGroup()
                            .addComponent(DeletedProductSearchBar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(DeletedProductSearchButton)
                            .addGap(2, 2, 2))
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 628, Short.MAX_VALUE))
                    .addContainerGap()))
        );
        DeletedProductLayout.setVerticalGroup(
            DeletedProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DeletedProductLayout.createSequentialGroup()
                .addContainerGap(293, Short.MAX_VALUE)
                .addComponent(RestoreDeletedProductButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(DeletedProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(DeletedProductLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(DeletedProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(DeletedProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DeletedProductSearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DeletedProductSearchButton))
                        .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(18, 18, 18)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout DeletedProductDialogLayout = new javax.swing.GroupLayout(DeletedProductDialog.getContentPane());
        DeletedProductDialog.getContentPane().setLayout(DeletedProductDialogLayout);
        DeletedProductDialogLayout.setHorizontalGroup(
            DeletedProductDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 727, Short.MAX_VALUE)
            .addGroup(DeletedProductDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(DeletedProductDialogLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(DeletedProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        DeletedProductDialogLayout.setVerticalGroup(
            DeletedProductDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 344, Short.MAX_VALUE)
            .addGroup(DeletedProductDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(DeletedProductDialogLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(DeletedProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        DeletedCompontDialog.setTitle("Deleted Componts");
        DeletedCompontDialog.setMinimumSize(new java.awt.Dimension(800, 400));
        DeletedCompontDialog.setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);

        RestoreDeletedCompontButton.setText("Restore");
        RestoreDeletedCompontButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestoreDeletedCompontButtonActionPerformed(evt);
            }
        });

        jScrollPane7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        DeletedCompontTable.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        DeletedCompontTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IDSP", "Name", "PrixAcha", "PrixVendu", "Stock", "Extrait"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane7.setViewportView(DeletedCompontTable);

        jLabel32.setText("COmponts");

        DeletedCompontSearchButton.setText("Search");
        DeletedCompontSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletedCompontSearchButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DeletedCompontLayout = new javax.swing.GroupLayout(DeletedCompont);
        DeletedCompont.setLayout(DeletedCompontLayout);
        DeletedCompontLayout.setHorizontalGroup(
            DeletedCompontLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DeletedCompontLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DeletedCompontLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(DeletedCompontLayout.createSequentialGroup()
                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(DeletedCompontSearchBar, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DeletedCompontSearchButton))
                    .addGroup(DeletedCompontLayout.createSequentialGroup()
                        .addComponent(RestoreDeletedCompontButton)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        DeletedCompontLayout.setVerticalGroup(
            DeletedCompontLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DeletedCompontLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DeletedCompontLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(DeletedCompontLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(DeletedCompontLayout.createSequentialGroup()
                            .addGap(2, 2, 2)
                            .addComponent(DeletedCompontSearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(DeletedCompontLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DeletedCompontSearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DeletedCompontLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DeletedCompontLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 243, Short.MAX_VALUE)
                        .addComponent(RestoreDeletedCompontButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout DeletedCompontDialogLayout = new javax.swing.GroupLayout(DeletedCompontDialog.getContentPane());
        DeletedCompontDialog.getContentPane().setLayout(DeletedCompontDialogLayout);
        DeletedCompontDialogLayout.setHorizontalGroup(
            DeletedCompontDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 502, Short.MAX_VALUE)
            .addGroup(DeletedCompontDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(DeletedCompont, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        DeletedCompontDialogLayout.setVerticalGroup(
            DeletedCompontDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 344, Short.MAX_VALUE)
            .addGroup(DeletedCompontDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(DeletedCompont, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        DeletedBottelDialog.setTitle("Deleted Bottels");
        DeletedBottelDialog.setMinimumSize(new java.awt.Dimension(800, 400));
        DeletedBottelDialog.setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);

        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("Bottels");
        jLabel33.setToolTipText("");
        jLabel33.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jScrollPane8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        DeletedBottelTable.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        DeletedBottelTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IDB", "Volume", "PrixAcha", "PrixVendu", "Stock"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane8.setViewportView(DeletedBottelTable);

        DeletedBottelSearchButton.setText("Search");
        DeletedBottelSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletedBottelSearchButtonActionPerformed(evt);
            }
        });

        RestoreDeletedBottelButton.setText("Restore");
        RestoreDeletedBottelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestoreDeletedBottelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DeletedBottelLayout = new javax.swing.GroupLayout(DeletedBottel);
        DeletedBottel.setLayout(DeletedBottelLayout);
        DeletedBottelLayout.setHorizontalGroup(
            DeletedBottelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DeletedBottelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DeletedBottelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RestoreDeletedBottelButton)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(618, Short.MAX_VALUE))
            .addGroup(DeletedBottelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(DeletedBottelLayout.createSequentialGroup()
                    .addGap(94, 94, 94)
                    .addGroup(DeletedBottelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(DeletedBottelLayout.createSequentialGroup()
                            .addComponent(DeletedBottelSearchBar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(DeletedBottelSearchButton))
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 729, Short.MAX_VALUE))
                    .addGap(5, 5, 5)))
        );
        DeletedBottelLayout.setVerticalGroup(
            DeletedBottelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DeletedBottelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 272, Short.MAX_VALUE)
                .addComponent(RestoreDeletedBottelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(DeletedBottelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(DeletedBottelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(DeletedBottelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(DeletedBottelSearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(DeletedBottelSearchButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout DeletedBottelDialogLayout = new javax.swing.GroupLayout(DeletedBottelDialog.getContentPane());
        DeletedBottelDialog.getContentPane().setLayout(DeletedBottelDialogLayout);
        DeletedBottelDialogLayout.setHorizontalGroup(
            DeletedBottelDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DeletedBottel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        DeletedBottelDialogLayout.setVerticalGroup(
            DeletedBottelDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DeletedBottel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        HomeMenu.setMinimumSize(new java.awt.Dimension(130, 400));
        HomeMenu.setPreferredSize(new java.awt.Dimension(100, 400));
        HomeMenu.setLayout(new java.awt.GridLayout(3, 0, 244, 100));

        AddButton.setText("ADD New Items");
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });
        HomeMenu.add(AddButton);

        SellButton.setText("Sell");
        SellButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SellButtonActionPerformed(evt);
            }
        });
        HomeMenu.add(SellButton);

        RechargeButton.setText("Recharge Stock");
        RechargeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RechargeButtonActionPerformed(evt);
            }
        });
        HomeMenu.add(RechargeButton);

        SignIn_Dialog.setMinimumSize(new java.awt.Dimension(500, 250));
        SignIn_Dialog.setPreferredSize(new java.awt.Dimension(500, 250));

        jPanel1.setPreferredSize(new java.awt.Dimension(500, 200));

        jTextField1.setText("jTextField1");

        jLabel36.setText("jLabel36");

        jLabel37.setText("jLabel36");

        jTextField2.setText("jTextField1");

        jLabel38.setText("jLabel36");

        jTextField3.setText("jTextField1");

        jButton1.setText("jButton1");

        jButton2.setText("jButton1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField3)
                            .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout SignIn_DialogLayout = new javax.swing.GroupLayout(SignIn_Dialog.getContentPane());
        SignIn_Dialog.getContentPane().setLayout(SignIn_DialogLayout);
        SignIn_DialogLayout.setHorizontalGroup(
            SignIn_DialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        SignIn_DialogLayout.setVerticalGroup(
            SignIn_DialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ri7ti APP");
        setPreferredSize(new java.awt.Dimension(1000, 500));

        Container.setLayout(new java.awt.BorderLayout(20, 20));

        SignIN.setText("Sign IN");
        SignIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignINActionPerformed(evt);
            }
        });

        jLabel34.setText("Username");

        jLabel35.setText("Password");

        LogIN.setText("Log IN");
        LogIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogINActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout logInContainerLayout = new javax.swing.GroupLayout(logInContainer);
        logInContainer.setLayout(logInContainerLayout);
        logInContainerLayout.setHorizontalGroup(
            logInContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logInContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(logInContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, logInContainerLayout.createSequentialGroup()
                        .addComponent(SignIN, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(logInContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(homeBackgroundImage, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, logInContainerLayout.createSequentialGroup()
                                .addComponent(LogIN, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addGroup(logInContainerLayout.createSequentialGroup()
                        .addGroup(logInContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(logInContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(UsernameTXT, javax.swing.GroupLayout.DEFAULT_SIZE, 892, Short.MAX_VALUE)
                            .addComponent(PasswordTxT))
                        .addContainerGap())))
        );
        logInContainerLayout.setVerticalGroup(
            logInContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logInContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(logInContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UsernameTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(logInContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PasswordTxT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(logInContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(logInContainerLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(homeBackgroundImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, logInContainerLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(logInContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SignIN)
                            .addComponent(LogIN))
                        .addContainerGap())))
        );

        Container.add(logInContainer, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Container, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RechargeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RechargeButtonActionPerformed
       Container.removeAll();
       Container.add(HomeMenu,BorderLayout.WEST);
       Container.add(RechargeContainer,BorderLayout.CENTER);
       RechargeContainer.removeAll();
       RechargeContainer.add(RechargeMenu,BorderLayout.NORTH);
       RechargeContainer.repaint();
       RechargeContainer.revalidate();
       Container.repaint();
       Container.revalidate();
       
    }//GEN-LAST:event_RechargeButtonActionPerformed

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
       Container.removeAll();
       Container.add(HomeMenu,BorderLayout.WEST);
       Container.add(AddContainer,BorderLayout.CENTER);
       AddContainer.removeAll();
       AddContainer.add(AddMenu,BorderLayout.NORTH);
       AddContainer.repaint();
       AddContainer.revalidate();
       Container.repaint();
       Container.revalidate();
    }//GEN-LAST:event_AddButtonActionPerformed

    private void SellButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SellButtonActionPerformed
       Container.removeAll();
       Container.add(HomeMenu,BorderLayout.WEST);
       Container.add(SellContainer,BorderLayout.CENTER);
       SellContainer.removeAll();
       SellContainer.add(SellMenu,BorderLayout.NORTH);
       SellContainer.repaint();
       SellContainer.revalidate();
       Container.repaint();
       Container.revalidate();
    }//GEN-LAST:event_SellButtonActionPerformed

    private void AddConfigButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddConfigButtonActionPerformed
       AddContainer.removeAll();
       AddContainer.add(AddMenu,BorderLayout.NORTH);
       AddContainer.add(AddConfigContainer,BorderLayout.CENTER);
       AddContainer.repaint();
       AddContainer.revalidate();
       AddConfigVolume.setText("");
       sqli.fillComboBox(AddConfigSelectedBottel,"bottel","Volume");
       sqli.fillList(AddConfigListModel, "sousproduit","Name");
    }//GEN-LAST:event_AddConfigButtonActionPerformed

    private void AddBottelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBottelButtonActionPerformed

        
    sqli.fillBottelTable(BottelTable,"1");


       AddContainer.removeAll();
       AddContainer.add(AddMenu,BorderLayout.NORTH);
       
       AddContainer.add(addBottelContainer,BorderLayout.CENTER);
       AddContainer.repaint();
       AddContainer.revalidate();
    }//GEN-LAST:event_AddBottelButtonActionPerformed

    private void AddProductButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddProductButtonActionPerformed
     sqli.fillProductTable(ProductTable,"1");
        AddContainer.removeAll();
       AddContainer.add(AddMenu,BorderLayout.NORTH);
       AddContainer.add(AddProductContainer,BorderLayout.CENTER);
       AddContainer.repaint();
       AddContainer.revalidate();
           }//GEN-LAST:event_AddProductButtonActionPerformed

    private void AddCompontButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddCompontButtonActionPerformed
        sqli.fillCompontTable(CompontTable,"1");
        AddContainer.removeAll();
       AddContainer.add(AddMenu,BorderLayout.NORTH);
       AddContainer.add(AddCompontContainer,BorderLayout.CENTER);
       AddContainer.repaint();
       AddContainer.revalidate();
    }//GEN-LAST:event_AddCompontButtonActionPerformed

    private void RechargeBottelQteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RechargeBottelQteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RechargeBottelQteActionPerformed

    private void RechargeCompontStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RechargeCompontStockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RechargeCompontStockActionPerformed

    private void RechargeProductStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RechargeProductStockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RechargeProductStockActionPerformed

    private void RechargeBottelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RechargeBottelButtonActionPerformed
       RechargeContainer.removeAll();
       RechargeContainer.add(RechargeMenu,BorderLayout.NORTH);
       RechargeContainer.add(RechargeBottelContainer,BorderLayout.CENTER);
       BottelModel.removeAllElements();
       sqli.fillComboBox(RecahrgeBottelCombobox,"bottel","volume");
       RechargeBottelQte.setText("");
       RechargeContainer.repaint();
       RechargeContainer.revalidate();
    }//GEN-LAST:event_RechargeBottelButtonActionPerformed

    private void RechargeProductButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RechargeProductButtonActionPerformed
       RechargeContainer.removeAll();
       RechargeContainer.add(RechargeMenu,BorderLayout.NORTH);
       RechargeContainer.add(RechargeProductContainer,BorderLayout.CENTER);
       productModel.removeAllElements();
        sqli.fillComboBox(RechargeProductCombobox,"produit","name");
       RechargeContainer.repaint();
       RechargeContainer.revalidate();
       RechargeProductStock.setText("");
    }//GEN-LAST:event_RechargeProductButtonActionPerformed

    private void RechargeCompontButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RechargeCompontButtonActionPerformed
       RechargeContainer.removeAll();
       RechargeContainer.add(RechargeMenu,BorderLayout.NORTH);
       RechargeContainer.add(RechargeCompontContainer,BorderLayout.CENTER);
       compontModel.removeAllElements();
       sqli.fillComboBox(RechargeCompontCombobox,"sousproduit","Name");
       RechargeContainer.repaint();
       RechargeContainer.revalidate();
       RechargeCompontStock.setText("");
    }//GEN-LAST:event_RechargeCompontButtonActionPerformed

    private void SellOriginalComboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SellOriginalComboboxActionPerformed

    }//GEN-LAST:event_SellOriginalComboboxActionPerformed

    private void SellOriginalClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SellOriginalClearButtonActionPerformed
        SellOriginalQte.setText("");
        SellOriginalPrix.setText("");
        productModel.removeAllElements();
        sqli.fillComboBox(SellOriginalCombobox,"produit","name");
    }//GEN-LAST:event_SellOriginalClearButtonActionPerformed

    private void SellCreatedClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SellCreatedClearButtonActionPerformed
        SellCreatedPrix.setText("");
        SellCreatedQte.setText("");
        ExtraitModel.removeAllElements();
        BottelModel.removeAllElements();
        sqli.fillComboBoxWithConditon(SellCreatedExtraitCombobox,"sousproduit","name", "extrait=1 ");
        sqli.fillComboBox(SellCreatedBottelCombobox,"bottel","Volume"); 
    }//GEN-LAST:event_SellCreatedClearButtonActionPerformed

    private void SellCreatedBottelComboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SellCreatedBottelComboboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SellCreatedBottelComboboxActionPerformed

    private void SellCreatedExtraitComboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SellCreatedExtraitComboboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SellCreatedExtraitComboboxActionPerformed

    private void SellOriginalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SellOriginalButtonActionPerformed
       SellContainer.removeAll();
       SellContainer.add(SellMenu,BorderLayout.NORTH);
       SellContainer.add(SellOriginalContainer,BorderLayout.CENTER);
        sqli.fillComboBox(SellOriginalCombobox,"produit","name");
       SellContainer.repaint();
       SellContainer.revalidate();
       SellOriginalQte.setText("");
       SellOriginalPrix.setText("");
    }//GEN-LAST:event_SellOriginalButtonActionPerformed

    private void SellCreatedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SellCreatedButtonActionPerformed
       SellContainer.removeAll();
       SellContainer.add(SellMenu,BorderLayout.NORTH);
       SellContainer.add(SellCreatedContainer,BorderLayout.CENTER);
       SellContainer.repaint();
       SellContainer.revalidate();
       sqli.fillComboBoxWithConditon(SellCreatedExtraitCombobox,"sousproduit","name", "extrait=1 ");
        sqli.fillComboBox(SellCreatedBottelCombobox,"bottel","Volume"); 
        SellCreatedQte.setText("");
        SellCreatedPrix.setText("");
    }//GEN-LAST:event_SellCreatedButtonActionPerformed

    private void AddConfigPutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddConfigPutButtonActionPerformed
        DefaultTableModel AddConfigTableModel=(DefaultTableModel) AddConfigTable.getModel();
        int index=-1;
        String selectedElement="",VolumeAdded="";
        try {
            VolumeAdded=AddConfigVolume.getText();
            index=AddConfigList.getSelectedIndex();
            selectedElement=AddConfigList.getSelectedValue().toString();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        if (index==-1||VolumeAdded.equals("")) {
            JOptionPane.showMessageDialog(null, "Error you have selected  "+selectedElement+" and added to it "+VolumeAdded);
        }else {
            AddConfigTableModel.addRow(new Object[]{selectedElement,VolumeAdded});
            AddConfigTable.setModel(AddConfigTableModel);
            AddConfigListModel.removeElementAt(index);
            AddConfigVolume.setText("");
        }
    }//GEN-LAST:event_AddConfigPutButtonActionPerformed

    private void AddConfigRemoveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddConfigRemoveButtonActionPerformed
        DefaultTableModel AddConfigTableModel=(DefaultTableModel) AddConfigTable.getModel();
        String selectedElement="";
        int selectedRow=-1;
        try {
            selectedRow=AddConfigTable.getSelectedRow();
            selectedElement=AddConfigTableModel.getValueAt(selectedRow, 0).toString();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        if (selectedElement.equals("")) {
            JOptionPane.showMessageDialog(null, "error");
        } else{
            AddConfigVolume.setText("");
            AddConfigTableModel.removeRow(selectedRow);
            AddConfigListModel.addElement(selectedElement);
            AddConfigTable.setModel(AddConfigTableModel);
        }
    }//GEN-LAST:event_AddConfigRemoveButtonActionPerformed

    private void AddConfigClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddConfigClearButtonActionPerformed
        DefaultTableModel AddConfigTableModel=(DefaultTableModel) AddConfigTable.getModel();
        for (int i = 0; i < AddConfigTableModel.getRowCount();i ++) {
            AddConfigTableModel.removeRow(i);
        }
        AddConfigListModel.removeAllElements();
        
        sqli.fillList(AddConfigListModel, "sousproduit","Name");
        BottelModel.removeAllElements();
        sqli.fillComboBox(AddConfigSelectedBottel,"bottel","Volume");
        
    }//GEN-LAST:event_AddConfigClearButtonActionPerformed

    private void AddBottelAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBottelAddButtonActionPerformed
        String bottelVolume=AddBottelVolume.getText(),
               bottelPA=AddBottelBuyingPrice.getText(),
               bottelPV=AddBottelSellingPrice.getText(),
               bottelQte=AddBottelQte.getText();   
        if (bottelModifie) {
            sqli.UpdateBottel(bottelVolume, bottelQte, bottelPA, bottelPV,IDBselected);
        }else{      
        sqli.insertToBottel(bottelVolume, bottelQte, bottelPA, bottelPV);
            }
        AddBottelVolume.setText("");
        AddBottelBuyingPrice.setText("");
        AddBottelSellingPrice.setText("");
        AddBottelQte.setText(""); 
        sqli.fillBottelTable(BottelTable,"1");
    }//GEN-LAST:event_AddBottelAddButtonActionPerformed

    private void AddBottelClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBottelClearButtonActionPerformed
        AddBottelVolume.setText("");
        AddBottelBuyingPrice.setText("");
        AddBottelSellingPrice.setText("");
        AddBottelQte.setText("");        
    }//GEN-LAST:event_AddBottelClearButtonActionPerformed

    private void AddProductClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddProductClearButtonActionPerformed
        AddProductName.setText("");
        AddProductBuyingPrice.setText("");
        AddProductSellingPrice.setText("");
        AddProductQte.setText(""); 
    }//GEN-LAST:event_AddProductClearButtonActionPerformed

    private void AddProductAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddProductAddButtonActionPerformed
        
        String Name=AddProductName.getText(),
               PA=AddProductBuyingPrice.getText(),
               PV=AddProductSellingPrice.getText(),
               Qte=AddProductQte.getText();
        if (productModifie){
        sqli.UpdateProduct(Name, Qte, PA, PV,IDPselected);
        }else {
        sqli.insertToProduct(Name, Qte, PA, PV);
        }
        AddProductName.setText("");
        AddProductBuyingPrice.setText("");
        AddProductSellingPrice.setText("");
        AddProductQte.setText("");
        sqli.fillProductTable(ProductTable,"1");
    }//GEN-LAST:event_AddProductAddButtonActionPerformed

    private void AddCompontClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddCompontClearButtonActionPerformed
        AddCompontName.setText("");
        AddCompontBuyingPrice.setText("");
        AddCompontSellingPrice.setText("");
        AddCompontQte.setText("");
        ExtraitCheckbox.setSelected(false);
    }//GEN-LAST:event_AddCompontClearButtonActionPerformed

    private void AddCompontAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddCompontAddButtonActionPerformed
       String Name=AddCompontName.getText(),
               PA=AddCompontBuyingPrice.getText(),
               PV=AddCompontSellingPrice.getText(),
               Qte=AddCompontQte.getText(),
               extrait="0";
       if(ExtraitCheckbox.isSelected())
           extrait="1";
        else extrait="0";
        if (compontModifie){
            
           sqli.UpdateCompont(Name, Qte, PA, PV, extrait, IDSPselected);
       }else{
            
        
        sqli.insertToSP(Name, Qte, PA, PV, extrait);
       }
        sqli.fillCompontTable(CompontTable,"1");
        AddCompontName.setText("");
        AddCompontBuyingPrice.setText("");
        AddCompontSellingPrice.setText("");
        AddCompontQte.setText("");
        ExtraitCheckbox.setSelected(false);
    }//GEN-LAST:event_AddCompontAddButtonActionPerformed

    private void AddConfigAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddConfigAddButtonActionPerformed
        DefaultTableModel AddConfigTableModel=(DefaultTableModel) AddConfigTable.getModel();
        int selectedBotelIndex=AddConfigSelectedBottel.getSelectedIndex();
        String selectedBottel=BottelModel.getElementAt(selectedBotelIndex).toString(),
               IDBSelected=sqli.SelectFromBottelWithCOndition("Volume='"+selectedBottel+"';", "IDB");
        while(AddConfigTableModel.getRowCount()>0){
            String selectedCompont=AddConfigTableModel.getValueAt(0, 0).toString(),
                   Coef=AddConfigTableModel.getValueAt(0, 1).toString();
            String IDSPSelected=sqli.SelectFromCompontWithCOndition("Name='"+selectedCompont+"';", "IDSP");
            JOptionPane.showMessageDialog(null, IDBSelected+" "+IDSPSelected);
            int checkIDSP=sqli.checkingIFitExist("configration", "IDSP='"+IDSPSelected+"';"),
                checkIDB=sqli.checkingIFitExist("configration", "IDB='"+IDBSelected+"';");
            if(checkIDSP==1&&checkIDB==1)
                sqli.insertToConfig(IDSPSelected, IDBSelected, Coef);
            else JOptionPane.showMessageDialog(null, "IDSP "+IDBSelected+" "+IDSPSelected+" IDB i double");
            AddConfigTableModel.removeRow(0);
        }   
    }//GEN-LAST:event_AddConfigAddButtonActionPerformed

    private void SellOriginalSellButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SellOriginalSellButtonActionPerformed
        try {
            String  produit=SellOriginalCombobox.getSelectedItem().toString(),
                  qte =sqli.SelectFromProduitWithCOndition("name = '"+produit+"';", "qte"),
                  prixS =sqli.SelectFromProduitWithCOndition("name = '"+produit+"';", "prixVendu");
        double qteSelled ,qteExist,qteRest,prixTot,prix;
        qteExist=Double.parseDouble(qte);
        prix=Double.parseDouble(prixS);
        qteSelled=Double.parseDouble(SellOriginalQte.getText());
        prixTot=prix*qteSelled;
       
        qteRest=qteExist-qteSelled;
        JOptionPane.showMessageDialog(null, prixS);
        qte=String.valueOf(qteRest);
        sqli.UpdateStockFromProduit(qte, produit);
        SellOriginalPrix.setText(String.valueOf(prixTot));
        SellOriginalQte.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
    }//GEN-LAST:event_SellOriginalSellButtonActionPerformed

    private void SellCreatedSellButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SellCreatedSellButtonActionPerformed
        try {
            String SelectedBottel= SellCreatedBottelCombobox.getSelectedItem().toString(),
                    selectedExtrait=SellCreatedExtraitCombobox.getSelectedItem().toString(),
                    //selectedPrix=SellCreatedPrix.getText(),
                    selectedQte=SellCreatedQte.getText(),
                    stockBottel=sqli.SelectFromBottelWithCOndition("volume ='"+SelectedBottel+"';", "stock"),
                    stockExtrait=sqli.SelectFromCompontWithCOndition("name='"+selectedExtrait+"';", "VolumeStock"),
                    IDB=sqli.SelectFromBottelWithCOndition("volume ='"+SelectedBottel+"'", "IDB"),
                    IDE=sqli.SelectFromCompontWithCOndition("name='"+selectedExtrait+"'", "IDSP"),
                    config=sqli.SelectFromConfigrationWithCOndition("IDB='"+IDB+"' AND IDSP='"+IDE+"';", "coef"),
                    extraitprixvendu=sqli.SelectFromBottelWithCOndition("volume ='"+SelectedBottel+"';", "prixVendu"),
                    bottelpraixvendu=sqli.SelectFromCompontWithCOndition("name='"+selectedExtrait+"';", "prixVendu");
                    System.out.println(IDB+" "+IDE+" "+config);
            double extraitVolumeused=Double.parseDouble(config),
                qte=Double.parseDouble(selectedQte),
                extraitStocked=Double.parseDouble(stockExtrait),
                bottelStocked=Double.parseDouble(stockBottel),
                bottelLeft=bottelStocked-qte,
                extraitVolumeLeft=extraitStocked-qte*extraitVolumeused,
                prixExtrait=Double.parseDouble(extraitprixvendu),
                prixBottel=Double.parseDouble(bottelpraixvendu),
                    prixTotal=(prixBottel+extraitVolumeused*prixExtrait)*qte;
                ;
            if(extraitVolumeLeft<0){
                JOptionPane.showMessageDialog(null, "stock is empty");
            }
            SellCreatedPrix.setText(String.valueOf(prixTotal));
            sqli.UpdateStockFromSP(String.valueOf(extraitVolumeLeft), selectedExtrait);
            sqli.UpdateStockFromBottel(String.valueOf(bottelLeft), SelectedBottel);
            System.out.println(extraitVolumeLeft+" "+bottelLeft+" ");
        } catch (Exception e) {
            e.printStackTrace();
           
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_SellCreatedSellButtonActionPerformed

    private void RechargeCompontClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RechargeCompontClearButtonActionPerformed
        compontModel.removeAllElements();
        sqli.fillComboBox(RechargeCompontCombobox,"sousproduit","Name");
        RechargeCompontStock.setText("");
       
    }//GEN-LAST:event_RechargeCompontClearButtonActionPerformed

    private void RechargeProductClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RechargeProductClearButtonActionPerformed
        productModel.removeAllElements();
        sqli.fillComboBox(RechargeProductCombobox,"produit","name");
        RechargeProductStock.setText("");
    }//GEN-LAST:event_RechargeProductClearButtonActionPerformed

    private void RechargeBottelClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RechargeBottelClearButtonActionPerformed
        BottelModel.removeAllElements();
        sqli.fillComboBox(RecahrgeBottelCombobox,"bottel","volume");
        RechargeBottelQte.setText("");    }//GEN-LAST:event_RechargeBottelClearButtonActionPerformed

    private void RechargeBottelRechargeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RechargeBottelRechargeButtonActionPerformed
        try {
            String Bottel ="",QteRecharged="",QteStocked="";
        Bottel=RecahrgeBottelCombobox.getSelectedItem().toString();
        QteRecharged=RechargeBottelQte.getText();
        QteStocked=sqli.SelectFromBottelWithCOndition("volume ='"+Bottel+"';", "Stock");
        double newStock=0,oldStock=0,recharged=0;
        oldStock=Double.parseDouble(QteStocked);
        recharged=Double.parseDouble(QteRecharged);
        newStock=oldStock+recharged;
        sqli.UpdateStockFromBottel(String.valueOf(newStock), Bottel);
        RechargeBottelQte.setText("");
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_RechargeBottelRechargeButtonActionPerformed

    private void RechargeProductRechargeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RechargeProductRechargeButtonActionPerformed
        try {
            String product ="",QteRecharged="",QteStocked="";
        product=RechargeProductCombobox.getSelectedItem().toString();
        QteRecharged=RechargeProductStock.getText();
        QteStocked=sqli.SelectFromProduitWithCOndition("name ='"+product+"';", "qte");
        double newStock=0,oldStock=0,recharged=0;
        oldStock=Double.parseDouble(QteStocked);
        recharged=Double.parseDouble(QteRecharged);
        newStock=oldStock+recharged;
        sqli.UpdateStockFromProduit(String.valueOf(newStock), product);
        RechargeProductStock.setText("");
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_RechargeProductRechargeButtonActionPerformed

    private void RechargeCompontRechargeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RechargeCompontRechargeButtonActionPerformed
       try {
            String sousproduct ="",QteRecharged="",QteStocked="";
        sousproduct=RechargeCompontCombobox.getSelectedItem().toString();
        QteRecharged=RechargeCompontStock.getText();
        QteStocked=sqli.SelectFromCompontWithCOndition("name ='"+sousproduct+"';", "volumeStock");
        double newStock=0,oldStock=0,recharged=0;
        oldStock=Double.parseDouble(QteStocked);
        recharged=Double.parseDouble(QteRecharged);
        newStock=oldStock+recharged;
        sqli.UpdateStockFromSP(String.valueOf(newStock), sousproduct);
        RechargeCompontStock.setText("");
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_RechargeCompontRechargeButtonActionPerformed

    private void BottelSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BottelSearchButtonActionPerformed
        try {
            String searchedName= BottelSearchBar.getText();
            if (searchedName.equals(""))
            sqli.fillBottelTable(BottelTable, "1");
            else
            sqli.fillBottelTableWithCOndition(BottelTable, "1", searchedName);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "enter what u wanna search");
        }
    }//GEN-LAST:event_BottelSearchButtonActionPerformed

    private void ProductSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductSearchButtonActionPerformed
         try {
            String searchedName= ProductSearchBar.getText();
            if (searchedName.equals(""))
            sqli.fillProductTable(ProductTable, "1");
            else
            sqli.fillProductTableWithConditon(ProductTable, "1", searchedName);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "enter what u wanna search");
        }
    }//GEN-LAST:event_ProductSearchButtonActionPerformed

    private void CompontSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompontSearchButtonActionPerformed
         try {
            String searchedName= CompontSearchBar.getText();
            if (searchedName.equals(""))
            sqli.fillCompontTable(CompontTable, "1");
            else
            sqli.fillCompontTableWithCondition(CompontTable, "1", searchedName);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "enter what u wanna search");
        }
    }//GEN-LAST:event_CompontSearchButtonActionPerformed

    private void BottelAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BottelAddButtonActionPerformed
       Dialog_Bottel.setLocationRelativeTo(null);
       bottelModifie=false;
       AddBottelVolume.setText("");
            AddBottelBuyingPrice.setText("");
            AddBottelSellingPrice.setText("");
            AddBottelQte.setText("");
       AddBottelAddButton.setText("ADD");
       Dialog_Bottel.setTitle("ADD Bottels");
       Dialog_Bottel.setVisible(true);
    }//GEN-LAST:event_BottelAddButtonActionPerformed

    private void CompontAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompontAddButtonActionPerformed
        Dialog_Compont.setLocationRelativeTo(null);
        compontModifie=false;
        AddCompontName.setText("");
            AddCompontBuyingPrice.setText("");
            AddCompontSellingPrice.setText("");
            AddCompontQte.setText("");
            ExtraitCheckbox.setSelected(false);
            AddCompontAddButton.setText("ADD");
       Dialog_Compont.setTitle("ADD Componts");
        Dialog_Compont.setVisible(true);
    }//GEN-LAST:event_CompontAddButtonActionPerformed

    private void PeoductAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PeoductAddButtonActionPerformed
       Dialog_Product.setLocationRelativeTo(null);
       productModifie=false;
        AddProductName.setText("");
            AddProductBuyingPrice.setText("");
            AddProductSellingPrice.setText("");
            AddProductQte.setText("");
            
            AddProductAddButton.setText("ADD");
       Dialog_Compont.setTitle("ADD Product");
       Dialog_Product.setVisible(true);
    }//GEN-LAST:event_PeoductAddButtonActionPerformed

    private void BottelModifieButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BottelModifieButtonActionPerformed
       
       try {
           Dialog_Bottel.setLocationRelativeTo(null);
       bottelModifie=true;
       String selected [] = methode.getTableContent(BottelTable);
       IDBselected=selected[0];
        AddBottelVolume.setText(selected[1]);
        AddBottelBuyingPrice.setText(selected[2]);
        AddBottelSellingPrice.setText(selected[3]);
        AddBottelQte.setText(selected[4]);
        AddBottelAddButton.setText("Modify");
       Dialog_Bottel.setTitle("Modify Bottels");
       Dialog_Bottel.setVisible(true);
        } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "nothing is selected");
            }
       
    }//GEN-LAST:event_BottelModifieButtonActionPerformed

    private void BottelDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BottelDeleteButtonActionPerformed
        int index=BottelTable.getSelectedRow();
        if (index<0) {
            JOptionPane.showMessageDialog(null, "Veuillez séléctionner une ligne");
        }else{
           String idBottel= BottelTable.getValueAt(index, 0).toString();
           sqli.deleteFromTable("bottel","IDB='"+idBottel+"';");
           sqli.fillBottelTable(BottelTable,"1");
        }
     
    }//GEN-LAST:event_BottelDeleteButtonActionPerformed

    private void ProductDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductDeleteButtonActionPerformed
        int index=ProductTable.getSelectedRow();
        if (index<0) {
            JOptionPane.showMessageDialog(null, "Veuillez séléctionner une ligne");
        }else{
           String ID= ProductTable.getValueAt(index, 0).toString();
           sqli.deleteFromTable("produit","IDP='"+ID+"';");
           sqli.fillProductTable(ProductTable,"1");
        }
    }//GEN-LAST:event_ProductDeleteButtonActionPerformed

    private void CompontModifieButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompontModifieButtonActionPerformed
      
      try {
            Dialog_Compont.setLocationRelativeTo(null);
            compontModifie=true;
            String selected [] = methode.getTableContent(CompontTable);
            IDSPselected=selected[0];
            AddCompontName.setText(selected[1]);
            AddCompontBuyingPrice.setText(selected[2]);
            AddCompontSellingPrice.setText(selected[3]);
            AddCompontQte.setText(selected[4]);
            if (selected[5].equalsIgnoreCase("extrait"))
                ExtraitCheckbox.setSelected(true);
            else ExtraitCheckbox.setSelected(false);
            AddCompontAddButton.setText("Modify");
            Dialog_Compont.setTitle("Modify Compont");
            Dialog_Compont.setVisible(true);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "nothing is selected");
            }
       
        
       
    }//GEN-LAST:event_CompontModifieButtonActionPerformed

    private void ProductModifieButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductModifieButtonActionPerformed
        
      try {
          Dialog_Product.setLocationRelativeTo(null);
        productModifie=true;
            String selected [] = methode.getTableContent(ProductTable);
            IDPselected=selected[0];
            AddProductName.setText(selected[1]);
            AddProductBuyingPrice.setText(selected[2]);
            AddProductSellingPrice.setText(selected[3]);
            AddProductQte.setText(selected[4]);
           AddProductAddButton.setText("Modify");
       Dialog_Product.setTitle("Modify Compont");
       Dialog_Product.setVisible(true);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "nothing is selected");
            }
       
        
       
    }//GEN-LAST:event_ProductModifieButtonActionPerformed

    private void CompontDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompontDeleteButtonActionPerformed
        int index=CompontTable.getSelectedRow();
        if (index<0) {
            JOptionPane.showMessageDialog(null, "Veuillez séléctionner une ligne");
        }else{
           String ID= CompontTable.getValueAt(index, 0).toString();
           sqli.deleteFromTable("sousproduit","IDSP='"+ID+"';");
           sqli.fillCompontTable(CompontTable,"1");
        }
     
    }//GEN-LAST:event_CompontDeleteButtonActionPerformed

    private void ProductRestoreButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductRestoreButtonActionPerformed
        DeletedProductDialog.setLocationRelativeTo(null);
        sqli.fillProductTable(DeletedProductTable, "0");
        DeletedProductDialog.setVisible(true);
    }//GEN-LAST:event_ProductRestoreButtonActionPerformed

    private void DeletedProductSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletedProductSearchButtonActionPerformed
       try {
            String searchedName= DeletedProductSearchBar.getText();
            if (searchedName.equals(""))
            sqli.fillProductTable(DeletedProductTable, "0");
            else
            sqli.fillProductTableWithConditon(DeletedProductTable, "0", searchedName);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "enter what u wanna search");
        }
    }//GEN-LAST:event_DeletedProductSearchButtonActionPerformed

    private void DeletedCompontSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletedCompontSearchButtonActionPerformed
        try {
            String searchedName= DeletedCompontSearchBar.getText();
            if (searchedName.equals(""))
            sqli.fillCompontTable(DeletedCompontTable, "0");
            else
            sqli.fillCompontTableWithCondition(DeletedCompontTable, "0", searchedName);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "enter what u wanna search");
        }
    }//GEN-LAST:event_DeletedCompontSearchButtonActionPerformed

    private void DeletedBottelSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletedBottelSearchButtonActionPerformed
        try {
            String searchedName= DeletedBottelSearchBar.getText();
            if (searchedName.equals(""))
            sqli.fillBottelTable(DeletedBottelTable, "0");
            else
            sqli.fillBottelTableWithCOndition(DeletedBottelTable, "0", searchedName);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "enter what u wanna search");
        }
    }//GEN-LAST:event_DeletedBottelSearchButtonActionPerformed

    private void ComponetRestoreButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComponetRestoreButtonActionPerformed
        DeletedCompontDialog.setLocationRelativeTo(null);
        sqli.fillCompontTable(DeletedCompontTable, "0");
        DeletedCompontDialog.setVisible(true);
    }//GEN-LAST:event_ComponetRestoreButtonActionPerformed

    private void ProductRestoreButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductRestoreButton1ActionPerformed
        DeletedBottelDialog.setLocationRelativeTo(null);
        sqli.fillBottelTable(DeletedBottelTable, "0");
        DeletedBottelDialog.setVisible(true);
    }//GEN-LAST:event_ProductRestoreButton1ActionPerformed

    private void RestoreDeletedProductButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestoreDeletedProductButtonActionPerformed
        int index=DeletedProductTable.getSelectedRow();
        if (index<0) {
            JOptionPane.showMessageDialog(null, "Veuillez séléctionner une ligne");
        }else{
           String id= DeletedProductTable.getValueAt(index, 0).toString();
           sqli.restoreFromTable("produit","IDP='"+id+"';");
           sqli.fillProductTable(ProductTable,"1");
           sqli.fillProductTable(DeletedProductTable,"0");
        }
    }//GEN-LAST:event_RestoreDeletedProductButtonActionPerformed

    private void RestoreDeletedCompontButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestoreDeletedCompontButtonActionPerformed
        int index=DeletedCompontTable.getSelectedRow();
        if (index<0) {
            JOptionPane.showMessageDialog(null, "Veuillez séléctionner une ligne");
        }else{
           String id= DeletedCompontTable.getValueAt(index, 0).toString();
           sqli.restoreFromTable("sousproduit","IDSP='"+id+"';");
           sqli.fillCompontTable(CompontTable,"1");
           sqli.fillCompontTable(DeletedCompontTable,"0");
        }
    }//GEN-LAST:event_RestoreDeletedCompontButtonActionPerformed

    private void RestoreDeletedBottelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestoreDeletedBottelButtonActionPerformed
        int index=DeletedBottelTable.getSelectedRow();
        if (index<0) {
            JOptionPane.showMessageDialog(null, "Veuillez séléctionner une ligne");
        }else{
           String id= DeletedBottelTable.getValueAt(index, 0).toString();
           sqli.restoreFromTable("Bottel","IDB='"+id+"';");
           sqli.fillBottelTable(BottelTable,"1");
           sqli.fillBottelTable(DeletedBottelTable,"0");
        }
    }//GEN-LAST:event_RestoreDeletedBottelButtonActionPerformed

    private void RechargeBottelQteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RechargeBottelQteKeyPressed
           
       
    }//GEN-LAST:event_RechargeBottelQteKeyPressed

    private void RechargeBottelQteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RechargeBottelQteKeyTyped
        methode.conditionOnTheTextFiled(evt,RechargeBottelQte,this);
    }//GEN-LAST:event_RechargeBottelQteKeyTyped

    private void RechargeProductStockKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RechargeProductStockKeyTyped
        methode.conditionOnTheTextFiled(evt, RechargeProductStock,this);
    }//GEN-LAST:event_RechargeProductStockKeyTyped

    private void RechargeCompontStockKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RechargeCompontStockKeyTyped
        methode.conditionOnTheTextFiled(evt, RechargeCompontStock,this);
    }//GEN-LAST:event_RechargeCompontStockKeyTyped

    private void SellOriginalQteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SellOriginalQteKeyTyped
       methode.conditionOnTheTextFiled(evt, SellOriginalQte,this);
    }//GEN-LAST:event_SellOriginalQteKeyTyped

    private void SellOriginalPrixKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SellOriginalPrixKeyTyped
        methode.conditionOnTheTextFiled(evt, SellOriginalPrix,this);
    }//GEN-LAST:event_SellOriginalPrixKeyTyped

    private void SellCreatedQteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SellCreatedQteKeyTyped
        methode.conditionOnTheTextFiled(evt, SellCreatedQte,this);
    }//GEN-LAST:event_SellCreatedQteKeyTyped

    private void SellCreatedPrixKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SellCreatedPrixKeyTyped
        methode.conditionOnTheTextFiled(evt, SellCreatedPrix,this);
    }//GEN-LAST:event_SellCreatedPrixKeyTyped

    private void AddCompontBuyingPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddCompontBuyingPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddCompontBuyingPriceActionPerformed

    private void AddCompontBuyingPriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AddCompontBuyingPriceKeyTyped
        methode.conditionOnTheTextFiled(evt, AddCompontBuyingPrice,this);
    }//GEN-LAST:event_AddCompontBuyingPriceKeyTyped

    private void AddCompontSellingPriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AddCompontSellingPriceKeyTyped
        methode.conditionOnTheTextFiled(evt, AddCompontSellingPrice,this);
    }//GEN-LAST:event_AddCompontSellingPriceKeyTyped

    private void AddCompontQteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AddCompontQteKeyTyped
         methode.conditionOnTheTextFiled(evt, AddCompontQte,this);

    }//GEN-LAST:event_AddCompontQteKeyTyped

    private void AddBottelVolumeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AddBottelVolumeKeyTyped
        methode.conditionOnTheTextFiled(evt, AddBottelVolume,this);
    }//GEN-LAST:event_AddBottelVolumeKeyTyped

    private void AddBottelBuyingPriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AddBottelBuyingPriceKeyTyped
        methode.conditionOnTheTextFiled(evt, AddBottelBuyingPrice,this);
    }//GEN-LAST:event_AddBottelBuyingPriceKeyTyped

    private void AddBottelSellingPriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AddBottelSellingPriceKeyTyped
        methode.conditionOnTheTextFiled(evt, AddBottelSellingPrice,this);
    }//GEN-LAST:event_AddBottelSellingPriceKeyTyped

    private void AddBottelQteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AddBottelQteKeyTyped
        methode.conditionOnTheTextFiled(evt, AddBottelQte,this);
    }//GEN-LAST:event_AddBottelQteKeyTyped

    private void AddProductBuyingPriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AddProductBuyingPriceKeyTyped
        methode.conditionOnTheTextFiled(evt, AddProductBuyingPrice,this);
    }//GEN-LAST:event_AddProductBuyingPriceKeyTyped

    private void AddProductSellingPriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AddProductSellingPriceKeyTyped
        methode.conditionOnTheTextFiled(evt, AddProductSellingPrice,this);
    }//GEN-LAST:event_AddProductSellingPriceKeyTyped

    private void AddProductQteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AddProductQteKeyTyped
        methode.conditionOnTheTextFiled(evt, AddProductQte,this);
    }//GEN-LAST:event_AddProductQteKeyTyped

    private void AddConfigVolumeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AddConfigVolumeKeyTyped
        methode.conditionOnTheTextFiled(evt, AddConfigVolume,this);
    }//GEN-LAST:event_AddConfigVolumeKeyTyped

    private void LogINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogINActionPerformed
        String username=UsernameTXT.getText(),
                password=PasswordTxT.getText();
        boolean test=sqli.checkPassword(password, username);
        if (test){
            Container.remove(logInContainer);
           Container.add(HomeMenu,BorderLayout.WEST);
           Container.revalidate();
           Container.repaint();
        }else{
            JOptionPane.showMessageDialog(null, "wrong password or username");
        }
    }//GEN-LAST:event_LogINActionPerformed

    private void SignINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignINActionPerformed
        SignIn_Dialog.setLocationRelativeTo(null);
        SignIn_Dialog.setTitle("Sign IN");
        SignIn_Dialog.setVisible(true);
    }//GEN-LAST:event_SignINActionPerformed

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
            java.util.logging.Logger.getLogger(app.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(app.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(app.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(app.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new app().setVisible(true);
            }
        });
    }
    
    private DefaultListModel  AddConfigListModel = new DefaultListModel();
    
    private DefaultComboBoxModel BottelModel= new DefaultComboBoxModel(),
                         productModel= new DefaultComboBoxModel(),
                         ExtraitModel= new DefaultComboBoxModel(),
                         compontModel=new DefaultComboBoxModel() ;
    private boolean bottelModifie=false,productModifie=false,compontModifie=false;
    private String IDPselected="",IDSPselected="",IDBselected="";
    private sql sqli= new sql();   
    private Methods methode= new Methods();
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBottelAddButton;
    private javax.swing.JButton AddBottelButton;
    private javax.swing.JTextField AddBottelBuyingPrice;
    private javax.swing.JButton AddBottelClearButton;
    private javax.swing.JTextField AddBottelQte;
    private javax.swing.JTextField AddBottelSellingPrice;
    private javax.swing.JTextField AddBottelVolume;
    private javax.swing.JButton AddButton;
    private javax.swing.JButton AddCompontAddButton;
    private javax.swing.JButton AddCompontButton;
    private javax.swing.JTextField AddCompontBuyingPrice;
    private javax.swing.JButton AddCompontClearButton;
    private javax.swing.JPanel AddCompontContainer;
    private javax.swing.JTextField AddCompontName;
    private javax.swing.JTextField AddCompontQte;
    private javax.swing.JTextField AddCompontSellingPrice;
    private javax.swing.JButton AddConfigAddButton;
    private javax.swing.JButton AddConfigButton;
    private javax.swing.JButton AddConfigClearButton;
    private javax.swing.JPanel AddConfigContainer;
    private javax.swing.JList<String> AddConfigList;
    private javax.swing.JButton AddConfigPutButton;
    private javax.swing.JButton AddConfigRemoveButton;
    private javax.swing.JComboBox<String> AddConfigSelectedBottel;
    private javax.swing.JTable AddConfigTable;
    private javax.swing.JButton AddConfigUpdateButton;
    private javax.swing.JTextField AddConfigVolume;
    private javax.swing.JPanel AddContainer;
    private javax.swing.JPanel AddMenu;
    private javax.swing.JButton AddProductAddButton;
    private javax.swing.JButton AddProductButton;
    private javax.swing.JTextField AddProductBuyingPrice;
    private javax.swing.JButton AddProductClearButton;
    private javax.swing.JPanel AddProductContainer;
    private javax.swing.JTextField AddProductName;
    private javax.swing.JTextField AddProductQte;
    private javax.swing.JTextField AddProductSellingPrice;
    private javax.swing.JButton BottelAddButton;
    private javax.swing.JButton BottelDeleteButton;
    private javax.swing.JButton BottelModifieButton;
    private javax.swing.JTextField BottelSearchBar;
    private javax.swing.JButton BottelSearchButton;
    private javax.swing.JTable BottelTable;
    private javax.swing.JButton ComponetRestoreButton;
    private javax.swing.JButton CompontAddButton;
    private javax.swing.JButton CompontDeleteButton;
    private javax.swing.JButton CompontModifieButton;
    private javax.swing.JTextField CompontSearchBar;
    private javax.swing.JButton CompontSearchButton;
    private javax.swing.JTable CompontTable;
    private javax.swing.JPanel Container;
    private javax.swing.JPanel DeletedBottel;
    private javax.swing.JDialog DeletedBottelDialog;
    private javax.swing.JTextField DeletedBottelSearchBar;
    private javax.swing.JButton DeletedBottelSearchButton;
    private javax.swing.JTable DeletedBottelTable;
    private javax.swing.JPanel DeletedCompont;
    private javax.swing.JDialog DeletedCompontDialog;
    private javax.swing.JTextField DeletedCompontSearchBar;
    private javax.swing.JButton DeletedCompontSearchButton;
    private javax.swing.JTable DeletedCompontTable;
    private javax.swing.JPanel DeletedProduct;
    private javax.swing.JDialog DeletedProductDialog;
    private javax.swing.JTextField DeletedProductSearchBar;
    private javax.swing.JButton DeletedProductSearchButton;
    private javax.swing.JTable DeletedProductTable;
    private javax.swing.JPanel DialogBottelContainer;
    private javax.swing.JPanel DialogCompontContainer;
    private javax.swing.JPanel DialogProductContainer;
    private javax.swing.JDialog Dialog_Bottel;
    private javax.swing.JDialog Dialog_Compont;
    private javax.swing.JDialog Dialog_Product;
    private javax.swing.JCheckBox ExtraitCheckbox;
    private javax.swing.JPanel HomeMenu;
    private javax.swing.JButton LogIN;
    private javax.swing.JTextField PasswordTxT;
    private javax.swing.JButton PeoductAddButton;
    private javax.swing.JButton ProductDeleteButton;
    private javax.swing.JButton ProductModifieButton;
    private javax.swing.JButton ProductRestoreButton;
    private javax.swing.JButton ProductRestoreButton1;
    private javax.swing.JTextField ProductSearchBar;
    private javax.swing.JButton ProductSearchButton;
    private javax.swing.JTable ProductTable;
    private javax.swing.JComboBox<String> RecahrgeBottelCombobox;
    private javax.swing.JButton RechargeBottelButton;
    private javax.swing.JButton RechargeBottelClearButton;
    private javax.swing.JPanel RechargeBottelContainer;
    private javax.swing.JTextField RechargeBottelQte;
    private javax.swing.JButton RechargeBottelRechargeButton;
    private javax.swing.JButton RechargeButton;
    private javax.swing.JButton RechargeCompontButton;
    private javax.swing.JButton RechargeCompontClearButton;
    private javax.swing.JComboBox<String> RechargeCompontCombobox;
    private javax.swing.JPanel RechargeCompontContainer;
    private javax.swing.JButton RechargeCompontRechargeButton;
    private javax.swing.JTextField RechargeCompontStock;
    private javax.swing.JPanel RechargeContainer;
    private javax.swing.JPanel RechargeMenu;
    private javax.swing.JButton RechargeProductButton;
    private javax.swing.JButton RechargeProductClearButton;
    private javax.swing.JComboBox<String> RechargeProductCombobox;
    private javax.swing.JPanel RechargeProductContainer;
    private javax.swing.JButton RechargeProductRechargeButton;
    private javax.swing.JTextField RechargeProductStock;
    private javax.swing.JButton RestoreDeletedBottelButton;
    private javax.swing.JButton RestoreDeletedCompontButton;
    private javax.swing.JButton RestoreDeletedProductButton;
    private javax.swing.JButton SellButton;
    private javax.swing.JPanel SellContainer;
    private javax.swing.JComboBox<String> SellCreatedBottelCombobox;
    private javax.swing.JButton SellCreatedButton;
    private javax.swing.JButton SellCreatedClearButton;
    private javax.swing.JPanel SellCreatedContainer;
    private javax.swing.JComboBox<String> SellCreatedExtraitCombobox;
    private javax.swing.JTextField SellCreatedPrix;
    private javax.swing.JTextField SellCreatedQte;
    private javax.swing.JButton SellCreatedSellButton;
    private javax.swing.JPanel SellMenu;
    private javax.swing.JButton SellOriginalButton;
    private javax.swing.JButton SellOriginalClearButton;
    private javax.swing.JComboBox<String> SellOriginalCombobox;
    private javax.swing.JPanel SellOriginalContainer;
    private javax.swing.JTextField SellOriginalPrix;
    private javax.swing.JTextField SellOriginalQte;
    private javax.swing.JButton SellOriginalSellButton;
    private javax.swing.JButton SignIN;
    private javax.swing.JDialog SignIn_Dialog;
    private javax.swing.JTextField UsernameTXT;
    private javax.swing.JPanel addBottelContainer;
    private javax.swing.JLabel homeBackgroundImage;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JPanel logInContainer;
    // End of variables declaration//GEN-END:variables
}

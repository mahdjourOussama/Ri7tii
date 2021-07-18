
import java.awt.BorderLayout;
import java.sql.ResultSet;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class app extends javax.swing.JFrame {
    
    /**
     * Creates new form app
     */
    public app() {
        initComponents();
        settingComboBoxModel(AddConfigSelectedBottelModel,"bottel","Volume"); 
        settingListModel(AddConfigListModel, "sousproduit","Name");
    }
    public void settingComboBoxModel (DefaultComboBoxModel model,String table,String selection){
        ResultSet res= sqli.Select(table);
        int length=sqli.Length(res);
        res= sqli.Select(table);
        String[] BottelVolume=sqli.fromResultSetToString(res,selection,length );
        for (int i = 0; i < length; i++) {
            model.addElement(BottelVolume[i]);
        }
    }
    public void settingListModel (DefaultListModel model,String table,String selection){
        ResultSet res= sqli.Select(table);
        int length=sqli.Length(res);
        res= sqli.Select(table);
        String[] BottelVolume=sqli.fromResultSetToString(res,selection,length );
        for (int i = 0; i < length; i++) {
            model.addElement(BottelVolume[i]);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AddContainer = new javax.swing.JPanel();
        SellContainer = new javax.swing.JPanel();
        RechargeContainer = new javax.swing.JPanel();
        StockContainer = new javax.swing.JPanel();
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
        AddBottelContainer = new javax.swing.JPanel();
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
        AddProductContainer = new javax.swing.JPanel();
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
        Container = new javax.swing.JPanel();
        HomeMenu = new javax.swing.JPanel();
        AddButton = new javax.swing.JButton();
        SellButton = new javax.swing.JButton();
        RechargeButton = new javax.swing.JButton();
        StockButton = new javax.swing.JButton();

        AddContainer.setLayout(new java.awt.BorderLayout(20, 20));

        SellContainer.setLayout(new java.awt.BorderLayout(20, 20));

        RechargeContainer.setLayout(new java.awt.BorderLayout(20, 20));

        StockContainer.setLayout(new java.awt.BorderLayout(20, 20));

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

        AddConfigSelectedBottel.setModel(AddConfigSelectedBottelModel);

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

        jLabel3.setText("Volume");

        jLabel4.setText("Buying Price");

        jLabel5.setText("Selling Price");

        jLabel6.setText("Quantite");

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

        javax.swing.GroupLayout AddBottelContainerLayout = new javax.swing.GroupLayout(AddBottelContainer);
        AddBottelContainer.setLayout(AddBottelContainerLayout);
        AddBottelContainerLayout.setHorizontalGroup(
            AddBottelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddBottelContainerLayout.createSequentialGroup()
                .addGroup(AddBottelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddBottelContainerLayout.createSequentialGroup()
                        .addComponent(AddBottelClearButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AddBottelAddButton))
                    .addGroup(AddBottelContainerLayout.createSequentialGroup()
                        .addGroup(AddBottelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(AddBottelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AddBottelQte, javax.swing.GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE)
                            .addComponent(AddBottelSellingPrice)
                            .addComponent(AddBottelVolume)
                            .addComponent(AddBottelBuyingPrice))))
                .addContainerGap())
        );
        AddBottelContainerLayout.setVerticalGroup(
            AddBottelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddBottelContainerLayout.createSequentialGroup()
                .addGroup(AddBottelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddBottelContainerLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddBottelContainerLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(AddBottelVolume, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AddBottelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddBottelBuyingPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(AddBottelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddBottelSellingPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(AddBottelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddBottelQte, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(AddBottelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddBottelClearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddBottelAddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        AddProductAddButton.setText("Add");
        AddProductAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddProductAddButtonActionPerformed(evt);
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

        javax.swing.GroupLayout AddProductContainerLayout = new javax.swing.GroupLayout(AddProductContainer);
        AddProductContainer.setLayout(AddProductContainerLayout);
        AddProductContainerLayout.setHorizontalGroup(
            AddProductContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddProductContainerLayout.createSequentialGroup()
                .addGroup(AddProductContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddProductContainerLayout.createSequentialGroup()
                        .addComponent(AddProductClearButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 600, Short.MAX_VALUE)
                        .addComponent(AddProductAddButton))
                    .addGroup(AddProductContainerLayout.createSequentialGroup()
                        .addGroup(AddProductContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(AddProductContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AddProductQte)
                            .addComponent(AddProductSellingPrice)
                            .addComponent(AddProductName)
                            .addComponent(AddProductBuyingPrice))))
                .addContainerGap())
        );
        AddProductContainerLayout.setVerticalGroup(
            AddProductContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddProductContainerLayout.createSequentialGroup()
                .addGroup(AddProductContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddProductContainerLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddProductContainerLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(AddProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AddProductContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddProductBuyingPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(AddProductContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddProductSellingPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(AddProductContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddProductQte, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(AddProductContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddProductClearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddProductAddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel11.setText("Name");

        jLabel12.setText("Buying Price");

        jLabel13.setText("Selling Price");

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

        javax.swing.GroupLayout AddCompontContainerLayout = new javax.swing.GroupLayout(AddCompontContainer);
        AddCompontContainer.setLayout(AddCompontContainerLayout);
        AddCompontContainerLayout.setHorizontalGroup(
            AddCompontContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddCompontContainerLayout.createSequentialGroup()
                .addGroup(AddCompontContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddCompontContainerLayout.createSequentialGroup()
                        .addComponent(AddCompontClearButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AddCompontAddButton))
                    .addGroup(AddCompontContainerLayout.createSequentialGroup()
                        .addGroup(AddCompontContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(AddCompontContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AddCompontQte, javax.swing.GroupLayout.DEFAULT_SIZE, 648, Short.MAX_VALUE)
                            .addComponent(AddCompontSellingPrice)
                            .addComponent(AddCompontBuyingPrice)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddCompontContainerLayout.createSequentialGroup()
                                .addComponent(ExtraitCheckbox)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(AddCompontName)))))
                .addContainerGap())
        );
        AddCompontContainerLayout.setVerticalGroup(
            AddCompontContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddCompontContainerLayout.createSequentialGroup()
                .addGroup(AddCompontContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddCompontContainerLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(AddCompontContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ExtraitCheckbox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddCompontContainerLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(AddCompontName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AddCompontContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddCompontBuyingPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(AddCompontContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddCompontSellingPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(AddCompontContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddCompontQte, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(AddCompontContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddCompontClearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddCompontAddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel15.setText("Stock");

        RecahrgeBottelCombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel16.setText("Bottel");

        RechargeBottelQte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RechargeBottelQteActionPerformed(evt);
            }
        });

        RechargeBottelRechargeButton.setText("Recharge");

        RechargeBottelClearButton.setText("Clear");

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

        RechargeCompontCombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        RechargeCompontStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RechargeCompontStockActionPerformed(evt);
            }
        });

        jLabel17.setText("Volume");

        jLabel18.setText("COmponet");

        RechargeCompontClearButton.setText("Clear");

        RechargeCompontRechargeButton.setText("Recharge");

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

        RechargeProductCombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        RechargeProductStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RechargeProductStockActionPerformed(evt);
            }
        });

        jLabel19.setText("Qte Stock");

        jLabel20.setText("Product");

        RechargeProductClearButton.setText("Clear");

        RechargeProductRechargeButton.setText("Recharge");

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

        SellOriginalCombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        SellOriginalCombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SellOriginalComboboxActionPerformed(evt);
            }
        });

        jLabel22.setText("Product");

        jLabel23.setText("Prix");

        SellOriginalSellButton.setText("Sell");

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

        SellCreatedBottelCombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        SellCreatedBottelCombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SellCreatedBottelComboboxActionPerformed(evt);
            }
        });

        SellCreatedSellButton.setText("Sell");

        jLabel27.setText("Prix");

        SellCreatedExtraitCombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(300, 500));

        Container.setLayout(new java.awt.BorderLayout(20, 20));

        HomeMenu.setMinimumSize(new java.awt.Dimension(150, 400));
        HomeMenu.setPreferredSize(new java.awt.Dimension(150, 400));
        HomeMenu.setLayout(new java.awt.GridLayout(4, 0, 1, 100));

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

        StockButton.setText("View Stock");
        StockButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StockButtonActionPerformed(evt);
            }
        });
        HomeMenu.add(StockButton);

        Container.add(HomeMenu, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void StockButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StockButtonActionPerformed
       Container.removeAll();
       Container.add(HomeMenu,BorderLayout.WEST);
       Container.add(StockContainer,BorderLayout.CENTER);
       
       Container.repaint();
       Container.revalidate();
    }//GEN-LAST:event_StockButtonActionPerformed

    private void AddConfigButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddConfigButtonActionPerformed
       AddContainer.removeAll();
       AddContainer.add(AddMenu,BorderLayout.NORTH);
       AddContainer.add(AddConfigContainer,BorderLayout.CENTER);
       AddContainer.repaint();
       AddContainer.revalidate();
    }//GEN-LAST:event_AddConfigButtonActionPerformed

    private void AddBottelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBottelButtonActionPerformed
       AddContainer.removeAll();
       AddContainer.add(AddMenu,BorderLayout.NORTH);
       AddContainer.add(AddBottelContainer,BorderLayout.CENTER);
       AddContainer.repaint();
       AddContainer.revalidate();
    }//GEN-LAST:event_AddBottelButtonActionPerformed

    private void AddProductButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddProductButtonActionPerformed
       AddContainer.removeAll();
       AddContainer.add(AddMenu,BorderLayout.NORTH);
       AddContainer.add(AddProductContainer,BorderLayout.CENTER);
       AddContainer.repaint();
       AddContainer.revalidate();
           }//GEN-LAST:event_AddProductButtonActionPerformed

    private void AddCompontButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddCompontButtonActionPerformed
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
       RechargeContainer.repaint();
       RechargeContainer.revalidate();
    }//GEN-LAST:event_RechargeBottelButtonActionPerformed

    private void RechargeProductButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RechargeProductButtonActionPerformed
       RechargeContainer.removeAll();
       RechargeContainer.add(RechargeMenu,BorderLayout.NORTH);
       RechargeContainer.add(RechargeProductContainer,BorderLayout.CENTER);
       RechargeContainer.repaint();
       RechargeContainer.revalidate();
    }//GEN-LAST:event_RechargeProductButtonActionPerformed

    private void RechargeCompontButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RechargeCompontButtonActionPerformed
       RechargeContainer.removeAll();
       RechargeContainer.add(RechargeMenu,BorderLayout.NORTH);
       RechargeContainer.add(RechargeCompontContainer,BorderLayout.CENTER);
       RechargeContainer.repaint();
       RechargeContainer.revalidate();
    }//GEN-LAST:event_RechargeCompontButtonActionPerformed

    private void SellOriginalComboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SellOriginalComboboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SellOriginalComboboxActionPerformed

    private void SellOriginalClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SellOriginalClearButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SellOriginalClearButtonActionPerformed

    private void SellCreatedClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SellCreatedClearButtonActionPerformed
        // TODO add your handling code here:
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
       SellContainer.repaint();
       SellContainer.revalidate();
    }//GEN-LAST:event_SellOriginalButtonActionPerformed

    private void SellCreatedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SellCreatedButtonActionPerformed
       SellContainer.removeAll();
       SellContainer.add(SellMenu,BorderLayout.NORTH);
       SellContainer.add(SellCreatedContainer,BorderLayout.CENTER);
       SellContainer.repaint();
       SellContainer.revalidate();
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
        settingListModel(AddConfigListModel, "sousproduit","Name");
    }//GEN-LAST:event_AddConfigClearButtonActionPerformed

    private void AddBottelAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBottelAddButtonActionPerformed
        String bottelVolume=AddBottelVolume.getText(),
               bottelPA=AddBottelBuyingPrice.getText(),
               bottelPV=AddBottelSellingPrice.getText(),
               bottelQte=AddBottelQte.getText();
        sqli.insertToBottel(bottelVolume, bottelQte, bottelPA, bottelPV);
        AddBottelVolume.setText("");
        AddBottelBuyingPrice.setText("");
        AddBottelSellingPrice.setText("");
        AddBottelQte.setText("");  
        JOptionPane.showMessageDialog(null, "Added \t");
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
        sqli.insertToProduct(Name, Qte, PA, PV);
        AddProductName.setText("");
        AddProductBuyingPrice.setText("");
        AddProductSellingPrice.setText("");
        AddProductQte.setText("");
        JOptionPane.showMessageDialog(null, "Added \t");
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
        sqli.insertToSP(Name, Qte, PA, PV, extrait);
        AddCompontName.setText("");
        AddCompontBuyingPrice.setText("");
        AddCompontSellingPrice.setText("");
        AddCompontQte.setText("");
        ExtraitCheckbox.setSelected(false);
    }//GEN-LAST:event_AddCompontAddButtonActionPerformed

    private void AddConfigAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddConfigAddButtonActionPerformed
        DefaultTableModel AddConfigTableModel=(DefaultTableModel) AddConfigTable.getModel();
        int selectedBotelIndex=AddConfigSelectedBottel.getSelectedIndex();
        String selectedBottel=AddConfigSelectedBottelModel.getElementAt(selectedBotelIndex).toString(),
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
    DefaultComboBoxModel AddConfigSelectedBottelModel= new DefaultComboBoxModel();
    private sql sqli= new sql();   
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBottelAddButton;
    private javax.swing.JButton AddBottelButton;
    private javax.swing.JTextField AddBottelBuyingPrice;
    private javax.swing.JButton AddBottelClearButton;
    private javax.swing.JPanel AddBottelContainer;
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
    private javax.swing.JPanel Container;
    private javax.swing.JCheckBox ExtraitCheckbox;
    private javax.swing.JPanel HomeMenu;
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
    private javax.swing.JButton StockButton;
    private javax.swing.JPanel StockContainer;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}

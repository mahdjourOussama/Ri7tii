
import java.awt.BorderLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
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
        AddProductContainer = new javax.swing.JPanel();
        PeoductAddButton = new javax.swing.JButton();
        ProductModifieButton = new javax.swing.JButton();
        ProductDeleteButton = new javax.swing.JButton();
        ProductSearchBar = new javax.swing.JTextField();
        ProductSearchButton = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        ProductTable = new javax.swing.JTable();
        jLabel28 = new javax.swing.JLabel();
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

        jLabel23.setText("Prix");

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

        SellCreatedSellButton.setText("Sell");
        SellCreatedSellButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SellCreatedSellButtonActionPerformed(evt);
            }
        });

        jLabel27.setText("Prix");

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
        Dialog_Bottel.setName("Add Bottels"); // NOI18N

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

        javax.swing.GroupLayout addBottelContainerLayout = new javax.swing.GroupLayout(addBottelContainer);
        addBottelContainer.setLayout(addBottelContainerLayout);
        addBottelContainerLayout.setHorizontalGroup(
            addBottelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addBottelContainerLayout.createSequentialGroup()
                .addGroup(addBottelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BottelDeleteButton, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BottelModifieButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BottelAddButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 549, Short.MAX_VALUE)
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                        .addComponent(BottelDeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        Dialog_Compont.setMinimumSize(new java.awt.Dimension(700, 400));
        Dialog_Compont.setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);

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

        javax.swing.GroupLayout AddCompontContainerLayout = new javax.swing.GroupLayout(AddCompontContainer);
        AddCompontContainer.setLayout(AddCompontContainerLayout);
        AddCompontContainerLayout.setHorizontalGroup(
            AddCompontContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddCompontContainerLayout.createSequentialGroup()
                .addGroup(AddCompontContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CompontDeleteButton, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CompontModifieButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CompontAddButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5)
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
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

        javax.swing.GroupLayout AddProductContainerLayout = new javax.swing.GroupLayout(AddProductContainer);
        AddProductContainer.setLayout(AddProductContainerLayout);
        AddProductContainerLayout.setHorizontalGroup(
            AddProductContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddProductContainerLayout.createSequentialGroup()
                .addGroup(AddProductContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ProductModifieButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PeoductAddButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ProductDeleteButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4)
                .addContainerGap())
            .addGroup(AddProductContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ProductSearchBar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ProductSearchButton)
                .addGap(12, 12, 12))
        );
        AddProductContainerLayout.setVerticalGroup(
            AddProductContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddProductContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AddProductContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(AddProductContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ProductSearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ProductSearchButton))
                    .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(AddProductContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddProductContainerLayout.createSequentialGroup()
                        .addComponent(PeoductAddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ProductModifieButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ProductDeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 500));

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
       sqli.fillComboBox(AddConfigSelectedBottel,"bottel","Volume");
       sqli.fillList(AddConfigListModel, "sousproduit","Name");
    }//GEN-LAST:event_AddConfigButtonActionPerformed

    private void AddBottelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBottelButtonActionPerformed

        
    sqli.fillBottelTable(BottelTable);


       AddContainer.removeAll();
       AddContainer.add(AddMenu,BorderLayout.NORTH);
       
       AddContainer.add(addBottelContainer,BorderLayout.CENTER);
       AddContainer.repaint();
       AddContainer.revalidate();
    }//GEN-LAST:event_AddBottelButtonActionPerformed

    private void AddProductButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddProductButtonActionPerformed
     sqli.fillProductTable(ProductTable);
        AddContainer.removeAll();
       AddContainer.add(AddMenu,BorderLayout.NORTH);
       AddContainer.add(AddProductContainer,BorderLayout.CENTER);
       AddContainer.repaint();
       AddContainer.revalidate();
           }//GEN-LAST:event_AddProductButtonActionPerformed

    private void AddCompontButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddCompontButtonActionPerformed
        sqli.fillCompontTable(CompontTable);
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
    }//GEN-LAST:event_RechargeProductButtonActionPerformed

    private void RechargeCompontButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RechargeCompontButtonActionPerformed
       RechargeContainer.removeAll();
       RechargeContainer.add(RechargeMenu,BorderLayout.NORTH);
       RechargeContainer.add(RechargeCompontContainer,BorderLayout.CENTER);
       compontModel.removeAllElements();
       sqli.fillComboBox(RechargeCompontCombobox,"sousproduit","Name");
       RechargeContainer.repaint();
       RechargeContainer.revalidate();
    }//GEN-LAST:event_RechargeCompontButtonActionPerformed

    private void SellOriginalComboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SellOriginalComboboxActionPerformed
        // TODO add your handling code here:
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
    }//GEN-LAST:event_SellOriginalButtonActionPerformed

    private void SellCreatedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SellCreatedButtonActionPerformed
       SellContainer.removeAll();
       SellContainer.add(SellMenu,BorderLayout.NORTH);
       SellContainer.add(SellCreatedContainer,BorderLayout.CENTER);
       SellContainer.repaint();
       SellContainer.revalidate();
       sqli.fillComboBoxWithConditon(SellCreatedExtraitCombobox,"sousproduit","name", "extrait=1 ");
        sqli.fillComboBox(SellCreatedBottelCombobox,"bottel","Volume"); 
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
        sqli.fillBottelTable(BottelTable);
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
        sqli.fillProductTable(ProductTable);
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
        sqli.fillCompontTable(CompontTable);
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
            String    produit=SellOriginalCombobox.getSelectedItem().toString(),
                  qte =sqli.SelectFromProduitWithCOndition("name = '"+produit+"';", "qte"),
                  prixS =sqli.SelectFromProduitWithCOndition("name = '"+produit+"';", "prixVendu");
        double qteSelled ,qteExist,qtef,prixTot,prix;
        qteExist=Double.parseDouble(qte);
        prix=Double.parseDouble(prixS);
        qteSelled=Double.parseDouble(SellOriginalQte.getText());
        prixTot=prix*qteSelled;
        if (qteExist<qteSelled)
               JOptionPane.showMessageDialog(null, "Stock isnt enough \t");
        
        qtef=qteExist-qteSelled;
        JOptionPane.showMessageDialog(null, prixS);
        qte=String.valueOf(qtef);
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
        // TODO add your handling code here:
    }//GEN-LAST:event_BottelSearchButtonActionPerformed

    private void ProductSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductSearchButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProductSearchButtonActionPerformed

    private void CompontSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompontSearchButtonActionPerformed
        // TODO add your handling code here:
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
           sqli.fillBottelTable(BottelTable);
        }
     
    }//GEN-LAST:event_BottelDeleteButtonActionPerformed

    private void ProductDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductDeleteButtonActionPerformed
        DefaultTableModel tab =(DefaultTableModel) ProductTable.getModel();
      for (int i = 0; i < tab.getRowCount();i ++) {
            tab.removeRow(0);
        }
      ProductTable.setModel(tab);
      
      System.out.println(ProductTable.getRowCount());
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
       
    }//GEN-LAST:event_CompontDeleteButtonActionPerformed

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
    private javax.swing.JButton CompontAddButton;
    private javax.swing.JButton CompontDeleteButton;
    private javax.swing.JButton CompontModifieButton;
    private javax.swing.JTextField CompontSearchBar;
    private javax.swing.JButton CompontSearchButton;
    private javax.swing.JTable CompontTable;
    private javax.swing.JPanel Container;
    private javax.swing.JPanel DialogBottelContainer;
    private javax.swing.JPanel DialogCompontContainer;
    private javax.swing.JPanel DialogProductContainer;
    private javax.swing.JDialog Dialog_Bottel;
    private javax.swing.JDialog Dialog_Compont;
    private javax.swing.JDialog Dialog_Product;
    private javax.swing.JCheckBox ExtraitCheckbox;
    private javax.swing.JPanel HomeMenu;
    private javax.swing.JButton PeoductAddButton;
    private javax.swing.JButton ProductDeleteButton;
    private javax.swing.JButton ProductModifieButton;
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
    private javax.swing.JPanel addBottelContainer;
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    // End of variables declaration//GEN-END:variables
}

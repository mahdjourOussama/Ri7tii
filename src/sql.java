import java.sql.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class sql {
    //==========================================================================
        Connection conn=MySql.ConnectDB();
        PreparedStatement pst=null;
        Statement st= null;
        ResultSet rs = null;
    //==========================================================================
//==============================================================================
 public void insertToSP(String Param1,String Param2,String Param3,String Param4,String Param5) {
            
            String sql = "insert into sousproduit (`NAME`,`VolumeStock`,`PrixAcha`,`PrixVendu`,`extrait`) VALUES (?,?,?,?,?)";
            try {
                pst = conn.prepareStatement(sql);
                pst.setString(1, Param1);
                pst.setString(2, Param2);
                pst.setString(3, Param3);
                pst.setString(4, Param4);
                pst.setString(5, Param5);
                
                pst.execute();
                JOptionPane.showMessageDialog(null, "Added ToSP\t");
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "insertToSP\n" + e.getMessage());
            }
    }
//==============================================================================
//==============================================================================
 public void insertToProduct(String Param1,String Param2,String Param3,String Param4) {
            
            String sql = "insert into produit (`name`,`qte`,`PrixAcha`,`PrixVendu`) VALUES (?,?,?,?)";
            try {
                pst = conn.prepareStatement(sql);
                pst.setString(1, Param1);
                pst.setString(2, Param2);
                pst.setString(3, Param3);
                pst.setString(4, Param4);

                
                pst.execute();
                JOptionPane.showMessageDialog(null, "Added ToProduct\t");
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "insertToProduct\n" + e.getMessage());
            }
    }
//==============================================================================
//==============================================================================
  public void insertToBottel(String Param1,String Param2,String Param3,String Param4) {
            
            String sql = "insert into bottel (`volume`,`stock`,`PrixAcha`,`PrixVendu`) VALUES (?,?,?,?)";
            try {
                pst = conn.prepareStatement(sql);
                pst.setString(1, Param1);
                pst.setString(2, Param2);
                pst.setString(3, Param3);
                pst.setString(4, Param4);

                
                pst.execute();
                JOptionPane.showMessageDialog(null, "Added ToBottel\t");
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "insertToProduct\n" + e.getMessage());
            }
    }
//==============================================================================
  
//==============================================================================
  public void insertToConfig(String Param1,String Param2,String Param3) {
            
            String sql = "insert into configration (`IDSP`,`IDB`,`coef`) VALUES (?,?,?)";
            try {
                pst = conn.prepareStatement(sql);
                pst.setString(1, Param1);
                pst.setString(2, Param2);
                pst.setString(3, Param3);


                
                pst.execute();
                JOptionPane.showMessageDialog(null, "Added \t");
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error try again \t");
                JOptionPane.showMessageDialog(null, "insertToConfig\n" + e.getMessage());
            }
    }
//==============================================================================
  //==============================================================================
 public void UpdateBottel(String volume,String stock,String prixA,String PrixV,String IDB) {
            
            String sql = "UPDATE `bottel` SET `Volume`=?,`Stock`=?,`PrixAcha`=?,`PrixVendu`=? WHERE IDB=?";
            try {
                pst = conn.prepareStatement(sql);
                pst.setString(1, volume);
                pst.setString(2, stock);
                pst.setString(3, prixA);
                pst.setString(4, PrixV);
                pst.setString(5, IDB);
                pst.execute();
                JOptionPane.showMessageDialog(null, "updated Bottel \t");
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "BottelUpdate\n" + e.getMessage());
            }
    }
//==============================================================================
  //==============================================================================
 public void UpdateProduct(String name,String qte,String prixA,String PrixV,String IDP) {
            
            String sql = "UPDATE `produit` SET `name`=?,`qte`=?,`PrixAcha`=?,`PrixVendu`=? WHERE IDP=?";
            try {
                pst = conn.prepareStatement(sql);
                pst.setString(1, name);
                pst.setString(2, qte);
                pst.setString(3, prixA);
                pst.setString(4, PrixV);
                pst.setString(5, IDP);
                pst.execute();
                JOptionPane.showMessageDialog(null, "updated Produit \t");
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "produitUpdate\n" + e.getMessage());
            }
    }
//==============================================================================
   //==============================================================================
 public void UpdateCompont(String name,String VolumeStock,String prixA,String PrixV,String extrait,String IDSP) {
            
            String sql = "UPDATE `sousproduit` SET `name`=?,`VolumeStock`=?,`PrixAcha`=?,`PrixVendu`=?,`extrait`=? WHERE IDSP=?";
            try {
                pst = conn.prepareStatement(sql);
                pst.setString(1, name);
                pst.setString(2, VolumeStock);
                pst.setString(3, prixA);
                pst.setString(4, PrixV);
                pst.setString(5, extrait);
                pst.setString(6, IDSP);
                pst.execute();
                JOptionPane.showMessageDialog(null, "updated Compont \t");
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "CompontSUpdate\n" + e.getMessage());
            }
    }
//==============================================================================
 
//==============================================================================
 public void UpdateStockFromSP(String Param1,String Param2) {
            
            String sql = "update sousproduit set `VolumeStock`=? where name = ?;";
            try {
                pst = conn.prepareStatement(sql);
                pst.setString(1, Param1);
                pst.setString(2, Param2);
                
                pst.execute();
                JOptionPane.showMessageDialog(null, "updated StockFromSP \t");
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "insertToSP\n" + e.getMessage());
            }
    }
//==============================================================================
//==============================================================================
 public void UpdateStockFromProduit(String Param1,String Param2) {
            
            String sql = "update produit set `qte`=? where name = ?;";
            try {
                pst = conn.prepareStatement(sql);
                pst.setString(1, Param1);
                pst.setString(2, Param2);
                
                pst.execute();
                JOptionPane.showMessageDialog(null, "updated StockFromProduit \t");
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "UpdateStockFromProduit\n" + e.getMessage());
            }
    }
//==============================================================================
//==============================================================================
  public void UpdateStockFromBottel(String Param1,String Param2) {
            
            String sql = "update bottel set `Stock`=? where volume = ?;";
            try {
                pst = conn.prepareStatement(sql);
                pst.setString(1, Param1);
                pst.setString(2, Param2);
                
                pst.execute();
                JOptionPane.showMessageDialog(null, "updated StockFromBottel\t");
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "UpdateStockFrombottel\n" + e.getMessage());
            }
    }
//==============================================================================
//==============================================================================
  public void UpdateFromConfig(String Param1,String Param2,String Param3) {
            
            String sql = "insert into configration (`IDSP`,`IDB`,`coef`) VALUES (?,?,?)";
            try {
                pst = conn.prepareStatement(sql);
                pst.setString(1, Param1);
                pst.setString(2, Param2);
                pst.setString(3, Param3);


                
                pst.execute();
                JOptionPane.showMessageDialog(null, "Added \t");
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error try again \t");
                JOptionPane.showMessageDialog(null, "insertToConfig\n" + e.getMessage());
            }
    }
//==============================================================================
//==============================================================================
  public ResultSet Select(String table) {
            ResultSet res= null;
            String sql = "select * from "+table;
            try {
                st=conn.createStatement();
                res=st.executeQuery(sql);
                return res;

            } catch (Exception e) {
                e.printStackTrace();
                 JOptionPane.showMessageDialog(null, "Error try again \t");
                JOptionPane.showMessageDialog(null, "select all from\t"+table+" withpout condition\n" + e.getMessage());
                return res;
            }
    }
//==============================================================================
  public void fillBottelTable(JTable table,String active){
      
        DefaultTableModel tab =(DefaultTableModel) table.getModel();
      
        while(table.getRowCount()>0){
            tab.removeRow(0);
        }
        
        
      String sql ="select * from bottel where `active`='"+active+"'";
     try {
         
         pst = conn.prepareStatement(sql);
      rs=pst.executeQuery(sql); 
      
      while(rs.next()){
         String idBottel=rs.getString("IDB"),
                PrxAchat=rs.getString("PrixAcha"),
                PrxVendu=rs.getString("PrixVendu"),
                Volume=rs.getString("Volume"),
                Qte=rs.getString("Stock");
      
            
            tab.addRow(new Object[]{idBottel,Volume,PrxAchat,PrxVendu,Qte});    
       
         
      }
      
      
      } catch (Exception e) {
          e.printStackTrace();
         
      }
      
  }
//==============================================================================
  //==============================================================================
  public void fillBottelTableWithCOndition(JTable table,String active, String condition){
      
        DefaultTableModel tab =(DefaultTableModel) table.getModel();
      
        while(table.getRowCount()>0){
            tab.removeRow(0);
        }
        
        
      String sql ="select * from bottel where `active`='"+active+"' and volume ="+condition;
     try {
         
         pst = conn.prepareStatement(sql);
      rs=pst.executeQuery(sql); 
      
      while(rs.next()){
         String idBottel=rs.getString("IDB"),
                PrxAchat=rs.getString("PrixAcha"),
                PrxVendu=rs.getString("PrixVendu"),
                Volume=rs.getString("Volume"),
                Qte=rs.getString("Stock");
      
            
            tab.addRow(new Object[]{idBottel,Volume,PrxAchat,PrxVendu,Qte});    
       
         
      }
      
      
      } catch (Exception e) {
          e.printStackTrace();
         
      }
      
  }
//==============================================================================
  //==============================================================================
  public void fillCompontTable(JTable table,String active){
      
        DefaultTableModel tab =(DefaultTableModel) table.getModel();
      
        while(table.getRowCount()>0){
            tab.removeRow(0);
        }
        
        
      String sql ="select * from sousproduit where `active`='"+active+"' ";
     try {
         
         pst = conn.prepareStatement(sql);
      rs=pst.executeQuery(sql); 
      
      while(rs.next()){
         String idsp=rs.getString("IDSP"),
                PrxAchat=rs.getString("PrixAcha"),
                PrxVendu=rs.getString("PrixVendu"),
                name=rs.getString("name"),
                Qte=rs.getString("VolumeStock"),
                extrait=rs.getString("extrait");
      
            if (extrait.equals("1"))
                tab.addRow(new Object[]{idsp,name,PrxAchat,PrxVendu,Qte,"Extrait"});    
            else
                tab.addRow(new Object[]{idsp,name,PrxAchat,PrxVendu,Qte,"Non Extrait"}); 
         
      }
      
      
      } catch (Exception e) {
          e.printStackTrace();
         
      }
      
  }
//==============================================================================
    //==============================================================================
  public void fillCompontTableWithCondition(JTable table,String active,String condition){
      
        DefaultTableModel tab =(DefaultTableModel) table.getModel();
      
        while(table.getRowCount()>0){
            tab.removeRow(0);
        }
        
        
      String sql ="select * from sousproduit where `active`='"+active+"' and name="+condition;
     try {
         
         pst = conn.prepareStatement(sql);
      rs=pst.executeQuery(sql); 
      
      while(rs.next()){
         String idsp=rs.getString("IDSP"),
                PrxAchat=rs.getString("PrixAcha"),
                PrxVendu=rs.getString("PrixVendu"),
                name=rs.getString("name"),
                Qte=rs.getString("VolumeStock"),
                extrait=rs.getString("extrait");
      
            if (extrait.equals("1"))
                tab.addRow(new Object[]{idsp,name,PrxAchat,PrxVendu,Qte,"Extrait"});    
            else
                tab.addRow(new Object[]{idsp,name,PrxAchat,PrxVendu,Qte,"Non Extrait"}); 
         
      }
      
      
      } catch (Exception e) {
          e.printStackTrace();
         
      }
      
  }
//==============================================================================
  //==============================================================================
  public void fillProductTable(JTable table,String active){
      
        DefaultTableModel tab =(DefaultTableModel) table.getModel();
      
        while(table.getRowCount()>0){
            tab.removeRow(0);
        }
        
        
      String sql ="select * from produit where `active`= '"+active+"'";
     try {
         
         pst = conn.prepareStatement(sql);
      rs=pst.executeQuery(sql); 
      
      while(rs.next()){
         String idp=rs.getString("IDP"),
                PrxAchat=rs.getString("PrixAcha"),
                PrxVendu=rs.getString("PrixVendu"),
                name=rs.getString("name"),
                Qte=rs.getString("qte");
      
            
            tab.addRow(new Object[]{idp,name,PrxAchat,PrxVendu,Qte});    
       
         
      }
      
      
      } catch (Exception e) {
          e.printStackTrace();
         
      }
      
  }
//==============================================================================
   //==============================================================================
  public void fillProductTableWithConditon(JTable table,String active,String condition){
      
        DefaultTableModel tab =(DefaultTableModel) table.getModel();
      
        while(table.getRowCount()>0){
            tab.removeRow(0);
        }
        
        
      String sql ="select * from produit where `active`= '"+active+"' and name ='"+condition+"'";
     try {
         
         pst = conn.prepareStatement(sql);
      rs=pst.executeQuery(sql); 
      
      while(rs.next()){
         String idp=rs.getString("IDP"),
                PrxAchat=rs.getString("PrixAcha"),
                PrxVendu=rs.getString("PrixVendu"),
                name=rs.getString("name"),
                Qte=rs.getString("qte");
      
            
            tab.addRow(new Object[]{idp,name,PrxAchat,PrxVendu,Qte});    
       
         
      }
      
      
      } catch (Exception e) {
          e.printStackTrace();
         
      }
      
  }
//==============================================================================
//==============================================================================
  public void fillComboBox(JComboBox box ,String table,String selection){
      
        DefaultComboBoxModel model= (DefaultComboBoxModel) box.getModel();
        box.removeAllItems();
        
        
      String sql ="select * from "+table+" where active = 1";
     try {
         
         pst = conn.prepareStatement(sql);
         rs=pst.executeQuery(sql); 
      
      while(rs.next()){
         String result=rs.getString(selection);
         model.addElement(result);

      }
        box.setModel(model);
      
      } catch (Exception e) {
          e.printStackTrace();
          JOptionPane.showMessageDialog(null, "Fill ComboBox "+box.getName()+"\n"+e.getMessage());
      }
      
  }
//==============================================================================
//==============================================================================
  public void fillComboBoxWithConditon(JComboBox box ,String table,String selection,String condition){
      
        DefaultComboBoxModel model= (DefaultComboBoxModel) box.getModel();
        box.removeAllItems();
        
        
      String sql ="select * from "+table+" where "+condition+" and active = 1";
     try {
         
         pst = conn.prepareStatement(sql);
         rs=pst.executeQuery(sql); 
      
      while(rs.next()){
         String result=rs.getString(selection);
         model.addElement(result);

      }
        box.setModel(model);
      
      } catch (Exception e) {
          e.printStackTrace();
          JOptionPane.showMessageDialog(null, "Fill ComboBox "+box.getName()+" with Condition  "+condition+"\n"+e.getMessage());
      }
      
  }
//==============================================================================
  
  //==============================================================================
  public void fillList(DefaultListModel model ,String table,String selection){
      
        
        model.removeAllElements();
        
        
      String sql ="select * from "+table+" where active = 1";
     try {
         
         pst = conn.prepareStatement(sql);
         rs=pst.executeQuery(sql); 
      
      while(rs.next()){
         String result=rs.getString(selection);
         model.addElement(result);

      }
      
      } catch (Exception e) {
          e.printStackTrace();
          JOptionPane.showMessageDialog(null, "Fill List\n"+e.getMessage());
      }
      
  }
//==============================================================================
  public String[] Select(String table,String selection) {
            ResultSet res= null;
            String sql = "select * from "+table;
            int length=0,i=0;
            try {
                st=conn.createStatement();
                res=st.executeQuery(sql);
                while(res.next())
                    length++;
                
                res=st.executeQuery(sql);
                String result[]= new String[length];
                
                while(res.next()){
                    result[i]=res.getString(selection);
                    i++;
                }
                return result;

            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "selectString all from\t"+table+" with  "+selection+"\n" + e.getMessage());
                return null;
            }
    }
//==============================================================================
  //============================================================================
  public String[] SelectWithCondition(String table,String condition,String selection) {
            ResultSet res= null;
            String sql = "select * from "+table+" where "+condition;
            int length=0,i=0;
            try {
                st=conn.createStatement();
                res=st.executeQuery(sql);
                while(res.next())
                    length++;
                
                res=st.executeQuery(sql);
                String result[]= new String[length];
                
                while(res.next()){
                    result[i]=res.getString(selection);
                    i++;
                }
                return result;

            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "selectString all from\t"+table+" with  "+selection+"\n" + e.getMessage());
                return null;
            }
    }
//==============================================================================
//==============================================================================
  public String SelectFromBottelWithCOndition(String Condition,String Selection) {
            ResultSet res= null;
            String sql = "select * from bottel where "+Condition,
                    result="";
            try {
                st=conn.createStatement();
                res=st.executeQuery(sql);
                res.next();
                result=res.getString(Selection);
                
                return result;

            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "select all from bottel with condition\n" + e.getMessage());
                return result;
            }
    }
//==============================================================================
//==============================================================================
  public String SelectFromConfigrationWithCOndition(String Condition,String Selection) {
            ResultSet res= null;
            String sql = "select * from configration where "+Condition,
                    result="";
            try {
                st=conn.createStatement();
                res=st.executeQuery(sql);
                res.next();
                result=res.getString(Selection);
                
                return result;

            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "select all from config with condition\n" + e.getMessage());
                return result;
            }
    }
//==============================================================================
//==============================================================================
  public String SelectFromProduitWithCOndition(String Condition,String Selection) {
            ResultSet res= null;
            String sql = "select * from produit where "+Condition,
                    result="";
            try {
                st=conn.createStatement();
                res=st.executeQuery(sql);
                res.next();
                result=res.getString(Selection);
                
                return result;

            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "select all from bottel with condition\n" + e.getMessage());
                return result;
            }
    }
//==============================================================================
//==============================================================================
    public String SelectFromCompontWithCOndition(String Condition,String Selection) {
            ResultSet res= null;
            String sql = "select * from sousproduit where "+Condition,
                    result="";
            try {
                st=conn.createStatement();
                res=st.executeQuery(sql);
                res.next();
                result=res.getString(Selection);
                return result;

            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "select all from Compont with condition\n" + e.getMessage());
                return result;
            }
    }
//==============================================================================
//==============================================================================
    public int checkingIFitExist(String table,String Condition) {
            ResultSet res= null;
            String sql = "select * from "+table+" where "+Condition;
                int     result=0;
            try {
                st=conn.createStatement();
                res=st.executeQuery(sql);
                while(res.next())
                    result++;
               
                return result;

            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "CheckingIfItExist\n" + e.getMessage());
                return result;
            }
    }
//==============================================================================
//==============================================================================
    public void deleteFromTable(String table,String Condition){
        String sqql="update "+table+" set active=0 where "+Condition;
        
        try {
            
       pst=conn.prepareStatement(sqql);
       pst.execute();
        
        } catch (Exception e) {
            
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "DeleteFromTable \n "+e.getMessage());
        }
        
        
    }
    
//==============================================================================
    //==============================================================================
    public void restoreFromTable(String table,String Condition){
        String sqql="update "+table+" set active=1 where "+Condition;
        
        try {
            
       pst=conn.prepareStatement(sqql);
       pst.execute();
        
        } catch (Exception e) {
            
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "restoreFromTable \n "+e.getMessage());
        }
        
        
    }
    
//==============================================================================
}

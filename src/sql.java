import java.sql.*;
import javax.swing.JOptionPane;

public class sql {
    //==========================================================================
        Connection conn=MySql.ConnectDB();
        PreparedStatement pst=null;
        Statement st= null;
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

            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "insertToConfig\n" + e.getMessage());
            }
    }
//==============================================================================
//==============================================================================
  public ResultSet Select(String selection,String table,String condition) {
            ResultSet res= null;
            String sql = "select"+selection+" from "+table+" where"+condition;
            try {
                st=conn.createStatement();
                res=st.executeQuery(sql);
                return res;

            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "select\t"+table+"\n" + e.getMessage());
                return res;
            }
    }
//==============================================================================
//==============================================================================
  public ResultSet Select(String table,String condition) {
            ResultSet res= null;
            String sql = "select * from "+table+" where"+condition;
            try {
                st=conn.createStatement();
                res=st.executeQuery(sql);
                return res;

            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "select all from\t"+table+"\n" + e.getMessage());
                return res;
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
                JOptionPane.showMessageDialog(null, "select all from\t"+table+" withpout condition\n" + e.getMessage());
                return res;
            }
    }
//==============================================================================
  //==============================================================================
  public String [] fromResultSetToString(ResultSet res, String Column ,int num ) {
        
        int i=0;
        String []result= new String[num];
        try {
          while (res.next()){
            result[i]= res.getString(Column );
            i++;
        }

      } catch (Exception e) {
       e.printStackTrace();
        JOptionPane.showMessageDialog(null, "TOString\n" + e.getMessage());
      }
       return result;
    }
//==============================================================================
//==============================================================================
  public int Length(ResultSet res ) {
        int i=0;
        try {
          while (res.next()){
            i++;
        }
      } catch (Exception e) {
          e.printStackTrace();
          JOptionPane.showMessageDialog(null, "Length\n" + e.getMessage());
      }
        return i;
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
}

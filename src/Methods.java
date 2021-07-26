
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Methods {
        public String[] getTableContent(JTable table){
                 DefaultTableModel model =(DefaultTableModel) table.getModel();
            int selected =table.getSelectedRow(),colomn=table.getColumnCount();
            String selectedValues[]=new String[colomn];
            for (int i = 0; i < colomn; i++) {
                selectedValues[i]=model.getValueAt(selected, i).toString();
            }
            return selectedValues;        
    }
}

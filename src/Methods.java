
import java.awt.event.KeyEvent;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import  javax.swing.JFrame;


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
        public Double CalculatingProductPrice(){
            double price=0;
            return price;
        }
        public void conditionOnTheTextFiled (KeyEvent evt ,JTextField text , JFrame frame){
            char c = evt.getKeyChar();
        if (!((c >= '0') && (c <= '9')
            || (c == KeyEvent.VK_BACK_SPACE)
            || ((c == KeyEvent.VK_PERIOD) && !text.getText().contains("."))
            || (c == KeyEvent.VK_DELETE))) {
        frame.getToolkit().beep();
        evt.consume();
        
        }
        }
}

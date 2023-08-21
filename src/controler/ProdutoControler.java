
package controler;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Produto;
/**
 *
 * @author 182210120
 */
public class ProdutoControler {
    
    public boolean criarProduto(String nome, String unidades){
        try {
            int parseInt = Integer.parseInt(unidades);
            if(parseInt>0){
                if(nome != ""){
                    Produto p = new Produto(nome, parseInt);
                    JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso!");
                    return true;
                }
            }else{
                JOptionPane.showMessageDialog(null, "O número deve ser maior que 0");
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Numero inválido. Por favor digite um numero válido");
        }
        return false;
    }
    
    public void removerProduto(DefaultTableModel test){
        if(test.getRowCount()>=1){
            test.removeRow(test.getRowCount()-1);
        }
        else{
            JOptionPane.showMessageDialog(null, "não há itens para serem removidos");
        }
    }
    
    public void limparLista(DefaultTableModel list){
        if(list.getRowCount()>=1){
            for(int i=0;i<list.getRowCount();i++){
                list.removeRow(i);
            }
        }else{
            JOptionPane.showMessageDialog(null, "não há itens na lista");
        }
    }

    
    
    
}

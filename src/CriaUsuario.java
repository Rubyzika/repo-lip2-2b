import javax.swing.JOptionPane;

public class CriaUsuario {

	public static void main(String[] args) {
        int rm = 82744;
        String nome = "Lucas";
        String username = nome+"__"+rm;
        
        JOptionPane.showMessageDialog(null,
        		"RM: " + rm + "\n" +
                "Nome: " + nome + "\n" + 
        		"Usuário: " + username );
		
	}

}

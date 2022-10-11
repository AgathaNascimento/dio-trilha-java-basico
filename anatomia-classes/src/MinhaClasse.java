public class MinhaClasse {

    public static void main(String[] args) {
    
        String primeiroNome = "Agatha";
        String segundoNome = "Fernandes";
    
        String nomeCompleto = nomeCompleto (primeiroNome,segundoNome);
        
        System.out.println(nomeCompleto);
    
    }
    
    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "Resulstado do método: " + primeiroNome.concat(" ").concat(segundoNome);
    }
        
}
    
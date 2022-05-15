package cajeroautomatico;


public class CajeroAutomatico {

    
    public static void main(String[] args) {
        MenuOpciones fin = new ConsultarSaldo();
        fin.setSaldo(500);
        fin.mostarMenu();
        
    }
    
}
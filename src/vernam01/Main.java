

public class Main {
    public static void main(String[] args) {
        Vernam01 cripto = new Vernam01();
        String clave = "mouse";
        String texto = "HOLA MUNDO mensaje encriptado utilizando el Cifrado de Vernam";
        
        System.out.println( "Texto original: "  + texto);
        System.out.println();
        System.out.println( "------------------------------------------------------------");
        System.out.println( "Mensaje encriptado: " );
        String t = cripto.encriptar(texto, clave);
        System.out.println(t);                
        System.out.println( "------------------------------------------------------------");
        System.out.println();
        System.out.println( "Mensaje desencriptado: " );
        System.out.println( cripto.desencriptar(t, clave) );
        System.out.println( "------------------------------------------------------------");
    }
}
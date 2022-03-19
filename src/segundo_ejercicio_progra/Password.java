package segundo_ejercicio_progra;

//Haga una clase llamada Password
public class Password {
    //Atributos de longitud y contraseña
private int longitud;
private string contrasenia;
//Por defecto la longitud será de 8
private final int LONG_DEFAULT= 8;
        private char [] abecedarioMayusculas = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
   'K', 'L', 'M','N','O','P','Q','R','S','T','U','V','W', 'X','Y','Z'};
private char [] abecedarioMinusculas ={'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
   'k', 'l', 'm','n','o','p','q','r','s','t','u','v','w', 'x','y','z'};
   private char[] numeros={'0','1','2','3','4','5','6','7','8','9'};
private final static int SECURE_PASSW_NUMERO = 5;
private final static int SECURE_PASSW_MAYUSCULA = 2;
private final static int SECURE_PASSW_MINUSCULA = 1 ;
  
//Creación de los Constructores
public Password() {
    this.longitud = LONG_DEFAULT;
    this.contrasenia = contrasenia;
}
public Password(int longitud){
      this.longitud=longitud;
      this.contrasenia=generarPassword(longitud);
}
//Creación de los Métodos
public string getContrasenia() {
   return contrasenia; 
}
public int getLongitud () {
    return longitud;
}

public void setLongitud(int longitud){
    this.longitud = longitud;
}

public void setContrasenia (string contrasenia){
    this.contrasenia = contrasenia;
}

    private string generarPassword(int longitud) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
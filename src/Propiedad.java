import javax.swing.*;
import java.util.Scanner;


public class Propiedad {
    String nombre;

    public void setNombre() throws CaracterInvalidoIngresado {
        Scanner leer = new Scanner(System.in);
        nombre = JOptionPane.showInputDialog(null,"Ingrese el nombre de la propiedad:");

        if (verificarNombre(nombre) || nombre.isEmpty()) //SE PROCEDE AVERIFICAR QUE EL NOMBRE TENGA COMO RESULTADO TRUE
            this.nombre = nombre; //SE GUARDA EL NOMBRE DE LA PROPIEDAD
        else
            //SE ASIGNA EL MENSAJE QUE MOSTRARA LA EXCEPTION
            throw new CaracterInvalidoIngresado("Caracter invalido! Por favor ingresar solo letras");

    }//FIN SETNOMBRE

    public String getNombre() {
        return nombre;
    }//FIN GETNOMBRE

    static boolean verificarNombre(String nombre) {
        //VERIFICAMOS LA CADENA CARACTER POR CARACTER
        for (int i = 0; i < nombre.length(); i++)
        {
            char caracter = nombre.toUpperCase().charAt(i);
            int valorASCII = (int)caracter;
            //SE VERIFICA SI EL DIGITO ES UN CARACTER MEDIANTE EL CODIGO ASCII, SI NO ESTA DENTRO DEL RANGO DE LETRAS ENTONCES ES UN CARACTER NO VALIDO
            if (valorASCII != 165 && (valorASCII < 65 || valorASCII > 90))
                return false; //SI EL CARACTER ES INVALIDO
        }
        return true; //SI EL CARACTER ES VALIDO
    }//FIN VERIFICAR NOMBRE

    public Propiedad() {
        nombre = "";
    }
}//FIN CLASE

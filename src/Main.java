import javax.swing.JOptionPane;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Propiedad propiedad = new Propiedad();
        try {//INTENTAREMOS CORRER EL PROGRAMA SIN ERRORES
            propiedad.setNombre(); //PROCEDEMOS A ASIGNAR EL NOMBRE Y A VERIFICAR SI ES VALIDO
                JOptionPane.showMessageDialog(null,"El nombre es valido!", "GUARDANDO",JOptionPane.INFORMATION_MESSAGE);
        }catch(CaracterInvalidoIngresado error) {//SI SE ENCUENTRA UN ERROR SALTARA EL SIGUIENTE MENSAJE
            JOptionPane.showMessageDialog(null, error.getMessage(), "ERROR ENCONTRADO", JOptionPane.WARNING_MESSAGE);
        }
    }//FIN MAIN

}//FIN CLASE

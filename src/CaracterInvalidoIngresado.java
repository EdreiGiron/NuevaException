//CREAMOS NUESTRA CLASE HIJA DE EXCEPTION
class CaracterInvalidoIngresado extends Exception {


    //CONSTRUCTOR VACIO
    public CaracterInvalidoIngresado() {
    }

    //CONSTRUCTOR CON PARAMETROS
    public CaracterInvalidoIngresado(String mensaje) {
        super(mensaje);
    }
}

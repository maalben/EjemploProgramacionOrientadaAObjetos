package entidades;

public enum Mensajes {

    MENSAJE_PETICION_HORAS("Ingresa las horas trabajadas."),
    MENSAJE_PETICION_VALOR_HORA("Ingresa el valor de la hora trabajada."),
    MENSAJE_SALARIO_PAGAR("El salario a pagar es: $");

    private String mensaje;

    Mensajes(String s) {
        this.mensaje = s;
    }

    public String getMensaje() {
        return mensaje;
    }
}

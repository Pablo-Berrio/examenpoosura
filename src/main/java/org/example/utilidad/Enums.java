package org.example.utilidad;

public enum Enums {
    NOMBRES_ASEGURADO_LONGITUD("el nombre no puede tener mas de 20 caracteres"),
    NOMBRES_ASEGURADO_FORMATO("el nombre solo puede tener letras pelotudo"),
    NOMBRE_BENEFICIARIO_LONGITUD("no puedes tener mas de 50 caracteres en este campo"),
    NOMBRE_BENEFICIARIO_FORMATO("el nombre del beneficiario solo puede tener letras"),
    MONTO_COBERTURA("no cubrimos mas de 1500 palos"),
    MONTO_COBERTURA_FORMATO("solo puedes ingresar numeros aqui"),
    EDAD_ASEGURADO("el contacto que te proveemos para la afiliacion es: 3225108713"),


    ;
    private String Mensaje;
    Enums(String mensaje){
        Mensaje=mensaje;
    }

    public String getMensaje() {
        return Mensaje;
    }

    public void setMensaje(String mensaje) {
        Mensaje = mensaje;
    }
}

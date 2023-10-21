package org.example.validaciones;

import org.example.utilidad.Enums;
import org.example.utilidad.Utilidades;

public class Validaciones {

    Utilidades utilidades=new Utilidades();
    public Validaciones(){
    }

    public Boolean validarNombresAsegurado(String nombreAsegurado) throws Exception{
        if (nombreAsegurado.length()>20){
            throw new Exception(Enums.NOMBRES_ASEGURADO_LONGITUD.getMensaje());
        }

        String expresionRegular="^[a-zA-Z ]+$";
        if (!this.utilidades.buscarCoincidencia(expresionRegular,nombreAsegurado)){
            throw new Exception(Enums.NOMBRES_ASEGURADO_FORMATO.getMensaje());
        }
        return true;
    }

    public Boolean validarBeneficiario(String beneficiario)throws Exception{
        if (beneficiario.length()>50){
            throw new Exception(Enums.NOMBRE_BENEFICIARIO_LONGITUD.getMensaje());
        }

        String expresionRegular="^[a-zA-Z ]+$";
        if (!this.utilidades.buscarCoincidencia(expresionRegular,beneficiario)){
            throw new Exception(Enums.NOMBRE_BENEFICIARIO_FORMATO.getMensaje());
        }
        return true;
    }

    public Boolean validarMontoCobertura(Double montoCobertura)throws Exception{
        if (montoCobertura<0.00||montoCobertura>1500.00){
            throw new Exception(Enums.MONTO_COBERTURA.getMensaje());
        }

        String expresionRegular="^[0-9]+$";
        if (this.utilidades.buscarCoincidencia(expresionRegular, String.valueOf(montoCobertura))){
            throw new Exception(Enums.MONTO_COBERTURA_FORMATO.getMensaje());
        }
        return true;
    }


    public Boolean validarEdadAsegurado(int edadAsegurado)throws Exception{
        if (edadAsegurado<0||edadAsegurado>90){
            throw new Exception(Enums.EDAD_ASEGURADO.getMensaje());
        }

        String expresionRegular="^[0-9]+$";
        if (!this.utilidades.buscarCoincidencia(expresionRegular, String.valueOf(edadAsegurado))){
            throw new Exception(Enums.MONTO_COBERTURA_FORMATO.getMensaje());
        }
        return true;
    }

    public Boolean validarFecha(String fecha) throws Exception{

        String expresionRegular="^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}$";
        if (!this.utilidades.buscarCoincidencia(expresionRegular,fecha)){
            throw new Exception(Enums.FECHA_INCORRECTA.getMensaje());
        }
        return true;
    }

}

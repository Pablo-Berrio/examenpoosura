package org.example.validaciones;

import org.example.utilidad.Enums;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidacionesTest {

    private Validaciones validaciones;
    @BeforeEach
    public void prepararPruebas(){
        this.validaciones=new Validaciones();
    }

    @Test
    public void validarNombresAseguradoCorrectos(){
        String nombrePrueba="juan pablo berrio";
        Boolean resultado= Assertions.assertDoesNotThrow(()->this.validaciones.validarNombresAsegurado(nombrePrueba));
        Assertions.assertTrue(resultado);
    }

    @Test
    public void validarNombresAseguradoIncorrectosLongitud(){
        String nombrePrueba="juan pablo berrio berrio berrio berrio berrio";
        Exception resultado=Assertions.assertThrows(Exception.class,()->validaciones.validarNombresAsegurado(nombrePrueba));
        Assertions.assertEquals(Enums.NOMBRES_ASEGURADO_LONGITUD.getMensaje(),resultado.getMessage());
    }

    @Test
    public void validarNombresAseguradoFormato(){
        String nombrePrueba="juan pablo123*/.'";
        Exception resultado=Assertions.assertThrows(Exception.class,()->validaciones.validarNombresAsegurado(nombrePrueba));
        Assertions.assertEquals(Enums.NOMBRES_ASEGURADO_FORMATO.getMensaje(),resultado.getMessage());
    }

    @Test
    public void validarBeneficiarioCorrecto(){
        String nombrePrueba="juan pablo berrio";
        Boolean resultado=Assertions.assertDoesNotThrow(()->this.validaciones.validarBeneficiario(nombrePrueba));
        Assertions.assertTrue(resultado);
    }

    @Test
    public void validarBeneficiarioIncorrecto(){
        String nombrePrueba="juanito alimaña123*./";
        Exception resultado=Assertions.assertThrows(Exception.class,()->validaciones.validarBeneficiario(nombrePrueba));
        Assertions.assertEquals(Enums.NOMBRE_BENEFICIARIO_FORMATO.getMensaje(),resultado.getMessage());
    }

    @Test
    public void validarBeneficiarioIncorrectoLongitud(){
        String nombrePrueba="jsjsjsjsjsjsjsjsjsjsjsjsjsjsjsjsjsjsjsjsjsjsjsjsjsj";
        Exception resultado=Assertions.assertThrows(Exception.class,()->validaciones.validarBeneficiario(nombrePrueba));
        Assertions.assertEquals(Enums.NOMBRE_BENEFICIARIO_LONGITUD.getMensaje(),resultado.getMessage());
    }

    @Test
    public void validarMontoCoberturaCorrecto(){
        Double datoPrueba=1500.00;
        Boolean resultado=Assertions.assertDoesNotThrow(()->this.validaciones.validarMontoCobertura(datoPrueba));
        Assertions.assertTrue(resultado);
    }

    @Test
    public void validarMontoCoberturaIncorrecto(){
        Double datoPrueba=1501.00;
        Exception resultado=Assertions.assertThrows(Exception.class,()->validaciones.validarMontoCobertura(datoPrueba));
        Assertions.assertEquals(Enums.MONTO_COBERTURA.getMensaje(),resultado.getMessage());
    }

    @Test
    public void validarEdadAsegurado(){
        int datoPrueba=50;
        Boolean resultado=Assertions.assertDoesNotThrow(()->validaciones.validarEdadAsegurado(datoPrueba));
        Assertions.assertTrue(resultado);
    }

    @Test
    public void validarEdadAseguradoIncorrecta(){
        int datoPrueba=-20;
        Exception resultado=Assertions.assertThrows(Exception.class,()->validaciones.validarEdadAsegurado(datoPrueba));
        Assertions.assertEquals(Enums.EDAD_ASEGURADO.getMensaje(),resultado.getMessage());
    }
    @Test
    public void ValidarFechaCorrecta(){
        String fechaPrueba= "23/12/2020";
        Boolean resultado = Assertions.assertDoesNotThrow(()->this.validaciones.validarFecha(fechaPrueba));
        Assertions.assertTrue(resultado);
    }

    @Test
    public void ValidarFehcaIncorrecta(){
        String fechaPrueba= "322/12/2020";
        Exception resultado = Assertions.assertThrows(Exception.class,()->this.validaciones.validarFecha(fechaPrueba));
        Assertions.assertEquals(Enums.FECHA_INCORRECTA.getMensaje(),resultado.getMessage());
    }

}
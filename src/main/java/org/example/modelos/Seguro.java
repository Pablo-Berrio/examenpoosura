package org.example.modelos;

import java.time.LocalDate;

public class Seguro {

    // Atributos
     String nombreAsegurado;
     int edadAsegurado;
     String beneficiario;
     Double montoCobertura;
     String tipoPoliza;
     int duracionPoliza;
     boolean fumador;
     boolean enfermedadesPreexistentes;
     String compañiaSeguros;

     LocalDate fechaInicioCobertura;
     String numeroPoliza;


    public Seguro() {
    }

    public Seguro(String nombreAsegurado, int edadAsegurado, String beneficiario, double montoCobertura, String tipoPoliza, int duracionPoliza, boolean fumador, boolean enfermedadesPreexistentes, String compañiaSeguros, LocalDate fechaInicioCobertura, String numeroPoliza) {
        this.nombreAsegurado = nombreAsegurado;
        this.edadAsegurado = edadAsegurado;
        this.beneficiario = beneficiario;
        this.montoCobertura = montoCobertura;
        this.tipoPoliza = tipoPoliza;
        this.duracionPoliza = duracionPoliza;
        this.fumador = fumador;
        this.enfermedadesPreexistentes = enfermedadesPreexistentes;
        this.compañiaSeguros = compañiaSeguros;
        this.fechaInicioCobertura = fechaInicioCobertura;
        this.numeroPoliza = numeroPoliza;
    }

    public String getNombreAsegurado() {
        return nombreAsegurado;
    }

    public void setNombreAsegurado(String nombreAsegurado) {
        this.nombreAsegurado = nombreAsegurado;
    }

    public int getEdadAsegurado() {
        return edadAsegurado;
    }

    public void setEdadAsegurado(int edadAsegurado) {
        this.edadAsegurado = edadAsegurado;
    }

    public String getBeneficiario() {
        return beneficiario;
    }

    public void setBeneficiario(String beneficiario) {
        this.beneficiario = beneficiario;
    }

    public double getMontoCobertura() {
        return montoCobertura;
    }

    public void setMontoCobertura(double montoCobertura) {
        this.montoCobertura = montoCobertura;
    }

    public String getTipoPoliza() {
        return tipoPoliza;
    }

    public void setTipoPoliza(String tipoPoliza) {
        this.tipoPoliza = tipoPoliza;
    }

    public int getDuracionPoliza() {
        return duracionPoliza;
    }

    public void setDuracionPoliza(int duracionPoliza) {
        this.duracionPoliza = duracionPoliza;
    }

    public boolean isFumador() {
        return fumador;
    }

    public void setFumador(boolean fumador) {
        this.fumador = fumador;
    }

    public boolean isEnfermedadesPreexistentes() {
        return enfermedadesPreexistentes;
    }

    public void setEnfermedadesPreexistentes(boolean enfermedadesPreexistentes) {
        this.enfermedadesPreexistentes = enfermedadesPreexistentes;
    }

    public String getCompañiaSeguros() {
        return compañiaSeguros;
    }

    public void setCompañiaSeguros(String compañiaSeguros) {
        this.compañiaSeguros = compañiaSeguros;
    }

    public LocalDate getFechaInicioCobertura() {
        return fechaInicioCobertura;
    }

    public void setFechaInicioCobertura(LocalDate fechaInicioCobertura) {
        this.fechaInicioCobertura = fechaInicioCobertura;
    }

    public String getNumeroPoliza() {
        return numeroPoliza;
    }

    public void setNumeroPoliza(String numeroPoliza) {
        this.numeroPoliza = numeroPoliza;
    }

    public void calcularPrima() {
        double primaBase = 500;
        double primaFinal = primaBase;


        if (edadAsegurado < 30) {
            primaFinal -= 100;
        } else if (edadAsegurado > 60) {
            primaFinal += 200;
        }

        // Aplicar ajustes basados en el monto de cobertura
        if (montoCobertura > 1000000 ){
            primaFinal += 300;
        }

        System.out.println("La prima del seguro de vida es: $" + primaFinal);
    }
}

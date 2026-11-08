package controlador;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PeriodoEvaluacionControlador {
    
    public boolean validarPeriodo(
        LocalDate fechaInicio,
        LocalDate fechaFin){

        if(fechaInicio == null || fechaFin == null){
            return false;
        }

        if(fechaFin.isBefore(fechaInicio)){
            return false;
        }

        long diasDiferencia = ChronoUnit.DAYS.between(fechaInicio, fechaFin) + 1;

        return diasDiferencia <= 30;
    }

    public boolean validarFechaActual(
        LocalDate fechaActual,
        LocalDate fechaInicio,
        LocalDate fechaFin){

        if(fechaActual == null || !validarPeriodo(fechaInicio, fechaFin)){
            return false;
        }

        return !fechaActual.isBefore(fechaInicio) && !fechaActual.isAfter(fechaFin);
    }
}


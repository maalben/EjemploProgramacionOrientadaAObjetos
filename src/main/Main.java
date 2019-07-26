package main;

import entidades.empleados.Salario;
import javax.swing.*;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

import static entidades.Mensajes.*;

public class Main {

    public static void main(String[] args){

        DecimalFormatSymbols simbolo=new DecimalFormatSymbols();
        simbolo.setDecimalSeparator('.');
        simbolo.setGroupingSeparator(',');
        DecimalFormat formateador = new DecimalFormat("###,###.##", simbolo);
        Salario salario = new Salario();

        String horas = JOptionPane.showInputDialog(null,
                MENSAJE_PETICION_HORAS.getMensaje());

        String valor = JOptionPane.showInputDialog(null,
                MENSAJE_PETICION_VALOR_HORA.getMensaje());

        salario.setHorasTrabajadas(Double.parseDouble(horas));
        salario.setValorHora(Double.parseDouble(valor));

        JOptionPane.showMessageDialog(null,
                MENSAJE_SALARIO_PAGAR.getMensaje() + formateador.format(salario.calcularSalario()));



    }

}

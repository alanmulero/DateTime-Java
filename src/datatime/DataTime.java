/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package datatime;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.util.Date;
/**
 *
 * @author alan_
 * Estudos com datas e tempo em Java
 */
public class DataTime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String pattern = "E, dd MM yyyy HH:mm";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date = simpleDateFormat.format(new Date());
        System.out.println(date);

        
        // LocalDate
        
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);
        
        // Criando Datas
        
        LocalDate hoje2 = LocalDate.now();
        
        LocalDate aniversarioAlan = LocalDate.of(1968, Month.DECEMBER, 30);
        
        // Calculando periodo:
        
        Period periodo = Period.between(hoje, aniversarioAlan);
        System.out.println(periodo);

        
        // LocalTime
        LocalTime agora = LocalTime.now();
        System.out.println(agora);
        
    }
    
}

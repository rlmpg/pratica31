import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nanau
 */
public class Pratica31 {
    private static Date inicio;
    private static Date fim;
    private static String meuNome = "JoSe ReiNALDo LoPES da SILVA";
                                        // 0         1         2
                                        // 012345678901234567890123
    private static GregorianCalendar dataNascimento =
        new GregorianCalendar(1983, Calendar.AUGUST, 17);
    
    public static void main(String[] args) {
        inicio = new Date();

        System.out.println(meuNome.toUpperCase());
        
        String ultimoNome = Character.toUpperCase(meuNome.charAt(18)) + meuNome.substring(19).toLowerCase();
        System.out.println(ultimoNome + ", " + Character.toUpperCase(meuNome.charAt(0)) + ". "
                + Character.toUpperCase(meuNome.charAt(7)) + ".");    
        GregorianCalendar hoje = new GregorianCalendar();
        long dias = (hoje.getTime().getTime() - dataNascimento.getTime().getTime()) / (24 * 3600 * 1000);
        System.out.println("Data de nascimento: " + dataNascimento.getTime());
        System.out.println("Dias até hoje: " + dias);
        
        fim = new Date();
        System.out.println("Tempo de processamento: " + (fim.getTime() - inicio.getTime()) + "ms");

    }
}

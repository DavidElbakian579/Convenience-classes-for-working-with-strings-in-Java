/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasyntaxpro10l6;

/**
 *
 * @author David-pc
 */
public class Solution2 {
    /* 2
    String.format()
    Сделай так, чтобы метод format(String name, int salary) возвращал строку в таком виде:
    Меня зовут <name>. Я буду зарабатывать $<salary> в месяц.

    Для этого используй метод String.format().
    */
    
    public static void start() {
        System.out.println(format("Амиго", 5000));
    }
    
    public static String format(String name, int salary) {
        /* 1
        Первый способ решения
        String phrase = "Меня зовут %s. Я буду зарабатывать $%d в месяц.";
        return String.format(phrase, name, salary);
         */

        /* 2
        Второй способ решения
        String phrase = String.format("Меня зовут %s. Я буду зарабатывать $%d в месяц.", name, salary);
        return phrase;
         */

        // Третий способ решения
        return String.format("Меня зовут %s. Я буду зарабатывать $%d в месяц.", name, salary);
    }    
}

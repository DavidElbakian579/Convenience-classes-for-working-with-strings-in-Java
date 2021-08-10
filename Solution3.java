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
public class Solution3 {
    /* 3
    String pool
    Метод equal(String, String) сравнивает строки по ссылке, используя оператор ==.
    Нужно сделать так, чтобы метод возвращал true, если содержимое строк одинаковое, 
    и false — если разное, не используя метод equals().
    */
    
    public static void start() {
        String first = new String("JavaRush");
        String second = new String("JavaRush");
        String third = new String("javarush");
        System.out.println(equal(first, second));
        System.out.println(equal(second, third));
    }
    
    public static boolean equal(String first, String second) {        
        return first.intern() == second.intern();
    }
    
}

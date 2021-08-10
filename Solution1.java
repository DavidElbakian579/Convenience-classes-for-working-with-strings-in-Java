/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasyntaxpro10l6;

import java.util.Arrays;
import java.util.StringTokenizer;

/**
 *
 * @author David-pc
 */
public class Solution1 {
    /* 1
    StringTokenizer
    Используя StringTokenizer раздели query на части по разделителю delimiter.
    Максимально возможное количество токенов - 6.

    Пример:
    getTokens("java.util.stream", "\\.")
    возвращает массив строк
    {"java", "util", "stream"}
    */
    public static void start() {
        String packagePath = "java.util.stream";
        String[] tokens = getTokens(packagePath, "\\.");
        System.out.println(Arrays.toString(tokens));
    }
    
    public static String[] getTokens(String query, String delimiter) {
        StringTokenizer tokenizer = new StringTokenizer(query, delimiter);
        String[] result = new String[6];
        int i = 0;
        while (tokenizer.hasMoreTokens()) {
            result[i++] = tokenizer.nextToken();
        }
        return result;
    }
}

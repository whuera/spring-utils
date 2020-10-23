package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.StringTokenizer;

@Component("util")
public class UtilsComponent {

    public static final String whitespace_reference_number = "";
    @Bean
    public void getKey(){
        HashMap<String, String> newMap = new HashMap<String, String>();
        newMap.put("my_code", "shhh_secret");
        String value = newMap.get("my_code1");
        System.out.println("value "+value);

        String var = newMap.get("my_code1") == null ? newMap.put("my_code", "222") : whitespace_reference_number;

        System.out.println(StringUtils.capitalize("apache commons"));
        CharSequence charSequence = new StringBuilder("TIENES UN REGALO");
        String val[] = new String[charSequence.length()];
        StringBuilder sbf = new StringBuilder(charSequence); 
        String text1 = null;
        String text2 = null;
        for( int i = 0; i < charSequence.length(); i++){
            if (Character.isWhitespace(charSequence.charAt(i))) {

                System.out.println("espacio en blanco encontrado ");
                text2 = text1.concat(" ");
            }else {
                System.out.println("caracter: "+charSequence.charAt(i)+"  valor i: "+i);
                val[i] = String.valueOf(charSequence.charAt(i));
                text1 = String.valueOf(sbf.append(charSequence.charAt(i)));
            }

        }
        System.out.println(text2);
    }
}

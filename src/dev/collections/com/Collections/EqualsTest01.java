package dev.collections.com.Collections;

import dev.collections.com.Collections.dominio.SmartPhone;

public class EqualsTest01 {

    public static void main(String[] args) {

        String nome = "Pedrinho";
        String nome2 = "Pedrinho";
        System.out.println(nome == nome2);//true

        System.out.println("-----------");

        String name = new String("Pedrinho");
        String name2 = new String("Pedrinho");
        System.out.println(name == name2); // false

        System.out.println("-----------");

        SmartPhone s1 = new SmartPhone("L1UB", "Galaxy");
        SmartPhone s2 = new SmartPhone("LUIB", "Galaxy");
        System.out.println(s1.equals(s2));

    }


}

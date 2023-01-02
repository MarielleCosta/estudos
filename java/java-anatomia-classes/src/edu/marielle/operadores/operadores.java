package edu.marielle.operadores;

public class operadores {
    
    public static void main(String[] args) {
        String concatenacao = "LINGUAGEM " + "JAVA";
        System.out.println(concatenacao);
        //LINGUAGEM JAVA
        
        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);
        //31

        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);
        //1111

        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);
        //13
        
        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao);
        //1111
    }
}
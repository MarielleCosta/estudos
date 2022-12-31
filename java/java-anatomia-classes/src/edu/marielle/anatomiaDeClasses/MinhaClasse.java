package edu.marielle.anatomiaDeClasses;
public class MinhaClasse {
    public static void main(String[] args) {
        System.out.println("Olá mundo!");
        
        String primeiroNome = "Marielle";
        String segundoNome = "Cristina";
        // int anoFabricacao = 2001;

        //Variaviel que chama o método
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.print(nomeCompleto);
    }

    //Método
    public static String nomeCompleto(String primeiroNome, String segundoNome){
       return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
    }
}

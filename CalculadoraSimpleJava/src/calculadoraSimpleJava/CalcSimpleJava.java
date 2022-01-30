package calculadoraSimpleJava;

import java.util.Scanner;

public class CalcSimpleJava 
{

	public static void main(String[] args) 
    {
        // Se uso try para evitar el mensaje de memory leak, de acuerdo a cierta documentacion de java...
        try (Scanner op = new Scanner(System.in)) {
            while (true)
            {
                float res = 0;
                
                System.out.println("+: Suma");
                System.out.println("-: Resta");
                System.out.println("*: Multiplicacion"); 
                System.out.println("/: Division");
                System.out.println("s: Salir");
                System.out.println("Introduzca dos valores y el operador que desee emplear: ");
                
                float valX = op.nextFloat();
                float valY = op.nextFloat();
                String select = op.next();
    
                switch(select)
                {
                    case "+": res = valX + valY; System.out.println("\n"+valX+" + "+valY+" es igual a "+res+"\n"); break;
                    case "-": res = valX - valY; System.out.println("\n"+valX+" - "+valY+" es igual a "+res+"\n"); break;
                    case "*": res = valX * valY; System.out.println("\n"+valX+" * "+valY+" es igual a "+res+"\n"); break;
                    case "/": res = valX / valY; System.out.println("\n"+valX+" / "+valY+" es igual a "+res+"\n"); break;
                    case "s": System.out.println("\nSaliendo...\n"); System.exit(1);
                    default: System.out.println("\nOpcion no valida...\n");
                }    
            }
        }
    }
}

package programacaoparaleladistribuidalista1;

import java.util.Scanner;

public class ProgramacaoParalelaDistribuidaLista1 {
    protected static final Scanner SC = new Scanner(System.in);
    
    public static void main(String[] args) {
        while(true){
            switch(menu()){
                case 1:
                    question1();
                    break;
                case 2:
                    question2();
                    break;
                case 3:
                    question3();
                    break;
                case 4:
                    question4();
                    break;
                case 5:
                    question5();
                    break;
                case 6:
                    question6();
                    break;
                case 7:
                    question7();
                    break;
                default:
                    System.out.println("Opção inválida!\n");
            }
        }
    }
    
    private static int menu(){
        int opc = 0;
        while(true){
            printMenu();
            try{
                opc = Integer.parseInt(SC.next());
                break;
            } catch(NumberFormatException ex){
                System.out.println(
                        "Error " + ex.getLocalizedMessage().toLowerCase() + "!"
                );
            }
        }
        return opc;
    }
    
    private static void printMenu(){
        System.out.println("\tMENU");
        System.out.println("1 - Questão 1");
        System.out.println("2 - Questão 2");
        System.out.println("3 - Questão 3");
        System.out.println("4 - Questão 4");
        System.out.println("5 - Questão 5");
        System.out.println("6 - Questão 6");
        System.out.println("7 - Questão 7");
        System.out.print("R: ");
    }
    
    private static void question1(){}
    private static void question2(){}
    private static void question3(){}
    private static void question4(){}
    private static void question5(){}
    private static void question6(){}
    private static void question7(){}
}

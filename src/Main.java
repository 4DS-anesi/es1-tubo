import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Tubo tubo;

        int scelta=0;
        boolean flag=false;
        float r=0, h=0;

        do {
            do{
                try {
                    System.out.println("Inserire raggio tubo: ");
                    r=input.nextFloat();
                    flag=true;
                } catch (InputMismatchException e){
                    System.out.println("\nErrore! Input non valido");
                    flag=false;
                }
            } while (flag==true);

            do{
                try {
                    System.out.println("Inserire altezza tubo: ");
                    h=input.nextFloat();
                    flag=true;
                } catch (InputMismatchException e){
                    System.out.println("\nErrore! Input non valido");
                    flag=false;
                }
            } while (flag==true);


            try {
                tubo = new Tubo(r, h);
                flag=true;
            } catch (Exception e){
                System.out.println(e.getMessage());
                flag=false;
            }
        } while (flag==false);



        do{
            System.out.println("\nMenu TEST\n1. Calcolo volume\n2. Calcolo superfice\n3. Modifica il raggio\n4. Modifica l'altezza\n5. Visualizza dati tubo\n0. Esci");
            System.out.println("Scelta: ");
            scelta=input.nextInt();
            switch (scelta){
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 0:
                    System.out.println("\nTerminazione programma");
                    break;
                default:
                    System.out.println("\nScelta non valida");
                    break;
            }
        }while (scelta != 0);
    }
}
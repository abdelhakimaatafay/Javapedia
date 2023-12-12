import java.util.Scanner;

public class Javapedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n**********Javapedia**********");
        System.out.println("How many historical figures will you register?");
        
        int numberOfFigures = scan.nextInt();
        String[][] figures = new String[numberOfFigures][3];    
         
        scan.nextLine();

        for (int i=0; i<figures.length; i++){
            System.out.println("\n\tFigure " + (i+1));
            System.out.print("\t - Name: ");
            figures[i][0] = scan.nextLine();
            System.out.print("\t - Date of birth: ");
            figures[i][1] = scan.nextLine();
            System.out.print("\t - Occupation: ");
            figures[i][2] = scan.nextLine();
            System.out.print("\n");
        }

        System.out.println("These are the values you stored:"); 

        print2DArray(figures);

        System.out.print("\nWho do you want information on? ");  

        String searchName = scan.nextLine();

        for (int i = 0; i < figures.length; i++) {
            if (searchName.equals(figures[i][0])) {
                System.out.print("\t Name: " + figures[i][0]);
                System.out.print("\t Date of birth: " + figures[i][1]);
                System.out.print("\t Occupation: " + figures[i][2]);
            }
        }
        

        scan.close();
    }

    public static void print2DArray(String[][] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print("\t Name: " + array[i][0] + " Date of birth: " + array[i][1] + " Occupation: " + array[i][2]);
            System.out.println("\n");
        }
        
    }

}

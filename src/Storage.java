import java.util.Scanner;

public class Storage {
   static Scanner scan = new Scanner(System.in);

    public static void mainMenu() throws InterruptedException {
       String choice="";

        do {

            System.out.println("============= DEDELER_COLLEGE =============\n" +
                    "============== MAIN MENU ==============\n" +
                    "\n" +
                    "\t 1- View School Information \n " +
                    "\t 2- Teacher Menu\n" +
                    "\t 3- Student Menu\t\t \n" +
                    "\t Q- Quit\n");
            System.out.println("Please Make Your Choice");
            choice=scan.nextLine();

            switch (choice){
                case "1" ://School information
                    School.printSchoolInformation();
                    break;

                case  "2" ://Ogretmen menu
                    break;

                case "3" ://ogrenci menu
                    break;
                case "q" :
                case "Q" :
                    break;
                default:
                    System.out.println("Please enter a available preference ");

            }



        }while (!choice.equalsIgnoreCase("q"));

        Storage.stopProject();



    }

    public static void stopProject() {
        System.out.println("You left the school project !!!");
    }
}

import java.util.Scanner;

public class Storage {
   static Scanner scan = new Scanner(System.in);

    public static void mainMenu() throws InterruptedException {
       String choice="";

        do {

            System.out.println("============= DEDELER_COLLEGE =============");
            System.out.println("============== MAIN MENU ==============");
            System.out.println("1 -> View School Information");
            System.out.println("2 -> Teacher Menu");
            System.out.println("3 -> Student Menu");
            //todo authorised login
            System.out.println("Q -> Quit");
            System.out.println("Please Make Your Choice");
            choice=scan.nextLine();

            switch (choice){
                case "1" :
                    School.printSchoolInformation();
                    break;

                case  "2" :
                    Teacher.teacherMenu();
                    break;

                case "3" :
                    Student.studentMenu();
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
    //
}

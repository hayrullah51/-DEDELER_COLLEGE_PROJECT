import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Teacher {
    static Map<String,String> teachersMap = new HashMap<>();
    static Scanner scan = new Scanner(System.in);
    private String teacherID;
    private String teacherName;
    private String teacherLastName;
    private String teacherBirthYear;
    private String teacherBranch;

    /*getters*/
    public String getTeacherID() {return teacherID;}
    public String getTeacherName() {return teacherName;}
    public String getTeacherLastName() {return teacherLastName;}
    public String getTeacherBirthYear() {return teacherBirthYear;}
    public String getTeacherBranch() {return teacherBranch;}

    /*setter*/
    public void setTeacherID(String teacherID) {teacherID = teacherID;}
    public void setTeacherName(String teacherName) {teacherName = teacherName;}
    public void setTeacherLastName(String teacherLastName) {this.teacherLastName = teacherLastName;}
    public void setTeacherBirthYear(String teacherBirthYear) {this.teacherBirthYear = teacherBirthYear;}
    public void setTeacherBranch(String teacherBranch) {this.teacherBranch = teacherBranch;}

   static String choiseTchFind;


    public static void teacherAddedAllready(){
        Teacher.teachersMap.put("12345698741","Hayrullah, DEDELER, 1990, Math");
        Teacher.teachersMap.put("12345698742","Jhon, Allen, 1991, physics");
        Teacher.teachersMap.put("12345698743","Jacko, Berry, 1992, Chemistry");
        Teacher.teachersMap.put("12345698744","Thomas, Cooper, 1993, Chemistry");
        Teacher.teachersMap.put("12345698746","William, Davis, 1994, Math");
        Teacher.teachersMap.put("12345698747","Miller, Marshall, 1995, physics");
        Teacher.teachersMap.put("12345698748","Lee, Morris, 1996, Math");
    }


    public static void teacherMenu() throws InterruptedException {


        do {
            System.out.println("============= DEDELER_COLLEGE =============");
            System.out.println("=============== TEACHER_MENU ==============");
            System.out.println("1 -> Add a New Teacher");
            System.out.println("2 -> Finding a Teacher by Name");
            System.out.println("3 ->  Finding a Teacher by Branch");
            System.out.println("4 -> Finding a Teacher by ID");
            System.out.println("5 -> Print All Teachers");
            System.out.println("6 -> Remove a Teacher From the Lıst");
            System.out.println("7 -> Update Teacher Informatıon");
            System.out.println("M -> Return Main Menu");
            System.out.println("-------------------------------------------");
            System.out.println("Please Make Your Choice");
            choiseTchFind=scan.nextLine();

            switch (choiseTchFind){

                case "1" :
                    teacherAdd();
                    break;
                case "2" :
                    teacherSearchByName();
                    break;
                case "3" :
                    teacherSearchByBranch();
                    break;
                case "4" :
                    teacherSearchByID();
                    break;
                case "5" :
                    printAllTeachers();
                    break;
                case "6" :
                    teacherRemoveMenu();
                    break;

                case "7" :
                    teacherUpdateInformation();
                    break;

                case "M" :
                case "m" :
                    Storage.mainMenu();

                    break;

                default: System.out.println("Please enter a available preference ");

            }

        }while (!choiseTchFind.equalsIgnoreCase("Q"));

    }

    private static void teacherUpdateInformation() throws InterruptedException {
        System.out.println("Please enter teacher ID for update");
        String serchteaherID = scan.nextLine();
       // Map<String, String> tchMap = teachersMap.teacherAddedAllready();

        Set<Map.Entry<String,String>> teachersEntry = teachersMap.entrySet();
        for (Map.Entry<String,String> each:teachersEntry

                
        ) {
            String eachKey = each.getKey();
            String eachValue = each.getValue();
            String[] eachValueArr = eachValue.split(", ");

            if (serchteaherID.equalsIgnoreCase(eachKey)){
                System.out.println("Teacher ready for fix ...");
                System.out.printf("%11s  %-9s  %-9s   %-4s 2" +
                        "5   %-1s \n",eachKey,eachValueArr[0],eachValueArr[1],eachValueArr[2],eachValueArr[3]+"\n");


                System.out.println("*****************************************");
                System.out.println("Which information do you want to update ?");
                System.out.println("1 -> Name");
                System.out.println("2 -> Surname");
                System.out.println("3 -> Branch");
                String choiseUpdate = scan.nextLine();

                switch (choiseUpdate){
                    case "1" :
                        System.out.println("Enter new NAME");
                        String nameNew = scan.nextLine();
                        eachValueArr[0] = nameNew;
                        each.setValue(eachValueArr[0]+", "+eachValueArr[1]+", "+eachValueArr[2]+", "+eachValueArr[3]);
                        System.out.println("Doing.......");
                        Thread.sleep(2000);
                        System.out.printf("%11s  %-9s  %-9s   %-4s 2" +
                                "5   %-1s \n",eachKey,eachValueArr[0],eachValueArr[1],eachValueArr[2],eachValueArr[3]+"\n");

                        break;
                    case "2" :
                        System.out.println("Enter new SURNAME");
                        String surnameNew = scan.nextLine();
                        eachValueArr[1] = surnameNew;
                        each.setValue(eachValueArr[0]+", "+eachValueArr[1]+", "+eachValueArr[2]+", "+eachValueArr[3]);
                        System.out.println("Doing.......");
                        Thread.sleep(2000);
                        System.out.printf("%11s  %-9s  %-9s   %-4s 2" +
                                "5   %-1s \n",eachKey,eachValueArr[0],eachValueArr[1],eachValueArr[2],eachValueArr[3]+"\n");

                        break;
                    case "3" :
                        System.out.println("Enter new BRANCH");
                        String branchNew = scan.nextLine();
                        eachValueArr[3] =branchNew;
                        each.setValue(eachValueArr[0]+", "+eachValueArr[1]+", "+eachValueArr[2]+", "+eachValueArr[3]);
                        System.out.println("Doing.......");
                        Thread.sleep(2000);
                        System.out.printf("%11s  %-12s  %-12s   %-4s 2" +
                                "5   %-1s \n",eachKey,eachValueArr[0],eachValueArr[1],eachValueArr[2],eachValueArr[3]);

                        break;

                    default:
                        System.out.println("Please enter a available preference");
                }


            }

        }

    }

    private static void teacherSearchByID() throws InterruptedException {
        System.out.println("Please Enter Name to ID");
        String searchID = scan.nextLine();
        System.out.println("-----------------------------------------------------------------");
        Set<Map.Entry<String,String>> teachersEntry = teachersMap.entrySet();
        for (Map.Entry<String,String> each:teachersEntry
        ) {
            String eachKey = each.getKey();
            String eachValue = each.getValue();
            String eachValueArr[] = eachValue.split(", ");

            if (searchID.equalsIgnoreCase(eachKey)){

                System.out.printf("%11s  %-9s  %-9s   %-4s 2" +
                        "5   %-1s \n",eachKey,eachValueArr[0],eachValueArr[1],eachValueArr[2],eachValueArr[3]+"\n");
            }

        }

        System.out.println("-----------------------------------------------------------------");
        System.out.println("Please Wait...");
        Thread.sleep(3000);


    }

    private static void teacherSearchByBranch() throws InterruptedException {
        System.out.println("Please Enter Name to Branch");
        String searchBranch = scan.nextLine();
        System.out.println("-----------------------------------------------------------------");
        Set<Map.Entry<String,String>> teachersEntry = teachersMap.entrySet();
        for (Map.Entry<String,String> each:teachersEntry
        ) {
            String eachKey = each.getKey();
            String eachValue = each.getValue();
            String eachValueArr[] = eachValue.split(", ");

                if (searchBranch.equalsIgnoreCase(eachValueArr[3])){

                    System.out.printf("%11s  %-9s  %-9s   %-4s 2" +
                            "5   %-1s \n",eachKey,eachValueArr[0],eachValueArr[1],eachValueArr[2],eachValueArr[3]+"\n");
                }

        }

        System.out.println("-----------------------------------------------------------------");
        System.out.println("Please Wait...");
        Thread.sleep(3000);

    }

    private static void teacherRemoveMenu() throws InterruptedException {
        System.out.println("Be carefull please, You will remove !!!");
        System.out.println("Do you want to see teacher list before remove ?\nY / N :");
        String resume = scan.nextLine();

        if (resume.equalsIgnoreCase("Y")){
            printAllTeachers();
            teacherRemove();
        } else if (resume.equalsIgnoreCase("N")) {
            teacherRemove();
        }else {
            System.out.println("Please enter a available preference");
            teacherRemoveMenu();
        }


    }

    private static void teacherRemove() {
        Set<Map.Entry<String,String>> teachersEntry = teachersMap.entrySet();

        for (Map.Entry<String,String> each:teachersEntry
        ) {
            String eachKey = each.getKey();
            String eachValue = each.getValue();
            String eachValueArr[] = eachValue.split(", ");

            System.out.println("Please enter ID for removing");
            String removeID = scan.nextLine();

            if (removeID.equalsIgnoreCase(eachKey)){

                System.out.printf("%11s  %-9s  %-9s   %-4s 2" +
                        "5   %-1s \n",eachKey,eachValueArr[0],eachValueArr[1],eachValueArr[2],eachValueArr[3]+"\n");

                System.out.println("Remove is succesful");
                teachersMap.remove(eachKey);

            }


        }



    }

    public static void printAllTeachers() throws InterruptedException {
        System.out.println("*****************************************************************");
        System.out.println("========================= TEACHER_LIST ==========================");
        System.out.println("ID__________NAME_______SURNAME______BIRTH___BRANCH");
        System.out.println("-----------------------------------------------------------------");
       Set<Map.Entry<String,String>> teachersEntry = teachersMap.entrySet();
        for (Map.Entry<String,String> each:teachersEntry
             ) {
            String eachKey = each.getKey();
            String eachValue = each.getValue();
            String[] eachValueArr = eachValue.split(", ");

            System.out.printf("%11s  %-12s  %-12s   %-4s 2" +
                    "5   %-1s \n",eachKey,eachValueArr[0],eachValueArr[1],eachValueArr[2],eachValueArr[3]);
        }
        System.out.println("*****************************************************************");
        System.out.println("Please wait...[returning main menu]");
        Thread.sleep(3000);
    }

    public static void teacherFindMenu() throws InterruptedException {


        do {
            System.out.println("Welcome ...");
            System.out.println("How Can Help You ? ");
            System.out.println("1 -> Search by name");
            System.out.println("2 -> Search by surname");
            System.out.println("3 -> Search by ID");
            System.out.println("4 -> Search by branch");
            System.out.println("T -> Return Teacher Menu ");
            System.out.println("M -> Return Main Menu ");
            System.out.println("----------------------");
            System.out.println("Please Make Your Choise");
            choiseTchFind = scan.nextLine();



            switch (choiseTchFind){

                case "1" :

                    break;

                case "2" :

                    break;

                case "3" :

                    break;

                case "4" :

                    break;

                case "T" :
                case "t" :
                        teacherMenu();
                    break;

                case "M" :
                case "m" :
                        Storage.mainMenu();
                    break;

                default: System.out.println("Please enter a available preference ");

            }
        }while (true);





    }

    private static void teacherSearchByName() throws InterruptedException {
        System.out.println("Please Enter Name to Search");
        String searchName = scan.nextLine();
        System.out.println("-----------------------------------------------------------------");
        Set<Map.Entry<String,String>> teachersEntry = teachersMap.entrySet();
        for (Map.Entry<String,String> each:teachersEntry
             ) {
            String eachKey = each.getKey();
            String eachValue = each.getValue();
            String eachValueArr[] = eachValue.split(", ");


                if (searchName.equalsIgnoreCase(eachValueArr[0])){

                    System.out.printf("%11s  %-9s  %-9s   %-4s 2" +
                            "5   %-1s \n",eachKey,eachValueArr[0],eachValueArr[1],eachValueArr[2],eachValueArr[3]+"\n");
                }



            }

        System.out.println("-----------------------------------------------------------------");
        System.out.println("Please Wait...");
        Thread.sleep(3000);



    }


    /* Default cons*/
    public Teacher() {}


    public Teacher(String teacherID, String teacherName, String teacherLastName, String teacherBirthYear, String teacherBranch) {
        this.teacherID = teacherID;
        this.teacherName = teacherName;
        this.teacherLastName = teacherLastName;
        this.teacherBirthYear = teacherBirthYear;
        this.teacherBranch = teacherBranch;
    }
    public static Map<String,String>  teacherAdd (){

        Map<String,String> tcr = new HashMap<>();

        System.out.println("Please EnterTeacher ID :");
        String id = scan.nextLine();
        System.out.println("Please EnterTeacher NAME :");
        String name = scan.nextLine();
        System.out.println("Please EnterTeacher SURNAME :");
        String surName = scan.nextLine();
        System.out.println("Please EnterTeacher BIRTH YEAR :");
        String birthYear = scan.nextLine();
        System.out.println("Please EnterTeacher BRANCH :");
        String branch = scan.nextLine();
        teachersMap.put(id,name+", "+surName+", "+birthYear+", "+branch);
        return teachersMap;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherID='" + teacherID + '\'' +
                ", teacherName='" + teacherName + '\'' +
                ", teacherLastName='" + teacherLastName + '\'' +
                ", teacherBirthYear='" + teacherBirthYear + '\'' +
                ", teacherBranch='" + teacherBranch + '\'' +
                '}';
    }
}

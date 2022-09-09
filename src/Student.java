import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Student {
    static Map<String,String> studentMap = new HashMap<>();
    static Scanner scan = new Scanner(System.in);

    private String studentID;
    private String studentName;
    private String studentLastName;
    private String studentClass;
    private String studentNoteMath;
    private String studentNotePhysics;
    private String studentNoteChemistry;

    /* SETTERS */
    public void setStudentName(String studentName) {this.studentName = studentName;}
    public void setStudentNotePhysics(String studentNotePhysics) {this.studentNotePhysics = studentNotePhysics;}
    public void setStudentID(String studentID) {this.studentID = studentID;}
    public void setStudentClass(String studentClass) {this.studentClass = studentClass;}
    public void setStudentNoteMath(String studentNoteMath) {this.studentNoteMath = studentNoteMath;}
    public void setStudentNoteChemistry(String studentNoteChemistry) {this.studentNoteChemistry = studentNoteChemistry;}
    public void setStudentLastName(String studentLastName) {this.studentLastName = studentLastName;}


    /* GETTERS */
    public String getStudentClass() {return studentClass;}
    public String getStudentNoteMath() {return studentNoteMath;}
    public String getStudentID() {return studentID;}
    public String getStudentLastName() {return studentLastName;}
    public String getStudentNotePhysics() {return studentNotePhysics;}
    public String getStudentNoteChemistry() {return studentNoteChemistry;}
    public String getStudentName() {return studentName;}

    static String choiseStdFind;

    public static void studentAddedAllready(){
        Student.studentMap.put("72345698741","Hayrullah, DEDELER, 6, 0, 0, 0");
        Student.studentMap.put("72345698742","Alex, Tom, 6, 0, 0, 0");
        Student.studentMap.put("12345498743","Jacko, Berky, 6, 0, 0, 0");
        Student.studentMap.put("62345698744","Terry, Coo, 6, 0, 0, 0");
        Student.studentMap.put("12345698746","Falcao, Davis, 7, 0, 0, 0");
        Student.studentMap.put("12345698747","Ronaldo, Marshall, 7, 0, 0, 0");
        Student.studentMap.put("12345298748","Messi, Morris, 7, 0, 0, 0");
        Student.studentMap.put("12345698749","Kane, Morrisa, 7, 0, 0, 0");


    }

    public static void studentMenu () throws InterruptedException {

        do {
            System.out.println("============= DEDELER_COLLEGE =============");
            System.out.println("=============== STUDENT_MENU ==============");
            System.out.println("1 -> Add a New Student");
            System.out.println("2 -> Finding a Student by Name");
            System.out.println("3 ->  Finding a Student by Class");
            System.out.println("4 -> Finding a Student by ID");
            System.out.println("5 -> Print All Students");
            System.out.println("6 -> Remove a Student From the Lıst");
            System.out.println("M -> Return Main Menu");
            System.out.println("-------------------------------------------");
            System.out.println("Please Make Your Choice");
            choiseStdFind=scan.nextLine();

            switch (choiseStdFind){

                case "1" :
                    studentAdd();
                    break;
                case "2" :
                   // teacherSearchByName();
                    break;
                case "3" :
                   // teacherSearchByBranch();
                    break;
                case "4" :
                    //teacherSearchByID();
                    break;
                case "5" :
                    printAllStudents();
                    break;
                case "6" :
                   // teacherRemoveMenu();
                    break;

                case "7" :
                    //teacherUpdateInformation();
                    break;

                case "M" :
                case "m" :
                    Storage.mainMenu();

                    break;

                default: System.out.println("Please enter a available preference ");

            }

        }while (!choiseStdFind.equalsIgnoreCase("Q"));


    }

    private static void printAllStudents() throws InterruptedException {

        System.out.println("*****************************************************************");
        System.out.println("========================= STUDENT_LIST ==========================");
        System.out.println("ID_______________NAME__________SURNAME_________CLASS");
        System.out.println("-----------------------------------------------------------------");
        Set<Map.Entry<String,String>> teachersEntry = studentMap.entrySet();
        for (Map.Entry<String,String> each:teachersEntry
        ) {
            String eachKey = each.getKey();
            String eachValue = each.getValue();
            String[] eachValueArr = eachValue.split(", ");

            System.out.printf("%11s  %-12s  %-12s   %-14s    %-7s ","\n",eachKey,eachValueArr[0],eachValueArr[1],eachValueArr[2]);
        }
        System.out.println();
        System.out.println("*****************************************************************");
        System.out.println("Please wait...[returning main menu]");
        Thread.sleep(3000);

    }

    private static Map<String,String> studentAdd() {

        Map<String,String> std = new HashMap<>();

        System.out.println("Please Enter Student ID :");
        String id = scan.nextLine();
        System.out.println("Please Enter Student NAME :");
        String name = scan.nextLine();
        System.out.println("Please Enter Student SURNAME :");
        String surName = scan.nextLine();
        System.out.println("Please EnterTeacher Class :");
        String classs = scan.nextLine();

        studentMap.put(id,name+", "+surName+", "+classs);
        return studentMap;
    }


}

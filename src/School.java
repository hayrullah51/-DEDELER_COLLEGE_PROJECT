public class School {

        /*
        School information will be kept in the SCHOOL class and will be constant (unchangeable)
        must be available.
        School information should be accessible from every class within the project.
        School Class must have SINGLETON PATTERN (Object
        should not allow it to be created).
         */
    static final String schoolName = "DEDELER_COLLEGE";
    static final String adress = "London/ENGLAND";
    static final String telephone = "+10 123 234 34 45";
    static final String eMail = "dedelerCollege@edu";

    private School (){// we don't want to allow create any object from school class, so we did this cons. private

    }


    public static void printSchoolInformation() throws InterruptedException {

        System.out.println("============= DEDELER_COLLEGE =============\n" +
                "adress : "+adress+"\n"+
                "telephone : "+telephone+"\n"+
                "e mail : "+eMail);
        Thread.sleep(3000);
    }
}

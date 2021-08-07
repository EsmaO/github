//import java.util.Scanner;
//
//public class Question01 {
//  /*
//    Create a student's variables in the main method and use this assign variables
// create a method named Changename, student as parameter
// get the information and change all the information in the method and add the new information
// have it print
// The line where we call the Rename method in the Main method is immediately then reprint student information
// Create a method named changesurname, this method is "lastname" as parameter get the variable. In the method,
//  ask the user to enter a new last name and change the old last name (i.e. can).
// */
//​
//        ​
//       // import java.util.Scanner;
//​
//    public class question1 {
//​
//        ​
//        public static void main(String[] args) {
//​
//​
//            Student st1 = new Student();
//            st1.Changename("Abuzittin");
//            st1.ChangeSurname();
//            System.out.println(st1);
//​
//​
//        }
//​
//    }
//    class Student {
//        private String name;
//        private String SureName;
//​
//        ​
//        public Student(String name, String SureName) {
//            this.name = name;
//            this.SureName = SureName;
//        }
//​
//        public Student() {
//​
//        }
//​
//        public void Changename (String name) {
//            this.name = name;
//​
//        }
//​
//        @Override
//        public String toString() {
//            return  name + " " + SureName;
//        }
//​
//        public void ChangeSurname() {
//            Scanner scan = new Scanner(System.in);
//            String Lastname = scan.nextLine();
//            this.SureName = Lastname;
//        }
//​
//        ​
//    }
//​
//}

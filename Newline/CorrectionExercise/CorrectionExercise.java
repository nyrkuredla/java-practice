package CorrectionExercise;

public class CorrectionExercise {
    public static void main (String[] args) {
        int numStudents;
        int numTeachers;
        double averageGPA;

        String schoolName;
        String schoolCity;
        Boolean isPublic;

        numStudents = 403;
        schoolCity = "Atlanta, GA";
        numTeachers = 62;
        averageGPA = 2.98;
        schoolName = "Grady High School";
        isPublic = true;

        System.out.println("School: " + schoolName);
        System.out.println("Teachers: " + numTeachers);

//    function(averageGPA, schoolCity);int var = null;

    if (numStudents >= 10) {
        System.out.println("We have at least 10 students");
    }
    if (numTeachers >= 5) {
        System.out.println("We have at least 5 teachers");
    }
}

    public void function (Double x, Double y) {
        x = 2.4;
        y = 8.9;
        System.out.println(x.toString() + "," + y.toString());
    }
}

//ORIGINAL CODE (NOT CORRECTED):

//public class School {public static void main(String[] args) {
//    int numStudents;
//    int NumberOfTeachersInTheSchool;
//    double average_gpa;
//
//
//
//
//
//
//    String n;
//    String CityInWhichTheSchoolResides;
//    boolean IS_PUBLIC;
//
//    numStudents = "403";
//    city = Atlanta, GA;
//    numTeachers = "62";
//    averageGPA = 2.98
//    name = Grady High School;
//    isPublic = yes;
//
//    println("School: " + name);
//    println("Teachers: " numberOfTeachers);
//
//    function(averageGPA, city);int var = null;
//
//    if (numStudents) {print "We have at least 10 students"}
//    while (numTeach) {
//        System.out.println(We have at least 5 teachers);
//    }
//}
//
//    public static function (double x, double y) {
//        System.out.println(x + ", ", + y.toString());
//    }
//}
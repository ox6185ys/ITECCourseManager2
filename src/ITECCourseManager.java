import java.util.ArrayList;
public class ITECCourseManager {
    public static void main(String args[]) {
        //ITECCourse Constructor for 4 courses.
        ITECCourse javaCourse = new ITECCourse("Java Programming", 2545, 24, "3050");

        javaCourse.addStudent("Pat");
        javaCourse.addStudent("Mike");
        javaCourse.addStudent("Andrew");
        javaCourse.writeCourseInfo();
//      The following is broken.  Possibly remove next 6 lines.
        ArrayList<ITECCourse> allCourse = new ArrayList<>();
        allCourse.add(javaCourse);
        ITECCourse maintenanceCourse = null;
        allCourse.add(maintenanceCourse);
        ITECCourse datacomCourse = null;
        allCourse.add(datacomCourse);

        maintenanceCourse = new ITECCourse("Microcomputer Systems Maintenance", 1310, 20, "50");

        maintenanceCourse.addStudent("Anna");
        maintenanceCourse.addStudent("Bill");
        maintenanceCourse.addStudent("Carl");
        maintenanceCourse.writeCourseInfo();

        datacomCourse = new ITECCourse("Data Communications", 1425, 30, "60");

        datacomCourse.addStudent("Dave");
        datacomCourse.addStudent("Ed");
        datacomCourse.addStudent("Flora");
        datacomCourse.writeCourseInfo();

        ITECCourse infoTechConceptsCourse = new ITECCourse("Info Tech Concepts", 1100, 30, "T3050");
        infoTechConceptsCourse.addStudent("Max");
        infoTechConceptsCourse.addStudent("Nancy");
        infoTechConceptsCourse.addStudent("Orson");
        infoTechConceptsCourse.writeCourseInfo();
        //Assemble ArrayList to get availability.
        ArrayList<ITECCourse> allCourses = new ArrayList<ITECCourse>();
        allCourses.add(maintenanceCourse);
        allCourses.add(datacomCourse);
        allCourses.add(infoTechConceptsCourse);

        for (ITECCourse course : allCourses) {
            System.out.println(course.getName());
            System.out.println("There are " + course.availableSeats() + " spaces open in this class.\n");
        }
    }
}
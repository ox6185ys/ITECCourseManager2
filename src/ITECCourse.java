import java.util.ArrayList;
public class ITECCourse {//Set private elements for ITECCourse Class.
    private String name;
    private int code;
    private ArrayList<String> students;
    private int maxStudents;
    private String roomNumber;
    //Constructorfor ITECCourse.
    ITECCourse(String courseName, int courseCode, int courseMaxStudents, String roomNumber)
    {
        this.name = courseName;
        this.code = courseCode;
        this.students = new ArrayList<>();
        this.maxStudents = courseMaxStudents;
        this.roomNumber = roomNumber;
    }
    public void addStudent(String studentName)
    {
        //don't need to check if students ArrayList is null –
        //we know that the constructor set it up -- Clara Comments.
        students.add(studentName);
    }

    //check this removeStudent
    void removeStudent(String studentName){
        if (students.contains(studentName)){
            students.remove("John");
            System.out.println(studentName + " was delisted"+this.name);
        }else {
            System.out.println(studentName = " was not enrolled.");
        }
    }

    public int availableSeats()//Method for course availability in ITECCourseManager Class
    {
        return (maxStudents - students.size());
    }
    public void writeCourseInfo() {//Display Course Details.
        System.out.println("Course Name: " + this.name);
        System.out.println("Course Code: " + this.code);
        System.out.println("Students enrolled:" + maxStudents  );
        for (String student : this.students) {
            System.out.println(student);
        }
        //System.out.println("There are " + getNumberOfStudents() + " students enrolled");
        System.out.println("The class meets in room number " + roomNumber );
        System.out.println("The max number of students that can enroll in this course is " + this.maxStudents +'\n');
    }
    //Return the total to ITECCourse Class.
    public String getName()
    {
        return name;
    }
}
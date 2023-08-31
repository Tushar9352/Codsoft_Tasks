import java.util.ArrayList;
import java.util.List;

public class CourseRegistrationSystem {
    private List<Course> courses;
    private List<Student> students;

    public CourseRegistrationSystem() {
        courses = new ArrayList<>();
        students = new ArrayList<>();
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void displayCourses() {
        System.out.println("Available Courses:");
        for (Course course : courses) {
            System.out.println(course);
        }
    }

    public void registerStudentForCourse(Student student, Course course) {
        if (course.getCapacity() > 0) {
            student.addCourse(course);
            course.decrementCapacity();
            System.out.println("Registration successful.");
        } else {
            System.out.println("Sorry, this course is full.");
        }
    }

    public void dropCourseForStudent(Student student, Course course) {
        student.removeCourse(course);
        course.incrementCapacity();
        System.out.println("Course dropped successfully.");
    }
}

public class Course {
    private String code;
    private String title;
    private String description;
    private int capacity;
    private String schedule;

    public Course(String code, String title, String description, int capacity, String schedule) {
        this.code = code;
        this.title = title;
        this.description = description;
        this.capacity = capacity;
        this.schedule = schedule;
    }

    public String getCode() {
        return code;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getCapacity() {
        return capacity;
    }

    public void decrementCapacity() {
        capacity--;
    }

    public void incrementCapacity() {
        capacity++;
    }

    public String getSchedule() {
        return schedule;
    }

    @Override
    public String toString() {
        return "Course{" +
                "code='" + code + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", capacity=" + capacity +
                ", schedule='" + schedule + '\'' +
                '}';
    }
}

public class Student {
    private String id;
    private String name;
    private List<Course> courses;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
        courses = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}

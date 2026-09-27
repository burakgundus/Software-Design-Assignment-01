package OOP;

import java.util.UUID;

public class ProgramCourse {

    private UUID id;
    private Program program;       // Hangi program?
    private Course course;         // Hangi ders?
    private int semesterOrder;     // Kaçıncı yarıyıl (1-8)
    private CourseType courseType; // Zorunlu/Seçmeli
    private boolean isActive;

    // 1. Boş Constructor
    public ProgramCourse() {
    }

    // 2. Dolu Constructor
    public ProgramCourse(UUID id, Program program, Course course, int semesterOrder, CourseType courseType) {
        this.id = id;
        this.program = program;
        this.course = course;
        this.semesterOrder = semesterOrder;
        this.courseType = courseType;
        this.isActive = true;
    }

    // Getter ve Setter Metodları
    public UUID getId() { return id; }
    public void setId(UUID id) { this.id = id; }

    public Program getProgram() { return program; }
    public void setProgram(Program program) { this.program = program; }

    public Course getCourse() { return course; }
    public void setCourse(Course course) { this.course = course; }

    public int getSemesterOrder() { return semesterOrder; }
    public void setSemesterOrder(int semesterOrder) { this.semesterOrder = semesterOrder; }

    public CourseType getCourseType() { return courseType; }
    public void setCourseType(CourseType courseType) { this.courseType = courseType; }

    boolean isActive() { return isActive; }
    void setActive(boolean active) { isActive = active; }

    @Override
    public String toString() {
        return program.getName() + " - " + course.getName() + " (" + semesterOrder + ". Dönem)";
    }
}
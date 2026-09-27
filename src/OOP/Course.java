package OOP;

import java.util.UUID;

public class Course {

    private UUID id;
    private String code;
    private String name;
    private Department department; // FK referansı: Hangi bölüme ait?
    private int credits;
    private int theoryHours;
    private int labHours;
    private CourseType courseType; // Enum (Mandatory, Elective vb.)
    private String language;
    private String description;
    private boolean isActive;

    // 1. Boş Constructor
    public Course() {
    }

    // 2. Dolu Constructor
    public Course(UUID id, String code, String name, Department department, int credits, CourseType courseType) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.department = department;
        this.credits = credits;
        this.courseType = courseType;
        this.isActive = true;
    }

    // Getter ve Setter Metodları
    public UUID getId() { return id; }
    public void setId(UUID id) { this.id = id; }

    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Department getDepartment() { return department; }
    public void setDepartment(Department department) { this.department = department; }

    public int getCredits() { return credits; }
    public void setCredits(int credits) { this.credits = credits; }

    public int getTheoryHours() { return theoryHours; }
    public void setTheoryHours(int theoryHours) { this.theoryHours = theoryHours; }

    public int getLabHours() { return labHours; }
    public void setLabHours(int labHours) { this.labHours = labHours; }

    public CourseType getCourseType() { return courseType; }
    public void setCourseType(CourseType courseType) { this.courseType = courseType; }

    public String getLanguage() { return language; }
    public void setLanguage(String language) { this.language = language; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public boolean isActive() { return isActive; }
    public void setActive(boolean active) { this.isActive = active; }

    @Override
    public String toString() {
        return "Ders: " + name + " (" + code + ") - Kredi: " + credits;
    }
}
package OOP;

import java.util.UUID;

public class CoursePrerequisite {

    private UUID id;
    private Course course;             
    private Course prerequisiteCourse; 
    private PrerequisiteType type;     
    private String minGrade;

    public CoursePrerequisite() {
    }

    public CoursePrerequisite(UUID id, Course course, Course prerequisiteCourse, PrerequisiteType type) {
        this.id = id;
        this.course = course;
        this.prerequisiteCourse = prerequisiteCourse;
        this.type = type;
    }

    public UUID getId() { return id; }
    public void setId(UUID id) { this.id = id; }

    public Course getCourse() { return course; }
    public void setCourse(Course course) { this.course = course; }

    public Course getPrerequisiteCourse() { return prerequisiteCourse; }
    public void setPrerequisiteCourse(Course prerequisiteCourse) { this.prerequisiteCourse = prerequisiteCourse; }

    public PrerequisiteType getType() { return type; }
    public void setType(PrerequisiteType type) { this.type = type; }

    public String getMinGrade() { return minGrade; }
    public void setMinGrade(String minGrade) { this.minGrade = minGrade; }

    @Override
    public String toString() {
        return course.getCode() + " dersi için önkoşul: " + prerequisiteCourse.getCode();
    }
}
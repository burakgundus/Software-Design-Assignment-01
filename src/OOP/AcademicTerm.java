package OOP;

import java.time.LocalDate;
import java.util.UUID;

public class AcademicTerm {

    private UUID id;
    private String code;
    private String name;
    private String academicYear;
    private Semester semester; // semester enum
    private LocalDate startDate;
    private LocalDate endDate;
    private LocalDate registrationStart;
    private LocalDate registrationEnd;
    private LocalDate addDropEnd;
    private boolean isActive;

    public AcademicTerm() {
    }

    public AcademicTerm(UUID id, String code, String name, String academicYear, Semester semester) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.academicYear = academicYear;
        this.semester = semester;
        this.isActive = true;
    }

    public UUID getId() { return id; }
    public void setId(UUID id) { this.id = id; }

    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getAcademicYear() { return academicYear; }
    public void setAcademicYear(String academicYear) { this.academicYear = academicYear; }

    public Semester getSemester() { return semester; }
    public void setSemester(Semester semester) { this.semester = semester; }

    public LocalDate getStartDate() { return startDate; }
    public void setStartDate(LocalDate startDate) { this.startDate = startDate; }

    public LocalDate getEndDate() { return endDate; }
    public void setEndDate(LocalDate endDate) { this.endDate = endDate; }

    public LocalDate getRegistrationStart() { return registrationStart; }
    public void setRegistrationStart(LocalDate registrationStart) { this.registrationStart = registrationStart; }

    public LocalDate getRegistrationEnd() { return registrationEnd; }
    public void setRegistrationEnd(LocalDate registrationEnd) { this.registrationEnd = registrationEnd; }

    public LocalDate getAddDropEnd() { return addDropEnd; }
    public void setAddDropEnd(LocalDate addDropEnd) { this.addDropEnd = addDropEnd; }

    public boolean isActive() { return isActive; }
    public void setActive(boolean active) { this.isActive = active; }

    @Override
    public String toString() {
        return "Dönem: " + name + " (" + academicYear + ")";
    }
}
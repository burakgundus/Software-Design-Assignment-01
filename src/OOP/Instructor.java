package OOP;

import java.time.LocalDate;
import java.util.UUID;

public class Instructor {

    // Şemaya göre belirlenen alanlar[cite: 1]
    private UUID id;
    private String employeeNo;
    private String nationalId;
    private String firstName;
    private String lastName;
    private String email;
    private Department department; // FK referansı: İlgili bölüm
    private InstructorTitle title; // Oluşturduğun enum
    private String specialization;
    private LocalDate hireDate;
    private boolean isActive;

    // 1. Boş Constructor
    public Instructor() {
    }

    // 2. Dolu Constructor
    public Instructor(UUID id, String employeeNo, String firstName, String lastName, InstructorTitle title) {
        this.id = id;
        this.employeeNo = employeeNo;
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.isActive = true; // Varsayılan olarak aktif başlasın
    }

    // Getter ve Setter Metodları
    public UUID getId() { return id; }
    public void setId(UUID id) { this.id = id; }

    public String getEmployeeNo() { return employeeNo; }
    public void setEmployeeNo(String employeeNo) { this.employeeNo = employeeNo; }

    public String getNationalId() { return nationalId; }
    public void setNationalId(String nationalId) { this.nationalId = nationalId; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public Department getDepartment() { return department; }
    public void setDepartment(Department department) { this.department = department; }

    public InstructorTitle getTitle() { return title; }
    public void setTitle(InstructorTitle title) { this.title = title; }

    public String getSpecialization() { return specialization; }
    public void setSpecialization(String specialization) { this.specialization = specialization; }

    public LocalDate getHireDate() { return hireDate; }
    public void setHireDate(LocalDate hireDate) { this.hireDate = hireDate; }

    public boolean isActive() { return isActive; }
    public void setActive(boolean active) { this.isActive = active; }

    @Override
    public String toString() {
        return title + " " + firstName + " " + lastName;
    }
}
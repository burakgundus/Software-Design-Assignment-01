package OOP;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

public class Student {
    
    // Değişkenler (Fields)
    private UUID id;
    private String studentNumber;
    private String nationalId;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private Gender gender; 
    private String email;
    private String phoneNumber;
    private String address;
    private Program program; 
    private int enrollmentYear;
    private int classYear;
    private Status status; 
    private String photoUrl;
    private LocalDateTime createdAt;

    // 1. Boş Constructor
    public Student() {
    }

    // 2. Dolu Constructor
    public Student(UUID id, String studentNumber, String firstName, String lastName, Program program, Status status) {
        this.id = id;
        this.studentNumber = studentNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.program = program;
        this.status = status;
        this.createdAt = LocalDateTime.now();
    }

    // Getter ve Setter Metodları
    public UUID getId() { return id; }
    public void setId(UUID id) { this.id = id; }

    public String getStudentNumber() { return studentNumber; }
    public void setStudentNumber(String studentNumber) { this.studentNumber = studentNumber; }

    public String getNationalId() { return nationalId; }
    public void setNationalId(String nationalId) { this.nationalId = nationalId; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public LocalDate getBirthDate() { return birthDate; }
    public void setBirthDate(LocalDate birthDate) { this.birthDate = birthDate; }

    public Gender getGender() { return gender; }
    public void setGender(Gender gender) { this.gender = gender; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public Program getProgram() { return program; }
    public void setProgram(Program program) { this.program = program; }

    public int getEnrollmentYear() { return enrollmentYear; }
    public void setEnrollmentYear(int enrollmentYear) { this.enrollmentYear = enrollmentYear; }

    public int getClassYear() { return classYear; }
    public void setClassYear(int classYear) { this.classYear = classYear; }

    public Status getStatus() { return status; }
    public void setStatus(Status status) { this.status = status; }

    public String getPhotoUrl() { return photoUrl; }
    public void setPhotoUrl(String photoUrl) { this.photoUrl = photoUrl; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    // toString Metodu
    @Override
    public String toString() {
        return "Öğrenci: " + firstName + " " + lastName + " | No: " + studentNumber + " | Durum: " + status;
    }
}
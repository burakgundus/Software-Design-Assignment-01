package OOP;

import java.time.LocalDateTime;
import java.util.UUID;

public class Faculty {

    private UUID id;
    private String code;
    private String name;
    private Instructor dean; // FK referansı
    private String phone;
    private String email;
    private boolean isActive;
    private LocalDateTime createdAt;

    public Faculty() {
    }

    public Faculty(UUID id, String code, String name) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.createdAt = LocalDateTime.now();
    }

    public UUID getId() { return id; }
    public void setId(UUID id) { this.id = id; }

    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Instructor getDean() { return dean; }
    public void setDean(Instructor dean) { this.dean = dean; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public boolean isActive() { return isActive; }
    public void setActive(boolean active) { this.isActive = active; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    @Override
    public String toString() {
        return "Fakülte: " + name + " (" + code + ")";
    }
}
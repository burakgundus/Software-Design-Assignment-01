package OOP;

import java.util.UUID;

public class Program {
    
    private UUID id;
    private String code;
    private String name;
    // private Department department; 
    private DegreeLevel degreeLevel; // Senin oluşturduğun enum
    private int totalCredits;
    private int durationYears;
    private String language;
    private boolean isActive;

    // Boş Constructor
    public Program() {
    }

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public DegreeLevel getDegreeLevel() {
		return degreeLevel;
	}

	public void setDegreeLevel(DegreeLevel degreeLevel) {
		this.degreeLevel = degreeLevel;
	}

	public int getTotalCredits() {
		return totalCredits;
	}

	public void setTotalCredits(int totalCredits) {
		this.totalCredits = totalCredits;
	}

	public int getDurationYears() {
		return durationYears;
	}

	public void setDurationYears(int durationYears) {
		this.durationYears = durationYears;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

}
package OOP;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        ArrayList<Student> studentList = new ArrayList<>();

// 		test amaciyla default bi program olusturdum
        Program defaultProgram = new Program();
        defaultProgram.setName("Yazılım Mühendisliği Lisans Programı");

        int choice;
        do {
            System.out.println("    ÖĞRENCİ BİLGİ SİSTEMİ (OBS)    \n");
            System.out.println("1. Yeni Öğrenci Kaydet");
            System.out.println("2. Kayıtlı Tüm Öğrencileri Listele");
            System.out.println("3. Test Verileri Yükle");
            System.out.println("0. Çıkış");
            System.out.print("Seçiminiz: ");
            
            choice = input.nextInt();
            input.nextLine(); // Buffer temizleme

            switch (choice) {
                case 1:
                    System.out.println("\n    YENİ ÖĞRENCİ KAYIT EKRANI ");
                    
                    System.out.print("Öğrenci Numarası: ");
                    String studentNo = input.nextLine();

                    System.out.print("Adı: ");
                    String firstName = input.nextLine();

                    System.out.print("Soyadı: ");
                    String lastName = input.nextLine();

                    System.out.print("Cinsiyet Seçin ([1] Erkek(Male), [2] Kadın(Female)): ");
                    int genderChoice = input.nextInt();
                    input.nextLine();
                    Gender gender = (genderChoice == 1) ? Gender.MALE : Gender.FEMALE;

                    System.out.print("Öğrenci Durumu Seçin ([1] Aktif(Active), [2] Mezun(Graduated): ");
                    int statusChoice = input.nextInt();
                    input.nextLine();
                    Status status = (statusChoice == 1) ? Status.ACTIVE : Status.GRADUATED;

                    Student newStudent = new Student(
                        UUID.randomUUID(),
                        studentNo,
                        firstName,
                        lastName,
                        defaultProgram,
                        status
                    );
                    newStudent.setGender(gender);

                    studentList.add(newStudent);
                    System.out.println(" Başarıyla kaydedildi!");
                    break;

                case 2:
                    System.out.println("\n    SİSTEMDEKİ TÜM ÖĞRENCİLER ");
                    if (studentList.isEmpty()) {
                        System.out.println("Sistemde henüz kayıtlı öğrenci bulunmuyor.");
                    } else {
                        for (Student s : studentList) {
                            System.out.println(s.toString() + " | Cinsiyet: " + s.getGender());
                        }
                    }
                    break;

                case 3:
                    Student s1 = new Student(UUID.randomUUID(), "260507211", "Burak", "Demir", defaultProgram, Status.ACTIVE);
                    s1.setGender(Gender.MALE);
                    Student s2 = new Student(UUID.randomUUID(), "251684597", "Zeynep", "Çelik", defaultProgram, Status.GRADUATED);
                    s2.setGender(Gender.FEMALE);
                    
                    studentList.add(s1);
                    studentList.add(s2);
                    System.out.println("Test verileri başarıyla yüklendi!");
                    break;

                case 0:
                    System.out.println("Sistemden çıkılıyor. İyi günler!");
                    break;

                default:
                    System.out.println("Geçersiz seçim yaptınız, tekrar deneyin.");
            }
            
        } while (choice != 0);

        input.close();
    }
}
package model;

import java.io.File;

public class User {

    private String firstName;
    private String lastName;
    private String gender;
    private int age;
    private String phone;
    private String email;
    private String continent;
    private String experience;
    private File photo;

    public User(String firstName, String lastName, String gender, int age,
                String phone, String email, String continent, String experience, File photo) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.phone = phone;
        this.email = email;
        this.continent = continent;
        this.experience = experience;
        this.photo = photo;
    }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getContinent() { return continent; }
    public void setContinent(String continent) { this.continent = continent; }

    public String getExperience() { return experience; }
    public void setExperience(String experience) { this.experience = experience; }

    public File getPhoto() { return photo; }
    public void setPhoto(File photo) { this.photo = photo; }

    @Override
    public String toString() {
        return String.format(
            "User Profile:\nFirst Name: %s\nLast Name: %s\nGender: %s\nAge: %d\nPhone: %s\nEmail: %s\nContinent: %s\nExperience: %s",
            firstName, lastName, gender, age, phone, email, continent, experience
        );
    }
}

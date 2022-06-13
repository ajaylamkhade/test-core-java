package javarunner.core.interview.javaeight;

import java.util.List;

public class User {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<String> getEmails() {
        return emails;
    }

    public void setEmails(List<String> emails) {
        this.emails = emails;
    }

    String name;
    Long phoneNumber;
    List<String> emails;

    public User(String name, Long phoneNumber, List<String> emails) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.emails = emails;
    }

    public User() {

    }
}

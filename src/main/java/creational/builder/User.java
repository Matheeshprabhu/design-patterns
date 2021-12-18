package creational.builder;

import java.time.LocalDate;

public class User {

    private String firstName;
    private String lastName;
    private LocalDate birthday;
    private Address address;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getAge() {
        return birthday;
    }

    public void setBirthday(LocalDate age) {
        this.birthday = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}

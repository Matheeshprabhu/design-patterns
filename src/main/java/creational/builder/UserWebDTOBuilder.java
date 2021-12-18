package creational.builder;

import java.time.LocalDate;
import java.time.Period;

public class UserWebDTOBuilder implements  UserDTOBuilder{

    private String firstName;
    private String lastName;
    private String age;
    private String address;
    private UserWebDTO userWebDTO;

    @Override
    public UserDTOBuilder firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    @Override
    public UserDTOBuilder lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    @Override
    public UserDTOBuilder birthday(LocalDate birthday) {
        Period age = Period.between(birthday, LocalDate.now());
        this.age = Integer.toString(age.getYears());
        return this;
    }

    @Override
    public UserDTOBuilder address(Address address) {
        this.address = address.toString();
        return this;
    }

    @Override
    public UserDTO build() {
        userWebDTO = new UserWebDTO(firstName+ " " + lastName,
                address, age);
        return userWebDTO;
    }

    @Override
    public UserDTO getUserDTO() {
        return userWebDTO;
    }
}

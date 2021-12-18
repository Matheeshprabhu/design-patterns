package creational.builder;

import java.time.LocalDate;
import java.time.Period;

public class UserWebDTO implements UserDTO {

    private String name;

    private String address;

    private String age;

    @Override
    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    @Override
    public String getAddress() {
        return address;
    }

    private void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String getAge() {
        return age;
    }

    private void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "name=" + name + "\nage=" + age + "\naddress=" + address ;
    }

    public static UserWebDTOBuilder getBuilder(){
        return new UserWebDTOBuilder();
    }

    public static class UserWebDTOBuilder implements  UserDTOBuilder{

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
            userWebDTO = new UserWebDTO();
            userWebDTO.setName(firstName + " " + lastName);
            userWebDTO.setAge(age);
            userWebDTO.setAddress(address);
            return userWebDTO;
        }

        @Override
        public UserDTO getUserDTO() {
            return userWebDTO;
        }
    }

}

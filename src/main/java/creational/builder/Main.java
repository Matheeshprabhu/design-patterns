package creational.builder;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        UserDTO userDTO = directBuild(new UserWebDTOBuilder(), createUser());

        System.out.println(userDTO);

    }

    public static UserDTO directBuild(UserDTOBuilder userDTOBuilder, User user){

        return userDTOBuilder.firstName(user.getFirstName()).lastName(user.getLastName())
                .address(user.getAddress()).birthday(user.getAge()).build();
    }

    public static User createUser() {
        User user = new User();
        user.setBirthday(LocalDate.of(1999, 1, 11));
        user.setFirstName("Matheesh");
        user.setLastName("Prabhu");
        Address address = new Address();
        address.setHouseNumber("No.22");
        address.setStreet("unknown street");
        address.setCity("Chennai");
        address.setState("Tamilnadu");
        address.setZipcode("627111");
        user.setAddress(address);
        return user;
    }
}

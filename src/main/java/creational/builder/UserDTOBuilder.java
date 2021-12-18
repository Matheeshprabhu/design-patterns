package creational.builder;

import java.time.LocalDate;

public interface UserDTOBuilder {

    UserDTOBuilder firstName(String firstName);
    UserDTOBuilder lastName(String lastName);
    UserDTOBuilder birthday(LocalDate birthday);
    UserDTOBuilder address(Address address);

    UserDTO build();
    UserDTO getUserDTO();

}

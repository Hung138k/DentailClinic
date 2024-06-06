package com.example.dentailclinic.dto;

import com.example.dentailclinic.entity.Address;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    private Long userID;
    private String name;
    private String email;
    private String img;
    private String phone;
    private String description;
    private Float salary;
    private Date createdDate;
    private String password;
    private Set<RoleDto> roles;
    private List<Address> addresses;
    private Boolean gender;
    private Date dob;
}

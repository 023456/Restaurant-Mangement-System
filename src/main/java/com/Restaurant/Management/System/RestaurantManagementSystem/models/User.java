package com.Restaurant.Management.System.RestaurantManagementSystem.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User extends BaseModel{
    private String name;
    private String password;
    private String phone;
    private UserType userType;
}

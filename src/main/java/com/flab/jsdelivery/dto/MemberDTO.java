package com.flab.jsdelivery.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter@Setter@AllArgsConstructor
public class MemberDTO {
    private String id;
    private String password;
    private String userName;
    private String phone;
    private String email;
    private String address;

}

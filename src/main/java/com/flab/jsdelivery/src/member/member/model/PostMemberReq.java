package com.flab.jsdelivery.src.member.member.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter@Setter@AllArgsConstructor
public class PostMemberReq {
    private String id;
    private String password;
    private String userName;
    private String phone;
    private String email;
    private String address;

}

package com.flab.jsdelivery.controller;

import com.flab.jsdelivery.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/members")
public class MemberController {
    @Autowired
    private final MemberService memberService;

    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
//
//    /**
//     * 회원가입
//     * [POST] /members/
//     */
//    @ResponseBody
//    @PostMapping("")
//    public PostMemberRes createMember(@RequestBody PostMemberReq postMemberReq){
//
//        try{
//            PostMemberRes postMemberRes = memberService.createMember(postMemberReq);
//            return new postMemberRes;
//        } catch (Exception exception){
//            return exception.getStackTrace();
//        }
//
//    }


    /**
     * 로그인
     * [POST] /members/login
     */






}

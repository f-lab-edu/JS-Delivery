package com.flab.jsdelivery.src.member.member;

import com.flab.jsdelivery.src.member.member.model.PostMemberReq;
import com.flab.jsdelivery.src.member.member.model.PostMemberRes;
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

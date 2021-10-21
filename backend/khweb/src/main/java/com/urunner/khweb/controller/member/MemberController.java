package com.urunner.khweb.controller.member;

import com.urunner.khweb.controller.dto.MemberRes;
import com.urunner.khweb.repository.member.MemberRepository;
import com.urunner.khweb.service.member.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Slf4j
@Controller
@RequestMapping("/memberManagement")
@CrossOrigin(origins = "http://localhost:8080", allowedHeaders = "*")
public class MemberController {
    @Autowired
    MemberService memberService;

    @Autowired
    MemberRepository memberRepository;

    //회원가입
    @PostMapping("/register-member")
    public ResponseEntity<Boolean> register(@RequestBody MemberRes memberRes) throws Exception {

        log.info("register()");

        boolean isOk = memberService.registerMember(memberRes);

        if(isOk){
            return new ResponseEntity<>(true,HttpStatus.OK);
        }else{
            return new ResponseEntity<>(false,HttpStatus.OK);
        }




    }



    // 회원 탈퇴
    @DeleteMapping("/leaveMember/{memberNo}")
    public ResponseEntity<Void> leaveMember(@PathVariable("memberNo")Long memberNo) throws Exception {

        memberService.leaveMember(memberNo);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }
}
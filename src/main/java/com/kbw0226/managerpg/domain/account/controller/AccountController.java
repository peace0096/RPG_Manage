package com.kbw0226.managerpg.domain.account.controller;

import com.kbw0226.managerpg.domain.account.entitiy.Account;
import com.kbw0226.managerpg.domain.account.service.AccountService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/account")
public class AccountController {
    private final AccountService accountService;

    @GetMapping("/test")
    public ResponseEntity<?> test(@RequestParam String name) {

        return ResponseEntity.ok(accountService.addAccount(name));
    }

    @GetMapping("/test1")
    public ResponseEntity<?> test1() {
        return ResponseEntity.ok("Success");
    }
}

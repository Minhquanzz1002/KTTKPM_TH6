package vn.edu.iuh.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vn.edu.iuh.models.Account;
import vn.edu.iuh.services.AccountService;

@RestController
@RequestMapping("/api/account")
@RequiredArgsConstructor
public class AccountController {
    private final AccountService accountService;

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody Account account) {
        Account _account = accountService.save(account);
        if (null == _account) {
            return new ResponseEntity<>("There was an error with your registration. Please try registering again.", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>("Your account has been created.", HttpStatus.CREATED);
    }
}

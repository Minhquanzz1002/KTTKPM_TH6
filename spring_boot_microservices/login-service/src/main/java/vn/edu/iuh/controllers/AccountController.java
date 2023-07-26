package vn.edu.iuh.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vn.edu.iuh.models.Account;
import vn.edu.iuh.services.AccountService;

@RestController
@RequestMapping("/api/account")
@RequiredArgsConstructor
public class AccountController {
    private final AccountService accountService;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody Account account) {
        boolean isValid = accountService.login(account);
        if (isValid) {
            return new ResponseEntity<>("Login successfully!" , HttpStatus.OK);
        }
        return new ResponseEntity<>("Login failed", HttpStatus.UNAUTHORIZED);
    }
}

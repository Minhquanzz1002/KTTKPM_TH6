package vn.edu.iuh.services.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import vn.edu.iuh.models.Account;
import vn.edu.iuh.repositories.AccountRepository;
import vn.edu.iuh.services.AccountService;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {
    private final AccountRepository accountRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public boolean login(Account account) {
        Optional<Account> optionalAccount = accountRepository.findByUsername(account.getUsername());
        if (optionalAccount.isEmpty()) {
            return false;
        }
        Account _account = optionalAccount.get();
        if (bCryptPasswordEncoder.matches(account.getPassword(), _account.getPassword())) {
            return true;
        }
        return false;
    }
}

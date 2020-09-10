package pl.bartoszchodyla.account;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by "Bartosz Chodyla" on 2020-09-07.
 */
public class AccountService {

    private AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    List<Account> getAllActiveAccounts() {
        return accountRepository.getAllAccounts().stream()
                .filter(Account::isActive)
                .collect(Collectors.toList());
    }

    List<String> findByName(String name) {
        return accountRepository.getByName(name);
    }

}

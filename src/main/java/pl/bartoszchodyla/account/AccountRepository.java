package pl.bartoszchodyla.account;

import java.util.List;

/**
 * Created by "Bartosz Chodyla" on 2020-09-07.
 */
public interface AccountRepository {

    List<Account> getAllAccounts();
    List<String> getByName(String name);
}

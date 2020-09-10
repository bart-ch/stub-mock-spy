package pl.bartoszchodyla.account;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;

/**
 * Created by "Bartosz Chodyla" on 2020-09-10.
 */
class AccountTest {

    @Test
    void getAllActiveAccounts() {

        //given
        AccountRepository accountRepositoryStub = new AccountRepositoryStub();
        AccountService accountService = new AccountService(accountRepositoryStub);

        //when
        List<Account> activeAccounts = accountService.getAllActiveAccounts();

        //then
        assertThat(activeAccounts.size(), is(2));
    }

    @Test
    void getNoActiveAccounts() {

        //given
        AccountRepository accountRepository = mock(AccountRepository.class);
        AccountService accountService = new AccountService(accountRepository);
        given(accountRepository.getAllAccounts()).willReturn(Collections.emptyList());

        //when
        List<Account> activeAccounts = accountService.getAllActiveAccounts();

        //then
        assertThat(activeAccounts.size(), is(0));
    }

}
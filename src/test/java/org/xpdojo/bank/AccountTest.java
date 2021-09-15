package org.xpdojo.bank;

import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class AccountTest {

    @Test
    @Ignore
    public void depositAnAmountToIncreaseTheBalance() {
        Account account = new Account();
        account.addBalance(10);
        assertEquals(account.balance, 10);
    }

    @Test
    @Ignore
    public void checkBalance() {
        Account account = new Account();
        account.addBalance(10);
        account.addBalance(10);
        assertEquals(account.balance, 20);
    }

    @Test
    @Ignore
    public void checkBalanceAfterDeductingAmount() {
        Account account = new Account();
        account.addBalance(10);
        account.addBalance(20);
        account.addBalance(-15);
        assertEquals(account.balance, 15);
    }


}

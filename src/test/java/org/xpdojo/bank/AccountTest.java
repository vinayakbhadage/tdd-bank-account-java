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

        assertEquals(account.balance, 0);
    }
}

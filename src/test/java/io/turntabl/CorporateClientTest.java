package io.turntabl;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class CorporateClientTest {

    @Test
    public void testGetClientName() {

        AccountManager accountManager = new AccountManager("alex");

        CorporateClient corporateClient = new CorporateClient("kwame", "1", ServiceLevel.GOLD, accountManager);

        Assert.assertEquals(accountManager.getName(), corporateClient.getClientName());
    }
}
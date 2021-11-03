package io.turntabl;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PrivateClientTest {

    @Test
    public void testGetClientName() {
        PrivateClient privateClient = new PrivateClient("kwame", "1", ServiceLevel.PLATINUM);

        Assert.assertEquals("kwame", privateClient.getClientName());
    }

}
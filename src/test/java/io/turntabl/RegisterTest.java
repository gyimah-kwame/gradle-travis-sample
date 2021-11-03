package io.turntabl;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class RegisterTest {


    @Test
    public void testGetNamesOfGoldClients() {

        List<Client> clients = List.of(
                new PrivateClient("kwame", "1",  ServiceLevel.GOLD),
                new CorporateClient("kofi", "2",  ServiceLevel.PREMIUM, new AccountManager("john")),
                new CorporateClient("yaw",  "3",  ServiceLevel.GOLD, new AccountManager("john")),
                new PrivateClient("dan", "4",  ServiceLevel.PLATINUM)
        );

        Register register = new Register(clients);

        assertEquals(List.of("kwame", "yaw"), register.getNamesOfGoldClients());
    }

    @Test
    public void testGetClientNameById() {
        List<Client> clients = List.of(
                new PrivateClient("kwame", "1",  ServiceLevel.GOLD),
                new CorporateClient("kofi", "2",  ServiceLevel.PREMIUM, new AccountManager("john")),
                new CorporateClient("yaw",  "3",  ServiceLevel.GOLD, new AccountManager("john")),
                new PrivateClient("dan", "4",  ServiceLevel.PLATINUM)
        );

        Register register = new Register(clients);

        assertNotNull(register.getClientNameById("1").orElse(null));
    }

    @Test
    public void testGetClientNameByIdNotFound() {
        List<Client> clients = List.of(
                new PrivateClient("kwame", "1",  ServiceLevel.GOLD),
                new CorporateClient("kofi", "2",  ServiceLevel.PREMIUM, new AccountManager("john")),
                new CorporateClient("yaw",  "3",  ServiceLevel.GOLD, new AccountManager("john")),
                new PrivateClient("dan", "4",  ServiceLevel.PLATINUM)
        );

        Register register = new Register(clients);

        assertNull(register.getClientNameById("10").orElse(null));
    }


    @Test
    public void testGetNumberOfClientsInEachLevel() {
        assertTrue(true);
    }
}
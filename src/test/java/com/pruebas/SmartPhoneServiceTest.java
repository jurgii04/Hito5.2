package com.pruebas;

import com.example.demo.service.SmartPhoneServiceImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SmartPhoneServiceTest {

    @Test
    void testCount() {
        SmartPhoneServiceImpl service = new SmartPhoneServiceImpl();
        int count = service.count();

        assertNotNull(count, "El método count() no debe devolver NULL");
        assertTrue(count > 0, "El valor devuelto por count() debe ser mayor que 0");
        assertEquals(3, count, "El valor devuelto por count() debe ser 3");
    }
}
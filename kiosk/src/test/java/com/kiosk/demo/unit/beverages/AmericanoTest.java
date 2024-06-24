package com.kiosk.demo.unit.beverages;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class AmericanoTest {

    @Test
    void getName() {

        Americano americano = new Americano();

        // 임마는 Junit
        assertEquals(americano.getName(),"Americano");

        // AssertJ
        assertThat(americano.getName()).isEqualTo("Americano");
    }

    @Test
    void getPrice(){
        Americano americano = new Americano();

        assertThat(americano.getPrice()).isEqualTo(4000);
    }
}
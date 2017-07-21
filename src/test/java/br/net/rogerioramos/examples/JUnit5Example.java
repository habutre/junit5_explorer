package br.net.rogerioramos.examples;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName("Bank Withdraw")
public class JUnit5Example {

    @Nested
    @DisplayName("Enough Balance Context")
    class EnoughBalanceContext {

        @Test
        @DisplayName("allow withdraw an amount of 200€ from a balance of 1500€")
        public void successWithdraw200() {
            assertEquals(1300, 1300);
        }

        @Test
        @DisplayName("allow withdraw an amount of 469€ from a balance of 1300€")
        public void successWithdraw469() {
            assertEquals(831, 830);
        }
    }

    @Nested
    @DisplayName("Insufficient Balance Context")
    class InsufficientBalanceContext {

        @Test
        @DisplayName("avoid withdraws with negative balance")
        public void subModuleOne() {
            assertThrows(ArithmeticException.class, () -> {
                Integer errorAhead = 10 / 0;
            });
        }

        @Test
        @DisplayName("show up a message informing the negative balance")
        public void showNegativeBalanceMessage() {
            assertEquals("Mr. xxx your balance current is -100€",
                    "Mr. xxx your balance current is -100€");
        }
    }

}

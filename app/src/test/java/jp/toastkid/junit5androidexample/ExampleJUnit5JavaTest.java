package jp.toastkid.junit5androidexample;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author toastkidjp
 */
class ExampleJUnit5JavaTest {

    @Test
    void test() {
        assertAll(
                new Executable() {
                    @Override
                    public void execute() throws Throwable {
                        System.out.println("1st");
                        assertEquals(1, 0 + 1);
                    }
                },
                new Executable() {
                    @Override
                    public void execute() throws Throwable {
                        System.out.println("2nd");
                        assertEquals(3, 0 + 1);
                    }
                },
                new Executable() {
                    @Override
                    public void execute() throws Throwable {
                        System.out.println("3rd");
                        assertEquals(2, 1 + 1);
                    }
                }
        );
    }
}

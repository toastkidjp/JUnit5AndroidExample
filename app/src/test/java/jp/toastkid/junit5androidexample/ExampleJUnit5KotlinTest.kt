package jp.toastkid.junit5androidexample

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.function.Executable
import org.junit.jupiter.api.Assertions.assertAll
import org.junit.jupiter.api.Assertions.assertEquals

/**
 * @author toastkidjp
 */
internal class ExampleJUnit5KotlinTest {

    @Test
    fun test() {
        assertAll(
                Executable {
                    println("1st")
                    assertEquals(1, 0 + 1)
                },
                Executable {
                    println("2nd")
                    assertEquals(2, 1 + 1)
                },
                Executable {
                    println("3rd")
                    assertEquals(2, 1 + 1)
                }
        )
    }
}

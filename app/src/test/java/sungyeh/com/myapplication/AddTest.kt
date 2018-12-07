import junit.framework.TestCase.assertEquals
import org.junit.Test
import sungyeh.com.myapplication.Add
class AddTest {
    @Test
    fun add() {
        //arrange
        val first = 1
        val second = 2
        val expect = 3
        val add = Add()

        //act
        val actual = add.add(first, second)

        //assert
        assertEquals(expect, actual)
    }

}
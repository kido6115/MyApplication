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
    @Test
    fun calculate(){
        val first = 1
        val second = 2
        val addExpect=3
        val minusExpect=1
        val add = Add()
        val actual = add.add(first, second)

        assertEquals(addExpect, actual)

    }

}
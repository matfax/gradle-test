import org.scalatest.FlatSpec

/**
  * Created by Matthias on 16.03.2017.
  */
class TestAppTest extends FlatSpec {

  "A testMethod" should "return test" in {
    val testResult = TestApp.testMethod()
    println(testResult)
    assert(testResult === "test")
  }

}

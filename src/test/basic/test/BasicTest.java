package test.basic.test;

import org.testng.annotations.*;

public class BasicTest {
/*    @Test - oznaczenie metody jako testowej (bez dodania zależności TestNG do pom.xml nie byłaby ona dla nas dostępna,
    tak jak pozostałe adnotacje, ponieważ nie wchodzą one w skład Java, a są one dostępne wewnątrz zewnętrznej biblioteki,
    która w rzeczywistości jest zbiorem klas i metod Java napisanych przez inne osoby
 */
    @Test
    public void basicTestMethod() {
        System.out.println("To jest mój pierwszy test.");
    }

    @Test
    public void secondBasicTestMethod() {
        System.out.println("To jest mój drugi test.");
    }

/*    @BeforeSuite - ta metoda zostanie wykonana tylko raz, przed uruchomieniem pierwszej metody testowej,
      jedno wywołanie dla całego <suite>
 */
    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Before suite");
    }

    /* @BeforeTest - metoda zostanie wywołana przed wywołaniem pierwszej metody w ramach danego testu, w tym przypadku
    jako test traktujemy obiekt <test> w pliku suite.xml, metoda będzie uruchamiana przed każdym obiektem <test>
     */
    @BeforeTest
    public void beforeTest() {
        System.out.println("Before test");
    }

    /* @BeforeClass - metoda wywoływana przed uruchomieniem pierwszej metody wewnątrz klasy testowej (obiekt <class>,
    będzie ona wykonywana przed każdą klasą testową
     */
    @BeforeClass
    public void beforeClass() {
        System.out.println("Before class");
    }

//    BeforeMethod - metoda zostanie wywołana przed każdą metodą oznaczoną jako @Test
    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before method");
    }

//    Zakres działania adnotacji @After... jest analogiczny do @Before..., z tym że są one wykonywane dopiero po wykonaniu danej czynności
    @AfterMethod
    public void afterMethod() {
        System.out.println("After method");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("After class");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("After test");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("After suite");
    }
}

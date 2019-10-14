package test.basic.test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import sum.Sum;

public class SumTest {

//  Deklaracja prywatnego pola wskazującego na obiekt klasy Sum
    private Sum sum;

/*  Przed wykonaniem pierwszego testu w ramach klasy tworzymy obiekt klasy Sum przypisując go do wyżej zadeklarowanego pola sum.
    Obiekt tworzymy po to, żeby z poziomu klasy SumTest mieć dostęp do zawartości klasy Sum, konkretnie metody calculateSum.
    Jeżeli metoda calculateSum byłaby oznaczona jako static, to moglibyśmy jej użyć bez konieczności tworzenia obiektu.
 */
    @BeforeClass
    public void createSumObject() {
        sum = new Sum();
    }

    /*Deklaracja metody testowej,
    wewnątrz której do zmiennej typu int przypisujemy wynik metody calculateSum dostępnej w klasie Sum,
    zwróć uwagę, że do metody musimy się odwoływać podając nazwę obiekt, który utworzyliśmy.
    Na końcu testu wykonujemy asercję, która sprawdza, czy wartość naszej zmiennej jest zgodna z oczekiwaną,
    a jeżeli nie, to w konsoli wypisany zostanie wskazany tekst (podanie tego tekstu nie jest obowiązkowe).
     */
    @Test
    public void test1() {
        int x = sum.calculateSum(1,1);
        Assert.assertEquals(x, 2, "Expected sum: 2, got: " + x);
    }

    /*Wykonanie podobnego testu jak powyżej, ale z podaniem innych wartości w celu umyślnego uzyskania
    negatywnego wyniku testu
     */
    @Test
    public void test2() {
        int x = sum.calculateSum(1,1);
        Assert.assertEquals(x, 3, "Expected sum: 3, got: " + x);
    }
}

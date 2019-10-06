package hello.world;

public class Main {

    //Deklaracja statycznej metody niezwracającej żadnego typu danych - metoda statyczna to taka, do wywołania której nie potrzebujemy tworzyć obiektu
    public static void test() {

        /*Deklaracja zmiennej typu Integer będącej typem obiektówym przechowującym liczby całkowite - typ obiektowy różni się od prostego (int) m.in.
        tym, że dla tego typu mamy dostęp do szeregu operacji, możemy go np. skonwertować do typu String
         */
        Integer x =1 ;

        //-2 147 483 648 do 2 147 483 647
        int y = 1;

        //Deklaracja zmiennej typu String, do której przypisana jest od razu wartość zmiennej typu Integer skonwertowana do typu String//
        String firstName = x.toString();

        //Wypisanie tekstu w konsoli
        System.out.println(x);
        System.out.println(y);

        //od -128 do 127
        byte byteNumber = 127;

        //od -32 768 do 32 767
        short shortNumber = 32767;

        //od -2^63 do (2^63)-1
        long longNumber = 5000000;

        //max ok 6-7 liczb po przecinku
        float floatNumber = 23.1219868768111f;

        //max ok 15 cyfr po przecinku
        double doubleNumber = 23.1219868768111;

        //Deklaracja zmiennej przechowującej pojedynczy znak
        char singleChar = 's';

        //Deklaracja zmiennej typu logicznego - może przechowywać tylko wartości true/false
        boolean trueOrFalse = true;
    }

    /* Deklaracja metody main, która jest domyślnie uruchamianą metodą klasy. Zawsze przyjmuje ona na wejściu tablicę parametrów String - są to parametry,
    które moglibyśmy podać z poziomu konsoli.
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");

        //Wywołanie zadeklarowanej wyżej metody
        test();

        //Utworzenie pustego obiektu klasy Human przy użyciu domyślnego konstruktora
        Human human = new Human();

        //Ustawienie wartości pól wewnątrz utworzonego obiektu
        human.firstName = "Mariusz";
        human.lastName = "Łazor";
        human.age = 30;

        //Wypisanie w konsoli wartości pól obiektu klasy Human
        System.out.println("Imię człowieka: " + human.firstName);
        System.out.println("Nazwisko człowieka: " + human.lastName);
        System.out.println("Wiek człowieka: " + human.age);

        human.setFirstName("Jan");
        human.setLastName("Kowalski");
        human.setAge(21);
        System.out.println("Imię człowieka: " + human.getFirstName());
        System.out.println("Nazwisko człowieka: " + human.getLastName());
        System.out.println("Wiek człowieka: " + human.getAge());

        //Utworzenie obiektu klasy Human przy użyciu zadeklarowanego w tamtej klasie sparametryzowanego konstruktora
        Human humanFull = new Human("Tomasz", "Nowak", 44);
        System.out.println("Imię człowieka: " + humanFull.getFirstName());
        System.out.println("Nazwisko człowieka: " + humanFull.getLastName());
        System.out.println("Wiek człowieka: " + humanFull.getAge());
        humanFull.setFirstName("Adam");

        //Utworzenie obiektu klasy Employee przy użyciu zadeklarowanego w tamtej klasie sparametryzowanego konstruktora
        Employee employee = new Employee("Jan", "Kowalski", 32, "Tester oprogramowania", 3000);
    }
}

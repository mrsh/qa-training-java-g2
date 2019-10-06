package hello.world;

public class Human {

    /*Utworzenie publicznego pola typu String:
    - public - pole jest dostępne wewnątrz danej klasy oraz dla wszystkich innych klas
    - protected - pole lub metoda jest dostępne obiektów danej klasy oraz obiektów klas po niej dziedziczących (rozszerzających ją)
    - private - pole/metoda jest dostępne tylko wewnątrz danej klasy
    - String - informujemy, że przechowujemy w tym obiekcie dane tekstowe (ciąg znaków);
     */
    protected String firstName;
    protected String lastName;
    protected int age;

    /*Daklaracja metody będą cej konstruktorem danej klasy (zwraca obiekt danej klasy) - w poniższym przykładzie mamy deklarację
    konstruktora przyjmującego parametry wejściowe, na podstawie których ustawiane są wartości pól tworzonego obiektu - tworzony obiekt
    nie jest pusty, jak przy użyciu domyślnego konstruktora, tylko wypełniony danymi
     */
    public Human(String firstName, String lastName, int age) {
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
    }

    /* Deklaracja niesparametryzowanego konstruktora klasy, który tworzy pusty obiekt klasy (w środku nie mamy żadnych instrukcji). Tak wygląda domyślny
    konstruktor klasy, do którego mamy dostęp, jeżeli w klasie nie zdefiniujemy żadnego konstruktora
     */
    public Human(){
    }

//    Deklaracja metody typu String zwracającej wartość pola firstName
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

/*    Deklaracja metody typu void (niezwracającej żadnego typu, nie możemy użyć w niej instrukcji return), która na podstawie parametru wejściowego
      ustawia wartość pola klasy
 */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

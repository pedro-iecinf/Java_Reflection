public class Person {

    private String name;
    private String lastName;
    private String nationality;

    public Person() {
    }

    public Person(String name, String lastName, String nationality) {
        this.name = name;
        this.lastName = lastName;
        this.nationality = nationality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setName(String first, String second) {
        this.name = first+" "+second;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    private void doSomeThing(String name, String LastName, int edad) {

    }
}

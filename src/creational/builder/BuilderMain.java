package creational.builder;

public class BuilderMain {
    public static void main(String[] args) {
        Person lucas = new PersonBuilder().setFirstName("Lucas").setLastName("Amaral").build();
        lucas.introducePerson();
    }
}

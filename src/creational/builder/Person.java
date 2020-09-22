package creational.builder;

public class Person {
    private String firstName;
    private String middleName = "";
    private String lastName;
    private double height;
    private double weight;
    private String id;

    protected Person(PersonBuilder builder){
        this.firstName = builder.getFirstName();
        this.middleName = builder.getMiddleName();
        this.lastName = builder.getLastName();
        this.height = builder.getHeight();
        this.weight = builder.getWeight();
        this.id = builder.getId();
    }

    public void introducePerson(){
        System.out.println("Name: "+this.firstName);
        System.out.println("Name: "+this.lastName);
    }

}

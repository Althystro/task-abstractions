abstract class Person {
    private final String name; // Common property for all persons

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    abstract void describeRole();
}
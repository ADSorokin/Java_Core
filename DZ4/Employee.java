public class Employee extends Customer {
    private Gender gender;

    public Employee(String name, int age, String phone, Gender gender) {
        super(name, age, phone, gender);
        this.gender = gender;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}

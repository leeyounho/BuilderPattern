public class Main {
    public static void main(String[] args) {
        Person person = new Person.Builder()
                .personId(new PersonId("Lee", "YH"))
                .sex("Male")
                .height(186.5)
                .weight(80.0)
                .build();
        System.out.println(person);

        PersonFunctional personFunctional = new PersonFunctional.Builder()
                .with($ -> {
                    $.personId = new PersonId("Lee", "YH");
                    $.sex = "Male";
                    $.height = 186.5;
                    $.weight = 80.0;
                })
                .build();
        System.out.println(personFunctional);
    }
}
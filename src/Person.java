public class Person {
    private PersonId personId;
    private String sex;
    private double height;
    private double weight;

    private Person(Builder builder) {
        personId = builder.personId;
        sex = builder.sex;
        height = builder.height;
        weight = builder.weight;
    }

    public static final class Builder {
        private PersonId personId;
        private String sex;
        private double height;
        private double weight;

        public Builder() {
        }

        public Builder personId(PersonId val) {
            personId = val;
            return this;
        }

        public Builder sex(String val) {
            sex = val;
            return this;
        }

        public Builder height(double val) {
            height = val;
            return this;
        }

        public Builder weight(double val) {
            weight = val;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "personId=" + personId +
                ", sex='" + sex + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}

import java.util.function.Consumer;

public class PersonFunctional {
    private PersonId personId;
    private String sex;
    private double height;
    private double weight;

    public PersonFunctional(Builder builder) {
        this.personId = builder.personId;
        this.sex = builder.sex;
        this.height = builder.height;
        this.weight = builder.weight;
    }

    public static class Builder {
        public PersonId personId;
        public String sex;
        public double height;
        public double weight;

        public Builder with(Consumer<Builder> consumer) {
            consumer.accept(this);
            return this;
        }

        public PersonFunctional build() {
            return new PersonFunctional(this);
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

public class User {
    private final String firstName;
    private final String lastName;
    private final String city;

    public User(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.city = builder.city;
    }

    //NO setters to provide immutability.
    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getCity() {
        return this.city;
    }

    @Override
    public String toString() {
        return String.format("User:%n First Name: %s%n Last Name: %s%n City: %s"
                , this.firstName
                , this.lastName
                , this.city);
    }

    public static class Builder {
        private String firstName;
        private String lastName;
        private String city;


        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setCity(String city) {
            this.city = city;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}

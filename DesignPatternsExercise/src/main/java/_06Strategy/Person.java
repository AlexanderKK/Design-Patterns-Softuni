package _06Strategy;

public class Person {

    private String firstName;
    private String lastName;
    private String email;

    private void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    private void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private Person person;

        public Builder() {
            this.person = new Person();
        }

        public Builder withFirstName(String firstName) {
            person.firstName = firstName;
            return this;
        }

        public Builder withLastName(String lastName) {
            person.lastName = lastName;
            return this;
        }

        public Builder withEmail(String email) {
            person.email = email;
            return this;
        }

        public Person build() {
            validatePersonState();
            return person;
        }

        private void validatePersonState() {
            StringBuilder stringBuilder = new StringBuilder(System.lineSeparator());

            if(person.firstName != null && person.firstName.isEmpty()) {
                stringBuilder.append("Empty First Name").append(System.lineSeparator());
            }

            if(person.lastName != null && person.lastName.isEmpty()) {
                stringBuilder.append("Empty Last Name").append(System.lineSeparator());
            }

            if(person.email != null && person.email.isEmpty()) {
                stringBuilder.append("Empty Email").append(System.lineSeparator());
            }

            if(stringBuilder.toString().trim().length() > 0) {
                throw new IllegalArgumentException(stringBuilder.toString().trim());
            }
        }

    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

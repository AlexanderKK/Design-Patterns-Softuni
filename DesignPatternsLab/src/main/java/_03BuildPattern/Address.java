package _03BuildPattern;

public class Address {

    private String name;
    private String email;
    private String phoneNumber;
    private String city;

    public String getName() {
        if(name == null) {
            return "";
        }

        return name;
    }

    public String getEmail() {
        if(email == null) {
            return "";
        }

        return email;
    }

    public String getPhoneNumber() {
        if(phoneNumber == null) {
            return "";
        }

        return phoneNumber;
    }

    public String getCity() {
        if(city == null) {
            return "";
        }

        return city;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s", getName(), getEmail(), getPhoneNumber(), getCity()).trim();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private Address address;

        private Builder() {
            this.address = new Address();
        }

        public Builder withName(String name) {
            address.name = name;
            return this;
        }

        public Builder withEmail(String email) {
            address.email = email;
            return this;
        }

        public Builder withPhoneNumber(String phoneNumber) {
            address.phoneNumber = phoneNumber;
            return this;
        }

        public Builder withCity(String city) {
            address.city = city;
            return this;
        }

        public Address build() {
            return address;
        }

    }

}

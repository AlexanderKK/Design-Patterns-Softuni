package _04Builder.softuni;

import _04Builder.Person;

import java.lang.reflect.Field;

public class Contact {

    private String name;
    private String number;
    private String company;
    private String title;
    private String email;
    private String website;
    private String birthday;

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private Contact contact;

        public Builder() {
            this.contact = new Contact();
        }

        public Builder withName(String name) {
            contact.name = name;
            return this;
        }

        public Builder withNumber(String number) {
            contact.number = number;
            return this;
        }

        public Builder withCompany(String company) {
            contact.company = company;
            return this;
        }

        public Builder withTitle(String title) {
            contact.title = title;
            return this;
        }

        public Builder withEmail(String email) {
            contact.email = email;
            return this;
        }

        public Builder withWebsite(String website) {
            contact.website = website;
            return this;
        }

        public Builder withBirthday(String birthday) {
            contact.birthday = birthday;
            return this;
        }

        public Contact build() throws NoSuchFieldException, IllegalAccessException {
            validateContactState();
            return contact;
        }

        private void validateContactState() throws NoSuchFieldException, IllegalAccessException {
            StringBuilder stringBuilder = new StringBuilder();

            ensureField("name", 2, stringBuilder);
            ensureField("number", 10, stringBuilder);
            ensureField("company", 5, stringBuilder);
            ensureField("title", 8, stringBuilder);
            ensureField("email", 10, stringBuilder);
            ensureField("website", 5, stringBuilder);
            ensureField("birthday", 10, stringBuilder);

            if(stringBuilder.toString().trim().length() > 0) {
                throw new IllegalArgumentException(stringBuilder.toString().trim());
            }
        }

        private void ensureField(String fieldName, int charactersCount, StringBuilder stringBuilder) throws NoSuchFieldException, IllegalAccessException {
            Field field = Contact.class.getDeclaredField(fieldName);

            String fieldValue = field.get(contact) != null ? field.get(contact).toString() : null;

            if(fieldValue != null && (fieldValue.trim().equals("") || fieldValue.length() < charactersCount)) {
                stringBuilder
                        .append("The ")
                        .append(fieldName)
                        .append(" must contain at least ")
                        .append(charactersCount)
                        .append(" characters!")
                        .append(System.lineSeparator());
            }
        }

    }

    private String checkIfNull(String fieldValue) {
        if(fieldValue == null) {
            fieldValue = "";
        }

        return fieldValue;
    }

    public String getName() {
        return checkIfNull(name);
    }

    public String getNumber() {
        return checkIfNull(number);
    }

    public String getCompany() {
        return checkIfNull(company);
    }

    public String getTitle() {
        return checkIfNull(title);
    }

    public String getEmail() {
        return checkIfNull(email);
    }

    public String getWebsite() {
        return checkIfNull(website);
    }

    public String getBirthday() {
        return checkIfNull(birthday);
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                ", company='" + company + '\'' +
                ", title='" + title + '\'' +
                ", email='" + email + '\'' +
                ", website='" + website + '\'' +
                ", birthday='" + birthday + '\'' +
                '}';
    }
}

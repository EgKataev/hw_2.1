public class Human {
    private int yearOfBirth;
    public String name;
    private String city;
    public String jobTitle;

    public Human(int yearOfBirth, String name, String city, String jobTitle) {
        if (yearOfBirth < 0) {
            this.yearOfBirth = 0;
        } else {
            this.yearOfBirth = yearOfBirth;
        }


        if (name == null) {
            this.name = "Информация не указана";
        } else {
            this.name = name;
        }

        if (city == null) {
            this.city = "Информация не указана";
        } else {
            this.city = city;
        }

        if (jobTitle == null) {
            this.jobTitle = "Информация не указана";
        } else {
            this.jobTitle = jobTitle;
        }
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        if (yearOfBirth < 0) {
            this.yearOfBirth = 0;
        } else {
            this.yearOfBirth = yearOfBirth;
        }
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        if (city == null || city.isBlank() || city.isEmpty()) {
            this.city = "Информация не указана";
        } else {
            this.city = city;
        }
    }
}

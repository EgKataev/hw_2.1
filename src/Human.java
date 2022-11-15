public class Human {
    public int age;
    public String name;
    public String city;
    public String jobTitle;

    public Human(int age, String name, String city, String jobTitle) {
        if (age < 0) {
            this.age = 0;
        } else {
            this.age = age;
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
}

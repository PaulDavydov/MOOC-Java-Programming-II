public class Person {
    private String gender;
    private String country;
    private int year;
    private double literacyPercent;
    public Person(String gender, String country, int year, double literacyPercent) {
        if (gender.contains("female")) {
            this.gender = "female";
        } else {
            this.gender = "male";
        }
        this.country = country;
        this.year = year;
        this.literacyPercent = literacyPercent;
    }
    public String getGender() {
        if(this.gender.contains("female")) {
            return "female";
        }
        if(this.gender.contains("male")) {
            return "male";
        }
        return null;
    }
    public String getCountry() {
        return this.country;
    }
    public int getYear() {
        return this.year;
    }
    public double getLiteracyPercent() {
        return this.literacyPercent;
    }

    public String toString() {
        return this.country + " (" + this.year + "), " + this.getGender() + ", " + this.literacyPercent;
    }
}

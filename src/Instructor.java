public class Instructor {
    private String lastName, firstName;
    private String officeNumber;
    Instructor(String lastName, String firstName, String officeNumber){
        this.lastName = lastName;
        this.firstName = firstName;
        this.officeNumber = officeNumber;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setOfficeNumber(String officeNumber){
        this.officeNumber = officeNumber;
    }
    public String getLastName(){
        return lastName;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getOfficeNumber(){
        return officeNumber;
    }
    public String getFullName(){
        return getLastName()+", "+getFirstName();
    }
}

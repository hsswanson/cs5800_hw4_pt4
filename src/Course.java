public class Course {
    private String name;
    private Instructor instructor;
    private Textbook textbook;
    public Course(String courseName, Textbook textbook, Instructor instructor){
        this.name = courseName;
        this.textbook = textbook;
        this.instructor = instructor;
    }
    public void setInstructor(Instructor instructor){
        this.instructor = instructor;
    }
    public void setTextbook(Textbook textbook){
        this.textbook = textbook;
    }
    public void setName(String courseName){
        this.name=courseName;
    }
    public Instructor getInstructor(){
        return instructor;
    }
    public Textbook getTextbook(){
        return textbook;
    }
    public String getName(){
        return name;
    }
    public void print(){
        System.out.println(getName() +":"+getInstructor().getFullName()+", "+getTextbook().getInfo());
    }
}

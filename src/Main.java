//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    IO.println(String.format("cs5800_hw4_pt4"));

    Instructor instructor1 = new Instructor("Last", "First", "OFFICE_NUM");
    Textbook textbook1 = new Textbook("Textbook title", "Author name", "Publisher name");
    Course course1 = new Course("COURSE_NAME", textbook1, instructor1);

    Instructor instructor2 = new Instructor("Davarpanah","Nima", "3-2636");
    Textbook textbook2 = new Textbook("Clean Code", "Martin et al", "Prentice Hall");
    Course course2 = new Course("CS5800",textbook2,instructor2);

    course1.print();
    course2.print();

}

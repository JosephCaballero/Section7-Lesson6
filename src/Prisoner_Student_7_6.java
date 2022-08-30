//Section 7, Lesson 6 Starter for Exercise 2 - Slide 16

public class Prisoner_Student_7_6 {
    //Fields
    private String name;
    private double height;
    private int sentence;
    private String cell;
    private static int prisonerCount = 0;
    private static int bookingNumber = 0;
    //Constructor
    public Prisoner_Student_7_6(String name, double height, int sentence, String cell){

        this.name = name;
        this.height = height;
        this.sentence = sentence;
        this.cell = cell;
        prisonerCount++;
        bookingNumber++;


        }


    //Methods
    public void think(){
        System.out.println("I'll have my revenge.");
    }
    public void display(){
        System.out.println("There are " + getPrisonerCount() + " prisoners");
        System.out.println("Name: " +getName());
        System.out.println("Height: " +getHeight() +"m");
        System.out.println("Sentence: " +getSentence() +" yrs");
        System.out.println("Cell: " +getCell() + getName());
        System.out.println("Booking number " + bookingNumber);
    }

    //Getters
    public String getName() {
        return name;
    }
    public double getHeight() {
        return height;
    }
    public int getSentence() {
        return sentence;
    }
    public String getCell() {
        return cell;
    }
    public int getPrisonerCount(){
        return prisonerCount;

    }

    //Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public void setSentence(int sentence) {
        this.sentence = sentence;
    }
    public void setCell(String cell) {
        this.cell = cell;
    }
    public void setPrisonerCount(int prisonerCount){
        this.prisonerCount = prisonerCount;

    }
}

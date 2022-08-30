//Section 7, Lesson 6 Starter for Exercise 2 - Slide 16
import java.util.*;
public class PrisonTest_Student_7_6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Cell_Student_7_6 cellA1 = new Cell_Student_7_6("A1", false, 1234);
        Cell_Student_7_6 cellB1 = new Cell_Student_7_6("B1", false, 1234);
        Cell_Student_7_6 cellC1 = new Cell_Student_7_6("C1", false, 1234);
        Cell_Student_7_6 cellD1 = new Cell_Student_7_6("D1", false, 1234);

        Prisoner_Student_7_6 bubba = new Prisoner_Student_7_6("bubba", 2.08, 4, "hey");
        bubba.display();
        Prisoner_Student_7_6 bubbba = new Prisoner_Student_7_6("bubbba", 2.08, 3, "hi");
        bubbba.display();
    }
}

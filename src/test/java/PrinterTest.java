import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PrinterTest {

//    Create a Printer class that has a property for number of sheets of paper left.
//    Add a method to print that takes in a number of pages and number of copies.
//    The print method will only run if the printer has enough paper. If it runs it will reduce the value of the paper left by number of copies * number of pages.
//    Create a method to refill the printer paper.
//    Add a toner volume property to the class.
//    Modify the printer so that it reduces the toner by 1 for each page printed.

    Printer myPrinter;

    @Before
    public void before(){
        myPrinter = new Printer(1000, 1000);
    }

    @Test
    public void getPrinterSheetsRemaining(){
        assertEquals(1000, myPrinter.getPaper());
    }

    @Test
    public void canPrint(){
        myPrinter.print(2,1);
        assertEquals(998, myPrinter.getPaper());
    }

    @Test
    public void cannotPrintMoreThanPaperStock(){
        myPrinter.print(900,2);
        assertEquals(1000, myPrinter.getPaper());
    }

    @Test
    public void canRefillPaper(){
        myPrinter.refill();
        assertEquals(1000, myPrinter.getPaper());
    }

    @Test
    public void hasToner(){
        assertEquals(1000, myPrinter.getToner());
    }

    @Test
    public void usesTonerWhenPrinting(){
        myPrinter.print(5, 2);
        assertEquals(990, myPrinter.getToner());
    }

    @Test
    public void cannotPrintWithoutEnoughToner(){
        myPrinter.print(10000, 1);
        assertEquals(1000, myPrinter.getToner());
    }




}

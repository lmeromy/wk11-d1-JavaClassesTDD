public class Printer {

//    Create a Printer class that has a property for number of sheets of paper left.
//    Add a method to print that takes in a number of pages and number of copies.
//    The print method will only run if the printer has enough paper. If it runs it will reduce the value of the paper left by number of copies * number of pages.
//    Create a method to refill the printer paper.
//    Add a toner volume property to the class.
//    Modify the printer so that it reduces the toner by 1 for each page printed.

    private int sheetsLeft;
    private int tonerLeft;

    public Printer(int sheetsLeft, int tonerLeft){
        this.sheetsLeft = sheetsLeft;
        this.tonerLeft = tonerLeft;
    }

    public int getPaper(){
        return this.sheetsLeft;
    }

    public void print(int pages, int copies){
        int lessPaper = pages * copies;
        if(lessPaper <= this.sheetsLeft){
            this.sheetsLeft = this.sheetsLeft - lessPaper;
            this.tonerLeft = this.tonerLeft - lessPaper;
        } else {
            this.sheetsLeft = this.sheetsLeft - 0;
            this.tonerLeft = this.tonerLeft - 0;
        }

    }

    public void refill(){
        this.sheetsLeft = 1000;
    }


    public int getToner() {
        return this.tonerLeft;
    }
}

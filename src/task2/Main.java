package task2;

public class Main {
    public static void main(String[] args) {

        XMLHandler xmlHandler = new XMLHandler();
        TXTHandler txtHandler = new TXTHandler();
        DOCHandler docHandler = new DOCHandler();
        System.out.println("Робота з документами");
        System.out.println("-------------------");
        xmlHandler.open();
        xmlHandler.change();
        xmlHandler.create();
        xmlHandler.save();
        System.out.println("-------------------");
        txtHandler.open();
        txtHandler.change();
        txtHandler.create();
        txtHandler.save();
        System.out.println("-------------------");
        docHandler.open();
        docHandler.change();
        docHandler.create();
        docHandler.save();
    }
}

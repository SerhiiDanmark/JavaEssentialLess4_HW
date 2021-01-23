package task2;

public class TXTHandler extends AbstractHandler{
    @Override
    void open() {
        System.out.println("Відкрити в TXT");
    }

    @Override
    void create() {
        System.out.println("Створити TXT");
    }

    @Override
    void change() {
        System.out.println("Змінити TXT");
    }

    @Override
    void save() {
        System.out.println("Зберегти в TXT");
    }
}

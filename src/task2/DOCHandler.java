package task2;

public class DOCHandler extends AbstractHandler{
    @Override
    void open() {
        System.out.println("Відкрити в DOC");
    }

    @Override
    void create() {
        System.out.println("Створити DOC");
    }

    @Override
    void change() {
        System.out.println("Змінити DOC");
    }

    @Override
    void save() {
        System.out.println("Зберегти в DOC");
    }
}

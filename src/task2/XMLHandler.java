package task2;

public class XMLHandler extends AbstractHandler{
    @Override
    void open() {
        System.out.println("Відкрити в XML");
    }

    @Override
    void create() {
        System.out.println("Створити XML");
    }

    @Override
    void change() {
        System.out.println("Змінити XML");
    }

    @Override
    void save() {
        System.out.println("Зберегти в XML");
    }
}

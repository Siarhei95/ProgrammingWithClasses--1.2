//Создйте  класс  Test2  двумя переменными. Добавьте  конструктор с входными параметрами. Добавьте
// конструктор, инициализирующий члены класса по умолчанию. Добавьте set- и get- методы для полей экземпляра класса.
package Question_2;

public class Task2 {

    private String name;
    private int age;

    public Task2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Task2() { //конструктор по умолчанию
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Task2 Person1 = new Task2("Виктор",30);
        Task2 Person2 = new Task2(); //сработает конструктор по умолчанию
        System.out.println(Person1.age);
        System.out.println(Person1.name);
        Person1.setAge(18);
        System.out.println(Person1.getAge()); //с помощью сеттеров и геттеров изменим переменные.
        Person1.setName("Петр");
        System.out.println(Person1.getName());
    }
}
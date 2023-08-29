package uz.zaripov.mvc.model;


import javax.validation.constraints.*;

public class Person {

    private int id;

    @NotEmpty(message = "Это поле не должно быть пустым")
    @Size(min = 3, max = 30 , message = "Имя Должно быть в пределах от 3 до 30 символов")
    private String name;

    @NotEmpty(message = "Поле Email не должно быть пустым")
    @Email(message = "Формат это поля some@mail.ru")
    private String email;

    @Min(value = 0, message = "Минимальное значение 0")
    @Max(value = 100, message = "Максимальное значение 100")
    private int age;



    public Person(int id, String name, String email, int age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public Person() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

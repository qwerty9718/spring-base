package uz.zaripov.mvc.model;

public class News {

    private int id;
    private String name;
    private String text;


    public News(){}

    public News(int id, String name, String text) {
        this.id = id;
        this.name = name;
        this.text = text;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setText(String text){
        this.text = text;
    }

    public String getName(){
        return name;
    }

    public String getText() {
        return text;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

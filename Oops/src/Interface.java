public interface Interface {
    int age = 30;
    String name= "Sam"; //Final and static

    void show();
    void config();
}

class example implements Interface{
    public void show() {
        System.out.println("in show");
    }

    public void config() {
        System.out.println("in config");
    }
}

class Demo{
    public static void main(String[] args) {
        example ex = new example();
        ex.show();
        ex.config();

        //as age and name is static they can be call without object
        System.out.println(Interface.age +" "+ Interface.name);

    }
}

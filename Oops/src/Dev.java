//class Computer{
//    public void code(){
//
//    }
//}
// As in the above class method there is nothing written so we can write the above code as

//abstract class Computer{
//    public abstract void code();
//}
//we can also use interface instead of abstract class

interface Computer{
    void code();
}

//class Laptop extends Computer  //so this will replace extends with implements
class Laptop implements Computer
{
    public void code()
    {
        System.out.println("code, compile, run");
    }
}

class Desktop implements Computer // similarly here also
{
    public void code()
    {
        System.out.println("code, compile, run : Faster");
    }
}

 class Dev {

    //public void devApp(Laptop lap)  //As you have laptop object as parameter u can
                                      //directly call it.

    public void devApp(Computer lap)
     {
        lap.code();
    }
}

class Demoo{
    public static void main(String[] args) {

        Computer lap = new Laptop();   //creating reference of Parent class & object of
        Computer desk = new Desktop(); //subclass
        Dev sam =  new Dev();
        sam.devApp(lap);
    }

}
class Animal {
    public Animal() {
        System.out.println("create animal");
    }

    protected void finalize() throws Throwable {
        System.out.println("delete animal");
        super.finalize();
    }

    public void sound() {
        System.out.println("animal sound");
    }
}

class Dog extends Animal {
    public Dog() {
        System.out.println("dog");
    }

    protected void finalize() throws Throwable {
        System.out.println("delete dog");
        super.finalize();
    }

    @Override
    public void sound() {
        System.out.println("dog barks");
    }
}

class Cat extends Animal {
    public Cat() {
        System.out.println("cat");
    }

    protected void finalize() throws Throwable {
        System.out.println("delete cat");
        super.finalize();
    }

    @Override
    public void sound() {
        System.out.println("cat meows");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a = new Animal();  
        Dog d = new Dog();       
        Cat c = new Cat();       
  
        a.sound();
        d.sound();
        c.sound();
        

        a = null;
        d = null;
        c = null;
        System.gc(); 
    }
}

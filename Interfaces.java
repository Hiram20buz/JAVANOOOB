class Interfaces {
public static void main(String[] args) {
Animal dog = new Dog();
Animal cat = new Cat();
dog.swim();
dog.play();
cat.swim();
cat.play();
}
}
interface Swimmer {
void swim();
}
interface Player {
void play();
}

abstract class Animal implements Swimmer, Player{
}
class Dog extends Animal {
public void swim() {
System.out.println("Dog is swimming");
}
public void play() {
System.out.println("Dog is playing");
}
}

class Cat extends Animal {

public void swim() {
System.out.println("Cat is swimming");
}
public void play() {
System.out.println ("Cat is playing");
}
}

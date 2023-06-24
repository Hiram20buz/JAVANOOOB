//javac threads.java
//java threads
class threads {
    public static void main(String[ ] args) {
        Name name = new Name();
        name.setPriority(1);

        Welcome welcome = new Welcome();
        welcome.setPriority(6);

        welcome.start();
        name.start();

    }
}


class Welcome extends Thread{
    public void run() {
        System.out.println("Welcome!");
    }
}


class Name extends Thread{
    public void run() {
        System.out.println("Please enter your name");
    }
}

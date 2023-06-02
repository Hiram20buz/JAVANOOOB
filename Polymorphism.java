class Polymorphism {
   public static void main(String[] args) {

       Vehicle vehicle = new Vehicle();
       Vehicle elVehicle  = new ElVehicle();
       Vehicle hybrid = new HybridVehicle();

       vehicle.start();
       vehicle.resource();
       elVehicle.start();
       elVehicle.resource();
       hybrid.start();
       hybrid.resource();
   }
}
class Vehicle{
    public void start(){
        System.out.println("Starting");
    }
    public void resource(){
        System.out.println("I use petrol");
    }
}

class ElVehicle extends Vehicle{
    public void resource(){
        System.out.println("I use electricity");
    }
}

class HybridVehicle extends Vehicle{
    public void resource(){
        System.out.println("I use both petrol and electricity");
    }

}

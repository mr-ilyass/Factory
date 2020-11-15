package factory;



// The ComputerFactory class declares the factory method (ComputerFactory) that returns new Computer objects.
// It’s important that the return type of this method matches the Computer interface.

public class ComputerFactory {

    public static Computer getComputer(String type,String ram,String hdd,String cpu){

        if(type.equalsIgnoreCase("PC"))
            return new PC(ram,hdd,cpu);

        else if (type.equalsIgnoreCase("Server"))
            return new Server(ram,hdd,cpu);

        return null;

    }

}

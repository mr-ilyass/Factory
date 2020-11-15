package factory;


//The Computer declared as abstract class, which is common to all objects
//that can be produced by the factory and its subclasses.


public abstract class Computer {
    public abstract String getRAM();
    public abstract String getHDD();
    public abstract String getCPU();
    public String toString() {

        return "RAM= "+this.getRAM()+", HDD="+this.getHDD()+", CPU="+this.getCPU();


    }
}

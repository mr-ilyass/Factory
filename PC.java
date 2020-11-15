package factory;

public class PC extends Computer{

    // properties
    private String ram;
    private String hdd;
    private String cpu;

    // constructor
    public PC(String ram,String hdd,String cpu){
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    // inherited methods
    public String getRAM() { return this.ram; }
    public String getHDD() { return this.hdd; }
    public String getCPU() { return this.cpu; }


}

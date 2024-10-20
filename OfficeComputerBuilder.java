public class OfficeComputerBuilder implements IComputerBuilder {
    private Computer _computer= new Computer();
    public void SetCPU(){
        _computer.CPU = "Intel i3";}
    public void SetRAM() {
        _computer.RAM = "8GB";
    }
    public void SetStorage() {
        _computer.Storage = "1TB HDD";
    }
    public void SetGPU() {
        _computer.GPU = "Integrated";
    }
    public void SetOS() {
        _computer.OS = "Windows 10";
    }

    public Computer GetComputer() {
        return _computer;
    }
}

class GamingComputerBuilder implements IComputerBuilder {
    private Computer _computer = new Computer();

    public void SetCPU() {_computer.CPU = "Intel i9";}
    public void SetRAM() {_computer.RAM = "32GB";}
    public void SetStorage(){_computer.Storage = "1TB SSD";}
    public void SetGPU() { _computer.GPU = "NVIDIA RTX 3080";}
    public void SetOS() { _computer.OS = "Windows 11";}

    public Computer GetComputer() {
        return _computer;
        }

}
class ComputerDirector
{
    private IComputerBuilder _builder;

    public ComputerDirector(IComputerBuilder builder)
    {
        _builder = builder;
    }

    public void ConstructComputer()
    {
        _builder.SetCPU();
        _builder.SetRAM();
        _builder.SetStorage();
        _builder.SetGPU();
        _builder.SetOS();
    }

    public Computer GetComputer()
    {
        return _builder.GetComputer();
    }
}
class Main1{
    public static void main(String[] args) {
        IComputerBuilder officeBuilder = new OfficeComputerBuilder();
        ComputerDirector director = new ComputerDirector(officeBuilder);
        director.ConstructComputer();
        Computer officeComputer = director.GetComputer();
        System.out.println(officeComputer);

        IComputerBuilder gamingBuilder = new GamingComputerBuilder();
        director = new ComputerDirector(gamingBuilder);
        director.ConstructComputer();
        Computer gamingComputer = director.GetComputer();
        System.out.println(gamingComputer);

    }
}
public interface IComputerBuilder{
    void SetCPU();

    void SetRAM();

    void SetStorage();

    void SetGPU();

    void SetOS();

    Computer GetComputer();
}
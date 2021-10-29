public class Worker implements Person{

    @Override
    public String work() {
        System.out.println("worker...");
        return "worker";
    }
}

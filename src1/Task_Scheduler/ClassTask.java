package Task_Scheduler;

public class ClassTask {

    protected String name;

    public ClassTask(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "ClassTask{" +
                "name='" + name + '\'' +
                '}';
    }
}

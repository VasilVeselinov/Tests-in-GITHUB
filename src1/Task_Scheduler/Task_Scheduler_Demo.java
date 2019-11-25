package Task_Scheduler;

public class Task_Scheduler_Demo {
    public static void main(String[] args) {
        Scheduler myScheduler = new Scheduler();
        ClassTask task1 = new ClassTask("Task1");
        ClassTask task2 = new ClassTask("Task2");
        ClassTask task3 = new ClassTask("Task3");
        ClassTask task4 = new ClassTask("Task4");
        myScheduler.push(task1);
        myScheduler.push(task2);
        myScheduler.push(task3);
        myScheduler.push(task4);
        System.out.println(myScheduler);
        myScheduler.doWork();
        System.out.println(myScheduler);
        myScheduler.mainOfScheduler(3);
        System.out.println(myScheduler);
        myScheduler.mainOfScheduler(0);
        myScheduler.mainOfScheduler(4);
        myScheduler.mainOfScheduler(3);
        System.out.println(myScheduler);
        myScheduler.mainOfScheduler(1);
        System.out.println(myScheduler);
        myScheduler.mainOfScheduler("Task");
        myScheduler.mainOfScheduler("Task3");
        myScheduler.mainOfScheduler();
        System.out.println(myScheduler);

    }
}

package Task_Scheduler;

import java.util.LinkedList;

public class Scheduler implements Task {

    private LinkedList<ClassTask> tasks = new LinkedList();
    private int indexOfTaskInput;
    private int indexOfFirstTask = 0;

    void push(ClassTask newTask) {
        this.tasks.offer(newTask);
    }

    @Override
    public void doWork() {
        if (this.indexOfTaskInput == this.indexOfFirstTask) {
            System.out.println("Работи се по следващият таск");
            System.out.println("Таска е изпълнен");
            this.tasks.poll();
        } else {
            System.out.println("Този таск не е на ред");
        }
    }

    void mainOfScheduler(int numberOfTask) {
        if (checkForNull()) {
            this.indexOfTaskInput = numberOfTask - 1;
            if (checkForOutOfBounds()) {
                doWork();
            }
        }
    }

    void mainOfScheduler() {
        if (checkForNull()) {
            doWork();
        }
    }

    void mainOfScheduler(String nameOfTask) {
        if (checkForNull()) {
            for (int i = 0; i < this.tasks.size(); i++) {
                if (this.tasks.get(i).getName().equals(nameOfTask)) {
                    System.out.println("В опашката има такъв таск");
                    return;
                }
            }
            System.out.println("В опашката няма такъв таск");
        }
    }

    private boolean checkForNull() {
        if (this.tasks.get(this.indexOfFirstTask) == null) {
            System.out.println("Няма таскове за изпълнение");
            return false;
        }
        return true;
    }

    private boolean checkForOutOfBounds() {
        if (this.indexOfTaskInput >= this.tasks.size()) {
            System.out.println("Този таск не съществува");
            return false;
        } else {
            if (this.indexOfTaskInput < this.indexOfFirstTask) {
                System.out.println("Този таск не съществува");
                return false;
            }
        }
        return true;
    }


    @Override
    public String toString() {
        return "Scheduler{" +
                "tasks=" + tasks +
                '}';
    }
}

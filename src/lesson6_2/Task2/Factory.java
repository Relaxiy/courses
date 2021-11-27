package lesson6_2.Task2;

public class Factory {
    private Director director;
    private Worker[] workers;

    public void addWorker(Worker worker) {
        for(int i = 0; i < this.workers.length; i++) {
            if (this.workers[i] == null) {
                this.workers[i] = worker;
                System.out.println(this.workers[i]);
                return;
            }
        }

        if (this.workers[this.workers.length - 1] != null) {
            System.out.println("Нет рабочих мест!");
        }

    }

    Factory(Director director, int n) {
        this.director = director;
        this.workers = new Worker[n];
    }
}
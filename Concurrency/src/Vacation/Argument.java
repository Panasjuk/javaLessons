package Vacation;

public class Argument extends Thread{
    @Override
    public void run() {
        VacationCandidate[] candidates = new VacationCandidate[] { new Yura(), new Inesa() };

        for (VacationCandidate c : candidates) {
            c.start();
        }

        try {
            int t = 10 + (int)(Math.random() * 100);
            sleep(t);
        } catch (InterruptedException e) {}

        for (VacationCandidate c : candidates) {
            c.interrupt();
        }

        for (VacationCandidate c : candidates) {
            try {
                c.join();
            } catch (InterruptedException e) {}
        }

        System.out.println("IGOR: Screw you guys! I'm going alone.");
        System.out.println(VacationCandidate.Winner + " has won the argument. But at what price!.");
    }
}

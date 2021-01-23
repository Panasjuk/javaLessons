package Vacation;

public class VacationCandidate extends Thread {
    public static volatile String Winner;

    @Override
    public void run() {
        while (!Thread.interrupted()){
            System.out.println(getClass().getName() + ": Igor will go on vacation with me");
            VacationCandidate.Winner =  getClass().getName();

            try {
                sleep(10);
            }catch (InterruptedException e){
                return;
            }
        }
    }
}

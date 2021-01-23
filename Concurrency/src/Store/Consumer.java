package Store;


import java.util.concurrent.TimeUnit;

public class Consumer implements Runnable {
    private Store store;

    public Consumer(Store store) {
        this.store=store;
    }

    public void run() {
        while(true) {
            store.get();
        }
    }
}

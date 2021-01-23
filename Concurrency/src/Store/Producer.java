package Store;

import java.util.concurrent.TimeUnit;

public class Producer implements Runnable {
    private Store store;

    public Producer(Store store ){
        this.store=store;
    }
    public void run() {
        while(true) {
            store.put();
        }
    }
}

package mx.ucol;

public class Drop {
    private String messages[]  = new String[10];
    private boolean empty = true;
    private boolean fully = false;
    private int currentPos = 0;

    public synchronized String take() {

        while (empty) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Someone interrupted this thread." + e);
            }
        }

        String res = messages[currentPos-1];
        currentPos--;
        if (currentPos == 0) {
            empty = true;
        }
        fully = false;
        notifyAll();

        return res;
    }

    public synchronized void put(String message) {
        while (fully) {
            try {
                wait();
            } catch (InterruptedException e) {}
        }

        messages[currentPos] = message;
        currentPos++;
        if (currentPos == 9) {
            fully = true;
        }
        empty = false;
        notifyAll();
    }
}

public class Passagem extends Thread{
    boolean status; // true = ocupado, false = desocupado
    public Passagem(){
        this.status = false;
    }

    public synchronized void passar(String tipo) {
        try {
            while (this.status) {
                wait();
            }

            System.out.println("\n"+ tipo + " está passando.");
            this.status = true;

            for (int i = 1; i < 11; i++) {
                System.out.print(i + " ");
                Thread.sleep(1000);
            }

            this.liberar();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public synchronized void liberar() {
        this.status = false;
        notifyAll();
    }
}
public class Granjero extends Thread{
    private String name;
    private int quantity;
    private Huerto basket;

    public Granjero(String name, int quantity, Huerto basket){
        this.name = name;
        this.quantity = quantity;
        this.basket = basket;
    }

    @Override
    public void run(){

        for (int i = 0; i < quantity; i++) {

            try {
                Thread.sleep(Util.generarTiempo());
                basket.deposit(this.name);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
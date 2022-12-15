public class Cliente extends Thread{
    private String name;
    private int quantity;
    private Huerto basket;

    public Cliente(String name, int quantity, Huerto basket){
        this.name = name;
        this.quantity = quantity;
        this.basket = basket;
    }

    @Override
    public void run(){

        for (int i = 0; i < quantity; i++) {
            try {

                sleep(Util.generarTiempo());

                basket.extract(this.name);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}

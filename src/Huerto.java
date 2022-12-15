import java.util.ArrayList;

public class Huerto {
    private int amountVegetables;
    private int limit;

    public Huerto(int limit){
        this.limit = limit;
    }

    ArrayList vegetableList = new ArrayList();

    synchronized public void deposit(String name){

        if (amountVegetables == limit){
            System.out.println("Has superado el límite del huerto");
            return;
        } else {
            String vegetable = Util.generarNombreVegetales();

            vegetableList.add(vegetable);

            this.amountVegetables += 1;
            String message = name + " ha depositado " + 1 + " " + vegetable;
            System.out.println(message);
            notify();
        }

    }

    synchronized public void extract(String name) throws InterruptedException {

        if (amountVegetables == 0){
            wait();
        }

        String message = name;
        this.amountVegetables -= 1;
        message += " ha consumido " + 1 + " " + vegetableList.remove(0);
        System.out.println(message);

    }

}

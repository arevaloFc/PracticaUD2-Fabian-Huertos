public class Main {

    public static void main(String[] args) {
        Huerto basket = new Huerto(10);
	    Granjero camilo = new Granjero("Camilo",2,basket);
        Granjero fabian = new Granjero("Fabian",6,basket);
        Cliente aaron = new Cliente("Manuel",2,basket);
        Cliente pedro = new Cliente("Pedro",3,basket);
        Cliente maria = new Cliente("Maria",3,basket);

        camilo.start();
        fabian.start();
        aaron.start();
        pedro.start();
        maria.start();
    }
}

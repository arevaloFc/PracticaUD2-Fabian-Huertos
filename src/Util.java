public class Util {
    private static final String []NOMBRES_VEGETALES = {
            "lettuce",
            "cabbage",
            "onion",
            "spinach",
            "potato",
            "celery",
            "asparagus",
            "radish",
            "broccoli",
            "artichoke",
            "tomato",
            "cucumber",
            "eggplant",
            "carrot",
            "green bean"
    };

    public static String generarNombreVegetales() {
        return NOMBRES_VEGETALES[(int) (Math.random() * NOMBRES_VEGETALES.length)];
    }

    public static int generarTiempo() {
        return (int)Math.floor(Math.random()*5000+1);
    }
}

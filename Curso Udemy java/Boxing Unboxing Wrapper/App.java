public class App {
    public static void main(String[] args) {
        int x = 20;

        //Boxing
        Object obj = x;

        //Unboxing
        int y = (int) obj;

        System.out.println("X: " + x + " Y: " + y + " obj: " + obj);

        /**
         * Wrapper classes:
         * Byte, Short, Integer, Long, Float, Double
         * Uso Comum: Campos de identidades em sistemas de informação
         * O cast no final não é mais necessário
         * Diferentemente dos tipos primitivos (int, double, float,...); wrapper classes aceitam valores nulos!
         */
        int z = 30;

        //Boxing
        Integer objInteger = z;

        //Unboxing
        int w = objInteger;

        System.out.println("Z: " + z + " W: " + w + " obj: " + objInteger);
    }
}

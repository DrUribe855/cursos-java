public class PrimitivosCaracteres {
    public static void main(String[] args) {
        
        char character = '\u0040';
        char decimal = 64;
        System.out.println("character = " + character);
        System.out.println("decimal = " + decimal);
        System.out.println("decimal = decimal = " + (decimal == character));

        System.out.println("char corresponde en byte: " + Character.BYTES);
        System.out.println("char corresponde en bites: "+ Character.SIZE);
        System.out.println("maximo correspondiente de char" + Character.MAX_VALUE);
        System.out.println("Character.MIN_VALUE = " + Character.MIN_VALUE);
    }
}

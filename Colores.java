import java.util.*;

public class Colores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String color1;
        String color2;

        System.out.print("\nIngrese primer color en hexadecimal: ");
        color1 = sc.next();
        System.out.print("\nIngrese segundo color en hexadecimal: ");
        color2 = sc.next();

        colorNew(color1, color2);
    }

    public static void colorNew(String color1, String color2) {
        String R1,R2;
        String G1,G2;
        String B1,B2;
        String R, G, B;
        int Red, Green, Blue; 
        
        R1 = color1.substring(0, 2);
        G1 = color1.substring(2, 4);
        B1 = color1.substring(4, 6);

        R2 = color2.substring(0, 2);
        G2 = color2.substring(2, 4);
        B2 = color2.substring(4, 6);

        Red = (Integer.parseInt(R1,16) + Integer.parseInt(R2,16)) / 2;
        Green = (Integer.parseInt(G1,16) + Integer.parseInt(G2,16)) / 2;
        Blue = (Integer.parseInt(B1,16) + Integer.parseInt(B2,16)) / 2;

        R =  Integer.toHexString(Red);
        G =  Integer.toHexString(Green);
        B =  Integer.toHexString(Blue);

        System.out.println("Red Color (R): " + R);
        System.out.println("Green Color (G): " + G);
        System.out.println("Blue Color (B): " + B);
        System.out.println("RGB: #" + R + G + B);
        // System.out.println("rgb(" + Red + ", " + Green + ", " + Blue + ")");
    }
}
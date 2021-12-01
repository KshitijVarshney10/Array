public class ASCIIValuetoChar {
    int[] ascii;
    ASCIIValuetoChar() {
        ascii = new int[] {79,80,60};
    }
    void print_Array()
    {
        for (int i=0; i<ascii.length; i++) {
            System.out.println((char)ascii[i]);
        }
    }
}
class Main
{
    public static void main(String[] args) {
        ASCIIValuetoChar obj = new ASCIIValuetoChar();
        obj.print_Array();
    }
}
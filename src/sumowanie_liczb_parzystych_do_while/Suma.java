package sumowanie_liczb_parzystych_do_while;

public class Suma {

    public static void main(String[] args)
    {
        int i = 1, suma = 0;

        System.out.println("Program liczy sume liczb parzystych.");

        do
        {
            if (i % 2 == 0) suma += i;
            i++;
        }
        while(i <= 100);

        System.out.println("Suma liczba parzystych 1 do 100 wynosi: \t" + suma + ".");
    }
}

public class Array {
    public static void main(String[] args)
    {
        int[] intValues = new int[100];

        intValues[01]= 1;
        intValues[99] = 100;

        for (int dex = 0; dex < intValues.length; dex ++)
        {
            intValues[dex] = dex + 1;
        }

        ///display the array to confirm
        for (int dex = 0; dex < intValues.length; dex ++)
        {
            System.out.printf("%4d", intValues[dex]);

        }
    }
}

import java.lang.reflect.Type;

/**
 * Created by ivan.matiash on 22 / Feb / 2017.
 */
public class HelloWorld {

    public static void main(String[] args) {
        //dz1();
        //dz2();
        //dz3();
        //dz4();
        //dz5();
        }


    public static void dz1()
    {
        double a = 5;
        double b = 11;
        double c = 2;

        double disc = b * b - (4 * a* c);
        double x1 = (-b + Math.sqrt(disc)) / (2 * a);
        double x2 = (-b - Math.sqrt(disc)) / (2 * a);

            if (Double.isNaN(x1) || Double.isInfinite(x1))
                System.out.println("x1=");
            else
                System.out.println("x1=" + x1);
            if (Double.isNaN(x2) || Double.isInfinite(x2))
                System.out.println("x2=");
            else
                System.out.println("x2=" + x2);
    }

    public static void dz2()
    {
        int var = 0;
        String[][] array = new String[5][5];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                var += 1;
                if (var < 10)
                    array[i][j] = " " + Integer.toString(var) + " ";
                else
                    array[i][j] = Integer.toString(var) + " ";
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    array[i][j] = " * ";
                    array[i][array.length - i - 1] = " * ";
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }

    public static void dz3()
    {
        int[] array = {30, 2, 10, 4, 6};
        int length = array.length;

        for (int j = 0; j < length; j++) {
            for (int i = 0; i < length-j-1; i++) {
                if (array[i] > array[i + 1]) {
                    int tmp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = tmp;
                }
            }
        }
        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void dz4()
    {
        int[] array = {30, 2, 10, 4, 6};
        int length = array.length;

        for (int k=length/2; k>0; k/=2)
        {
            for (int i = k; i< length; i++)
            {
                int tmp = array[i];
                int j;
                for (j=i; j>=k; j-=k)
                {
                    if (tmp<array[j-k])
                        array[j]=array[j-k];
                    else
                        break;
                }
                array[j]=tmp;
            }
        }
        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void dz5()
    {
        int data[] = { 3, 7, 10, 15, 35, 40, 56, 59, 71, 86 };
        int numberToFind = 101;

        int first = 0;
        int last = data.length;
        int res = -1;
        while (first<last)
        {
            int mid = (first + last) / 2;
            if (numberToFind == data[mid])
            {
                res = mid;
                break;
            }
            else
            {
                if (numberToFind < data[mid])
                    last = mid;
                else
                    first = mid + 1;
            }
        }
            System.out.print(res);
    }


}

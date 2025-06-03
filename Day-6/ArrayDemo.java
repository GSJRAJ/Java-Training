public class ArrayDemo {
    public static void main(String[] args) {
        int size = 0;
        int a [] = new int [size];
        System.out.println(a.length);
        a[0]=1;//ArrayIndeOutOfBoundsException;

        int size=-1;
        int a [] = new int[size];
        System.out.println(a.length);
        a[0]=1;
        // NegativeArraySizeException:
        // OutOfMemoryError;
       /* // int[] a={1,2,3,4,5};
        System.out.println(a.length);
        System.out.println(a);

        for(int i = 0 ; i < a.length;i++)
        {
            System.out.println(a[i]+" ");
        }
        System.out.println();
        for (int val:a){
            System.out.println(val);
        }
        System.out.println(Arrays.toString(a));*/

    System.out.println("Enter the size: ");
    int size = sc.nextInt();

    int a[] = new int[size];
    for(int i =0; i<size;i++)
    {

        a[i] = sc.nextInt();
    }
    System.out.println(Arrays.toString(a));
    }
}


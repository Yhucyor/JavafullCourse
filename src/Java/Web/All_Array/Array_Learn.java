package Java.Web.All_Array;

import java.util.Arrays;

public class Array_Learn {
    public static void main(String[] argns){
        //1. Khai báo mảng
        int[] a = new int[10];
        int[] b = {10, 20};

        //2. Truy cập phần tử và độ dài
        System.out.println(a[0] + "Length is: " + a.length);

        //3 Duyệt mảng
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
        for(int x: a){
            System.out.println(x);
        }

        //4. Mảng đa chiều
        int[][] c = new int[2][3];
        for(int i = 0; i < c.length; i++){
            for (int j = 0; j < c[i].length; j++){
                System.out.println(c[i][j]);
            }
        }

        //5. Copy dữ liệu từ mảng
        // Cách 1: System.arraycopy()
        int[] src = {1, 2, 3, 4, 5};
        int[] dest = new int[5];
        System.arraycopy(src, 0, dest, 0, src.length);

        // Cách 2: Arrays.copyOf()
        int[] d = Arrays.copyOf(a, 3); // {1, 2, 3}
    }
}

package mypackage;

public class While {
    public static void main(String[] args) {
//
//        while (i < 5) {
//            System.out.println(i);
//
//            // Nếu ko có điều kiện tăng i thì sẽ sập nguồn vì lặp vô tận ko đủ bộ nhớ;
//            i++;
//        }
//        System.out.println("----");


//        int []arr = {1, 2, 3, 4, 5};
//        int i = 0;
//
//        while (i < arr.length) {
//            System.out.println(arr[i]);
//            i++;
//        }

        // Do-while(chay cau lenh xong check dieu kien;
//        int i = 0;
//        do {
//            System.out.println(i);
//            i++;
//        } while (i < 5);
//
//        int []arr = {1,2,3,4,5};
//
//
//        int index = 0;
//
//        do {
//            System.out.println(arr[index]);
//            index++;
//        } while (index < arr.length);


        // Vong lap for(; ; ;);
        // Dieu kien tang len 2 lan;
        for (int i = 0; i < 5; i += 2) {
            System.out.println(i);
        }
        System.out.println("Ket thuc");

        // Dieu kien tang len 3 lan;
        int x = 0;
        for ( ; x < 5; ) {
            System.out.println(x);
            x += 3;
        }

        // Dieu kien tang len 1 lan;
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        // Dieu kien giam 1 lan;
        for (int i = 5; i > 0; i--) {
            System.out.println(i);
        }

        // Duyet va in cac phan tu trong Mang;
        int [] arr = {1,2,3,4,5};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

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
        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i < 5);

        int []arr = {1,2,3,4,5};


        int index = 0;

        do {
            System.out.println(arr[index]);
            index++;
        } while (index < arr.length);

    }
}

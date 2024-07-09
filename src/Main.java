import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // VÒNG LẶP FOR :
        //  for(int i = 0; i <10 ; i++){
        //    if(i %3 == 0){
        //      continue;
        //  }
        //  System.out.println(i);
        // }
        //break : dừng vòng lặp gần nhất khi gặp từ khóa này;
        // continue : Khi gặp , bỏ qua lần lặp hiện tại và chuyển tới lần lặp tiếp;


        //VÒNG LẶP DO-WHILE :
     /*   Scanner number = new Scanner(System.in);
        System.out.println("Nhập số :");
        int n = number.nextInt();
        do {
            System.out.println(n);
            n--;
        } while (n>-1);
        // do while dù đúng hay sai cũng thực thi ít nhất 1 lần;

      */
        // VÒNG LẶP WHILE :
       /* while (<điều kiện dừng >){
            <câu lệnh thực thi>
        }
        nếu điều kiện dừng trả về false thì sẽ dừng vòng lặp luôn

        */
      /*  int i =0 ;
        while (i<10){
            System.out.println(i);
            i++;
        }

       */

        // bài tập KIỂM TRA SỐ NGUYÊN TỐ :
     /*   Scanner number = new Scanner(System.in);
        System.out.println("Nhập số để kiểm tra là số nguyên tố hay không : ");
        int n = number.nextInt();
        if(n<2){
            System.out.println(n + " không phải số nguyên tố");
        }else {
            int i =2;
            boolean check = true;
            while(i<n){
                if(n%i==0){
                    check = false;
                    break;
                }
                i++;
            }
            if(check){
                System.out.println(n + " là số nguyên tố");
            }else {
                System.out.println(n + "không là số nguyên tố");
            }
        }

      */
        // ỨNG DỤNG TÍNH TIỀN LÃI CHO VAY
         /*
        double money = 1.0;
        int month = 1;
        double rate = 1.0;
        Scanner input = new Scanner(System.in);
        System.out.println("NHập số tiền gửi :");
        money = input.nextDouble();
        System.out.println("Nhập số tháng gửi :");
        month = input.nextInt();
        System.out.println("Nhập lãi suất :");
        rate = input.nextDouble();
        double total = 0;
        for(int i = 1; i <= month; i++) {
            total += money*rate*month;
        }
        System.out.println("Lãi của bạn là :" +total);

          */
        // TÌM ƯỚC SỐ CHUNG LỚN NHẤT :
        /*
        Scanner number = new Scanner(System.in);
        System.out.println("NHập số nguyên a :");
        int a = number.nextInt();
        System.out.println("Nhập số nguyên b : ");
        int b = number.nextInt();
        if(a== 0 || b==0){
            System.out.println( " không có ước chung lớn nhất");

        }
        while (a!=b){
            if(a>b){
                a = a -b;
            }else {
                b=b-a;
            }

        }
        System.out.println("Ước số chung lớn nhất là: " + a);

         */
        //THIẾT KẾ MENU :
        /*
        int choice = -1;
        Scanner input = new Scanner(System.in);
        System.out.println("MENU : ");
        System.out.println("1.vẽ hình tam giác :");
        System.out.println("2. vẽ hình vuông :");
        System.out.println("3.vẽ hình chữ nhật :");
        System.out.println("0.Exit");
        System.out.println("Enter your choice : ");
        switch (choice) {
            case 1:
                System.out.println(" Vẽ hình tam giác :");
                System.out.println("******");
                System.out.println("*****");
                System.out.println("****");
                System.out.println("***");
                System.out.println("**");
                System.out.println("*");
                break;
            case 2:
                System.out.println("vẽ hình vuông :");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                break;
            case 3 :
                System.out.println("vẽ hình chữ nhật :");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                break;
            case 0 :
                System.exit(0);
            default:
                System.out.println("khoông có lựa chọn nào");
        }
        while(choice != 0) {
            System.out.println("MENU : ");
            System.out.println("1.vẽ hình tam giác :");
            System.out.println("2. vẽ hình vuông :");
            System.out.println("3.vẽ hình chữ nhật :");
            System.out.println("0.Exit");
            System.out.println("Enter your choice : ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("vẽ hình tam giác");
                    System.out.println("******");
                    System.out.println("*****");
                    System.out.println("****");
                    System.out.println("***");
                    System.out.println("**");
                    System.out.println("*");
                    break;
                case 2:
                    System.out.println("vẽ hình vuông :");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    break;
                case 3:
                    System.out.println("vẽ hình chữ nhật");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("không có lựa chọn");
            }
        }

         */
        // HIỂN THỊ 20 SỐ NGUYÊN TỐ ĐẦU TIÊN :
        Scanner nb = new Scanner(System.in);
        System.out.println("Nhập số:");
        int number = nb.nextInt();

        if (number < 1) {
            System.out.println("Không có số nguyên tố để in ra.");

        }

        int count = 0;
        int N = 2;

        while (count < number) {
            boolean isPrime = true;

            for (int i = 2; i <= Math.sqrt(N); i++) {
                if (N % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(N + " , ");
                count++;
            }
            N++;
        }


    }
}

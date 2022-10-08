import java.util.Scanner;
class HelloWorld {//god回复感觉还是地方
    public static void main(String[] args) {
        //有一个数组 {1， 2， 3， 4， 5}， 可以将该数组进行缩减，提示用户是否继续缩减，
        // 每次缩减最后那个元素。当只剩 下最后一个元素，提示，不能再缩减。
        do {
            int n = 4;
            int arr[] = {1, 2, 3, 4, 5};
            int arr1[] = new int[n];

            for (int i = 0; i < arr1.length; i++) {
                arr1[i] = arr[i];
            }
            arr = arr1;

            for (int j = 0; j < arr.length; j++) {
                System.out.println(arr[j]);
            }
                Scanner myScanner = new Scanner(System.in);
                System.out.println("是否继续缩减Y/N");
                Char m = myScanner.next().charAt(0);

                if (m=="Y"||n>1){
                    n--;
                }else{
                    System.out.println("只剩下最后一个元素");
                    break;
                }



            }while(true);
        }
    }

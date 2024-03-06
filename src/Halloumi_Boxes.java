import java.util.Scanner;

public class Halloumi_Boxes {
    private static boolean isSorted(int[] arr){
        if(arr.length<=1){
            return true;
        }
        for(int i=1;i<arr.length;i++){
            if (arr[i]<arr[i-1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            if(k>1||isSorted(a)){
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
        sc.close();
    }

}

package interview;

public class GenerateBinary {
    public static void main(String[] args){
        int n=10;
        for(int i=0;i<=n;i++) {
            generateBinary(i);
        }


    }
    public static void generateBinary(int n){
        int i=0;
        int[] binaryarr = new int[256];
        while (n>0){
            binaryarr[i] = n%2;
            n = n/2;
            i++;
        }
        for (int j=i-1; j>=0; j--){
            System.out.print(binaryarr[j]);
        }
        System.out.println();

    }
}

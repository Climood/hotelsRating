import java.util.Scanner;


public class hotelsRating {
    //---------------------------------------------------------------------------------
    static int nextMaxIndex(int[] arr){
        int index=0;
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                index=i;
                max=arr[i];
            }
        }
        return index;
    }
    //---------------------------------------------------------------------------------
    public static void main(String[] Args){
        Scanner scanner = new Scanner(System.in);
        int numOfHotels = scanner.nextInt();
        int numOfStars=numOfHotels/5;
        int[] raites=new int[numOfHotels];
        for(int i=0;i<raites.length;i++) {
            raites[i] = scanner.nextInt();
        }
        int[]stars = new int[numOfHotels];
        int numOfLocalStars = numOfStars;
        int star=5; //start star
        for(int i=0;i<stars.length;i++) {
            int maxIndx = nextMaxIndex(raites);
            raites[maxIndx] = 0;
            stars[maxIndx] = star;
            --numOfLocalStars;
            if (numOfLocalStars == 0) {
                numOfLocalStars = numOfStars;
                star--;
            }
        }
        for(int i=0;i<stars.length;i++) {
            System.out.print(stars[i]+" ");
        }

    }
}
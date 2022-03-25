package practice03;

public class Q04 {

    public static void main(String[] args) {

        int arr[] = {3, 1, 7, 9, 4, 23, 12};

        //Print just last two elements--use continue

        for(int i = 0; i < arr.length ; i++){
            if( i < arr.length-2){
                continue; // to skip steps inside the loop
            }
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        //Print just first three elements --use break
        for(int i = 0; i< arr.length; i++){
            if(i > 2){
                break;
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        //int arr[] = {3, 1, 7, 9, 4, 23, 12};
        //Print the elements from index 2 to index 4


        for(int i = 0; i < arr.length; i++){

            if( i < 2 ){
                continue;
            }
            if( i > 4){
                break;
            }
            System.out.print(arr[i] + " ");
        }



    }

}

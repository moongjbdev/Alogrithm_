public class Sort {
    public static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length - i - 1; j++){
                if(arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void  selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++){
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            if(minIndex != i)
            {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }

    public static void insertSort(int[] arr){
        for (int i = 1; i < arr.length; i++){
            int value = arr[i];
            int pos = i - 1;
            while (pos >= 0 && value < arr[pos]){
                    arr[pos + 1] = arr[pos];
                    pos--;
            }
            arr[pos + 1] = value;

        }
    }
    public static void main(String[] args) {
        int arr[] = {3,4,5,1,2,3};
        selectionSort(arr);
        for (int a: arr){
            System.out.print(a + " ");
        }
    }
}

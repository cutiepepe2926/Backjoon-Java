package level13;

public class BinarySearch {
    public static void main(String[] args) {
        // 오름차순으로 정렬된 정수형 배열(크기 20)
        int[] arr = {-10, -4, -1, 0, 2, 3, 5, 7, 8, 12, 15, 18, 22, 25, 27, 30, 31, 35, 40, 44};

        int result = binarySearch(arr, 6);

        if (result!=-1) {
            System.out.println("arr["+result+"]에 값이 존재함. "+arr[result]);
        }
        else {
            System.out.println("값이 존재하지 않음.");
        }

    }

    public static int binarySearch(int[] arr, int n) {

        int ptrFront = 0;
        int ptrEnd = arr.length-1;
        int ptrMid = (ptrFront+ptrEnd)/2;
        int result = -1;

        while (ptrFront <= ptrEnd) {
            if (arr[ptrMid]==n) {
                return ptrMid;
            }
            else if (arr[ptrMid]<n) {
                ptrFront = ptrMid +1;
                ptrMid = (ptrFront+ptrEnd)/2;
            }
            else {
                ptrEnd = ptrMid-1;
                ptrMid = (ptrFront+ptrEnd)/2;
            }
        }
        return result;
    }
}

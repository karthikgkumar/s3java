package Cycle6;
public class BinarySearch {
    static int mid = -1;
    public static int binarySearch(int A[],int lp,int up,int key){
        while(lp<=up){
            int mid=(lp+up)/2;
            System.out.println(mid);
            if(A[mid]==key){
                return mid;
            }
            else if(A[mid]<key){
                lp=mid+1;
            }
            else if(A[mid]>key){
                
                up=mid-1;
            }
            
        }
        return mid;
    }
    public static void main(String[] args) {
        int[] A= {1,2,3,4,5,6,7,8};
        int key=0;
        int index=binarySearch(A, 0, 7, key);
        if(index==-1){
            System.out.println("the element is not found");
        }
        else
            System.out.println("the element is found at position"+ index);
    }
}
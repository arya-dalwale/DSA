import java.util.ArrayList;
import java.util.List;

public class Array {
    public static void main(String [] args){
       int[] arr ={2,4,6,9,5,7};
       int[]arr1 = {2,2,3,4,5,};

        System.out.println(findIndex(arr,9,0));
        System.out.println(findIndex1(arr,9,0));
        System.out.println(findIndex2(arr,9,arr.length-1));
        findIndex3(arr1,2,0);
        System.out.println(list);


    }
    static boolean findIndex(int [] arr,int target,int index){
        if(index== arr.length){
            return false;
        }
        return arr[index]==target || findIndex(arr, target,index+1);
    }
    static int findIndex1(int [] arr,int target ,int index){
        if(index==arr.length){
            return -1;

        }
        if(arr[index]==target){
            return target;
        }else {
            return findIndex1(arr,target,index+1);
        }
    }
    static int findIndex2(int []arr,int target,int index){
        if(index==-1){
            return -1;
        }
        if(arr[index]==target){
            return target;
        }else{
            return findIndex2(arr,target,index-1);
        }
    }
    static ArrayList<Integer> list=new ArrayList<>();
    static void findIndex3(int[]arr1,int target,int index){
        if(index==arr1.length){
            return;
        }
        if(arr1[index]==target){
            list.add(index);
        }
        findIndex3(arr1,target,index+1);
    }
}

public class linearSearch {

    public static int linearSsearch(int numbers[], int key){
        for(int i = 0; i< numbers.length; i++){
            if(numbers[i] == key){
                return i;
            }
        }

        return -1;
    }
    public static void main(String [] args){
        int numbers [] = {20, 10, 30, 50, 70, 90, 40};
        int key = 70;

        int index = linearSsearch(numbers, key);
        if(index == -1){
            System.out.println("key not found");
        } else {
            System.out.println("key found:" +index);    
        }

        
    }
}

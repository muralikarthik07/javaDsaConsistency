public class arrayTiffins {

    public static String searchT(String tiffins[],String key){
        for(int i = 0; i < tiffins.length; i++){
            if(tiffins[i].equals(key)){
                return tiffins[i];
            }
        }
        return "not found";
    }
    public static void main(String[] args){
        String tiffins[] = {"idle", "dose", "upma", "bonda", "uthapam","punugu"};
        String key = "dose";

        String index = searchT(tiffins, key);
        
        if(index == "not found"){
            System.out.println("Tiffin not found");
        } else {
            System.out.println("Tiffin found: " + index);
        }
    }
}

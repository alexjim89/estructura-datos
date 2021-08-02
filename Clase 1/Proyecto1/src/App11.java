public class App11 {
    public static void main(String[] args){
        int i = 0;
        int j = 99;
        System.out.println("Serie for: ");
        for (i = 1; i <= 10; i++){
            if(i < 10){
                System.out.print(i + ",");
            }else{
                System.out.print(i);
            }
        } i = 1; 
        System.out.println("");
        System.out.println("Serie while: ");  
        
        while (i <= 10){
            if(i < 10){
                System.out.print(i + ",");
            }else{
                System.out.print(i);
            } i++;
        } i = 1;
        System.out.println("");
        System.out.println("Serie do while: ");
        do{
            if(i < 10){
                System.out.print(i + ",");
            }else{
                System.out.print(i);
            } i++;
        } while (i <= 10);
        i = 1;
        System.out.println("");
        System.out.println("Serie for: ");
        for (i = 1; i <= 5; i++){
            if(i < 5){
                System.out.print(i + ",");
                System.out.print(j + ",");
            }else{
                System.out.print(i + ",");
                System.out.print(j);
           } j --;
        }System.out.println("");
        i = 1;
        j = 99;
        System.out.println("Serie while: ");
        while (i <= 5){
            if(i < 5){
                System.out.print(i + ",");
                System.out.print(j + ",");
            }else{
                System.out.print(i + ",");
                System.out.print(j);
            } i++;
              j--;
        } i = 1;
          j = 99;
          System.out.println("");
          System.out.println("Serie do while: ");
          do{
              if(i < 5){
                System.out.print(i + ",");
                System.out.print(j + ",");
              }else{
                System.out.print(i + ",");
                System.out.print(j);
              } i++;
                j--;
          } while (i <= 5);
    }
}
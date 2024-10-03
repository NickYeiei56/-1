import java.util.Scanner;

/**
 * f1
 */
public class shipgone {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("menber is ?");
        String memberis = scanner.nextLine();


        System.out.println("Price is ?");
        int Totol = scanner.nextInt();
        scanner.close();
    
        int discountP = Discount(memberis, Totol);
        System.out.println("Discount: " + discountP + " for " + memberis);
    }
    
    public static int Discount(String memberis , int Totol){
        int disprice ;
        switch (memberis) {
            case "Platinum":
            disprice = (int)(Totol *0.05);
                Totol = Totol - disprice ;
                
                break;

            case "Gold" :
             if (Totol >= 1000) {
                disprice = (int)(Totol *0.03);
                Totol = Totol - disprice ;
            }

            break;

            case "Silver" :
            if (Totol >=1000) {
                disprice = (int)(Totol *0.02);
                Totol = Totol - disprice ;
            }
                break;         
        }return Totol;
    }
}
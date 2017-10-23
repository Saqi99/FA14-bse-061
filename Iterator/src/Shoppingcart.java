import java.util.Scanner;
public class Shoppingcart {
	private static Scanner a;
	
	public static void main(String[] args) {
	      ItemsRepository namesRepository = new ItemsRepository();

	      for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
	         String name = (String)iter.next();
	         System.out.println("Name : " + name);
      
	         a = new Scanner(System.in);
	         
	         System.out.println("\nEnter weight one of a item shown above in numbers:");  
	         float w=a.nextInt();

	         if (w <= 5) {
	         	double cl=w*0.75;
	             System.out.println("Shipping costs:"+cl+"\n");
	         }
	         else if (w > 5) {
	         	double cg=w*0.50;
	             System.out.println("Shipping costs:"+cg+"\n");
	         }
	         else {
	             System.out.println("you Entered Worng Number!");
	      } 	
	   }
	}
}

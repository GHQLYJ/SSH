import java.util.Collection;
import java.util.Random;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Demo.RandomDemo();
		
		System.out.println("hello world!");
	}
	
	public static void RandomDemo(){
		
		
		Random random = new Random();
		
		int[] intArray = new int[10];
		
		for(int a = 0;a <intArray.length;a++){
			
			int i = random.nextInt(52);
			if(Demo.chart(intArray, i)==true){
			intArray[a] = i;
			}else{
				a--;
			}
			
			
		}
		for(int in : intArray){
			System.out.print(in+",");
		}
	}
	static boolean chart(int[] i ,int a){
//		for(int s : i){
//			System.out.print(s+",");
//		}
		
		
		
		
		boolean rebln = true;
		for(int b = 0;b<i.length;b++){
			if(i[b] == a){
				rebln = false;
				break;
			}
		}
		return rebln;
	}
}

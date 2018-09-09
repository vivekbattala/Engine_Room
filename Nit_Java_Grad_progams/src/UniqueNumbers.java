import java.util.Collection;
import java.util.Arrays;

public class UniqueNumbers {
	public static Collection<Integer> findUniqueNumbers(Collection<Integer> numbers) {
        
        for(int i=0;i<numbers.size();i++){
            boolean isDistinct = false;
            for(int j=0;j<i;j++){
            	if(numbers(i) == numbers(j)){
                    isDistinct = true;
                    break;
                }
            }
            if(!isDistinct){
                System.out.print(numbers(i)+" ");
            }
            }
		return numbers;
           
    }

	private static Object numbers(int j) {
		// TODO Auto-generated method stub
		return null;
	}

	public static void main(String[] args) {
		Collection<Integer> numbers = Arrays.asList(1, 2, 1, 3);
		for (int number : findUniqueNumbers(numbers)) {
			System.out.println(number);
	}
}
}
